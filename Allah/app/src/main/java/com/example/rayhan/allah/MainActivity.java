package com.example.rayhan.allah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDataBase database = AppDataBase.getAppDatabase(this);

        DataGenerator.with(database).generateAddress();
        database.addressDao().insert();
        Address[]addresses=database.addressDao().loadAll();
for(Address address:addresses){

    String state=address.getState();
    Log.d("BABY",state);


}
     /*   Logger.displayAdressesInLog(database.addressDao().loadAll());
        Log.d("Shuvo", String.valueOf(database.addressDao().loadAll()));
        Log.d("Rafan", String.valueOf(database.addressDao().findRepositoriesForUser(1)));
        Logger.displayAdressesInLog(database.addressDao().findRepositoriesForUser(5));*/

    }
}
