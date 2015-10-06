package com.example.lufamily.breastcancerawarenessapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends ActionBarActivity {

    private String[] lang;
    public Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lang = getResources().getStringArray(R.array.languages);
        spinner = (Spinner) findViewById(R.id.spinnerLanguage);


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lang);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void onClickProceed(View v)
    {
        String lang3 = String.valueOf(spinner.getSelectedItem());   //GET SPINNER VALUE
        Intent output;

        if(lang3.equals("English"))
        {
            output = new Intent(getApplicationContext(), English.class);
            startActivity(output);
        }

        else if(lang3.equals("Filipino"))
        {
            output = new Intent(getApplicationContext(), Filipino.class);
            startActivity(output);
        }

        else if(lang3.equals("Chinese"))
        {
            output = new Intent(getApplicationContext(), Chinese.class);
            startActivity(output);
        }
    }

    public void onClickAbout(View v)
    {
        Intent about = new Intent(getApplicationContext(), Help.class);
        startActivity(about);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
