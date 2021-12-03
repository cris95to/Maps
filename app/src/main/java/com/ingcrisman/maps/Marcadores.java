package com.ingcrisman.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.ingcrisman.maps.R;

public class Marcadores {
    GoogleMap  nMap;
    Context context;

    public Marcadores(GoogleMap nMap, Context context) {
        this.nMap = nMap;
        this.context = context;
    }

    public void addMarkersDefault(){

        uno(3.43722, -76.5225,"cali");
        dos( 4.60971, -74.08175, "bogota");
        tres( 5.53528, -73.36778, "tunja");
        cuatro(7.12539, -73.1198, "bucaramanga");
        cinco( 4.81333, -75.69611, "pereira");
        seis( 6.25184, -75.56359, "medellin");
    }

    public void uno(Double latitiud, Double longitud, String titulo){
        LatLng punto = new LatLng(latitiud,longitud);
        int height = 140;
        int width = 165;
       BitmapDrawable uno = (BitmapDrawable) context.getResources().getDrawable(R.drawable.googleg_disabled_color_18);//googleg_disabled_color_18 esto es un icono
       Bitmap unos = uno.getBitmap();
       Bitmap uns = Bitmap.createScaledBitmap(unos, width,height,false);
       nMap.addMarker(new MarkerOptions()
       .position(punto)
       .title(titulo).snippet("uno")
       .icon(BitmapDescriptorFactory.fromBitmap(uns)));
    }
    public void dos(Double latitiud, Double longitud, String titulo){
        LatLng punto = new LatLng(latitiud,longitud);
        int height = 140;
        int width = 165;
        BitmapDrawable uno = (BitmapDrawable) context.getResources().getDrawable(R.drawable.googleg_disabled_color_18);//googleg_disabled_color_18 esto es un icono
        Bitmap unos = uno.getBitmap();
        Bitmap uns = Bitmap.createScaledBitmap(unos, width,height,false);
        nMap.addMarker(new MarkerOptions()
                .position(punto)
                .title(titulo).snippet("uno")
                .icon(BitmapDescriptorFactory.fromBitmap(uns)));
    }
    public void tres(Double latitiud, Double longitud, String titulo){
        LatLng punto = new LatLng(latitiud,longitud);
        int height = 140;
        int width = 165;
        BitmapDrawable uno = (BitmapDrawable) context.getResources().getDrawable(R.drawable.googleg_disabled_color_18);//googleg_disabled_color_18 esto es un icono
        Bitmap unos = uno.getBitmap();
        Bitmap uns = Bitmap.createScaledBitmap(unos, width,height,false);
        nMap.addMarker(new MarkerOptions()
                .position(punto)
                .title(titulo).snippet("uno")
                .icon(BitmapDescriptorFactory.fromBitmap(uns)));
    }
    public void cuatro(Double latitiud, Double longitud, String titulo){
        LatLng punto = new LatLng(latitiud,longitud);
        int height = 140;
        int width = 165;
        BitmapDrawable uno = (BitmapDrawable) context.getResources().getDrawable(R.drawable.googleg_disabled_color_18);//googleg_disabled_color_18 esto es un icono
        Bitmap unos = uno.getBitmap();
        Bitmap uns = Bitmap.createScaledBitmap(unos, width,height,false);
        nMap.addMarker(new MarkerOptions()
                .position(punto)
                .title(titulo).snippet("uno")
                .icon(BitmapDescriptorFactory.fromBitmap(uns)));
    }
    public void cinco(Double latitiud, Double longitud, String titulo){
        LatLng punto = new LatLng(latitiud,longitud);
        int height = 140;
        int width = 165;
        BitmapDrawable uno = (BitmapDrawable) context.getResources().getDrawable(R.drawable.googleg_disabled_color_18);//googleg_disabled_color_18 esto es un icono
        Bitmap unos = uno.getBitmap();
        Bitmap uns = Bitmap.createScaledBitmap(unos, width,height,false);
        nMap.addMarker(new MarkerOptions()
                .position(punto)
                .title(titulo).snippet("uno")
                .icon(BitmapDescriptorFactory.fromBitmap(uns)));
    }
    public void seis(Double latitiud, Double longitud, String titulo){
        LatLng punto = new LatLng(latitiud,longitud);
        int height = 140;
        int width = 165;
        BitmapDrawable uno = (BitmapDrawable) context.getResources().getDrawable(R.drawable.googleg_disabled_color_18);//googleg_disabled_color_18 esto es un icono
        Bitmap unos = uno.getBitmap();
        Bitmap uns = Bitmap.createScaledBitmap(unos, width,height,false);
        nMap.addMarker(new MarkerOptions()
                .position(punto)
                .title(titulo).snippet("uno")
                .icon(BitmapDescriptorFactory.fromBitmap(uns)));
    }
}
