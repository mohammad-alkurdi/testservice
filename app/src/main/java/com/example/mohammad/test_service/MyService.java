package com.example.mohammad.test_service;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by Mohammad on 10/11/2016.
 */
public class MyService extends IntentService {

    AlarmManager mng;

    public MyService()
    {
        super("");

    }

    @Override
    protected void onHandleIntent(Intent intent) {


        Calendar now = Calendar.getInstance();

        Calendar next = Calendar.getInstance();
        next.set(Calendar.MONTH, now.get(Calendar.MONTH)+1);
        next.set(Calendar.DAY_OF_MONTH, 1);
        next.set(Calendar.HOUR_OF_DAY, 0);
        next.set(Calendar.MINUTE, 0);
        next.set(Calendar.SECOND, 0);

        long time = next.getTimeInMillis() - now.getTimeInMillis();


     /*   long time = (c.getActualMaximum(Calendar.DAY_OF_MONTH) - c.get(Calendar.DAY_OF_MONTH)) * 24 * 60 * 60 *1000
                + (24 - c.get(Calendar.HOUR_OF_DAY) - 1) * 60 * 60 * 1000
                + (60 - c.get(Calendar.MINUTE) - 1) * 60 * 1000
                + (60 - c.get(Calendar.SECOND)) * 1000 ;*/

        Intent i = new Intent(this,MyService.class);

        PendingIntent pendingintentResetAlarms = PendingIntent.getService(this, 1, i, PendingIntent.FLAG_UPDATE_CURRENT );

        mng = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);
        mng.set(AlarmManager.RTC_WAKEUP,
                System.currentTimeMillis()+2000, pendingintentResetAlarms);

        Log.e("Info", "Service started...   "+time);

    }
}
