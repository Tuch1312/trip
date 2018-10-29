package com.quattroventi.trip;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.quattroventi.trip.NuovoModificaFragment.ModificaViaggio;
import com.quattroventi.trip.NuovoModificaFragment.NuovoViaggio;
import com.quattroventi.trip.Utils.Constant;
import com.quattroventi.trip.Utils.Utils;

import java.util.concurrent.ExecutionException;


/**
 * Questa classe/actvty funge da contenitore per tutte le scehrmate di nuovo/modifca qualcosa (viaggio,tappa,etc.)
 * E' necessario passare all'interno del bundle il
 */
public class NuovoModificaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuovo_modifica);
        if (getIntent() != null)  {
            if (getIntent().getStringExtra("fragmentKey") != null) {
                setFragment(getIntent().getStringExtra("fragmentKey"));
            }
        }


    }

    /**
     *
     * @param fragmentKey : constant.java fragment key, identificatore fragment
     */
    public void setFragment(String fragmentKey)  {

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentByTag(fragmentKey);
        //Se il fragment è già presente nella view lo riciclo, altriementi lo creo
        if (fragment != null) {
            //inizializzazione fragment
            FragmentTransaction ft = fm.beginTransaction();// begin  FragmentTransaction
            ft.replace(R.id.frContainer, fragment);                                // add    Fragment
            ft.commit();

        } else {
            switch (fragmentKey) {
                case Constant.FRAGMENT_NUOVO_VIAGGIO_KEY:
                    fragment = new NuovoViaggio();
                    break;
                case Constant.FRAGMENT_MODIFICA_VIAGGIO_KEY:
                    fragment = new ModificaViaggio();
                    break;

            }
            if (fragment == null) {
                Log.e("Setting fragment", "Inavlid key for fragment generation");
                return;
            }

            FragmentTransaction ft = fm.beginTransaction();// begin  FragmentTransaction
            ft.add(R.id.frContainer, fragment, fragmentKey);                                // add    Fragment
            ft.commit();


        }

    }

    public static void launch(Context context, String fragmentKey) {
        if (context != null && Utils.checkString(fragmentKey)) {
            Intent intent = new Intent(context, NuovoModificaActivity.class);
            intent.putExtra("fragmentKey", fragmentKey);
            context.startActivity(intent);
        }
    }





}
