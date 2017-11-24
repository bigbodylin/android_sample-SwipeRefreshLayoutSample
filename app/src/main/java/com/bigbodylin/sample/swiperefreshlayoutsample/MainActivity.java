package com.bigbodylin.sample.swiperefreshlayoutsample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView mShowTextView;
    private SwipeRefreshLayout mSwipeRefreshLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initLayout();

        mShowTextView.setText(getString(R.string.show_before_refresh_wording));

        mSwipeRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {


                mShowTextView.setTextColor(Color.parseColor("#FF0000"));
                mShowTextView.setText(getString(R.string.show_after_refresh_wording));
                mSwipeRefreshLayout.setRefreshing(false);
            }
        });

    }


    private void initLayout(){
        mShowTextView = findViewById(R.id.txt_show_wording);
        mSwipeRefreshLayout = findViewById(R.id.text_swipe_refresh_layout);
    }


}
