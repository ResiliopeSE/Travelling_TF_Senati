package com.example.travellingapp.ui.ViajesDisponibles;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViajesDisponiblesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ViajesDisponiblesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}