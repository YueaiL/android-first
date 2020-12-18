package com.zyz.first;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.zyz.first.model.CountMathModel;

public class CountMathActivity extends AppCompatActivity {

    CountMathModel model;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.count_math);
//        ViewModelProvider.of{this}.ge
//
//        CountMathModel model = new ViewModelProvider(this).get(CountMathModel.class);
        model = new ViewModelProvider(this).get(CountMathModel.class);
        TextView viewById = findViewById(R.id.textView);
        viewById.setText(String.valueOf(model.number));
        findViewById(R.id.addOne).setOnClickListener(v -> viewById.setText(String.valueOf(model.number++)));
        findViewById(R.id.addTwo).setOnClickListener(v -> viewById.setText(String.valueOf(model.number += 2)));


    }
}
