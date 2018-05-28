    package com.richardcar.alarma;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int ALARM_REQUEST_CODE = 1;
    private AlarmManager alarmMgr;
    private PendingIntent alarmIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        establecerAlarmaClick(0);

    }

        public void establecerAlarmaClick(int when){
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            Date date = new Date();
            String fecha = dateFormat.format(date);

            alarmMgr = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);
            Intent intent  = new Intent(this, MyReceiver.class);

            alarmIntent = PendingIntent.getBroadcast(this, 0, intent,  0);

            alarmMgr.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), alarmIntent);
        }



        @Override
        public void onClick(View v) {

        }
    }
