package com.quattroventi.trip.Core.Servizio.persistence;

import android.content.ContentValues;
import android.content.Context;

import com.quattroventi.trip.Model.Business.Cdp;
import com.quattroventi.trip.Model.Business.PausaNotte;
import com.quattroventi.trip.Utils.Converter;

import java.util.List;

import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_COORDINATE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_COSTO;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_DESCRIZIONE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_DURATA_SOSTA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_IMPORTANZA_CDF;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_INDIRIZZO;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_NOME;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_NOTE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_ORA_ARRIVO;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_ORA_PARTENZA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_PLACE_ID;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_SEQ_NOTTE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_TIPO_DURATA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_WEB_LINK;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.TABLE_CDF;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.TABLE_PAUSANOTTE;

public class PausaNotteAdapter extends GenericAdapter {
    protected PausaNotteAdapter(Context context) {
        super(context);
    }


    public List<PausaNotte> getByViaggio() {
        return null;
    }//TODO getByViaggio (pausaNotte))

    public PausaNotte getById() {
        return null;
    }//TODO getById (pausaNotte))

    public List<PausaNotte> getByRotta() {
        return null;
    }//TODO getByRotta (pausaNotte))

    public List<PausaNotte> getByTappa() {
        return null;
    }//TODO getByTappa (pausaNotte))

    public boolean update() {
        return false;
    }//TODO update (pausaNotte))

    public boolean insert(PausaNotte pausaNotte) {
        if (pausaNotte == null)  {
            return false;
        }
        open();
        ContentValues valori = new ContentValues();
        valori.put(KEY_INDIRIZZO, pausaNotte.getIndirizzo());
        valori.put(KEY_WEB_LINK, pausaNotte.getWebLink());
        valori.put(KEY_COSTO, pausaNotte.getCosto());
        valori.put(KEY_DESCRIZIONE, pausaNotte.getDescrizione());
        valori.put(KEY_DURATA_SOSTA, pausaNotte.getDurataSosta());
        valori.put(KEY_NOME, pausaNotte.getNome());
        valori.put(KEY_NOTE, pausaNotte.getNote());
        valori.put(KEY_PLACE_ID, pausaNotte.getPlaceId());
        valori.put(KEY_SEQ_NOTTE, pausaNotte.getSeqNotte());
        valori.put(KEY_COORDINATE, Converter.latLngToDbString(pausaNotte.getCoordinate()));
        valori.put(KEY_ORA_ARRIVO, Converter.dateTodbString(pausaNotte.getOraArrivo()));
        valori.put(KEY_ORA_PARTENZA, Converter.dateTodbString(pausaNotte.getOraPartenza()));
        valori.put(KEY_TIPO_DURATA, pausaNotte.getTipoDurata().toString());
        database.insert(TABLE_PAUSANOTTE,null, valori);
        close();
        return true;
    }

}
