package com.quattroventi.trip.Core.Servizio;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.PolyUtil;
import com.quattroventi.trip.Model.Servizio.mapsModel.DirectionsRoute;
import com.quattroventi.trip.Utils.Utils;

import java.util.List;

public class MapsDrower {

    public void drawRouteOnMap(GoogleMap map, List<DirectionsRoute> routes) {
        if (Utils.checkList(routes)) {
            for (DirectionsRoute route : routes) {
                map.addPolyline(
                        new PolylineOptions()
                                .addAll(PolyUtil.decode(route.overviewPolyline.getEncodedPath()))
                                .clickable(true));
            }

        }
    }
}
