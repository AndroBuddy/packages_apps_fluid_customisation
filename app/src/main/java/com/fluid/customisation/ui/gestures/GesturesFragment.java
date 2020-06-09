package com.fluid.customisation.ui.gestures;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
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
