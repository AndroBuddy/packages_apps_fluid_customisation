package com.fluid.customisation.ui.statusbar;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class StatusBarViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public StatusBarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Status Bar fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}