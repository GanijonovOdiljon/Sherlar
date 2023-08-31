package com.example.sherlar2.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.sherlar2.DiydorActivity
import com.example.sherlar2.R
import com.example.sherlar2.databinding.ItemLayoutBinding
import com.example.sherlar2.model.model


class Adapter : ListAdapter<model, Adapter.VH>(DifCCallback()) {

    lateinit var onClick: (model, pos:Int) -> Unit

    private class DifCCallback : DiffUtil.ItemCallback<model>() {
        override fun areItemsTheSame(oldItem: model, newItem: model): Boolean {
            return oldItem.text == newItem.text
        }

        override fun areContentsTheSame(oldItem: model, newItem: model): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(
            ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(getItem(position))
    }

    inner class VH(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(vmodel: model) {
            binding.apply {
                nomi.text = vmodel.text
                img.setImageResource(R.drawable.img)


                itemView.setOnClickListener {
                    onClick.invoke(vmodel,adapterPosition)
                }
            }
        }
    }
}


