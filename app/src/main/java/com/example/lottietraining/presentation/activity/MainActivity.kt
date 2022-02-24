package com.example.lottietraining.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.commitNow
import com.example.lottietraining.R
import com.example.lottietraining.presentation.fragments.SplashFragment
import com.example.lottietraining.presentation.fragments.WelcomeFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setSplashFragment(savedInstanceState)
    }

    private fun setSplashFragment(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            val splashFragment = SplashFragment {
                setWelcomeFragment()
            }
            supportFragmentManager.commitNow {
                setReorderingAllowed(true)
                add(R.id.fragment_container_view, splashFragment)
            }
        }
    }

    private fun setWelcomeFragment() {
        supportFragmentManager.commitNow {
            val welcomeFragment = WelcomeFragment()
            setReorderingAllowed(true)
            replace(R.id.fragment_container_view, welcomeFragment)
        }
    }
}