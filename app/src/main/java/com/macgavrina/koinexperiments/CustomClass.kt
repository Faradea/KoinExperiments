package com.macgavrina.koinexperiments

import org.koin.standalone.KoinComponent
import org.koin.standalone.inject


//Custom class (not activity and other android classes) should implement KoinComponent interface to use koin

class CustomClass: KoinComponent {

    private val mainPresenter: MySimplePresenter by inject()
}