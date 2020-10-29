package com.danang.evncpc.data.Object


import com.google.gson.annotations.SerializedName

data class NhomDT(
    @SerializedName("ma_nhomdt")
    val maNhomdt: String,
    @SerializedName("ten_dt")
    val tenDt: String
)