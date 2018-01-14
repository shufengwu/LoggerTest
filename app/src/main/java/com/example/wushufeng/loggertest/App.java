package com.example.wushufeng.loggertest;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.CsvFormatStrategy;
import com.orhanobut.logger.DiskLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

import timber.log.Timber;

/**
 * Created by wushufeng on 2018/1/14.
 */

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

    }
}
