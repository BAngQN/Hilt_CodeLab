package com.example.android.hilt.data

import android.util.Log.d
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class LoggerInMemoryDataSource @Inject constructor(): LoggerDataSource {
    override fun addLog(msg: String) {
        d("aaa", "LoggerInMemoryDataSource addLog" )
    }

    override fun getAllLogs(callback: (List<Log>) -> Unit) {
        d("aaa", "LoggerInMemoryDataSource getAllLogs" )
    }

    override fun removeLogs() {
        d("aaa", "LoggerInMemoryDataSource removeLogs" )
    }
}