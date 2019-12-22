package com.example.tubes_kel_4;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(listener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new FragmentHome()).commit();
    }
    BottomNavigationView.OnNavigationItemSelectedListener listener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment select = null;

            switch (item.getItemId()){
                case R.id.item_home:
                    select = new FragmentHome();
                    break;
                case R.id.item_search:
                    select = new FragmentSearch();
                    break;
                case R.id.item_upload:
                    select = new FragmentHome();
                    break;
                case R.id.item_profile:
                    select = new FragmentSearch();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment,select).commit();

            return true;
        }
    };

}
