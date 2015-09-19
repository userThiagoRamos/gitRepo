package br.com.ramos.mk1.cadastro.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import br.com.ramos.mk1.R;
import br.com.ramos.mk1.cadastro.model.User;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by casa on 16/09/2015.
 */
public class SingUpFragment extends DialogFragment {



    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        final LayoutInflater layoutInflater = getActivity().getLayoutInflater();

        builder.setView(layoutInflater.inflate(R.layout.dialog_signup, null)).setTitle("Enter info").setPositiveButton(R.string.signup, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                layoutInflater.getContext();
                User newUser = new User();


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
