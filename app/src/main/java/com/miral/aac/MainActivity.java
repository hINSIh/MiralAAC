package com.miral.aac;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button[] btnMenus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenus = new Button[]{
                (Button)findViewById(R.id.menu_action)
        };
    }

    public void openMenu(View v){
        Log.i("Nyyynyyy", "Open Menu");
        Intent menuIntent = new Intent(MainActivity.this, MenuActivity.class);

        String menuName = ((Button) v).getText().toString();
        int menuColor = ((ColorDrawable)v.getBackground()).getColor();

        menuName = menuName.replace('\n', ' ');

        Log.i("Nyyynyyy", menuName + " : " + menuColor);

        menuIntent.putExtra("MENU_NAME", menuName);
        menuIntent.putExtra("MENU_COLOR", menuColor);
        startActivity(menuIntent);
    }
}


