package com.zyz.first.model;

import android.nfc.tech.NfcB;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ModelViewWithLiveData extends ViewModel {

    private MutableLiveData<Integer> number;

    public MutableLiveData<Integer> getNumber() {
        if(number == null){
            number = new MutableLiveData<>();
            number.setValue(0);
        }
        return number;
    }

    public void addNumber(Integer i){
        number.setValue(number.getValue()+i);
    }
}
