package com.example.rayhan.learnword.learningsection;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.ArrayList;

/**
 * Created by Rayhan on 3/26/2018.
 */

@Entity
public class SectionOneWordGroupEntity extends ArrayList<SectionOneWordGroupEntity> {

    @PrimaryKey(autoGenerate = true)
    public int sectionOneId;


    public String givenWord;
    public String partOfSpeech;
    public String meaning;


    public int getSectionOneId() {
        return sectionOneId;
    }

    public void setSectionOneId(int sectionOneId) {
        this.sectionOneId = sectionOneId;
    }

    public String getGivenWord() {
        return givenWord;
    }

    public void setGivenWord(String givenWord) {
        this.givenWord = givenWord;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

}
