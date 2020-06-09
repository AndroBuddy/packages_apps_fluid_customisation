package com.fluid.customisation.ui.statusbar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

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