package com.appsbyme.logoquiz.ui.main.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.appsbyme.logoquiz.data.model.Logo;
import com.appsbyme.logoquiz.data.repository.LogoDataRepo;

import java.util.List;

public class LogoViewModel extends ViewModel {

    private LogoDataRepo logoDataRepo;
    private MutableLiveData<List<Logo>> mutableLiveData;

    public LogoViewModel(){
        logoDataRepo = new LogoDataRepo();
    }

    public LiveData<List<Logo>> getLogos() {
        if(mutableLiveData==null){
            mutableLiveData = logoDataRepo.requestLogos();
        }
        return mutableLiveData;
    }
}
