package com.joebruckner.androidbase

import android.os.Bundle
import android.util.Log

class FragmentLifecycleLogger: FragmentLifecycleListener() {

    override fun onFragmentAttached(fragment: BaseFragment) {
        Log.i(fragment.TAG, "Attached")
    }

    override fun onFragmentViewCreated(fragment: BaseFragment) {
        Log.i(fragment.TAG, "ViewCreated")
    }

    override fun onFragmentStarted(fragment: BaseFragment) {
        Log.i(fragment.TAG, "Started")
    }

    override fun onFragmentResumed(fragment: BaseFragment) {
        Log.i(fragment.TAG, "Resumed")
    }

    override fun onFragmentPaused(fragment: BaseFragment) {
        Log.i(fragment.TAG, "Paused")
    }

    override fun onFragmentStopped(fragment: BaseFragment) {
        Log.i(fragment.TAG, "Stopped")
    }

    override fun onFragmentSaveInstanceState(fragment: BaseFragment, savedInstanceState: Bundle?) {
        Log.i(fragment.TAG, "SaveInstanceState")
    }

    override fun onFragmentViewDestroyed(fragment: BaseFragment) {
        Log.i(fragment.TAG, "View Destroyed")
    }

    override fun onFragmentDestroyed(fragment: BaseFragment) {
        Log.i(fragment.TAG, "Destroyed")
    }

    override fun onFragmentDetached(fragment: BaseFragment) {
        Log.i(fragment.TAG, "Detached")
    }
}