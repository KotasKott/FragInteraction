package com.example.user.fraginteraction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FirstFragment.FirstFragmentListener, SecondFragment.SecondFragmentListener, ThirdFragment.{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment firstFragment = new FirstFragment();
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.container, firstFragment, firstFragment.getClass().getName())
                .commit();


    }

    @Override
    public void showSecondFragment() {
        SecondFragment secondFragment = new SecondFragment();
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.container,secondFragment,secondFragment.getClass().getName())
                .commit();
    }

    @Override
    public void showThirdFragment() {
        ThirdFragment thirdFragment = new ThirdFragment();
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.container,thirdFragment,thirdFragment.getClass().getName())
                .commit();
    }




}
