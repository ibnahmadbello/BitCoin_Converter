package com.regent.tech.bitcoin_converter;

import static java.io.File.separator;

/**
 * Created by root on 11/10/17.
 */

class Card {
    private String cryptoSymbol;
    private String otherSymbol;
    private String cryptoText;
    private String otherText;
    private double exchangeRate;
    static final String seperator = "###";


    String getCryptoSymbol(){
        return cryptoSymbol;
    }

    void setCryptoSymbol(String cryptoSymbol){
        this.cryptoSymbol = cryptoSymbol;
    }

    String getOtherSymbol() {
        return otherSymbol;
    }

    void setOtherSymbol(String otherSymbol) {
        this.otherSymbol = otherSymbol;
    }

    String getCryptoText(){
        return cryptoText;
    }

    void setCryptoText(String cryptoText){
        this.cryptoText = cryptoText;
    }

    String getOtherText() {
        return otherText;
    }

    void setOtherText(String otherText) {
        this.otherText = otherText;
    }

    double getExchangeRate() {
        return exchangeRate;
    }

    void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return cryptoSymbol + separator + cryptoText
                + separator + otherSymbol + separator
                + otherText + separator + exchangeRate;
    }

    static Card cardFromString(String[] fields){
        Card card = new Card();
        card.setCryptoSymbol(fields[0]);
        card.setCryptoText(fields[1]);
        card.setOtherSymbol(fields[2]);
        card.setOtherText(fields[3]);
        card.setExchangeRate(Double.valueOf(fields[4]));
        return card;
    }

}
