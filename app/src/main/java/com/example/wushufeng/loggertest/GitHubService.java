package com.example.wushufeng.loggertest;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by wushufeng on 2018/1/14.
 */

public interface GitHubService {
    @GET("weather/json.shtml")
    Call<WeatherBean> getMyWeatherList(@Query("city") String city);
}
