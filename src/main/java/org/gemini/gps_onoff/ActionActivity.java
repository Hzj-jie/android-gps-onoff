package org.gemini.gps_onoff;

import android.app.Activity;
import android.os.Bundle;
import android.os.Process;

public abstract class ActionActivity extends Activity
{
    protected abstract void action();

    @Override
    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        action();
        finish();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Process.killProcess(Process.myPid());
        System.exit(0);
    }
}
