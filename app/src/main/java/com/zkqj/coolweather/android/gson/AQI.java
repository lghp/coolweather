package com.zkqj.coolweather.android.gson;

/**
 * Created by window on 2017/10/28.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
