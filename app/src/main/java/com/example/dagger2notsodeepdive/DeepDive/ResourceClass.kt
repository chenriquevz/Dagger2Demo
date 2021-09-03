package com.example.dagger2notsodeepdive.DeepDive

import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2notsodeepdive.R
import com.example.dagger2notsodeepdive.di.Sucrilhos
import javax.inject.Inject

/**
 * TODO #6.1 SCOPE
 */
@Sucrilhos
/**
 * TODO #5 @BindsOnInstance
 */
class ResourceClass @Inject constructor(private val appCompatActivity: AppCompatActivity, private val randomValue2: RandomValue2) {

    fun getAppname() = appCompatActivity.getString(R.string.app_name) + randomValue2.getRandomDouble()

}