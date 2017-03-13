package com.example.weathertest.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yf on 2017/3/13.
 */

public class county extends DataSupport {
    int id;
    int countyCode;
    String countyName;
    String weatherId;

    public void setId(int id) {
        this.id = id;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
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

    public int getCountyCode() {
        return countyCode;
    }

    public String getCountyName() {
        return countyName;
    }
}
