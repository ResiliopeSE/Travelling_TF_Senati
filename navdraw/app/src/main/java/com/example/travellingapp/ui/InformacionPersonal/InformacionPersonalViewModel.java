package com.example.travellingapp.ui.InformacionPersonal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InformacionPersonalViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public InformacionPersonalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}