package com.example.dagger2notsodeepdive.DeepDive

import com.example.dagger2notsodeepdive.di.Sucrilhos
import javax.inject.Inject
import kotlin.random.Random

/**
 * TODO #1 Ativando classe para entrar no dagger
 */

//class RandomValue {

    /**
     * TODO #3 add inject constructor
     */
    class RandomValue @Inject constructor() {

    private val randomInt = Random.nextInt()

    fun getRandomInt() : Int = randomInt

}