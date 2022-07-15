package com.express.android.materialdialog.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.express.android.materialdialog.R
import com.express.android.materialdialog.databinding.MenuItemBinding
import com.express.android.materialdialog.entity.MenuItem
import com.express.android.materialdialog.listener.MenuListener
import com.express.android.materialdialog.vh.MenuItemViewHolder

/**
 * Created by Miftah Mubarak
 * Visit me on github.com @immimu
 * 18 November 2020
 */

class MenuAdapter(private val menuList: List<MenuItem>, private val listener: MenuListener) :
    RecyclerView.Adapter<MenuItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemViewHolder {
        return MenuItemViewHolder(
            MenuItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            listener
        )
    }

    override fun getItemCount(): Int = menuList.size

    override fun onBindViewHolder(holder: MenuItemViewHolder, position: Int) {
        holder.bind(menuList[position])
    }

}