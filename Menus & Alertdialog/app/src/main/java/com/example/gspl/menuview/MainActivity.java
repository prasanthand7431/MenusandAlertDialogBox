package com.example.gspl.menuview;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
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
        getMenuInflater().inflate(R.menu.obj,menu);
        return super.onCreateOptionsMenu(menu);
        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String p=item.getTitle().toString();
        if(p.equals("Home")){
            AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
            alert.setTitle("success");
            alert.setMessage("do you want logout");
            alert.setIcon(android.R.drawable.ic_media_play);
            alert.setPositiveButton("ok",null);
            alert.setNegativeButton("cancel",null);
            alert.setNeutralButton("Dhinesh", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Toast.makeText(MainActivity.this, "you are clicked Dhinesh", Toast.LENGTH_SHORT).show();


                }
            });
            alert.show();



        }
        return super.onOptionsItemSelected(item);

    }
}
