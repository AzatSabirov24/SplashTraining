package com.example.lottietraining.presentation.fragments.com.example.lottietraining.presentation.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import com.example.lottietraining.databinding.FragmentWelcomeBinding
import com.example.lottietraining.presentation.adapter.ClientChoiceAdapter
import com.example.lottietraining.presentation.fragments.BaseFragment
import com.example.lottietraining.presentation.viewmodel.ClientChoiceViewModel

class WelcomeFragment : BaseFragment<FragmentWelcomeBinding>(
    FragmentWelcomeBinding::inflate
) {
    var adapter: ClientChoiceAdapter? = null
    val clientChoiceViewModel: ClientChoiceViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val clientChoiceAdapter = ClientChoiceAdapter()
        this.adapter = clientChoiceAdapter

        binding.rcClientChoice.adapter = clientChoiceAdapter

        clientChoiceViewModel.clientChoice.observe(viewLifecycleOwner){
            Log.d("AAA", "1234")
            adapter?.submitList(it)
        }
    }
}