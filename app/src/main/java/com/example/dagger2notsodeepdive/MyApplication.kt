package com.example.dagger2notsodeepdive

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2notsodeepdive.di.AnotherTopComponent
import com.example.dagger2notsodeepdive.di.DaggerAnotherTopComponent
import com.example.dagger2notsodeepdive.di.DaggerTopComponent
import com.example.dagger2notsodeepdive.di.DaggerTopComponent.factory
import com.example.dagger2notsodeepdive.di.TopComponent

open class MyApplication : Application() {

    private lateinit var topComponent: TopComponent

    override fun onCreate() {
        super.onCreate()
        topComponent = DaggerTopComponent.factory().create()
    }

    fun getTopComponent(): TopComponent {
        return topComponent
    }

//    fun getAnotherTopComponent(): AnotherTopComponent {
//        return DaggerAnotherTopComponent.create()
//    }

    /**
     * TODO #5 @BindsOnInstance
     */
    fun getAnotherTopComponent(appCompatActivity: AppCompatActivity): AnotherTopComponent {
        return DaggerAnotherTopComponent.factory().create(appCompatActivity)
    }

}