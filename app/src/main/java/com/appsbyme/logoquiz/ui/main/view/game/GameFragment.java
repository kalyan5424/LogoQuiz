package com.appsbyme.logoquiz.ui.main.view.game;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.appsbyme.logoquiz.R;
import com.appsbyme.logoquiz.data.model.Logo;
import com.appsbyme.logoquiz.ui.main.viewmodel.LogoViewModel;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GameFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GameFragment extends Fragment {

    private static final String TAG = "GameFragment";
    public static GameFragment newInstance() {
        GameFragment fragment = new GameFragment();
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
        return inflater.inflate(R.layout.fragment_game, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView imageView = getActivity().findViewById(R.id.ivLogo);
        LogoViewModel logoViewModel = new LogoViewModel();

        logoViewModel.getLogos().observe(getActivity(), new Observer<List<Logo>>() {
            @Override
            public void onChanged(List<Logo> currencyPojos) {
                Log.d(TAG, "onChanged: " + currencyPojos.toString());
                Log.d(TAG, "imageURL: " + currencyPojos.get(0).getImgUrl());
                Glide.with(getActivity()).load(currencyPojos.get(0).getImgUrl()).into(imageView);
            }
        });
    }
}