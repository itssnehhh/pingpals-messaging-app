package com.example.pingpals

import android.app.Application
import com.example.data.storage.UserPreferences
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class PingPalsApplication : Application(){
    @Inject
    lateinit var userPreferences: UserPreferences

}