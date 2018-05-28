package com.richardcar.alarma;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

/**
 * Created by richard on 27/05/2018.
 */

public class MyReceiver extends android.content.BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "APAGA TU BLUETOOTH, TU INFORMACIÓN ESTA EXPUESTA A SER VULNERADA", Toast.LENGTH_LONG).show();
        Vibrator v =(Vibrator) context.getSystemService(context.VIBRATOR_SERVICE);
        v.vibrate(10000);

    }
}
