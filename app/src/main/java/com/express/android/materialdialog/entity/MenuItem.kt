package com.express.android.materialdialog.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Miftah Mubarak
 * Visit me on github.com @immimu
 * 18 November 2020
 */
@Parcelize
data class MenuItem(val id: Int, val title: String, val subtitle: String) : Parcelable