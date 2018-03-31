package com.example.rayhan.allah;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by Rayhan on 3/22/2018.
 */

@Database(entities = {Address.class}, version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {

    private static AppDataBase instance;



    public abstract AddressDao addressDao();


    public static AppDataBase getAppDatabase(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    AppDataBase.class,
                    "cat-owners-db")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
}
