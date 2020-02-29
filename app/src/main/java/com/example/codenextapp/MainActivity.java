package com.example.codenextapp;


import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
private Button button1;
private Button button2;
private Button button3;
private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.coaches);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCoachesActivity();
            }

            });

        button2 = findViewById(R.id.programs);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProgramsActivity();
            }
        });

        button3 = findViewById(R.id.locations);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLocationsActivity();
            }
        });

        button4 = findViewById(R.id.faq);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFaqActivity();
            }
        });




    }

    public void openCoachesActivity(){
        Intent intent = new Intent(this, CoachesActivity.class);
        startActivity(intent);
    }

    public void openProgramsActivity() {
        Intent intent = new Intent(this, ProgramsActivity.class);
        startActivity(intent);
    }

    public void openLocationsActivity() {
        Intent intent = new Intent(this, LocationsActivity.class);
        startActivity(intent);
    }
    public void openFaqActivity() {
          Intent intent = new Intent(this, FaqActivity.class);
          startActivity(intent);
      }

 }
