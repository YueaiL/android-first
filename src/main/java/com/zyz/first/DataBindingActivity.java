package com.zyz.first;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.zyz.first.databinding.DataBindingBinding;
import com.zyz.first.model.DataBindingModelView;

public class DataBindingActivity extends AppCompatActivity {

    DataBindingBinding binding;

    DataBindingModelView model ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.data_binding);

        model = new ViewModelProvider(this).get(DataBindingModelView.class);
        binding.setModel(model);
        binding.setLifecycleOwner(this);
    }
}
