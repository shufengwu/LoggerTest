package com.example.wushufeng.loggertest;

import java.io.IOException;
import com.orhanobut.logger.Logger;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by wushufeng on 2018/1/14.
 */

public class NetworkInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        long startTime = System.currentTimeMillis();
        Response response = chain.proceed(request);
        long endTime = System.currentTimeMillis();

        String time = "响应时长(ms)： " +(endTime-startTime)+"";
        String requestStr = "Request：\n"+request.url().toString();
        Logger.d( requestStr+"\n"+time);
        Logger.d("Headers：\n"+response.headers().toString());
        MediaType mediaType = response.body().contentType();
        String string = response.body().string();
        Logger.json(string);
        if (response.body() != null && response.body().contentType() != null) {
            ResponseBody responseBody = ResponseBody.create(mediaType, string);
            return response.newBuilder().body(responseBody).build();
        } else {
            return response;
        }
    }
}
