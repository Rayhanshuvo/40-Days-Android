package com.example.rayhan.makingmcq;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Rayhan on 3/19/2018.
 */


@Entity(tableName = "question")
public class QuestionAnswetable {


    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name="question")
    private String question;
    @ColumnInfo(name="optionOne")
    private String optionOne;
    @ColumnInfo(name="optionTwo")
    private String optionTwo;
    @ColumnInfo(name="optionThree")
    private String optionThree;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public void setOptionTwo(String optionTwo) {
        this.optionTwo = optionTwo;
    }

    public String getOptionThree() {
        return optionThree;
    }

    public void setOptionThree(String optionThree) {
        this.optionThree = optionThree;
    }

    public QuestionAnswetable(String question, String optionOne, String optionTwo, String optionThree) {
        this.question = question;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
    }
}
