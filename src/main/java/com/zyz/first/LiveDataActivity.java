package com.zyz.first;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.zyz.first.model.ModelViewWithLiveData;

public class LiveDataActivity extends AppCompatActivity {

    TextView welText;
    ImageButton imageGood,imageDown;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.live_data);

        welText = findViewById(R.id.liveTextView);
        imageDown = findViewById(R.id.imageDown);
        imageGood = findViewById(R.id.imageGood);
        ModelViewWithLiveData model = new ViewModelProvider(this).get(ModelViewWithLiveData.class);
        model.getNumber().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                welText.setText(String.valueOf(integer));
            }
        });

        imageGood.setOnClickListener(v -> model.addNumber(1));
        imageDown.setOnClickListener(v -> model.addNumber(-1));

    }
}
