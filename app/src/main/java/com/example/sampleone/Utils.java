package com.example.sampleone;

import android.content.Context;

import androidx.appcompat.app.AlertDialog;

import com.example.sampleone.network.DoubleOApi;
import com.example.sampleone.network.DoubleOClient;

public class Utils {

    public static DoubleOApi getApi(){
        return DoubleOClient.getFoodClient().create(DoubleOApi.class);

    }
    public static AlertDialog showDialogMessage(Context context, String title, String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).setTitle(title).setMessage(message).show();
        if (alertDialog.isShowing()) {
            alertDialog.cancel();
        }
        return alertDialog;
    }

}
