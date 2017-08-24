package com.star

var user: User? = null
var banner: Banner? = null
var item: Item? = null

fun main(args: Array<String>) {

    user = User().apply {
        id = "9088"
        name = "xingxing"
    }
    banner = Banner()

    ifAllNotNull(user, banner) {
        user, banner ->
        println("user.id == " + user.id + ", user.name == " + user.name)
    }


}

inline fun <A, B, R> ifAllNotNull(a: A?, b: B?, transform: (a: A, b: B) -> R) =
        if (a != null && b != null) transform(a, b) else null

inline fun <A, B, C, R> ifAllNotNull(a: A?, b: B?, c: C?, transform: (a: A, b: B, c: C) -> R) =
        if (a != null && b != null && c!= null) transform(a, b, c) else null


//item = Item()
//ifAllNotNull(user, banner, item) {
//    user, banner, item ->
//    println("all empty")
//}

class Item{}
