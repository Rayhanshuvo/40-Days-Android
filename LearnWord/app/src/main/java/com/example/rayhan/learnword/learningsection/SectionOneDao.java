package com.example.rayhan.learnword.learningsection;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rayhan on 3/26/2018.
 */

@Dao
public interface SectionOneDao {

    @Insert
    void insert(ArrayList<SectionOneWordGroupEntity> sectionOne);

    @Update
    void update(ArrayList<SectionOneWordGroupEntity> sectionOne);

    @Delete
    void delete(ArrayList<SectionOneWordGroupEntity> sectionOne);





 /*   @Query("Select * FROM sectionOne")
    ArrayList<SectionOneWordGroupEntity> loadAll();*/

/*
    @Query("SELECT * FROM address WHERE sectionOneId=:sectionOneId")
    ArrayList<SectionOneWordGroupEntity> findRepositoriesForUser(final int sectionOneId);*/
}
