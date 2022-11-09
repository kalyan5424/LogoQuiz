package com.appsbyme.logoquiz.data.repository;

import androidx.lifecycle.MutableLiveData;

import com.appsbyme.logoquiz.data.model.Logo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class LogoDataRepo {

    private final String TAG = getClass().getSimpleName();

    public MutableLiveData<List<Logo>> requestLogos() {
        final MutableLiveData<List<Logo>> mutableLiveData = new MutableLiveData<>();
        Gson gson = new Gson();
        String jsonOutput = "[{\"imgUrl\":\"http://www.dsource.in/sites/default/files/resource/logo-design/logos/logos-representing-india/images/01.jpeg\",\"name\":\"AADHAAR\"},{\"imgUrl\":\"https://static.digit.in/default/thumb_101067_default_td_480x480.jpeg\",\"name\":\"PHONEPE\"},{\"imgUrl\":\"https://cdn.iconscout.com/icon/free/png-256/bhim-3-69845.png\",\"name\":\"BHIM\"},{\"imgUrl\":\"https://media.glassdoor.com/sqll/300494/flipkart-com-squarelogo-1433217726546.png\",\"name\":\"FLIPKART\"},{\"imgUrl\":\"http://logok.org/wp-content/uploads/2014/05/Walmart-Logo-880x645.png\",\"name\":\"WALMART\"},{\"imgUrl\":\"http://www.thestylesymphony.com/wp-content/uploads/2015/05/Myntra-logo.png\",\"name\":\"MYNTRA\"}]";
        Type logoListType = new TypeToken<List<Logo>>(){}.getType();

        List<Logo> logos = gson.fromJson(jsonOutput, logoListType);
        mutableLiveData.setValue(logos);
        return mutableLiveData;
    }
}
