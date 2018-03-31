package com.example.rayhan.learnword.learningsection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rayhan.learnword.R;

import java.util.ArrayList;

public class SectionOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_one);

        Database database = Database.getAppDatabase(this);
        SectionOnedataGenerator.with(database).generateWord();



    }
}
