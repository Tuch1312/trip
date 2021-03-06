package com.quattroventi.trip;

import com.quattroventi.trip.Core.Servizio.persistence.DbHelper;
import com.quattroventi.trip.Model.Servizio.MapsDirectionApiOption;
import com.quattroventi.trip.Utils.Constant;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void google_maps_api_url_for_call() {
        MapsDirectionApiOption o = new MapsDirectionApiOption();
        o.setAlternative(true);
        o.setMezzo_usato(Constant.DIRECTION_OPTION_MODE.BICI);
        List<Constant.DIRECTION_OPTION_EVITA> l = new ArrayList<>();
        l.add(Constant.DIRECTION_OPTION_EVITA.PEDAGGI);
        l.add(Constant.DIRECTION_OPTION_EVITA.TRAGHETI);
        o.setLista_limitazioni(l);

    }

    @Test
    public void sql_constant_test() {
        System.out.println(DbHelper.SQL_CREATE_PPA);
        System.out.println(DbHelper.SQL_CREATE_CDF);
        System.out.println(DbHelper.SQL_CREATE_CDP);
        System.out.println(DbHelper.SQL_CREATE_PAUSA_NOTTE);
        System.out.println(DbHelper.SQL_CREATE_ROTTA);
        System.out.println(DbHelper.SQL_CREATE_TAPPA);
        System.out.println(DbHelper.SQL_CREATE_VIAGGIO);

    }

}