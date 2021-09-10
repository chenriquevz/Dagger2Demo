package com.example.dagger2notsodeepdive.di.subcomponent

import com.example.dagger2notsodeepdive.ui.dashboard.DashboardFragment
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import javax.inject.Named

@Subcomponent(modules = [
    /**
     * TODO #7 NAMED
     */
    NamedModuleSample::class
])
interface BestSubComponent {

fun inject (dashboardFragment: DashboardFragment)

}



/**
 * TODO #7 NAMED
 */
@Module
object NamedModuleSample {


    @Provides
    @Named("randomTextString1")
    fun provideString1(): String = "string1"

    @Provides
    @Named("randomTextString2")
    fun provideString2(): String = "string2"

    @Provides
    @Named("superString")
    fun provideSuperString(@Named("randomTextString1") string1: String, @Named("randomTextString2") string2: String): String {
        return string1 + string2
    }
}