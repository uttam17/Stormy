package com.uttamapps.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.uttamapps.stormy.R;

/**
 * Created by uttam_000 on 7/24/2015.
 */
public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    /*Method called on the creation of the dialogue
    */
    {
        Context context = getActivity(); //gets the activity currently calling the method.

        //sets properties of an AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(context.getString(R.string.error_title))
                .setMessage(context.getString(R.string.error_message))
                .setPositiveButton(context.getString(R.string.error_ok_button_text), null);
                //All the above methods are chained in order to simplify errethang

        //sets a new AlertDialog with the properties specified by the builder set above. Uses the create() method
        AlertDialog dialog = builder.create();

        //returns the dialog
        return dialog;

        /*
        The whole thing is like writing down the recipe for a a cake.
        You can have multiple recipes set, but then you can choose which one to make by putting it in the oven (nameOfAlertDialog.create())
        Pretty cool bruh
         */
    }
}
