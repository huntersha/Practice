package com.hunter.practice;

import android.app.Application;
import android.content.Context;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * @Description: java类作用描述
 * @Author: Hunter
 * @CreateDate: 2018/8/13 21:02
 */
public class App extends Application {
    private static App sInstance;
    public static App getInstance(){
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;

        /*FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)  // (Optional) Whether to show thread info or not. Default true
                .methodCount(0)         // (Optional) How many method line to show. Default 2
                .methodOffset(7)        // (Optional) Hides internal method calls up to offset. Default 5
                 // (Optional) Changes the log strategy to print out. Default LogCat
                .tag("My custom tag")   // (Optional) Global tag for every log. Default PRETTY_LOGGER
                .build();*/

        Logger.addLogAdapter(new AndroidLogAdapter());
    }

    public static Context getAppContext(){
        return App.getInstance().getApplicationContext();
    }

}
