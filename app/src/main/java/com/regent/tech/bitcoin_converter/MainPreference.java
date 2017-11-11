package com.regent.tech.bitcoin_converter;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 11/11/17.
 */

class MainPreference {
    private SharedPreferences preferences;
    private static final String EXCHANGE_CARD = "card_for_exchange";
    private static final String CARD_SEPERATOR = "&&&";
    MainPreference(Context context){
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    void addCard(Card card){
        String newAllCardsString = getAllCardsString() + CARD_SEPERATOR + card;
        setAllCardsString(newAllCardsString);
        Log.d("TAG", "All card string - " + newAllCardsString);
    }

    List<Card> getCardList(){
        List<Card> cardList = new ArrayList<>();
        String[] allCardString = getAllCardsString().split(CARD_SEPERATOR);
        for (String cardString : allCardString){
            String[] cardFields = cardString.split(Card.seperator);
            if (!cardString.equals("") && cardFields.length == 5){
                cardList.add(Card.cardFromString(cardFields));
            }
            Log.d("TAG", "Current Card String - " + cardString);
        }
        Log.d("TAG", "Size of list - " + cardList.size());
        return cardList;
    }

    private String getAllCardsString(){
        return preferences.getString(EXCHANGE_CARD, "");
    }

    private void setAllCardsString(String cardsString){
        preferences.edit().putString(EXCHANGE_CARD, cardsString).apply();
    }
}
