package com.example.administrator.nestfragment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListen();
    }

    private void initListen() {

    }

    private void initView() {

        frameLayout = (FrameLayout) findViewById(R.id.fl);

        getSupportFragmentManager().beginTransaction().add(R.id.fl,new Fragment01(),null).commit();

    }
}
