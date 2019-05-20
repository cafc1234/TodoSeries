package com.example.todoseries;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import maes.tech.intentanim.CustomIntent;

public class SecondActivity extends AppCompatActivity {
    boolean mIsDualPane = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        //View segundoPanel = findViewById(R.id.panelPrincipal);
       // mIsDualPane = segundoPanel != null && segundoPanel.getVisibility() == View.VISIBLE;


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.panelPrincipal, new SerieFragmento())
                .commit();

    }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.panelPrincipal, new SerieFragmento())
                .commit();
    }

    @Override
    public void finish() {
        super.finish();
        CustomIntent.customType(this,"right-to-left");

    }
}

