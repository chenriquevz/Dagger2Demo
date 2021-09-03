package com.example.dagger2notsodeepdive.DeepDive

import javax.inject.Inject
import kotlin.random.Random

/**
 * TODO #3.1 Provides vs Binds
 */
interface RandomValueInterface {

    fun getValue(): Float
}

class RandomValue3 @Inject constructor() : RandomValueInterface {

    private val nextFloat = Random.nextFloat()

    override fun getValue(): Float {
        return nextFloat
    }

}

