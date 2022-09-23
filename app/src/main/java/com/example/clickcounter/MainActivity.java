package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button hozzaad;
    private TextView kiiras;
    private Button kivon;
     private int counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


        hozzaad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;

            kiiras.setText(String.valueOf(counter));

            if (counter > 0)
            {
                kiiras.setTextColor(Color.rgb(0,255,0));
            }
            else if (counter == 0)
            {
                kiiras.setTextColor(Color.rgb(0,0,255));
            }
            else
            {
                kiiras.setTextColor(Color.rgb(255,0,0));
            }

            }
        });

        kivon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                kiiras.setText(String.valueOf(counter));

                if (counter > 0)
                {
                    kiiras.setTextColor(Color.rgb(0,255,0));
                }
                else if (counter == 0)
                {
                    kiiras.setTextColor(Color.rgb(0,0,255));
                }
                else
                {
                    kiiras.setTextColor(Color.rgb(255,0,0));
                }
            }
        });

        kiiras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                kiiras.setText(String.valueOf(counter));

                if (counter > 0)
                {
                    kiiras.setTextColor(Color.rgb(0,255,0));
                }
                else if (counter == 0)
                {
                    kiiras.setTextColor(Color.rgb(0,0,255));
                }
                else
                {
                    kiiras.setTextColor(Color.rgb(255,0,0));
                }
            }
        });


    }
        public void init()
        {
            hozzaad = findViewById(R.id.hozzaadGomb);
            kiiras = findViewById(R.id.kiiras);
            kivon = findViewById(R.id.kivonGomb);

        }

}
