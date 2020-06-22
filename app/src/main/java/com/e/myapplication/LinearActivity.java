package com.e.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LinearActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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


        Button btn2 = new Button(this);
        btn2.setText("go back home");

        linearLayout.addView(btn2);

        setContentView(linearLayout);

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intnt = new Intent(LinearActivity.this, MainActivity.class);
                startActivity(intnt);
            }
        });

    }
}
