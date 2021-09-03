package com.example.dagger2notsodeepdive.di

import com.example.dagger2notsodeepdive.DeepDive.RandomValue
import com.example.dagger2notsodeepdive.DeepDive.RandomValue2
import com.example.dagger2notsodeepdive.DeepDive.RandomValue3
import com.example.dagger2notsodeepdive.DeepDive.RandomValueInterface
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable
import javax.inject.Singleton

@Module
interface RandomValueModule {

    /**
     * TODO #6 SCOPE
     */
    @Sucrilhos
    /**
     * TODO #3.1 Provides vs Binds
     */
    @Binds
    fun bindsRandomInterface(randomValue3: RandomValue3): RandomValueInterface

    companion object {

        /**
         * TODO #1 adicionar
         */
        /**
         * TODO #3 remove from modules para mostrar a diferença do @Inject Constructor
         */
        /**
         * TODO #6.2 SCOPE @Reusable
         */
        @Reusable
        @Provides
        fun provideRandomValue() = RandomValue()


        /**
         * TODO #6 SCOPE
         */
        @Sucrilhos
        /**
         * TODO #1.1 adicionar - mostrar diferença de parte do modulo não usado
         */
        @Provides
        fun provideRandomValue2() = RandomValue2()
    }


}