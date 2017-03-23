package com.weather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wyh on 2017/3/23.
 */

public class Basic {
    //用注解的方式让json字段和Java字段建立映射关系
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
