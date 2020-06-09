package com.fluid.customisation.ui.lockscreen;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fluid.customisation.R;

public class LockScreenFragment extends Fragment {

    private LockScreenViewModel lockscreenViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        lockscreenViewModel =
                ViewModelProviders.of(this).get(LockScreenViewModel.class);
        View root = inflater.inflate(R.layout.fragment_lockscreen, container, false);
        final TextView textView = root.findViewById(R.id.text_lockscreen);
        lockscreenViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
