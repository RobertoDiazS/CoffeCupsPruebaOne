package com.bobbyman.coffecups.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.bobbyman.coffecups.R;

public class MainActivity extends AppCompatActivity {

    private CoffysCups coffeeCups = new CoffysCups(0,"",false);
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

         coffeeCups.setStrains();

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sugar=coffeeCups.getSugar();
                coffeeCups.setSugar(sugar+1);
                String msg = coffeeCups.recommendedStrain() + " " + coffeeCups.getSugar();
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

            }

        });

        setFabLong();
        setMenu();

    }

    private void setMenu(){
        TextView textView=(TextView)findViewById(R.id.coffesTv);
        textView.setText(coffeeCups.allStrains());

    }

    private void setFabLong () {
        fab.OnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                int sugar = coffeeCups.getSugar();
                coffeeCups.setSugar(sugar - 1);
                String msg = coffeeCups.recommendedStrain() + " " + coffeeCups.getSugar();
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                return true;
            }

        });

    }

}





