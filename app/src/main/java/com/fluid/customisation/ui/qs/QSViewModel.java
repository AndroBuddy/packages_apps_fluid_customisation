package com.fluid.customisation.ui.qs;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

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