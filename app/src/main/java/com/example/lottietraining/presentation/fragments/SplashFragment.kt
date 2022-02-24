package com.example.lottietraining.presentation.fragments

import android.animation.Animator
import android.os.Bundle
import android.view.View
import com.example.lottietraining.databinding.FragmentSplashBinding

class SplashFragment(
    private val callBack: () -> Unit
) : BaseFragment<FragmentSplashBinding>(
    FragmentSplashBinding::inflate
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lottieAnimationSplash.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(p0: Animator?) {
            }

            override fun onAnimationEnd(p0: Animator?) {
                callBack.invoke()
            }

            override fun onAnimationCancel(p0: Animator?) {
            }

            override fun onAnimationRepeat(p0: Animator?) {
            }
        })
    }
}