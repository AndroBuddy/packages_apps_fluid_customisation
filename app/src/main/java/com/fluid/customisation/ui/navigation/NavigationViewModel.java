package com.fluid.customisation.ui.navigation;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class NavigationViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NavigationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Navigation fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}