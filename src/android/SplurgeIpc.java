package com.splurgegroup.plugins.splurgeipc;

import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.content.Context;
import android.net.Uri;

import android.provider.Settings;

import android.os.Build;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;

public class SplurgeIpc extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		Context context=this.cordova.getActivity().getApplicationContext();
        PluginResult.Status status = PluginResult.Status.OK;
        Uri packageUri = Uri.parse("package:" + this.cordova.getActivity().getPackageName());
        String result = "";

        
		action = args.getString(0);
		Log.d(action);

        callbackContext.sendPluginResult(new PluginResult(status, result));
        return true;
    }
}

