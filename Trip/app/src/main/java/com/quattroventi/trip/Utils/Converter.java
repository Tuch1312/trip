package com.quattroventi.trip.Utils;

import com.google.android.gms.location.places.Place;
import com.quattroventi.trip.Model.Fermata;

public class Converter {

    private void PlaceToFermata(Place place, Fermata f) {
        if (place != null) {
            f.setCoordinate(place.getLatLng());
            f.setNome(place.getName().toString());
        }

    }


}
