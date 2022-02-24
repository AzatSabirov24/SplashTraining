package com.example.lottietraining.presentation.mapper

import com.example.lottietraining.data.model.ClientChoiceDTO
import com.example.lottietraining.presentation.model.ClientChoice

interface Mapper<U, V> {
    fun mapToClientChoice(clientDTO: ClientChoiceDTO): ClientChoice
}