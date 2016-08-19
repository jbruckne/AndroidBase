package com.joebruckner.androidbase;


public class BaseContract {

    public interface Presenter {
        void attachView(View view);
        void detachView();
    }

    public interface View {

    }
}