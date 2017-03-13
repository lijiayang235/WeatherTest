package com.example.weathertest.util;

import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.example.weathertest.db.City;
import com.example.weathertest.db.County;
import com.example.weathertest.db.Province;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by yf on 2017/3/13.
 */

public class Utility {
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allProvinces=new JSONArray(response);
                for (int i=0;i<allProvinces.length();i++){
                    JSONObject o=allProvinces.getJSONObject(i);
                    Province province=new Province();
                    province.setProvinceName(o.getString("name"));
                    province.setProvinceCode(o.getInt("id"));
                    province.save();
                }
                return true;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCityResponse(String response,int provinceId){
        if(!TextUtils.isEmpty(response)){
            try{
                JSONArray allCities=new JSONArray(response);
                for (int i=0;i<allCities.length();i++){
                    JSONObject o=allCities.getJSONObject(i);
                    City city=new City();
                    city.setCityName(o.getString("name"));
                    city.setCityCode(o.getString("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
    public static boolean handleCountyResponse(String response,String cityId){
        if(!TextUtils.isEmpty(response)){
            try{
                Log.d("handleCountyResponse",response);
                JSONArray allCounties=new JSONArray(response);
                for (int i=0;i<allCounties.length();i++){
                    JSONObject o=allCounties.getJSONObject(i);
                    County county=new County();
                    county.setCountyName(o.getString("name"));
                    county.setWeatherId(o.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
}
