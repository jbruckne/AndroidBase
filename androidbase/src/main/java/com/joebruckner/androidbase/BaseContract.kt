package com.joebruckner.androidbase


class BaseContract {

    interface Presenter {
        fun attachView(view: View)
        fun detachView()
    }

    interface View
}