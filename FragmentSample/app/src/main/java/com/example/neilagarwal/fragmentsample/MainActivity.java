package com.example.neilagarwal.fragmentsample;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnNextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNextPage = (Button) findViewById(R.id.button);
        btnNextPage.setOnClickListener(this);
        addLoginFragment();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                addLifeCycleFragment();
                break;
            default:
                Toast.makeText(getApplicationContext(), "From Fragment", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    /**
     *
     */
    private void addLoginFragment() {
        LoginFragment loginFragment = LoginFragment.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, loginFragment, LoginFragment.class.getSimpleName());
        fragmentTransaction.commit();
    }

    /**
     *
     */
    private void addLifeCycleFragment() {
        LifeCycleFragment lifeCycleFragment = LifeCycleFragment.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, lifeCycleFragment, LifeCycleFragment.class.getSimpleName());
        fragmentTransaction.addToBackStack(LoginFragment.class.getSimpleName());
        fragmentTransaction.commit();
    }
}
