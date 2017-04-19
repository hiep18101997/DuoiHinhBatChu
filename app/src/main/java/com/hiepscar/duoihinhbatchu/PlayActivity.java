package com.hiepscar.duoihinhbatchu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class PlayActivity extends AppCompatActivity {
    //private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // initLayout();
        setContentView(R.layout.main_layout);
    }

//    private void initLayout() {
//        linearLayout = new LinearLayout(this);
//        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
//        linearLayout.setBackgroundColor(Color.GREEN);
//        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,50));
//    }
}
