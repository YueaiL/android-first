package com.zyz.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

public class LinearLayoutActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
        Button spik = findViewById(R.id.spik);
        spik.setOnClickListener(v -> startActivity(new Intent(LinearLayoutActivity.this,MainActivity.class)));
    }
}
