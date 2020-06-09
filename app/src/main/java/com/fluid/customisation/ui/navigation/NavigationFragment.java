package com.fluid.customisation.ui.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import com.fluid.customisation.R;

public class NavigationFragment extends Fragment {

    private NavigationViewModel navigationViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        navigationViewModel =
                ViewModelProviders.of(this).get(NavigationViewModel.class);
        View root = inflater.inflate(R.layout.fragment_navigation, container, false);
        final TextView textView = root.findViewById(R.id.text_navigation);
        navigationViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
