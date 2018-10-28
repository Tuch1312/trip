package com.quattroventi.trip;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.quattroventi.trip.NuovoModificaFragment.ModificaViaggio;

public class NuovoModificaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuovo_modifica);
        Button b = findViewById(R.id.aaa);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // get fragment manager
                FragmentManager fm = getFragmentManager();

// add
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.fragment_snuovo_modifica, (Fragment) ModificaViaggio.newInstance("",""));
// alternatively add it with a tag
// trx.add(R.id.your_placehodler, new YourFragment(), "detail");
                ft.commit();



            }
        });
    }


}
