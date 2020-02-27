package com.example.sampleone.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sampleone.R;
import com.example.sampleone.Utils;
import com.example.sampleone.models.coffee.Coffee;
import com.example.sampleone.models.icecream.IceCream;
import com.example.sampleone.models.snacks.Snack;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

import butterknife.BindView;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";

    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        navigationView = findViewById(R.id.bottom_navigation);

        navigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        openFragment(HomeFragment.newInstance("", ""));

    }

    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            item -> {
                switch (item.getItemId()) {
                    case R.id.navigation_icecream:
                        openFragment(HomeFragment.newInstance("", ""));
                        return true;
                    case R.id.navigation_coffee:
                        openFragment(CoffeeFragment.newInstance("", ""));
                        return true;
                    case R.id.navigation_snacks:
                        openFragment(IceCreamFragment.newInstance("", ""));
                        return true;
                }
                return false;
            };
}
