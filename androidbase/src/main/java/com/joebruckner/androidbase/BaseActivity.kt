package com.joebruckner.androidbase

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu

abstract class BaseActivity : AppCompatActivity() {
    abstract val layoutId: Int
    open val menuId: Int = R.menu.empty
    open val lifecycleListeners = mutableListOf<ActivityLifecycleListener>()
    var menu: Menu? = null

    open val TAG: String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)

        lifecycleListeners.forEach { it.onActivityCreated(this, savedInstanceState) }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(menuId, menu)
        this.menu = menu
        return super.onCreateOptionsMenu(menu)
    }

    override fun onStart() {
        super.onStart()

        lifecycleListeners.forEach { it.onActivityStarted(this) }
    }

    override fun onResume() {
        super.onResume()

        lifecycleListeners.forEach { it.onActivityResumed(this) }
    }

    override fun onPause() {
        super.onPause()

        lifecycleListeners.forEach { it.onActivityPaused(this) }
    }

    override fun onStop() {
        super.onStop()

        lifecycleListeners.forEach { it.onActivityStopped(this) }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        lifecycleListeners.forEach { it.onActivitySaveInstanceState(this, outState) }
    }

    override fun onDestroy() {
        super.onDestroy()

        lifecycleListeners.forEach { it.onActivityDestroyed(this) }
    }
}
