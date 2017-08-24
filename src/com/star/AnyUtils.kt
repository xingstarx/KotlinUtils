package com.star

inline fun <A, B, R> ifAllNotNull(a: A?, b: B?, transform: (a: A, b: B) -> R) =
        if (a != null && b != null) transform(a, b) else null