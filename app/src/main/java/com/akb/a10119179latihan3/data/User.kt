package com.akb.a10119179latihan3.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//<!--Muhamad Bagus Prakoso-10119179-IF6-->

@Parcelize
data class User(
    val name: String?,
    val age: Int?
) : Parcelable