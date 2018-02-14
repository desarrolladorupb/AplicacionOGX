package com.example.user.practicafragment;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
    implements FragmentRed.OnFragmentInteractionListener,FragmentBlue.OnFragmentInteractionListener,FragmentGreen.OnFragmentInteractionListener{

    FragmentBlue fragmentBlue;
    FragmentRed fragmentRed;
    FragmentGreen fragmentGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentBlue=new FragmentBlue();
        fragmentRed=new FragmentRed();
        fragmentGreen=new FragmentGreen();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragment,fragmentRed).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void onClick(View view) {
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();

        switch (view.getId()){
            case R.id.btn1:
                    transaction.replace(R.id.contenedorFragment,fragmentRed);
                break;
            case R.id.btn2:
                transaction.replace(R.id.contenedorFragment,fragmentBlue);
                break;
            case R.id.btn3:
                transaction.replace(R.id.contenedorFragment,fragmentGreen);
                break;
        }

        transaction.commit();
    }
}
