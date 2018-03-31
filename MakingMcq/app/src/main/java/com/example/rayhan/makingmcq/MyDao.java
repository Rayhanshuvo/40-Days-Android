package com.example.rayhan.makingmcq;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Rayhan on 3/19/2018.
 */
@Dao
public interface MyDao {


    @Insert
    void insertData(List<QuestionAnswetable> db);


}
