package com.joebruckner.androidbase

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.*

abstract class BaseFragment: Fragment() {
    abstract val layoutId: Int
    open val menuId: Int = R.menu.empty
    open val lifecycleListeners = mutableListOf<FragmentLifecycleListener>()

    open val TAG: String = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        lifecycleListeners.forEach { it.onFragmentAttached(this) }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(layoutId, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        lifecycleListeners.forEach { it.onFragmentViewCreated(this) }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(menuId, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onStart() {
        super.onStart()

        lifecycleListeners.forEach { it.onFragmentStarted(this) }
    }

    override fun onResume() {
        super.onResume()

        lifecycleListeners.forEach { it.onFragmentResumed(this) }
    }

    override fun onPause() {
        super.onPause()

        lifecycleListeners.forEach { it.onFragmentPaused(this) }
    }

    override fun onStop() {
        super.onStop()

        lifecycleListeners.forEach { it.onFragmentStopped(this)}
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        lifecycleListeners.forEach { it.onFragmentSaveInstanceState(this, outState) }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        lifecycleListeners.forEach { it.onFragmentViewDestroyed(this) }
    }

    override fun onDestroy() {
        super.onDestroy()

        lifecycleListeners.forEach { it.onFragmentDestroyed(this) }
    }

    override fun onDetach() {
        super.onDetach()

        lifecycleListeners.forEach { it.onFragmentDetached(this) }
    }
}