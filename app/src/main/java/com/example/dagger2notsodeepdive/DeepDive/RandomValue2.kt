package com.example.dagger2notsodeepdive.DeepDive

import javax.inject.Inject
import kotlin.random.Random

/**
 * TODO #1 Ativando classe para entrar no dagger
 */
class RandomValue2 {

    private val randomDouble = Random.nextDouble()

    fun getRandomDouble() : Double = randomDouble

}