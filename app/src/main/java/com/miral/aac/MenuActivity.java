package com.miral.aac;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    private LinearLayout backgroundLayout;
    private TextView backgroundName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initBackground();
    }

    private void initBackground(){
        backgroundLayout = (LinearLayout) findViewById(R.id.backgroundLayout);
        backgroundName = (TextView) findViewById(R.id.header_text);

        int menuColor = getIntent().getIntExtra("MENU_COLOR", Color.WHITE);
        String menuName = getIntent().getStringExtra("MENU_NAME");

        backgroundLayout.setBackgroundColor(menuColor);
        backgroundName.setText(menuName);
    }

    public void moveBack(View v){
        Log.i("Nyyynyyy", "Move Back");
        finish();
    }

    public void moveHome(View v){
        Log.i("Nyyynyyy", "Move Home");
        finish();
    }
}
