package com.uttamapps.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by uttam_000 on 7/24/2015.
 */
public class NetworkUnvailableDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(context.getString(com.uttamapps.stormy.R.string.network_error_title))
                .setMessage(context.getString(com.uttamapps.stormy.R.string.network_error_message))
                .setPositiveButton(context.getString(com.uttamapps.stormy.R.string.network_error_posbutton), null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
