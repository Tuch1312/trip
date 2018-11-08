package com.quattroventi.trip.NuovoModificaFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;
import com.quattroventi.trip.Core.Servizio.persistence.PpaAdapter;
import com.quattroventi.trip.Model.Business.Ppa;
import com.quattroventi.trip.R;


public class NuovoViaggio extends Fragment {

    PpaAdapter prova = new PpaAdapter(getContext());

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {
            // Get back arguments
            if (getArguments() != null) {
                //TODO residuo bellico, gestire argomenti in entrata
                // position = getArguments().getInt("position", 0);
            }
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {

        // Inflate the xml file for the fragment
        return inflater.inflate(R.layout.fragment_nuovo_viaggio, parent, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        //TODO logica di inizializzazione

        PlaceAutocompleteFragment autocompleteFragment2 = (PlaceAutocompleteFragment)
                getActivity().getFragmentManager().findFragmentById(R.id.place_autocomplete_fragment2);

        autocompleteFragment2.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(Place place) {
                Log.i("tag", "Place: " + place.getName() + "coord : " + place.getLatLng().toString());
                //voglio scrivere al posto di "luogo di partenza" il nome
                TextView t = getActivity().findViewById(R.id.textView2);

                Ppa partenza = new Ppa();
                partenza.setCoordinate(place.getLatLng());
                partenza.setNome((String) place.getName());
                partenza.setIndirizzo((String) place.getAddress());
                t.setText(partenza.getIndirizzo());
                prova.addPpa(partenza);
                //((NuovoModificaActivity) getActivity()).setFragment(Constant.FRAGMENT_MODIFICA_VIAGGIO_KEY);


            }

            @Override
            public void onError(Status status) {

            }


        });
    }

    // Activity is calling this to update view on Fragment
    public void updateView(int position) {
        //TODO lgica di aggiornamento
    }
}
