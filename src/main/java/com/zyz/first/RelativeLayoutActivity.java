package com.zyz.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

public class RelativeLayoutActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
        Button button = findViewById(R.id.black);
        button.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(RelativeLayoutActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
