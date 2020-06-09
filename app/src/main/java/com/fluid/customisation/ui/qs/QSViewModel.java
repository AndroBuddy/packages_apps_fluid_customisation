package com.fluid.customisation.ui.qs;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class QSViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public QSViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Quick Settings fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}