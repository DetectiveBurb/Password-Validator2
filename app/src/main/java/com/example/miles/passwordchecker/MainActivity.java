package com.example.miles.passwordchecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText pass;
    Button submit;
    String x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean strength=true;
                x = pass.getText().toString();

                if (x.equals("password"))
                    strength=false;

                if (x.length()<9)
                    strength=false;

                if (strength==true){
                    Toast.makeText(getApplicationContext(),"password is strong enough",Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getApplicationContext(),"password is not strong enough",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
