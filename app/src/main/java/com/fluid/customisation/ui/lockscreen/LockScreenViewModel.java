package com.fluid.customisation.ui.lockscreen;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class LockScreenViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LockScreenViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Lock Screen fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}