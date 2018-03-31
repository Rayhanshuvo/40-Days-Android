package com.example.rayhan.allah;

import android.util.Log;

/**
 * Created by Rayhan on 3/22/2018.
 */

public class Logger {


    private static final String TAG = Logger.class.getName();


    public static void displayAdressesInLog(Address[] addresses) {

        if (addresses == null)
            return;

        for (Address address: addresses) {
            Log.d(TAG, "Address street: " + address.state + ", address city: " + address.city + ", address state: " + address.state + ", adress postal code: " + address.postCode);
        }
    }



}