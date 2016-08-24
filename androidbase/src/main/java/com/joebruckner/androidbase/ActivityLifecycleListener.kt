package com.joebruckner.androidbase

import android.os.Bundle

open class ActivityLifecycleListener() {
    open fun onActivityCreated(activity: BaseActivity, savedInstanceState: Bundle?) { }
    open fun onActivityStarted(activity: BaseActivity) { }
    open fun onActivityResumed(activity: BaseActivity) { }
    open fun onActivityPaused(activity: BaseActivity) { }
    open fun onActivityStopped(activity: BaseActivity) { }
    open fun onActivitySaveInstanceState(activity: BaseActivity, savedInstanceState: Bundle?) { }
    open fun onActivityDestroyed(activity: BaseActivity) { }
}