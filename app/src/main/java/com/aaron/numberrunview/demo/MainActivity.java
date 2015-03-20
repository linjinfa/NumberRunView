package com.aaron.numberrunview.demo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.aaron.numberrunview.demo.view.NumberRunView;


public class MainActivity extends ActionBarActivity {

    private NumberRunView numberRunView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberRunView = (NumberRunView) findViewById(R.id.numberRunView);
//        numberRunView.setShowNum("83218.918899",3);
        numberRunView.setShowNum("221.918899");
        numberRunView.startRun();
    }

    /**
     *
     * @param view
     */
    public void runClick(View view){
        numberRunView.startRun();
    }

}
