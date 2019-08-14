package com.example.latihanpassingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        final EditText name = (EditText) findViewById (R.id.edit_text);
        Button button_kirim = (Button) findViewById (R.id.btn_kirim);
        button_kirim.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent i = new Intent (MainActivity.this,main2.class);
                i.putExtra ("name",name.getText ().toString ());
                startActivity (i);
            }
        });
    }
}
