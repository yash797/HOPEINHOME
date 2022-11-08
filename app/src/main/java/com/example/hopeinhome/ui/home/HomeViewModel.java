package com.example.hopeinhome.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Take care of your body...It's the only place where you have to live🙂😃");
    }

    public LiveData<String> getText() {
        return mText;
    }
}