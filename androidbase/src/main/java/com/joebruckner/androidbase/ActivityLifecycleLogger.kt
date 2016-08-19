package com.joebruckner.androidbase

import android.os.Bundle
import android.util.Log

class ActivityLifecycleLogger: ActivityLifecycleListener() {

    override fun onActivityCreated(activity: BaseActivity, savedInstanceState: Bundle?) {
        Log.i(activity.TAG, "Created")
    }

    override fun onActivityStarted(activity: BaseActivity) {
        Log.i(activity.TAG, "Started")
    }

    override fun onActivityResumed(activity: BaseActivity) {
        Log.i(activity.TAG, "Resumed")
    }

    override fun onActivityPaused(activity: BaseActivity) {
        Log.i(activity.TAG, "Paused")
    }

    override fun onActivityStopped(activity: BaseActivity) {
        Log.i(activity.TAG, "Stopped")
    }

    override fun onActivitySaveInstanceState(activity: BaseActivity, savedInstanceState: Bundle?) {
        Log.i(activity.TAG, "SaveInstanceState")
    }

    override fun onActivityDestroyed(activity: BaseActivity) {
        Log.i(activity.TAG, "Destroyed")
    }
}