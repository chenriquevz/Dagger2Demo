package com.example.dagger2notsodeepdive.di

import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2notsodeepdive.DeepDive.RandomValue
import com.example.dagger2notsodeepdive.MainActivity
import com.example.dagger2notsodeepdive.ui.home.HomeFragment
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * TODO #6 SCOPE
 */
//@Sucrilhos
@Component(
    modules = [
        /**
         * TODO #1
         */
//        RandomValueModule::class
    ]
)
interface AnotherTopComponent {

    /**
     * TODO #2
     */
//    fun inject(mainActivity: MainActivity)

    /**
     * TODO #4 activitycomponent igual ao Psafe atual
     */
//    fun inject(homeFragment: HomeFragment)


    /**
     * TODO #5 @BindsOnInstance
     */
//    @Component.Factory
//    interface Factory {
//        fun create(
//            @BindsInstance appCompatActivity: AppCompatActivity,
//        ): AnotherTopComponent
//    }

}