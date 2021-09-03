package com.example.dagger2notsodeepdive.di

import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2notsodeepdive.DeepDive.RandomValue
import dagger.BindsInstance
import dagger.Component

/**
 * TODO #1
 */
//@Component(modules = [RandomValueModule::class])
/**
 * TODO #3 remove from modules para mostrar a diferença do @Inject Constructor
 */
@Component(modules = [])
interface TopComponent: RandomInterface {


    @Component.Factory
    interface Factory {
        fun create(): TopComponent
    }
}


interface RandomInterface {

    /**
     * TODO #1
     */
//    val randomValue: RandomValue

}