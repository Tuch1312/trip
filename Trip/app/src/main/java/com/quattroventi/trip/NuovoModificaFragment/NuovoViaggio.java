package com.quattroventi.trip.NuovoModificaFragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.quattroventi.trip.R;


public class NuovoViaggio extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState == null){
            // Get back arguments
            if(getArguments() != null) {
                //TODO residuo bellico, gestire argomenti in entrata
                // position = getArguments().getInt("position", 0);
            }
        }
       PlaceAutocompleteFragment autocompleteFragment2 = (PlaceAutocompleteFragment)
               getFragmentManager().findFragmentById(R.id.place_autocomplete_fragment2);

        autocompleteFragment2.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(Place place) {
                Log.i("tag", "Place: " + place.getName() + "coord : " + place.getLatLng().toString() );
                //voglio scrivere al posto di "luogo di partenza" il nome
            }

            @Override
            public void onError(Status status) {

            }
        });


    }




    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {

        // Inflate the xml file for the fragment
        return inflater.inflate(R.layout.fragment_nuovo_viaggio, parent, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        //TODO logica di inizializzazione



    }

    // Activity is calling this to update view on Fragment
    public void updateView(int position){
        //TODO lgica di aggiornamento
    }
}
