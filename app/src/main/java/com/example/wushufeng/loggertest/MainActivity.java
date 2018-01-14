package com.example.wushufeng.loggertest;

import android.nfc.Tag;
import android.os.Debug;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.CsvFormatStrategy;
import com.orhanobut.logger.DiskLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Url;
import timber.log.Timber;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .tag("wsf")   // (Optional) Global tag for every log. Default PRETTY_LOGGER
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy){
            @Override
            public boolean isLoggable(int priority, String tag) {
                return BuildConfig.DEBUG;
            }
        });
        //testLogger();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.sojson.com/open/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient
                        .Builder()
                        .addInterceptor(new NetworkInterceptor())
                        .build())
                .build();

        GitHubService service = retrofit.create(GitHubService.class);
        service.getMyWeatherList("北京").enqueue(new Callback<WeatherBean>() {

            @Override
            public void onResponse(Call<WeatherBean> call, Response<WeatherBean> response) {
                //Logger.d(response.headers().toString());
                Logger.d(response.body().getData().getPm25());
            }

            @Override
            public void onFailure(Call<WeatherBean> call, Throwable t) {
                Logger.d(t.getMessage());
            }
        });

    }

    public void testLogger(){
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .tag("wsf")   // (Optional) Global tag for every log. Default PRETTY_LOGGER
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy){
            @Override
            public boolean isLoggable(int priority, String tag) {
                return BuildConfig.DEBUG;
            }
        });

        Logger.i("hello world");
        Logger.d("hello world");
        Logger.v("hello world");
        Logger.e("hello world");
        Logger.w("hello world");
        Logger.wtf("hello world");
        Logger.i("hello %s", "China");

        Map<String, String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        Logger.d(map);

        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add("list2");
        list.add("list3");
        Logger.d(list);

        Set<String> set = new HashSet<>();
        set.add("set1");
        set.add("set2");
        set.add("set3");
        Logger.d(set);

        String [] array = new String[]{
                "array1",
                "array2",
                "array3"
        };
        Logger.d(array);

        Log.d(TAG, "onCreate: ");

        String jsonStr = "[" +
                "    {\"userName\":\"test\",\"address\":\"gz\"}," +
                "    {\"userName\":\"ququ\",\"address\":\"gr\"}" +
                "]";
        Logger.json(jsonStr);

        String xmlStr  = "<SMSMSGRECEIVES>" +
                "<SMSMSGRECEIVE>" +
                "<MSGID>2014062940010629110513337600</MSGID>" +
                "<DESTTERMID>12345</DESTTERMID>" +
                "<SRCTERMID>13301639266</SRCTERMID>" +
                "<MSGCONTENT>7890</MSGCONTENT>" +
                "<RECVTIME>2014-06-29 11:05:14</RECVTIME>" +
                "</SMSMSGRECEIVE>" +
                "<SMSMSGRECEIVE>"+
                "<MSGID>2014062940010629105000767600</MSGID>"+
                "<DESTTERMID>12345</DESTTERMID>"+
                "<SRCTERMID>13301639266</SRCTERMID>"+
                "<MSGCONTENT>7890</MSGCONTENT>"+
                "<RECVTIME>2014-06-29 10:50:02</RECVTIME>"+
                "</SMSMSGRECEIVE>"+
                "</SMSMSGRECEIVES>";
        Logger.xml(xmlStr);
    }
}
