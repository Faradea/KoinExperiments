package com.macgavrina.koinexperiments

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    // Lazy injected MySimplePresenter
    private val firstPresenter: MySimplePresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstPresenter.attachView(this)

        button.setOnClickListener {
            firstPresenter.buttonIsPressed()
        }

        Log.d("AppLogs", firstPresenter.sayHello())

    }

    fun displayToast() {
        Toast.makeText(this, "Toast for all!", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        firstPresenter
    }
}
