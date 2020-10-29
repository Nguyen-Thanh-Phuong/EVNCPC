package com.danang.evncpc.data.Object

data class Account(
    var loai: Int?=null,
    var madv: String,
    var moTa: String?=null,
    var password: String,
    var role: String,
    var userName: String
)