package com.example.weathertest.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yf on 2017/3/13.
 */

public class City extends DataSupport {
    private int id;
    private String cityCode;
    private String cityName;
    private int provinceId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public String getCityCode() {
        return cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getProvinceId() {
        return provinceId;
    }
}
