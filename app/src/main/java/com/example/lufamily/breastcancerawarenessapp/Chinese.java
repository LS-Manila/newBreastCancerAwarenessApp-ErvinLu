package com.example.lufamily.breastcancerawarenessapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class Chinese extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                if(position == 0)
                {
                    Intent overviewC = new Intent(getApplicationContext(), OverviewAndFactsC.class);
                    startActivity(overviewC);
                }

                else if(position == 1)
                {
                    Intent symptomsC = new Intent(getApplicationContext(), SymptomsAndTypesC.class);
                    startActivity(symptomsC);
                }

                else if(position == 2)
                {
                    Intent diagnosisC = new Intent(getApplicationContext(), DiagnosisAndTestsC.class);
                    startActivity(diagnosisC);
                }

                else if(position == 3)
                {
                    Intent treatmentC = new Intent(getApplicationContext(), TreatmentAndCareC.class);
                    startActivity(treatmentC);
                }

                else if(position == 4)
                {
                    Intent livingC = new Intent(getApplicationContext(), LivingAndManagingC.class);
                    startActivity(livingC);
                }

                else if(position == 5)
                {
                    Intent supportC = new Intent(getApplicationContext(), SupportAndResourcesC.class);
                    startActivity(supportC);
                }
            }
        };
        ListView listViewE = (ListView) findViewById(R.id.listViewChi);
        listViewE.setOnItemClickListener(itemClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chinese, menu);
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
