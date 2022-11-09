//package com.appsbyme.logoquiz.di.base
//
//import com.appsbyme.logoquiz.utils.Endpoints.BASE_URL
//import dagger.Module
//import dagger.Provides
//import okhttp3.OkHttpClient
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//import retrofit2.converter.scalars.ScalarsConverterFactory
//import java.util.concurrent.TimeUnit
//import javax.inject.Singleton
//
//@Module
//class AppModule {
//
//    companion object {
//
//        @Singleton
//        @Provides
//        fun provideOkHttpClient(): OkHttpClient {
//            return OkHttpClient.Builder()
//                .connectTimeout(45, TimeUnit.SECONDS)
//                .writeTimeout(45, TimeUnit.SECONDS)
//                .readTimeout(45, TimeUnit.SECONDS)
//                .build()
//        }
//
//        @Provides
//        fun provideRetrofitInstance(client: OkHttpClient): Retrofit {
//            return Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(ScalarsConverterFactory.create())
//                .addConverterFactory(GsonConverterFactory.create())
//                .client(client)
//                .build()
//        }
//
//    }
//}
