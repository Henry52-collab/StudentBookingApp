package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText ed1,ed2;
    TextView tx1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        ed1 = (EditText)findViewById(R.id.editTextTextPassword);
        ed2 = (EditText) findViewById(R.id.editTextTextPersonName);
        tx1 = (TextView) findViewById(R.id.textView6);
        tx1.setVisibility(View.GONE);
        b1.setOnClickListener(new View.OnClickListener(){
            protected void onClick(){
                EditText username = (EditText) findViewById(R.id.editTextTextPersonName);
                EditText password = (EditText) findViewById(R.id.editTextTextPassword);
                public void login(View view){
                    if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin123")){
                        Toast.makeText(getApplicationContext(),"redirecting",Toast.LENGTH_SHORT).show();
                    }
                    else{
                      Toast.makeText(getApplicationContext(),"Wrong credentials",Toast.LENGTH_SHORT).show();
                    }
                }
                public void cancel(View view){}
            }


        };





    }
}
