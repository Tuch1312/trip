package com.quattroventi.trip.NuovoModificaFragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
