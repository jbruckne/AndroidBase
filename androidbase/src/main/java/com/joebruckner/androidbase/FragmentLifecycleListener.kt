package com.joebruckner.androidbase

import android.os.Bundle


open class FragmentLifecycleListener {
    open fun onFragmentAttached(fragment: BaseFragment) {}
    open fun onFragmentViewCreated(fragment: BaseFragment) {}
    open fun onFragmentStarted(fragment: BaseFragment) {}
    open fun onFragmentResumed(fragment: BaseFragment) {}
    open fun onFragmentPaused(fragment: BaseFragment) {}
    open fun onFragmentStopped(fragment: BaseFragment) {}
    open fun onFragmentSaveInstanceState(fragment: BaseFragment, savedInstanceState: Bundle?) {}
    open fun onFragmentViewDestroyed(fragment: BaseFragment) {}
    open fun onFragmentDestroyed(fragment: BaseFragment) {}
    open fun onFragmentDetached(fragment: BaseFragment) {}
}