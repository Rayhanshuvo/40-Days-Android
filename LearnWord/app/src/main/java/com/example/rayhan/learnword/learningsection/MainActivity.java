package com.example.rayhan.learnword.learningsection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rayhan.learnword.R;

public class MainActivity extends AppCompatActivity {

    Button btnForLearning;
    Button btnForPractice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        takeId();
        onClickForLearning();
        Database database = Database.getAppDatabase(this);
        SectionOnedataGenerator.with(database).generateWord();



    }

    public void takeId(){

        btnForLearning= (Button) findViewById(R.id.button);
        btnForPractice=(Button)findViewById(R.id.button2);

    }

    public void onClickForLearning(){
    btnForLearning.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent i = new Intent(getApplicationContext(),LearningActivity.class);
            startActivity(i);

        }
    });


    }

}
