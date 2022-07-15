package com.express.android.materialdialog.vh

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.express.android.materialdialog.databinding.ActivityButtonBinding
import com.express.android.materialdialog.databinding.MenuItemBinding
import com.express.android.materialdialog.entity.MenuItem
import com.express.android.materialdialog.listener.MenuListener

/**
 * Created by Miftah Mubarak
 * Visit me on github.com @immimu
 * 18 November 2020
 */
class MenuItemViewHolder(val binding: MenuItemBinding, private val listener: MenuListener) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(menuItem: MenuItem) {
        binding.menuContainer.setOnClickListener { listener.onMenuClicked(menuItem) }
        binding.titleTextView.text = menuItem.title
        binding.subtitleTextView.text = menuItem.subtitle
    }
}