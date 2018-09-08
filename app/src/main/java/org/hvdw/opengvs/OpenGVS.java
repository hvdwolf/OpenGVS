package org.hvdw.opengvs;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.content.Context;
//import android.speech.RecognizerIntent;
//import android.content.ActivityNotFoundException;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import android.widget.Toast;

public class OpenGVS extends Activity {
    public static final String TAG = "OpenGVSApp";
    private static PackageManager pm;
    private static Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getApplicationContext();

        Log.d(TAG, "Started OpenGVSApp; in OnCreate void");

        /*Intent sIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        try {
            startActivityForResult(sIntent, 1);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(mContext, "Sorry, but your device doesn't support Speech to Text",Toast.LENGTH_SHORT).show();
        }*/

        Intent sIntent = new Intent(Intent.ACTION_MAIN);
        sIntent.setComponent(ComponentName.unflattenFromString("com.google.android.googlequicksearchbox/com.google.android.googlequicksearchbox.VoiceSearchActivity"));
        sIntent.addCategory(Intent.CATEGORY_LAUNCHER);
        sIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(sIntent);

        Log.d(TAG, "Switch On WiFi");

        finish();
    }

}
