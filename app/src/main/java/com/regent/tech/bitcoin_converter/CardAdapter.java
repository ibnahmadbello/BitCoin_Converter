package com.regent.tech.bitcoin_converter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

/**
 * Created by root on 11/10/17.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardHolder> {
    private List<Card> cardList;

    CardAdapter(List<Card> cardList){
        this.cardList = cardList;
    }

    @Override
    public CardHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View holderView = View.inflate(parent.getContext(), R.layout.card_list_item, null);
        return new CardHolder(holderView);
    }

    @Override
    public void onBindViewHolder(CardHolder holder, int position){
        Card card = cardList.get(position);
        holder.bindCard(card);
    }

    @Override
    public int getItemCount(){
        return cardList.size();
    }

    void addCardToList(Card card){
        cardList.add(card);
    }

    class CardHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView cryptoSymbol;
        private TextView otherSymbol;
        private TextView cryptoText;
        private TextView otherText;
        private TextView exchangeView;
        private ConversionDialogBox conversionDialogBox;
        CardHolder(View itemView){
            super(itemView);

            conversionDialogBox = new ConversionDialogBox();
            cryptoSymbol = (TextView) itemView.findViewById(R.id.cryptoCurrency);
            otherSymbol = (TextView) itemView.findViewById(R.id.otherCurrency);
            cryptoText = (TextView) itemView.findViewById(R.id.textCryptoCurrency);
            otherText = (TextView) itemView.findViewById(R.id.textOtherCurrency);
            exchangeView = (TextView) itemView.findViewById(R.id.currentRate);
        }

        void bindCard(Card card){
            cryptoSymbol.setText(card.getCryptoSymbol());
            otherSymbol.setText(card.getOtherSymbol());
            cryptoText.setText(card.getCryptoText());
            otherText.setText(card.getOtherText());
            exchangeView.setText(String.valueOf(card.getExchangeRate()));
        }

        @Override
        public void onClick(View v) {
//            conversionDialogBox.show(getSupportFragmentManager(), "Convert a Currency");
        }
    }
}
