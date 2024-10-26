package com.ncwu.paddlepaddle.djiflightcontrol;

import android.app.Application;
import android.content.Context;

import com.cySdkyc.clx.Helper;

public class MApplication extends Application {

    @Override
    protected void attachBaseContext(Context paramContext) {
        super.attachBaseContext(paramContext);
        Helper.install(MApplication.this);
    }
}
