package com.example.weathertest.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yf on 2017/3/13.
 */

public class city extends DataSupport {
    private int id;
    private int cityCode;
    private int cityName;

    public void setId(int id) {
        this.id = id;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityName(int cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getCityName() {
        return cityName;
    }
}
