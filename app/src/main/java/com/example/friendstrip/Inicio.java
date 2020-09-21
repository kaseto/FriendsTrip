package com.example.friendstrip;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Inicio extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;

    private HomeFragment homeFragment;
    private ProfileFragment profileFragment;
    private MessageFragment messageFragment;
    private OptionsFragment optionsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        homeFragment = new HomeFragment();
        profileFragment = new ProfileFragment();
        messageFragment = new MessageFragment();
        optionsFragment = new OptionsFragment();

        bottomNavigationView = findViewById(R.id.bottomNav);
        frameLayout = findViewById(R.id.frameLayout);

        setFragment(homeFragment);


      bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
          @Override
          public boolean onNavigationItemSelected(@NonNull MenuItem item) {
              switch (item.getItemId()) {
                  case R.id.home:
                      setFragment(homeFragment);
                      return true;

                  case R.id.profile:
                      setFragment(profileFragment);
                      return true;

                  case R.id.message:
                      setFragment(messageFragment);
                      return true;

                  case R.id.options:
                      setFragment(optionsFragment);
                      return true;

              }
              return false;
          }
      });
    }
            private void setFragment(Fragment fragment) {

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout, fragment);
                fragmentTransaction.commit();
            }
        }
