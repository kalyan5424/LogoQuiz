package com.appsbyme.logoquiz.ui.main.view.landing;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.appsbyme.logoquiz.R;
import com.appsbyme.logoquiz.ui.main.view.landing.fragments.LandingFragment;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();
    }

    private void initFragment() {
        FragmentManager fgr = getSupportFragmentManager();
        FragmentTransaction transaction = fgr.beginTransaction();
        transaction.addToBackStack(LandingFragment.class.getName());
        transaction.add(R.id.placeHolder, LandingFragment.newInstance());
        transaction.commit();
    }
}