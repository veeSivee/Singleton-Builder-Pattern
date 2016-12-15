package com.vi.singlebuilderpattern.main;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vi.singlebuilderpattern.R;
import com.vi.singlebuilderpattern.builder.BuilderActivity;
import com.vi.singlebuilderpattern.single.SingletonActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainContract.View, View.OnClickListener{

    private MainContract.Presenter presenter;

    @BindView(R.id.btn_single)
    Button btnSingletonBuilder;

    @BindView(R.id.btn_builder)
    Button btnBuilderPattern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initPresenter();

        init();

    }

    private void init(){

        ButterKnife.bind(this);

        btnSingletonBuilder.setOnClickListener(this);
        btnBuilderPattern.setOnClickListener(this);

    }

    private void initPresenter() {
        new MainPresenter(this);
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void gotoSingleActivity() {
        startActivity(new Intent(this, SingletonActivity.class));
    }

    @Override
    public void gotoBuilderActivity() {
        startActivity(new Intent(this, BuilderActivity.class));
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_single :
                presenter.singleButtonClicked();
                break;

            case R.id.btn_builder :
                presenter.builderButtonClicked();
                break;
        }
    }
}
