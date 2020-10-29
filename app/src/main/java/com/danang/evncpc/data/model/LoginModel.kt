package com.danang.evncpc.data.model

import com.danang.evncpc.data.Object.Account

class LoginModel {
    private constructor()
    companion object
    {
        var instances:LoginModel = LoginModel()
            private set
    }
    fun login(account: Account):Boolean
    {
        if(account.userName=="" && account.password=="")
            return false
        return true
    }
}