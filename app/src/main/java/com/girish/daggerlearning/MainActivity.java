package com.girish.daggerlearning;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject DataSource mDataSource;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getMyComponent().inject(this);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text1);
        textView.setText(mDataSource.getData());
    }
}
