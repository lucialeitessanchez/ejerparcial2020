package com.example.ejerparcial2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private RadioButton rb;
    private Button btn;
    public ArrayList<String> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editTextTextPersonName);
        rb = (RadioButton)findViewById(R.id.radioButton);
        btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb.isChecked()){
                    if(lista.isEmpty()){
                        lista.add(btn.getText().toString());
                        lista.add(rb.getText().toString());
                        lista.add(editText.getText().toString());
                        Intent i= new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(i);
                    }

                }
            }
        });

    }
}