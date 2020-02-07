package com.example.basicandroid.ui.profilep;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfilepViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProfilepViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is profilep fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}