package br.com.ramos.mk1.fragments;

import android.app.AlertDialog;
import android.app.Dialog;

import android.content.DialogInterface;
import android.os.Bundle;

import android.view.LayoutInflater;

import br.com.ramos.mk1.R;

/**
 * Created by casa on 16/09/2015.
 */
public class SingUpFragment extends android.support.v4.app.DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater layoutInflater = getActivity().getLayoutInflater();

        builder.setView(layoutInflater.inflate(R.layout.dialog_signup, null)).setPositiveButton(R.string.signup, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                // sign in the user ...
            }
        })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        SingUpFragment.this.getDialog().cancel();
                    }
                });

        return builder.create();
    }


}
