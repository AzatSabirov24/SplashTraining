package com.example.lottietraining.data.repository

import com.example.lottietraining.R
import com.example.lottietraining.presentation.model.ClientChoice

object ClientChoiceRepository {
    fun getClientChoice() = listOf(
        ClientChoice(
            "Заказать карту",
            "Условия заказа карты",
            R.drawable.ic_pay
        ),
        ClientChoice(
            "Рассчитать кредит",
            "Условия расчета кредита",
            null
        )
    )
}