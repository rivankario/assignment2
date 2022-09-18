package com.example.assignment1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText EditText;
    private TextView cT;
    private Button count;

    private String text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = (Button) findViewById(R.id.add);
        cT = (TextView) findViewById(R.id.counterText);
        EditText = (EditText) findViewById(R.id.textInputEditText);
        text = String.valueOf(EditText);




        count.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(cT.getText().toString());
                number++;
                cT.setText(String.valueOf(number));
            }
        });
        if(savedInstanceState != null){
            text = savedInstanceState.getString("the_text");
            EditText.setText(text);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("the_text", text);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}