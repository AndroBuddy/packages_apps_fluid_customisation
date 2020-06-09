package com.fluid.customisation.ui.gestures;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

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