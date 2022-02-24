package com.example.lottietraining.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.lottietraining.data.repository.ClientChoiceRepository
import com.example.lottietraining.presentation.model.ClientChoice

class ClientChoiceViewModel(
//    private val clientChoiceRepository: ClientChoiceRepository
) : ViewModel() {
    private var _clientChoice: MutableLiveData<List<ClientChoice>> = MutableLiveData()
    val clientChoice: LiveData<List<ClientChoice>> get() = _clientChoice

    init {
        _clientChoice.value = ClientChoiceRepository.getClientChoice()
    }





//    @Suppress("UNCHECKED_CAST")
//    class Factory : ViewModelProvider.Factory {
//        override fun <T : ViewModel> create(modelClass: Class<T>): T {
//            require(modelClass == ClientChoiceViewModel::class.java)
//            return ClientChoiceViewModel() as T
//        }
//    }

//    private val characterLiveData = MutableLiveData<CharacterData>()
//
//    fun getSingleCharacterData(): MutableLiveData<CharacterData> = characterLiveData
//
//    class ClientChoiceViewModelFactory() :
//        ViewModelProvider.Factory {
//
//        override fun <T : ViewModel> create(modelClass: Class<T>): T {
//            if (modelClass.isAssignableFrom(ClientChoiceViewModel::class.java)) {
//                @Suppress("Unchecked_cast")
//                return ClientChoiceViewModel() as T
//            }
//            throw IllegalArgumentException("Unknown ViewModelClass")
//        }
//    }

}