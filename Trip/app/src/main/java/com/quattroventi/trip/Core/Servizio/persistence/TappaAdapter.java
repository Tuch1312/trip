package com.quattroventi.trip.Core.Servizio.persistence;

import android.content.ContentValues;
import android.content.Context;

import com.quattroventi.trip.Model.Business.PausaNotte;
import com.quattroventi.trip.Model.Business.Tappa;
import com.quattroventi.trip.Utils.Converter;

import java.util.List;

import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_COORDINATE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_COSTO;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_DESCRIZIONE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_DURATA_SOSTA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_INDIRIZZO;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_NOME;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_NOTE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_ORA_ARRIVO;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_ORA_PARTENZA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_PLACE_ID;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_SEQ_NOTTE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_TIPO_DURATA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_WEB_LINK;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.TABLE_PAUSANOTTE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.TABLE_TAPPA;

public class TappaAdapter extends GenericAdapter {
    protected TappaAdapter(Context context) {
        super(context);
    }

    public List<Tappa> getByViaggio() {
        return null;
    }//TODO getByViaggio (tappa))

    public Tappa getById() {
        return null;
    }//TODO getById (tappa))

    public List<Tappa> getByRotta() {
        return null;
    }//TODO getByRotta (tappa))

    public boolean update() {
        return false;
    }//TODO update (tappa))

    public boolean insert(Tappa tappa) {
        if (tappa == null)  {
            return false;
        }
        open();
        ContentValues valori = new ContentValues();
        valori.put(KEY_COSTO, tappa.getCosto());
        valori.put(KEY_DESCRIZIONE, tappa.getDescrizione());
        valori.put(KEY_DURATA_SOSTA, tappa.getDurataSosta());
        valori.put(KEY_NOME, tappa.getNome());
        valori.put(KEY_NOTE, tappa.getNote());
        valori.put(KEY_PLACE_ID, tappa.getPlaceId());
        valori.put(KEY_SEQ_NOTTE, tappa.getSeqNotte());
        valori.put(KEY_COORDINATE, Converter.latLngToDbString(tappa.getCoordinate()));
        valori.put(KEY_ORA_ARRIVO, Converter.dateTodbString(tappa.getOraArrivo()));
        valori.put(KEY_ORA_PARTENZA, Converter.dateTodbString(tappa.getOraPartenza()));
        valori.put(KEY_TIPO_DURATA, tappa.getTipoDurata().toString());
        database.insert(TABLE_TAPPA,null, valori);
        close();
        return true;
    }
}
