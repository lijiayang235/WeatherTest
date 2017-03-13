package com.example.weathertest.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yf on 2017/3/13.
 */

public class County extends DataSupport {
    int id;
    String cityId;
    String countyName;
    String weatherId;

    public void setId(int id) {
        this.id = id;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {
        return id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public String getCityId() {
        return cityId;
    }

    public String getCountyName() {
        return countyName;
    }
}
