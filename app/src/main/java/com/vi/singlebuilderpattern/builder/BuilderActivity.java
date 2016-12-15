package com.vi.singlebuilderpattern.builder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vi.singlebuilderpattern.R;

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);

        setTitle("Singleton Pattern");
    }
}
