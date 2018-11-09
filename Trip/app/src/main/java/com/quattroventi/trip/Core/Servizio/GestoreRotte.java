package com.quattroventi.trip.Core.Servizio;

import com.quattroventi.trip.Model.Servizio.mapsModel.DirectionsRoute;

import java.util.List;

public class GestoreRotte {

    public void directionApiCallBack(List<DirectionsRoute> rotte) {
        Memory memory =  Memory.getInstance();
       memory.setUtilmeRotteSelezionate(rotte);

        MapsDrower drawer = new MapsDrower();
        drawer.drawRouteOnMap(memory.getSelectedMap(), rotte);
    }
}
