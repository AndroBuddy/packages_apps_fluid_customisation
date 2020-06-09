package com.fluid.customisation.ui.lockscreen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

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