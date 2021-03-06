package org.gemini.gps_onoff;

import android.annotation.TargetApi;
import android.os.Build;
import android.provider.Settings;

public abstract class BluetoothScanActivity extends ActionActivity
{
    protected abstract boolean value();

    @Override
    protected final void action()
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2)
        {
            Settings.Global.putInt(getContentResolver(),
                                   "ble_scan_always_enabled",
                                   value() ? 1 : 0);
        }
    }
}
