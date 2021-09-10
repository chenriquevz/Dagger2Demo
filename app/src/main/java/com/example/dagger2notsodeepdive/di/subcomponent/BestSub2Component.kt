package com.example.dagger2notsodeepdive.di.subcomponent

import com.example.dagger2notsodeepdive.ui.dashboard.DashboardFragment
import com.example.dagger2notsodeepdive.ui.notifications.NotificationsFragment
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import javax.inject.Named

@Subcomponent(modules = [
    NamedModuleSample::class
])
interface BestSub2Component {

fun inject (dashboardFragment: NotificationsFragment)

}