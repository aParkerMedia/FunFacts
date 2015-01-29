package com.aparkermedia.funfacts;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.view.MenuItem;

import java.util.Random;


public class FunFactsActivity extends ActionBarActivity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare our view variables

        final TextView funFactsLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        final View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fact = mFactBook.getFact();
                int colorWheel = mColorWheel.getColor();

                funFactsLabel.setText(fact);
                relativeLayout.setBackgroundColor(colorWheel);
                showFactButton.setTextColor(colorWheel);
            }


        };
        showFactButton.setOnClickListener(listener);

        //Toast.makeText(this, "Yay the app works!!", Toast.LENGTH_LONG).show();
    }
}
