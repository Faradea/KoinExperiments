package com.macgavrina.koinexperiments

import android.util.Log

class MySimplePresenter(private val repo: HelloRepository) {

    lateinit var activity: MainActivity

    fun sayHello() = "${repo.giveHello()} from $this"

    fun buttonIsPressed() {
        activity.displayToast()
    }

    fun attachView(mainActivity: MainActivity) {
        this.activity = mainActivity
    }
}