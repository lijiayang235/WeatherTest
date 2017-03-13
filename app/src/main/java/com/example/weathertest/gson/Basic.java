package com.example.weathertest.gson;

import com.google.gson.annotations.SerializedName;

import java.net.URL;

/**
 * Created by yf on 2017/3/13.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
