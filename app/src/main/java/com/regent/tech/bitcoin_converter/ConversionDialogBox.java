package com.regent.tech.bitcoin_converter;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by root on 11/11/17.
 */

public class ConversionDialogBox extends DialogFragment {

    private MainActivity mainActivity;
    private TextView cryptoCurrencyText;
    private TextView otherCurrencyText;
    private EditText amountConvert;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){

        mainActivity = new MainActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.conversion_dialog_box, null);
        builder.setView(dialogView)
                .setTitle("Convert to Base Currency")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog dialog =  builder.create();
        cryptoCurrencyText = (TextView) dialogView.findViewById(R.id.convert_from);
        otherCurrencyText = (TextView) dialogView.findViewById(R.id.convert_to);

        return dialog;

    }

}
