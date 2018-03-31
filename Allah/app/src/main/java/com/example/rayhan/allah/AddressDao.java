package com.example.rayhan.allah;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by Rayhan on 3/22/2018.
 */


@Dao
public interface AddressDao {

    @Insert
    void insert(Address... address);

    @Update
    void update(Address... address);

    @Delete
    void delete(Address... address);

    @Query("Select * FROM address")
    Address[] loadAll();


    @Query("SELECT * FROM address WHERE addressId=:addressId")
    Address[] findRepositoriesForUser(final int addressId);
}