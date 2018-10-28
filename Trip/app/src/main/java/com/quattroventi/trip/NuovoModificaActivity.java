package com.quattroventi.trip;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.quattroventi.trip.NuovoModificaFragment.ModificaViaggio;
import com.quattroventi.trip.NuovoModificaFragment.NuovoViaggio;
import com.quattroventi.trip.Utils.Constant;

import java.util.concurrent.ExecutionException;

public class NuovoModificaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuovo_modifica);

        Button b = findViewById(R.id.aaa);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        //CAMBIO FRAGMENT
                ModificaViaggio secondFragment = new ModificaViaggio();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frContainer, secondFragment) // replace flContainer
                        //.addToBackStack(null)
                        .commit();




            }
        });




    }


    public void setFragment(int fragmentKey)  {
        Fragment fragment = null;
        switch (fragmentKey) {
            case Constant.FRAGMENT_NUOVO_VIAGGIO_KEY :
                fragment =  new NuovoViaggio();
                break;
            case  Constant.FRAGMENT_MODIFICA_VIAGGIO_KEY :
                fragment =  new ModificaViaggio();
                break;

        }
        if (fragment == null) {
            Log.e("Setting fragment", "Inavlid key for fragment generation");
            return;
        }

        FragmentManager fm = getSupportFragmentManager();
        if (fm.findFragmentById(fragmentKey) == null) {
            //inizializzazione fragment

            // Add Fragment to FrameLayout (flContainer), using FragmentManager
            android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();// begin  FragmentTransaction
            ft.add(R.id.frContainer, fragment);                                // add    Fragment
            ft.commit();

        }


    }


}
