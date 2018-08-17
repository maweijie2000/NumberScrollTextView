package com.yitaiyun.numberscrolltextview;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

import com.yitaiyun.numscrolltextview.NumScrollUtils;
import com.yitaiyun.numscrolltextview.NumScrollView;


public class MainActivity extends AppCompatActivity {

    NumScrollView numscrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numscrollview = findViewById(R.id.numscrollview);


        numscrollview.setCharacterLists(NumScrollUtils.provideNumberList());//可以有小数点，"/"字符
        numscrollview.setAnimationInterpolator(new DecelerateInterpolator());
        numscrollview.setTypeface(Typeface.MONOSPACE);

    }

    int type = 0;

    public void onClick(View v) {
        switch (type) {
            case 0:
                numscrollview.setText(Double.toString(123.123456));//显示
                type = 1;
                break;
            case 1:
                numscrollview.setText(Double.toString(123.890876));//显示
                type = 2;
                break;
            case 2:
                numscrollview.setText(Double.toString(156.567111));//显示
                type = 3;
                break;
            case 3:
                numscrollview.setText(Double.toString(1156.111764));//显示
                type = 1;
                break;
        }

    }
}
