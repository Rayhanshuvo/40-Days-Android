package com.example.rayhan.makingmcq;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import java.util.List;

/**
 * Created by Rayhan on 3/19/2018.
 */


@Database(entities = {QuestionAnswetable.class},version = 1)
public abstract class MyAppDatabase extends RoomDatabase{

    public abstract MyDao myDaoListDao();
}
