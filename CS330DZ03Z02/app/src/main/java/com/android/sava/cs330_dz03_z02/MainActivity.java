package com.android.sava.cs330_dz03_z02;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        CreateMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return MenuChoice(item);
    }

    public void onClick1(View v) {
        Toast.makeText(this, "DA! Vi jeste student " + s, Toast.LENGTH_LONG).show();
    }
    public void onClick2(View v) {
        Toast.makeText(this, "NE! Vi niste student " + s, Toast.LENGTH_LONG).show();
    }


    public void CreateMenu(Menu menu) {
        final MenuItem mi1 = menu.add(0, 0, 0, "FIT");
        {
            mi1.setIcon(R.mipmap.ic_launcher);
            mi1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM | MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        }
        MenuItem mi2 = menu.add(0, 1, 1, "Fakultet za menadžment");
        {
            mi2.setIcon(R.mipmap.ic_launcher);
            mi2.setShowAsAction( MenuItem.SHOW_AS_ACTION_IF_ROOM | MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        }
        MenuItem mi3 = menu.add(0, 2, 2, "Fakultet digitalnih umetnosti");
        {
            mi3.setIcon(R.mipmap.ic_launcher);
            mi3.setShowAsAction( MenuItem.SHOW_AS_ACTION_IF_ROOM | MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        }
    }

    private boolean MenuChoice(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Toast.makeText(this, "Odabrali ste ikonu aplikacije!", Toast.LENGTH_LONG).show();
                Intent i = new Intent(this, MainActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                return true;
            case 0:
                Toast.makeText(this, "Odabrali ste " + item.toString(), Toast.LENGTH_LONG).show();
                s = item.toString();
                return true;
            case 1:
                Toast.makeText(this, "Odabrali ste " + item.toString(), Toast.LENGTH_LONG).show();
                s = item.toString();
                return true;
            case 2:
                Toast.makeText(this, "Odabrali ste " + item.toString(), Toast.LENGTH_LONG).show();
                s = item.toString();
                return true;
        }
        return false;
    }
}
