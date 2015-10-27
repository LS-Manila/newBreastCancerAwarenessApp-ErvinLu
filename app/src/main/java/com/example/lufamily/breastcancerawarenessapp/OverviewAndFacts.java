package com.example.lufamily.breastcancerawarenessapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class OverviewAndFacts extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview_and_facts);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if(position == 0)
                {
                    Intent anatomy = new Intent(getApplicationContext(), BreastAnatomy.class);
                    startActivity(anatomy);
                }

                else if(position == 1)
                {
                    Intent whatis = new Intent(getApplicationContext(), WhatIsBreastCancer.class);
                    startActivity(whatis);
                }

                else if(position == 2)
                {
                    Intent stages = new Intent(getApplicationContext(), Stages.class);
                    startActivity(stages);
                }

                else if(position == 3)
                {
                    Intent risk = new Intent(getApplicationContext(), Risk.class);
                    startActivity(risk);
                }

                else if(position == 4)
                {
                    Intent prevention = new Intent(getApplicationContext(), Prevention.class);
                    startActivity(prevention);
                }
            }
        };
        ListView listViewE = (ListView) findViewById(R.id.listViewOverview);
        listViewE.setOnItemClickListener(itemClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_overview_and_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
