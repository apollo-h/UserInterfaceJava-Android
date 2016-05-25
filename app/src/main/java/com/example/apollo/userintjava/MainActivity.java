package com.example.apollo.userintjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //add layout
        RelativeLayout pallobsLayout= new RelativeLayout(this);
        pallobsLayout.setBackgroundColor(Color.GREEN);
        //add a button
        Button redButton= new Button(this);
        //set button id
        redButton.setId(1);

        //set button text
        redButton.setText("Click Me");

        //set button color
        redButton.setBackgroundColor(Color.RED);

        //username input
        EditText username = new EditText(this);
        username.setId(2);

        //set a container to put the button give some rules like put in in the middle
        //create an object buttonDetails
        RelativeLayout.LayoutParams buttonDetails= new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        //same action as button
        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        //add username field rules
        usernameDetails.addRule(RelativeLayout.ABOVE, redButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);

        //button rules
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        //convert dip-(density independent pixels) into pixel vales as setwidth value takes only pixles
        Resources r = getResources();
        //dip to pixels
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,
                r.getDisplayMetrics()
                );
        username.setWidth(px);

        //add button to layout
        pallobsLayout.addView(redButton, buttonDetails);
        pallobsLayout.addView(username, usernameDetails);

        //view the layout and the button/set this activities content
        setContentView(pallobsLayout);

    }
}
