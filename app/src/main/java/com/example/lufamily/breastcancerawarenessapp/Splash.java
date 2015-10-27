package com.example.lufamily.breastcancerawarenessapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;


public class Splash extends ActionBarActivity {

    private Thread SplashThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Splash splashScreen = this;

        SplashThread =  new Thread(){

            @Override
            public void run(){
                try {
                    synchronized(this){
                        wait(3000);
                    }
                }

                catch(InterruptedException ex){

                }

                finish();

                //findViewById(R.id.progressBarLoading).setVisibility(View.GONE);   //STOP LOADING

                Intent intent = new Intent();
                intent.setClass(splashScreen, Splash2.class);
                startActivity(intent);
            }

        };

        SplashThread.start();

    }

    @Override
    public boolean onTouchEvent(MotionEvent evt)

    {

        if(evt.getAction() == MotionEvent.ACTION_DOWN)

        {

            synchronized(SplashThread){

                SplashThread.notifyAll();

            }

        }

        return true;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash, menu);
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
