package com.example.latihanpassingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class main2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);

        TextView t = (TextView) findViewById (R.id.text_data);
        Bundle bundle = getIntent ().getExtras ();
        String s = bundle.getString ("name");
        t.setText (s);
    }
}
