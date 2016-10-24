package com.example.mohammad.test_service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.provider.Settings;
import android.support.v7.app.*;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
/*
    Button start;
    static AlarmManager manager;


    String ExternalFontPath;
    Typeface FontLoaderTypeface;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  start = (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Calendar c = Calendar.getInstance();
                Toast.makeText(getApplicationContext(), ""+c.get(Calendar.SECOND), Toast.LENGTH_LONG).show();
            }
        });*/
/*
        Calendar c = Calendar.getInstance();



        long time = (c.getActualMaximum(Calendar.DAY_OF_MONTH) - c.get(Calendar.DAY_OF_MONTH)) * 24 * 60 * 60 *1000
                + (24 - c.get(Calendar.HOUR_OF_DAY) - 1) * 60 * 60 * 1000
                + (60 - c.get(Calendar.MINUTE) - 1) * 60 * 1000
                + (60 - c.get(Calendar.SECOND)) * 1000 ;*/

/*        Calendar now = Calendar.getInstance();
        Calendar next = Calendar.getInstance();
//        Log.e("MONTH",""+now.get(Calendar.MONTH));
        if(now.get(Calendar.MONTH) == 11)
        {
            next.set(Calendar.YEAR, now.get(Calendar.YEAR)+1);
            next.set(Calendar.MONTH, 0);
        }else{
            next.set(Calendar.MONTH, now.get(Calendar.MONTH)+1);
        }

        next.set(Calendar.DAY_OF_MONTH, 1);
        next.set(Calendar.HOUR_OF_DAY, 0);
        next.set(Calendar.MINUTE, 0);
        next.set(Calendar.SECOND, 0);

        long time = next.getTimeInMillis() - now.getTimeInMillis();

        Intent i = new Intent(this, MyService.class);
        PendingIntent pendingintentResetAlarms = PendingIntent.getService(this, 1, i, PendingIntent.FLAG_UPDATE_CURRENT );


        manager = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);
        manager.set(AlarmManager.RTC_WAKEUP,
                System.currentTimeMillis()+2000, pendingintentResetAlarms);

        Log.e("Info", "Time is ...   "+time);*/


        /*ActionBar actionbar = getSupportActionBar();

        TextView TextViewNewFont = new TextView(MainActivity.this);

        RelativeLayout.LayoutParams layoutparams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        TextViewNewFont.setLayoutParams(layoutparams);

        TextViewNewFont.setText("My balance");

        TextViewNewFont.setTextColor(Color.WHITE);

        TextViewNewFont.setTextSize(27);

        ExternalFontPath = "JFFlat.ttf";

        FontLoaderTypeface = Typeface.createFromAsset(getAssets(), ExternalFontPath);

        TextViewNewFont.setTypeface(FontLoaderTypeface);

        actionbar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

        actionbar.setCustomView(TextViewNewFont);
*/




    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);

        return true;
    }*/
}
