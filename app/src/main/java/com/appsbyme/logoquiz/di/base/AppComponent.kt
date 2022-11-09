//package com.appsbyme.logoquiz.di.base
//
//import android.app.Application
//import com.appsbyme.logoquiz.LogoQuizApplication
//import com.appsbyme.logoquiz.di.ActivityBuildersModule
//import com.appsbyme.logoquiz.di.base.AppModule
//import com.appsbyme.logoquiz.di.base.ViewModelFactoryModule
//import dagger.BindsInstance
//import dagger.Component
//import dagger.android.AndroidInjector
//import dagger.android.support.AndroidSupportInjectionModule
//import javax.inject.Singleton
//
//@Singleton
//@Component(
//    modules = [AndroidSupportInjectionModule::class,
//        ActivityBuildersModule::class,
//        AppModule::class,
//        ViewModelFactoryModule::class
//    ]
//)
//
//interface AppComponent : AndroidInjector<LogoQuizApplication> {
//
//    @Component.Factory
//    interface Factory {
//        fun create(@BindsInstance application: Application): AppComponent
//    }
//
//}
