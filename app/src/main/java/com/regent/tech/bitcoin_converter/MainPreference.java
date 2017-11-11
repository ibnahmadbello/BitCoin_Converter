package com.regent.tech.bitcoin_converter;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.List;

/**
 * Created by root on 11/11/17.
 */

class MainPreference {
    private SharedPreferences preferences;
    MainPreference(Context context){
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    void addCard(Card card){

    }

    List<Card> getCardList(){
        return null;
    }
}
