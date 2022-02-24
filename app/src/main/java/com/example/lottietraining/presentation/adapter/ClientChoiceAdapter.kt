package com.example.lottietraining.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.lottietraining.databinding.ItemClientChoiceBinding
import com.example.lottietraining.presentation.model.ClientChoice

class ClientChoiceAdapter :
    ListAdapter<ClientChoice, ClientChoiceAdapter.ClientChoiceViewHolder>(ClientChoiceItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ClientChoiceViewHolder(
            ItemClientChoiceBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ClientChoiceViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ClientChoiceViewHolder(private val binding: ItemClientChoiceBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(clientChoice: ClientChoice) = with(binding) {
            tvTitleClientChoice.text = clientChoice.title
            tvDescriptionClientChoice.text = clientChoice.description
        }
    }
}

private class ClientChoiceItemCallback : DiffUtil.ItemCallback<ClientChoice>() {
    override fun areItemsTheSame(oldItem: ClientChoice, newItem: ClientChoice) =
        oldItem == newItem

    override fun areContentsTheSame(oldItem: ClientChoice, newItem: ClientChoice) =
        oldItem.title == newItem.title
}

