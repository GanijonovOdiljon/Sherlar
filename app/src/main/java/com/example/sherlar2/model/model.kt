package com.example.sherlar2.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class model(
    val img: Int,
    val text: String,
    val text1: String,
    val sher: String
): Parcelable
