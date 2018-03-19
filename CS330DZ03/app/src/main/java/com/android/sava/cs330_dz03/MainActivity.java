package com.android.sava.cs330_dz03;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WindowManager wm = getWindowManager();
        Display d = wm.getDefaultDisplay();
        if (d.getWidth() > d.getHeight()) {
            Log.d("Orientation", "Okrenut je ekran na landscape mod");
            Toast.makeText(getBaseContext(), "Landscape", Toast.LENGTH_SHORT).show();
        }
        else {

            Log.d("Orientation", "Okrenut je ekran na portrait mode");
            Toast.makeText(getBaseContext(), "Portrait", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick1(View v) {
        Toast.makeText(getBaseContext(), "Univerzitet Metropolitan", Toast.LENGTH_SHORT).show();
    }

    public void onClick2(View v) {
        Intent i = new Intent("android.intent.action.VIEW");
        i.setData(Uri.parse("https://www.google.rs/maps/place/Metropolitan+University/@44.8303365,20.4525867,17z/data=!3m1!4b1!4m5!3m4!1s0x475a6530da697d59:0xd2bdfbf9d4b80259!8m2!3d44.8303365!4d20.4547754"));
        startActivity(i);
    }
}
