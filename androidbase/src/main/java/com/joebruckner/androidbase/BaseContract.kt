package com.joebruckner.androidbase


class BaseContract {

    interface Presenter<in V: View> {
        fun attachView(view: V)
        fun detachView()
    }

    interface View
}