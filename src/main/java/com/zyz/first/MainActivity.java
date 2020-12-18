package com.zyz.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button linear = findViewById(R.id.linear);
        linear.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.relative).setOnClickListener(v -> startActivity(new Intent(MainActivity.this,RelativeLayoutActivity.class)));

        findViewById(R.id.count).setOnClickListener(v -> startActivity(new Intent(MainActivity.this,CountMathActivity.class)));

        findViewById(R.id.liveData).setOnClickListener(v -> startActivity(new Intent(MainActivity.this,LiveDataActivity.class)));
        findViewById(R.id.spikData).setOnClickListener(v -> startActivity(new Intent(MainActivity.this,DataBindingActivity.class)));
    }


}
