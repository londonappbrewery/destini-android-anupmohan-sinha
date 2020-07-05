package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryText;
    Button mButtonTop;
    Button mButttonBottom;
    int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButttonBottom = findViewById(R.id.buttonBottom);
        mStoryIndex = 1;
        updateScreen();

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    mStoryIndex = 3;
                } else if(mStoryIndex == 2) {
                    mStoryIndex = 3;
                } else if(mStoryIndex == 3) {
                    mStoryIndex = 6;
                }
                updateScreen();
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    mStoryIndex = 2;
                } else if(mStoryIndex == 2) {
                    mStoryIndex = 4;
                } else if(mStoryIndex == 3) {
                    mStoryIndex = 5;
                }
                updateScreen();
            }
        });



    }

    private void updateScreen() {
        switch (mStoryIndex) {
            case 1:
                mStoryText.setText(R.string.T1_Story);
                mButtonTop.setText(R.string.T1_Ans1);
                mButttonBottom.setText(R.string.T1_Ans2);
                break;
            case 2:
                mStoryText.setText(R.string.T2_Story);
                mButtonTop.setText(R.string.T2_Ans1);
                mButttonBottom.setText(R.string.T2_Ans2);
                break;
            case 3:
                mStoryText.setText(R.string.T3_Story);
                mButtonTop.setText(R.string.T3_Ans1);
                mButttonBottom.setText(R.string.T3_Ans2);
                break;
            case 4:
                mStoryText.setText(R.string.T4_End);
                mButtonTop.setVisibility(View.GONE);
                mButttonBottom.setVisibility(View.GONE);
                break;
            case 5:
                mStoryText.setText(R.string.T5_End);
                mButtonTop.setVisibility(View.GONE);
                mButttonBottom.setVisibility(View.GONE);
                break;
            case 6:
                mStoryText.setText(R.string.T6_End);
                mButtonTop.setVisibility(View.GONE);
                mButttonBottom.setVisibility(View.GONE);
                break;
        }
    }
}
