//package com.appsbyme.logoquiz.di
//
//import android.app.Application
//import com.appsbyme.logoquiz.data.api.MainApi
//import com.appsbyme.logoquiz.data.api.MainDataSource
//import com.appsbyme.logoquiz.data.repository.MainRepository
//import dagger.Module
//import dagger.Provides
//import retrofit2.Retrofit
//
//@Module
//class MainModule {
//
//    companion object {
//        @Provides
//        fun provideMainApi(retrofit: Retrofit): MainApi {
//            return retrofit.create(MainApi::class.java)
//        }
//
//        @Provides
//        fun provideMainDataSource(
//                mainApi: MainApi, application: Application
//        ): MainDataSource {
//            return MainDataSource(mainApi, application)
//        }
//
//        @Provides
//        fun provideMainRepository(
//            mDataSource: MainDataSource
//        ): MainRepository {
//            return MainRepository(mDataSource)
//        }
//    }
//}
