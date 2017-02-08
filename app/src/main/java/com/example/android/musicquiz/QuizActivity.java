package com.example.android.musicquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/*Serve as a controller
* Controller objects tie the view and model objects together. They contain “application logic.”
* Controllers are designed to respond to various events triggered by view objects and to manage
* the flow of data to and from model objects and the view layer. In Android, a controller is
* typically a subclass of Activity, Fragment, or Service.
*/
public class QuizActivity extends AppCompatActivity {
    Button mTrueButton;
    Button mFalseButton;
    Button mNextButton;

    TextView mQuestionTextView;

    private TrueFalse[] mQuestionBank = new TrueFalse[]{
        new TrueFalse(R.string.question_bach, false),
        new TrueFalse(R.string.question_mozart, true),
        new TrueFalse(R.string.question_beethoven, false),
        new TrueFalse(R.string.question_wagner, false),
        new TrueFalse(R.string.question_chopin, false),
        new TrueFalse(R.string.question_bach, false),
        new TrueFalse(R.string.question_mendelssohn, true),
        new TrueFalse(R.string.question_mozart, true),
        new TrueFalse(R.string.question_brahms, false),
        new TrueFalse(R.string.question_bach, false),
        new TrueFalse(R.string.question_wagner, false),
        new TrueFalse(R.string.question_chopin, false),
        new TrueFalse(R.string.question_bach, false),
        new TrueFalse(R.string.question_mendelssohn, true),
        new TrueFalse(R.string.question_berg, false),
        new TrueFalse(R.string.question_mozart, true),
        new TrueFalse(R.string.question_krenek, false),
        new TrueFalse(R.string.question_beethoven, false)
    };

    int mCurrentIndex = 0;

    private void updateQuestion(){
        int question = mQuestionBank[mCurrentIndex].getQuestion();
        mQuestionTextView.setText(question);
        //mQuestionTextView = (TextView) findViewById(R.id.question_text_view);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mQuestionTextView = (TextView)findViewById(R.id.question_text_view);
        //int question = mQuestionBank[mCurrentIndex].getQuestion();
        //mQuestionTextView.setText(question);
        /*
        Wiring up the TextView
         */
        // Set text to first question in array
        mTrueButton = (Button) findViewById(R.id.true_button);
        /* anonymous inner class*/
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* this refers to the View.OnClickListener. */
                //updateQuestion();
                Toast.makeText(QuizActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();

            }
        });
        mFalseButton = (Button) findViewById(R.id.false_button);
        /* anonymous inner class*/
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* this refers to the View.OnClickListener. */
                //updateQuestion();
                Toast.makeText(QuizActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT).show();
            }
        });
        mNextButton = (Button) findViewById(R.id.next_button);
         /* anonymous inner class*/
        mNextButton.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
                /* Wiring up the new button */
               mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
               //int question = mQuestionBank[mCurrentIndex].getQuestion();
               //mQuestionTextView.setText(question);
               updateQuestion();
           }
        });
        updateQuestion();
    }
    /*Toast is a click of button that trigger a short message that informs the user of something*/
    public static Toast makeText(Context context, int resID, int duration) {
        /*
        The Context parameter is typically an instance of Activity (Activity is a subclass of Context).
        The second parameter is the resource ID of the string that the toast should display.
        The Context is needed by the Toast class to be able to find and use the string’s resource ID.
        The third parameter is usually one of two Toast constants that specify how long the toast should be visible.
         */
        return null;
    }
    /*
    Create an array of TrueFalse objects, and interact with the TextViuew and Buttons to dislay Questions
     */
    /*  Create a method to check answers
    public void checkAnswer(boolean userPressedTrue){
        boolean answerIsTrue = mQuestionBank[mCurrentIndex].isTrueQuestion();
        int messageResID = 0;
        if(userPressedTrue == answerIsTrue){
            messageResID = R.string.correct_toast;
        }
        else{
            messageResID = R.string.incorrect_toast;
        }
        Toast.makeText(this, messageResID, Toast.LENGTH_SHORT).show();
        */
}

