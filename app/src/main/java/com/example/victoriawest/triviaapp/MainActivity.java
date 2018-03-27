package com.example.victoriawest.triviaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements Callback {

    private QuestionCreatorFragment questionCreatorFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.add_question_button)
    protected void addQuestionClick(View view){
        questionCreatorFragment = QuestionCreatorFragment.newInstance();
        questionCreatorFragment.attachView(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, questionCreatorFragment).commit();

    }

}
