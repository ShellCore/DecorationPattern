package com.shellcore.android.decorationpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.shellcore.android.decorationpattern.breads.Bagel;
import com.shellcore.android.decorationpattern.breads.LowFatButter;
import com.shellcore.android.decorationpattern.breads.Open;
import com.shellcore.android.decorationpattern.breads.Toasted;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bagel bagel = new Bagel();

        LowFatButter spread = new LowFatButter(bagel);

        Toasted toasted = new Toasted(spread);

        Open open = new Open(toasted);

        Log.d(TAG, open.getDescription() + ": " + open.getKcal());
    }
}
