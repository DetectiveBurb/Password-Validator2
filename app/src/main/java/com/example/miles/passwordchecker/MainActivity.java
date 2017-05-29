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

                //checking the password is not "password"
                if (x.equals("password"))
                    strength=false;

                //checking the password is long enough
                if (x.length()<9)
                    strength=false;

                //checking password has a number
                if(!x.matches("0-9"))
                    strength=false;

                //checking for at least one uppercase letter
                if(!x.matches("A-Z"))
                    strength=false;

                //checking for at least one lowercase letter
                if(!x.matches("a-z"))
                    strength=false;

                //displaying results of test
                if (strength==true){
                    Toast.makeText(getApplicationContext(),"password is strong enough",Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(getApplicationContext(),"password is not strong enough",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
