package io.mapwize.app;

import android.app.Application;

import io.mapwize.mapwizeformapbox.AccountManager;


public class MapwizeApplication  extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //AccountManager.start(this, "1f04d780dc30b774c0c10f53e3c7d4ea");
        AccountManager.start(this, "dc973defc077a773be389117281be7fa");
    }

}
