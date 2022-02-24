package com.example.lottietraining.presentation.mapper

import com.example.lottietraining.data.model.ClientChoiceDTO
import com.example.lottietraining.presentation.model.ClientChoice

class ClientChoiceMapper : Mapper<ClientChoiceDTO, ClientChoice> {
    override fun mapToClientChoice(clientDTO: ClientChoiceDTO) =
        ClientChoice(
            title = clientDTO.title,
            description = clientDTO.description,
            image = clientDTO.image
        )
}