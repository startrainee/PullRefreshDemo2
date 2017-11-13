package com.snakotech.mypullrefreshdemo;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.snakotech.R;

public class PushHeadLayout extends LinearLayoutCompat {



    public PushHeadLayout(Context context) {
        super(context);
        init(context);
    }

    public PushHeadLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public PushHeadLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {

        View viewContainer = LayoutInflater.from(context).inflate(R.layout.pull_refresh_header,null);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT);
        addView(viewContainer, params);

    }

}
