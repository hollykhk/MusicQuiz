package com.example.android.musicquiz;

/**
 * Created by hxk132830 on 2/8/2017.
 */

public class TrueFalse extends Object {
    /*
    Serve as a model
    A model object holds the application’s data and “business logic.”
    Model classes are typically designed to model the things your app is concerned with,
    such as a user, a product in a store, a photo on a server, or a television show.
    Or a true-false question. Model objects have no knowledge of the user interface;
    their sole purpose is holding and managing data.
    The mQuestion variable will hold the resource ID (always an int) of a string resource for the question.
    The mTrueQuestion variable indicates whether the statement is true or false.
    In Android applications, model classes are generally custom classes you create.
    All of the model objects in your application compose its model layer.
    MusicQuiz’s model layer consists of the TrueFalse class.
     */
    private int mQuestion;
    private boolean mTrueQuestion;
    public TrueFalse(int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }
    public int getQuestion(){
        return mQuestion;
    }
    public void setQuestion(int question){
        mQuestion = question;
    }
    public boolean isTrueQuestion(){
        return mTrueQuestion;
    }
    public void setTrueQuestion(boolean trueQuestion){
        mTrueQuestion = trueQuestion;
    }
}
