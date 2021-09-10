package com.example.dagger2notsodeepdive.di

import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2notsodeepdive.DeepDive.RandomValue
import com.example.dagger2notsodeepdive.MainActivity
import com.example.dagger2notsodeepdive.di.subcomponent.BestSub2Component
import com.example.dagger2notsodeepdive.di.subcomponent.BestSubComponent
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * TODO #1
 */
//@Component(modules = [RandomValueModule::class])
/**
 * TODO #3 remove from modules para mostrar a diferença do @Inject Constructor
 */
//@Component(modules = [])
/**
 * TODO #7.2 Usando dependência do topComponent?
 */
@Sucrilhos
@Component(modules = [RandomValueModule::class])
interface TopComponent: RandomInterface {

    /**
     * TODO #6.5 Subcomponent
     */
    val bestSubComponent: BestSubComponent

    val bestSub2Component: BestSub2Component

    /**
     * TODO #7.2 Usando dependência do topComponent?
     */
    fun inject (mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(): TopComponent
    }
}


interface RandomInterface {

    /**
     * TODO #1
     */
    val randomValue: RandomValue

}

