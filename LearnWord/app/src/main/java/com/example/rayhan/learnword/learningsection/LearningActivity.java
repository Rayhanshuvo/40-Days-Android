package com.example.rayhan.learnword.learningsection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rayhan.learnword.R;
import com.example.rayhan.learnword.learningsection.SectionOne;

public class LearningActivity extends AppCompatActivity {
    Button sectionOne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        takeId();
        sectionOnclick();
    }

    public void takeId(){

      sectionOne= (Button) findViewById(R.id.button3);

    }

    public void sectionOnclick(){
    sectionOne.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent i = new Intent(getApplicationContext(),SectionOne.class);
            startActivity(i);
        }
    });


    }
}
