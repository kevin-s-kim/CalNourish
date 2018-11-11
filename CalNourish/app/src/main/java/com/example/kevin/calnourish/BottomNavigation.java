package com.example.kevin.calnourish;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private TextView mTextMessage;

//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//            switch (item.getItemId()) {
//                case R.id.info:
//                    mTextMessage.setText("Info");
//                    FragmentOne selectedFragment1 = new FragmentOne();
//                    transaction.replace(R.id.fragmentContainer,selectedFragment1).commit();
//                    return true;
//                    //break;
//                case R.id.categories:
//                    mTextMessage.setText("Categories");
//                    FragmentTwo selectedFragment2 = new FragmentTwo();
//                    transaction.replace(R.id.fragmentContainer,selectedFragment2);
//                    break;
//                case R.id.search:
//                    mTextMessage.setText("Search");
//                    FragmentThree selectedFragment3 = new FragmentThree();
//                    transaction.replace(R.id.fragmentContainer,selectedFragment3);
//                    break;
//            }
//            //transaction.commit();
//            return false;
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //loading the default fragment
        loadFragment(new FragmentOne());

        //getting bottom navigation view and attaching the listener
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.navigation_home:
                fragment = new FragmentOne();
                break;

            case R.id.navigation_dashboard:
                fragment = new FragmentOne();
                break;

            case R.id.navigation_notifications:
                fragment = new FragmentOne();
                break;

            case R.id.navigation_profile:
                fragment = new FragmentOne();
                break;
        }

        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_bottom_navigation);
//        mTextMessage = (TextView) findViewById(R.id.message);
//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
//        navigation.setSelectedItemId(R.id.info);

//        Button infoButton = (Button) findViewById(R.id.button2);
//
//        infoButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent startInfoActivity = new Intent(getApplicationContext(), InfoActivity.class);
//                startActivity(startInfoActivity);
//            }
//        });

    //}

}
