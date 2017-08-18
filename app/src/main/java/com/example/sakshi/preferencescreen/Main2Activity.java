package com.example.sakshi.preferencescreen;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text = (TextView)findViewById(R.id.Text);
        //shared preference to get the values
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        //getting values from shared preference
        String pass = sharedPreferences.getString("pass","null");
        boolean isenabled = sharedPreferences.getBoolean("lock",false);
        String reminder = sharedPreferences.getString("list","null");
        //setting text in text field
        text.setText("Password: "+pass+"\nScreen Lock Enabled: "+isenabled+"\nUpdate Reminder: "+reminder);

    }
}
