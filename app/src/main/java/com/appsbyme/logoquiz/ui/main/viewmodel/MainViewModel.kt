package com.appsbyme.logoquiz.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import com.appsbyme.logoquiz.data.repository.MainRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repository: MainRepository
) : ViewModel() {}
