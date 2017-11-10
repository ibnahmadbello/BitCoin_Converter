package com.regent.tech.bitcoin_converter;

/**
 * Created by root on 11/10/17.
 */

class Card {
    private String cryptoSymbol;
    private String otherSymbol;
    private String cryptoText;
    private String otherText;
    private double exchangeRate;


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

}
