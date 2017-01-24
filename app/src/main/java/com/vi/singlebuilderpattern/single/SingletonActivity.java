package com.vi.singlebuilderpattern.single;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vi.singlebuilderpattern.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SingletonActivity extends AppCompatActivity implements SingleContract.View, View.OnClickListener {

    @BindView(R.id.btn_single_click)
    Button btnSingleClick;

    @BindView(R.id.btn_non_single_click)
    Button btnNonSingleClick;

    @BindView(R.id.tv_single_pid)
    TextView tvSingleton;

    @BindView(R.id.tv_non_single_pid)
    TextView tvNonSingleton;

    private SingleContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

        setTitle(getString(R.string.title_singleton));

        initPresenter();

        init();
    }

    private void init(){

        ButterKnife.bind(this);

        btnSingleClick.setOnClickListener(this);
        btnNonSingleClick.setOnClickListener(this);
        tvSingleton.setMovementMethod(new ScrollingMovementMethod());
        tvNonSingleton.setMovementMethod(new ScrollingMovementMethod());
    }

    private void initPresenter(){
        new SingletonPresenter(this);
    }

    @Override
    public void setPresenter(SingleContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onGetPidSingletonSuccess(String pidClass) {
        tvSingleton.setText(pidClass);
    }

    @Override
    public void onGetPidSingletonFailed(String message) {
        tvSingleton.setText(message);
    }

    @Override
    public void onGetPidNonSingletonSuccess(String pidClass) {
        tvNonSingleton.setText(pidClass);
    }

    @Override
    public void onGetPidNonSingletonFailed(String message) {
        tvNonSingleton.setText(message);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_single_click:
                presenter.buttonSingletonClicked(tvSingleton.getText().toString());
                break;

            case R.id.btn_non_single_click:
                presenter.buttonNonSingletonClicked(tvNonSingleton.getText().toString());
                break;
        }

    }
}
