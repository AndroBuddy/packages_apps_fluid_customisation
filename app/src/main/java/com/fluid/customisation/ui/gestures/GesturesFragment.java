package com.fluid.customisation.ui.gestures;

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

public class GesturesFragment extends Fragment {

    private GesturesViewModel gesturesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        gesturesViewModel =
                ViewModelProviders.of(this).get(GesturesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gestures, container, false);
        final TextView textView = root.findViewById(R.id.text_gestures);
        gesturesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
