package com.ingcrisman.maps;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

public class MyAsyncTask extends AsyncTask<Integer, Integer, String> {


    private final Mapainicio mapainicio;

    public MyAsyncTask(Mapainicio mapainicio) {
        this.mapainicio = mapainicio;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();


    }

    @Override
    protected String doInBackground(Integer... integers) {

        try {
            while (mapainicio.location == null) {
                mapainicio.location = mapainicio.gpsTracker.getLocation();
                publishProgress(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        mapainicio.location = mapainicio.gpsTracker.getLocation();
        publishProgress(2);

        return "Fin";
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);

        if (values[0] == 0) {
            Log.d("Asyntask", "null");
        } else {
            Log.d("Asyntask", "Coordenadas");
            Toast.makeText(mapainicio, "LISTO", Toast.LENGTH_SHORT).show();
            Utils.coordenadas.setOrigenLat(mapainicio.location.getLatitude());
            Utils.coordenadas.setOrigenLng(mapainicio.location.getLongitude());
            Log.d("Asyntask", String.valueOf(mapainicio.location.getLatitude()));
            Log.d("Asyntask", String.valueOf(mapainicio.location.getLongitude()));
            mapainicio.ObtenerRuta(String.valueOf(Utils.coordenadas.getOrigenLat()), String.valueOf(Utils.coordenadas.getOrigenLng()),
                    String.valueOf(Utils.coordenadas.getDestinoLat()), String.valueOf(Utils.coordenadas.getDestinoLng()));

        }

    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        Log.d("asyntask", "FIN");

    }
}
