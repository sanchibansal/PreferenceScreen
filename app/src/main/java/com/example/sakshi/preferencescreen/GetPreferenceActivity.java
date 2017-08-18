package com.example.sakshi.preferencescreen;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sakshi on 8/16/2017.
 */

public class GetPreferenceActivity extends AppCompatActivity {
    //getting id for preference screen in xml directory
    public static int prefs = R.xml.preferences;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secscreen);
        //replacing with fragment
        getFragmentManager().beginTransaction().replace(android.R.id.content,new PF()).commit();
    }


    public static class PF extends PreferenceFragment {

        @Override
        public void onCreate(final Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //adding preference from resource
            addPreferencesFromResource(GetPreferenceActivity.prefs);
        }
    }


}
