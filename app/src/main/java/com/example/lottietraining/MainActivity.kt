package com.example.lottietraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.lottietraining.fragments.SplashFragment
import com.example.lottietraining.fragments.WelcomeFragment

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
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add(R.id.fragment_container_view, splashFragment)
            }
        }
    }

    private fun setWelcomeFragment() {
        supportFragmentManager.commit {
            val welcomeFragment = WelcomeFragment()
            setReorderingAllowed(true)
            replace(R.id.fragment_container_view, welcomeFragment)
        }
    }
}