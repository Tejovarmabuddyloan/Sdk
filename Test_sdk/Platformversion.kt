package com.example.test_sdk
import android.os.Build

object PlatformVersion {
    fun get(): String {
        return Build.VERSION.RELEASE
    }
}

