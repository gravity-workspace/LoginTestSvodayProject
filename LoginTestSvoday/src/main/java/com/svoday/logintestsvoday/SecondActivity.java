package com.svoday.logintestsvoday;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by suoday on 13-7-15.
 */
public class SecondActivity extends Activity {

    private TextView mTextView03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTextView03 = (TextView) findViewById(R.id.myTextView3);

        mTextView03.setOnClickListener(new TextView.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setClass(SecondActivity.this, FirstActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
