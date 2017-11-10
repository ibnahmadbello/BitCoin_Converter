package com.regent.tech.bitcoin_converter;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by root on 11/10/17.
 */

public class AddDialogBox extends DialogFragment {

    private Spinner cryptoSpinner;
    private Spinner otherCurrenciesSpinner;
    private TextView cryptoTextView;
    private TextView otherCurrenciesTextView;
    private String[] cryptoText;
    private String[] otherCurrencyText;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){

        cryptoSpinner = (Spinner) getActivity().findViewById(R.id.cryptoDropDown);
        otherCurrenciesSpinner = (Spinner) getActivity().findViewById(R.id.otherCurrencyDropDown);
        cryptoTextView = (TextView) getActivity().findViewById(R.id.cryptoDropDownText);
        otherCurrenciesTextView = (TextView) getActivity().findViewById(R.id.otherCurrencyDropDownText);
        cryptoText = new String[R.array.cryptoCurrenciesText];
        otherCurrencyText = new String[R.array.otherCurrenciesText];


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();
        setUpSpinners();
        //Inflate and set the layout for the dialog
        builder.setView(inflater.inflate(R.layout.add_card, null))
                .setTitle("Adding a new Card")
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

        //Create the AlertDialog object and return it
        return builder.create();
    }

    private void setUpSpinners(){
        ArrayAdapter<CharSequence> cryptoAdapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.cryptoCurrencies, android.R.layout.simple_spinner_item);
        cryptoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cryptoSpinner.setAdapter(cryptoAdapter);
        cryptoSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        cryptoTextView.setText(cryptoText[0]);
                        break;
                    case 1:
                        cryptoTextView.setText(cryptoText[1]);
                        break;
                }
            }
        });

        ArrayAdapter<CharSequence> otherCurrenciesAdapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.otherCurrencies, android.R.layout.simple_spinner_item);
        otherCurrenciesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        otherCurrenciesSpinner.setAdapter(otherCurrenciesAdapter);
        otherCurrenciesSpinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        otherCurrenciesTextView.setText(otherCurrencyText[0]);
                        break;
                    case 1:
                        otherCurrenciesTextView.setText(otherCurrencyText[1]);
                        break;
                    case 2:
                        otherCurrenciesTextView.setText(otherCurrencyText[2]);
                        break;
                    case 3:
                        otherCurrenciesTextView.setText(otherCurrencyText[3]);
                        break;
                    case 4:
                        otherCurrenciesTextView.setText(otherCurrencyText[4]);
                        break;
                    case 5:
                        otherCurrenciesTextView.setText(otherCurrencyText[5]);
                        break;
                    case 6:
                        otherCurrenciesTextView.setText(otherCurrencyText[6]);
                        break;
                    case 7:
                        otherCurrenciesTextView.setText(otherCurrencyText[7]);
                        break;
                    case 8:
                        otherCurrenciesTextView.setText(otherCurrencyText[8]);
                        break;
                    case 9:
                        otherCurrenciesTextView.setText(otherCurrencyText[9]);
                        break;
                    case 10:
                        otherCurrenciesTextView.setText(otherCurrencyText[10]);
                        break;
                    case 11:
                        otherCurrenciesTextView.setText(otherCurrencyText[11]);
                        break;
                    case 12:
                        otherCurrenciesTextView.setText(otherCurrencyText[12]);
                        break;
                    case 13:
                        otherCurrenciesTextView.setText(otherCurrencyText[13]);
                        break;
                    case 14:
                        otherCurrenciesTextView.setText(otherCurrencyText[14]);
                        break;
                    case 15:
                        otherCurrenciesTextView.setText(otherCurrencyText[15]);
                        break;
                    case 16:
                        otherCurrenciesTextView.setText(otherCurrencyText[16]);
                        break;
                    case 17:
                        otherCurrenciesTextView.setText(otherCurrencyText[17]);
                        break;
                    case 18:
                        otherCurrenciesTextView.setText(otherCurrencyText[18]);
                        break;
                    case 19:
                        otherCurrenciesTextView.setText(otherCurrencyText[19]);
                        break;
                }
            }
        });

    }


}
