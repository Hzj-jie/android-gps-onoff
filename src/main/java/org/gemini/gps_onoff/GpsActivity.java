package org.gemini.gps_onoff;

import android.location.LocationManager;
import android.provider.Settings;

public abstract class GpsActivity extends ActionActivity
{
    protected abstract boolean value();

    @Override
    @SuppressWarnings("deprecation")
    protected final void action()
    {
        Settings.Secure.setLocationProviderEnabled(
            getContentResolver(), LocationManager.GPS_PROVIDER, value());
        Settings.Secure.setLocationProviderEnabled(
            getContentResolver(), LocationManager.NETWORK_PROVIDER, value());
        Settings.Secure.setLocationProviderEnabled(
            getContentResolver(), LocationManager.PASSIVE_PROVIDER, value());
    }
}
