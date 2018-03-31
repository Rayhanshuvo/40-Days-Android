package com.example.rayhan.allah;

/**
 * Created by Rayhan on 3/22/2018.
 */

public class DataGenerator {


    private static DataGenerator instance;
    private static AppDataBase dataBase;


    public static DataGenerator with(AppDataBase appDataBase) {

        if (dataBase == null)
            dataBase = appDataBase;

        if (instance == null)
            instance = new DataGenerator();

        return instance;
    }



    private Address addressInstance(String street, String state, String city, int postCode) {
        Address address = new Address();

        address.street = street;
        address.state = state;
        address.city = city;
        address.postCode = postCode;

        return address;
    }


    public void generateAddress() {
        if (dataBase == null)
            return;

        Address[] addresses = new Address[4];
        addresses[0] = addressInstance("drf","x","fg",5);
        addresses[1] = addressInstance("f","f","c",7);
        addresses[2] = addressInstance("g","g","t",8);
        addresses[3] = addressInstance("ok","ok","ok",7);

        dataBase.addressDao().insert(addresses);
    }



}