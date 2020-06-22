package com.e.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * xml레이아웃 activity_main으로 view*/
        setContentView(R.layout.activity_main);

        Button btnsys=(Button)findViewById(R.id.btn_con);
        btnsys.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intnt = new Intent(MainActivity.this, ConstraintsActivity.class);
                startActivity(intnt);
            }
        });

        Button btncpu=(Button)findViewById(R.id.btn_lin);
        btncpu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intnt = new Intent(MainActivity.this, LinearActivity.class);
                startActivity(intnt);
            }
        });

        Button btnmem=(Button)findViewById(R.id.btn_rel);
        btnmem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intnt = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(intnt);
            }
        });


        /** =========================================
         *
         * java레이아웃으로 view
        // LinearLayout 레이아웃 생성
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(Color.BLUE);

        // 레이아웃 파라미터 생성
        LinearLayout.LayoutParams linearLayoutParams =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

        // 텍스트뷰를 생성한 후 파라미터 설정
        TextView textView = new TextView(this);
        textView.setText("Text View");
        textView.setTextColor(Color.WHITE);
        textView.setLayoutParams(linearLayoutParams);


        // 생성한 TextView 를 linearLayout 에 추가
        linearLayout .addView(textView);

        // 화면에 표시되도록 setContentView 실행
        setContentView(linearLayout);*/

        /**
        // Contaraint 레이아웃
        ConstraintLayout constraintLayout = new ConstraintLayout(this);

        ConstraintLayout.LayoutParams constraintLayoutParams =
                new ConstraintLayout.LayoutParams(
                        ConstraintLayout.LayoutParams.WRAP_CONTENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT
                );

        Button btn1 = new Button(this);
        btn1.setText("Button with Margin");


        constraintLayout.addView(btn1);

        setContentView(constraintLayout);
        */

/**
        // RelativeLayout 레이아웃
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(Color.LTGRAY);

        RelativeLayout.LayoutParams relativeLayoutParams =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );

        Button btn2 = new Button(this);
        btn1.setText("button2 on relativeLayout");
 ;

        setContentView(relativeLayout);*/
    }
}
