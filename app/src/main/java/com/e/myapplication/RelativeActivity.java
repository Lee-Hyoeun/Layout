package com.e.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // RelativeLayout 레이아웃
         RelativeLayout relativeLayout = new RelativeLayout(this);
         relativeLayout.setBackgroundColor(Color.CYAN);

         RelativeLayout.LayoutParams relativeLayoutParams =
                 new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                        );

         Button btn3 = new Button(this);
         btn3.setText("go back home");

        relativeLayout.addView(btn3);

        setContentView(relativeLayout);

         btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intnt = new Intent(RelativeActivity.this, MainActivity.class);
                startActivity(intnt);
            }
         });

    }
}