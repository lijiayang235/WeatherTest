package com.example.weathertest.gson;

/**
 * Created by yf on 2017/3/13.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
