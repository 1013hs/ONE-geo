package com.geo.explorer

import android.app.Application

class GeoApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // 后续可以在这里做全局数据库或日志初始化
    }
}
