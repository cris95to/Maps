package com.ingcrisman.maps;

import android.content.Context;

import com.google.android.gms.maps.GoogleMap;
import com.ingcrisman.maps.Coordenadas;
import com.ingcrisman.maps.Marcadores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Utils {
    public static Coordenadas coordenadas = new Coordenadas();
    public static List<List<HashMap<String, String>>>routes = new ArrayList<>();
    public static void markersDefault(GoogleMap nMap, Context context){

        new Marcadores(nMap, context).addMarkersDefault();
    }
}
