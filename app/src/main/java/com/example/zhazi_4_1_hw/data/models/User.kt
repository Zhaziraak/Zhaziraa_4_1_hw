package com.example.zhazi_4_1_hw.data.models

import java.io.Serializable

data class User(
    val name: String,
    val email: String,
    val password: Int
): Serializable
