package com.example.bellawirecalldesign.dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.bellawirecalldesign.ChatFragment;
import com.example.bellawirecalldesign.R;
import com.example.bellawirecalldesign.databinding.ActivityDashboardBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity {
ActivityDashboardBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_dashboard);
        loadFragment(new ChatFragment());
        binding.navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = item -> {
                Fragment fragment;
                switch (item.getItemId()) {
                    case R.id.actionHome:
                        fragment = new ChatFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.actionPlay:
                        fragment = new ChatFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.actionChat:
                        fragment = new ChatFragment();
                        loadFragment(fragment);
                        return true;
                }
                return false;
            };
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}