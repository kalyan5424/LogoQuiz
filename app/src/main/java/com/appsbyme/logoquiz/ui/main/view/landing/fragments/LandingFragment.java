package com.appsbyme.logoquiz.ui.main.view.landing.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.appsbyme.logoquiz.R;
import com.appsbyme.logoquiz.ui.main.view.game.GameFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LandingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LandingFragment extends Fragment {

    private static final String TAG = "LandingFragment";


    public static LandingFragment newInstance() {
        LandingFragment fragment = new LandingFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_landing, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button launchGame = getActivity().findViewById(R.id.btnStartGame);
        launchGame.setOnClickListener(v -> launchGameFragment());
    }

    private void launchGameFragment() {
        FragmentManager fgr = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = fgr.beginTransaction();
        transaction.addToBackStack(LandingFragment.class.getName());
        transaction.replace(R.id.placeHolder, GameFragment.newInstance());
        transaction.commit();
    }
}