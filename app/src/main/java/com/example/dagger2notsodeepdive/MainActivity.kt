package com.example.dagger2notsodeepdive

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.dagger2notsodeepdive.DeepDive.*
import com.example.dagger2notsodeepdive.databinding.ActivityMainBinding
import com.example.dagger2notsodeepdive.di.AnotherTopComponent
import com.example.dagger2notsodeepdive.di.TopComponent
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    /**
     * TODO #2
     */
    @Inject
    lateinit var randomValue: RandomValue

    /**
     * TODO #3.1 Provides vs Binds
     */
    @Inject
    lateinit var randomValue2: RandomValue2

    @Inject
    lateinit var randomValue3: RandomValueInterface

    /**
     * TODO #4 activitycomponent igual ao Psafe atual
     */
    val activityAnotherTopComponent by lazy {
//        (application as MyApplication).getAnotherTopComponent()
        /**
         * TODO #5 @BindsOnInstance
         */
        (application as MyApplication).getAnotherTopComponent(this)
    }

    /**
     * TODO #5 @BindsOnInstance
     */
    @Inject
    lateinit var resourceClass: ResourceClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onCreateStuff()

        /**
         * TODO #1 Pegando valor do [TopComponent] atrelado ao lifecycle do [MyApplication]
         */
        (application as MyApplication).getTopComponent().randomValue.getRandomInt().let {
            println("TopComponent $it")
        }

        /**
         * TODO #2 Pegando valor do [AnotherTopComponent]
         */
//        (application as MyApplication).getAnotherTopComponent().inject(this)

        /**
         * TODO #4 activitycomponent igual ao Psafe atual
         */
        activityAnotherTopComponent.inject(this)

        println("AnotherTopComponent ${randomValue.getRandomInt()}")


        /**
         * TODO #3.1 Provides vs Binds
         */
        println("AnotherTopComponent double ${randomValue2.getRandomDouble()}")
        println("AnotherTopComponent float ${randomValue3.getValue()}")

        /**
         * TODO #5 @BindsOnInstance
         */
        println("AnotherTopComponent ${resourceClass.getAppname()}")

    }

    private fun onCreateStuff() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

    }
}