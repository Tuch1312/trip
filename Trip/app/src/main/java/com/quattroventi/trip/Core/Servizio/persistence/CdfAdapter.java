package com.quattroventi.trip.Core.Servizio.persistence;

import android.content.ContentValues;
import android.content.Context;

import com.quattroventi.trip.Model.Business.Cdf;
import com.quattroventi.trip.Utils.Converter;

import java.util.List;

import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_COORDINATE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_COSTO;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_DESCRIZIONE;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_DURATA_SOSTA;
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.KEY_ID;
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
import static com.quattroventi.trip.Core.Servizio.persistence.TableConstant.TABLE_PPA;

public class CdfAdapter extends GenericAdapter {
    protected CdfAdapter(Context context) {
        super(context);
    }


    public List<Cdf> getByViaggio() {return null;}//TODO getByViaggio (cdf))
    public Cdf getById() {return null;}//TODO getById (cdf))
    public List<Cdf> getBytappa() {return null;}//TODO getByTappa (cdf))
    public boolean update() {return false;}//TODO update (cdf))

    public boolean insert(Cdf cdf) {
        if (cdf == null)  {
            return false;
        }
        open();
        ContentValues valori = new ContentValues();
        valori.put(KEY_IMPORTANZA_CDF, cdf.getImportanza());
        valori.put(KEY_WEB_LINK, cdf.getWebLink());
        valori.put(KEY_COSTO, cdf.getCosto());
        valori.put(KEY_DESCRIZIONE, cdf.getDescrizione());
        valori.put(KEY_DURATA_SOSTA, cdf.getDurataSosta());
        valori.put(KEY_NOME, cdf.getNome());
        valori.put(KEY_NOTE, cdf.getNote());
        valori.put(KEY_PLACE_ID, cdf.getPlaceId());
        valori.put(KEY_SEQ_NOTTE, cdf.getSeqNotte());
        valori.put(KEY_COORDINATE, Converter.latLngToDbString(cdf.getCoordinate()));
        valori.put(KEY_ORA_ARRIVO, Converter.dateTodbString(cdf.getOraArrivo()));
        valori.put(KEY_ORA_PARTENZA, Converter.dateTodbString(cdf.getOraPartenza()));
        valori.put(KEY_TIPO_DURATA, cdf.getTipoDurata().toString());
        database.insert(TABLE_CDF,null, valori);
        close();
        return true;
    }
}
