package com.weather.android.gson;

/**
 * Created by wyh on 2017/3/23.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
