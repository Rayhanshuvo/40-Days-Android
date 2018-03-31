package com.example.rayhan.learnword.learningsection;

import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by Rayhan on 3/26/2018.
 */


@android.arch.persistence.room.Database(entities = {SectionOneWordGroupEntity.class},version = 1, exportSchema = false)
public abstract class Database extends RoomDatabase {

    private static Database instance;
    public abstract SectionOneDao sectionOneDao();

    public static Database getAppDatabase(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    Database.class,
                    "databaseForWord")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
}
