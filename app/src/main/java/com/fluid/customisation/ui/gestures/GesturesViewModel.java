package com.fluid.customisation.ui.gestures;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GesturesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GesturesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Gestures fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}