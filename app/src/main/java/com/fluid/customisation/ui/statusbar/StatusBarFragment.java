package com.fluid.customisation.ui.statusbar;

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

public class StatusBarFragment extends Fragment {

    private StatusBarViewModel statusbarViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        statusbarViewModel =
                ViewModelProviders.of(this).get(StatusBarViewModel.class);
        View root = inflater.inflate(R.layout.fragment_status_bar, container, false);
        final TextView textView = root.findViewById(R.id.text_statusbar);
        statusbarViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
