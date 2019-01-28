package com.macgavrina.koinexperiments

import org.koin.dsl.module.module

val appModule = module {

    // single instance of HelloRepository
    single<HelloRepository> { HelloRepositoryImpl() }

    // Factory of MyPresenter - resolve Repository instance
    // produce a new instance on each demand
    factory { MySimplePresenter(get()) }
}