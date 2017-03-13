package com.example.weathertest.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yf on 2017/3/13.
 */

public class Province extends DataSupport {
    private int id;
    private int provinceCode;
    private String provinceName;

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }
}
