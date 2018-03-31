package com.example.rayhan.learnword.learningsection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rayhan on 3/26/2018.
 */

public class SectionOnedataGenerator {

    private static SectionOnedataGenerator instance;
    private static Database dataBase;

    public static SectionOnedataGenerator with(Database dataBase) {

        if (dataBase == null)
            dataBase = dataBase;

        if (instance == null)
            instance = new SectionOnedataGenerator();

        return instance;
    }


       ArrayList<SectionOneWordGroupEntity> sectionOneWordGroupEntityInstance(String givenWord, String partOfSpeech, String meaning) {
        SectionOneWordGroupEntity sectionOneWordGroupEntity = new SectionOneWordGroupEntity();

        sectionOneWordGroupEntity.givenWord = givenWord;
        sectionOneWordGroupEntity.partOfSpeech = partOfSpeech;
        sectionOneWordGroupEntity.meaning = meaning;


        return sectionOneWordGroupEntity;
    }

    public void generateWord() {
        if (dataBase == null)
            return;

       ArrayList<SectionOneWordGroupEntity>arrayList= new ArrayList<SectionOneWordGroupEntity>();
       arrayList.add(0, (SectionOneWordGroupEntity) sectionOneWordGroupEntityInstance("Cat","Bilai","Yt"));
        arrayList.add(1, (SectionOneWordGroupEntity) sectionOneWordGroupEntityInstance("Cat","Bilai","Yt"));


       dataBase.sectionOneDao().insert(arrayList);






    }


}
