package com.appsbyme.logoquiz.di.base

import androidx.lifecycle.ViewModelProvider
import com.appsbyme.logoquiz.ui.base.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelProvidersFactory: ViewModelFactory): ViewModelProvider.Factory
}
