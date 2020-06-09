package com.fluid.customisation.ui.qs;

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

public class QSFragment extends Fragment {

    private QSViewModel qsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        qsViewModel =
                ViewModelProviders.of(this).get(QSViewModel.class);
        View root = inflater.inflate(R.layout.fragment_qs, container, false);
        final TextView textView = root.findViewById(R.id.text_qs);
        qsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
