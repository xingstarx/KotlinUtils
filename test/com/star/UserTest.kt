package com.star


var user2: User? = null

fun main(args: Array<String>) {
    user2 = User()

    user2?.apply {
        id = "9088"
        name = "xingxing"
        user2 = null
    }
    println("user2 == $user2")

}