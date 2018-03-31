package com.example.rayhan.makingmcq;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static MyAppDatabase myAppDatabase;
    MyDao myDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myAppDatabase= Room.databaseBuilder(getApplicationContext(),MyAppDatabase.class,"questiondb").allowMainThreadQueries().build();





        QuestionAnswetable qs1=new QuestionAnswetable("y","g0","j","h");
        QuestionAnswetable qs2=new QuestionAnswetable("y","g0","j","h");


        List<QuestionAnswetable> db =new ArrayList<>();

        db.add(qs1);
        db.add(qs2);
        MainActivity.myAppDatabase.myDaoListDao().insertData(db);



    }
}
