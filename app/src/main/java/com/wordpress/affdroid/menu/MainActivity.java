package com.wordpress.affdroid.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.item1 :
                Toast.makeText(MainActivity.this, "Item 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2 :
                Toast.makeText(MainActivity.this, "Item 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3 :
                Toast.makeText(MainActivity.this, "Item 3", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
