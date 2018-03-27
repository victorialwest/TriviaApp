package com.example.victoriawest.triviaapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by victoriawest on 3/26/18.
 */

public class QuestionCreatorFragment extends Fragment {

    private Callback callback;

    public QuestionCreatorFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question_creator, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    public static QuestionCreatorFragment newInstance() {
        QuestionCreatorFragment fragment = new QuestionCreatorFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }

    public void attachView(Callback callback) {
        this.callback = callback;

    }


}






