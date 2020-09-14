package com.kotlin.explorer.reflection

import kotlin.reflect.KClass

inline fun <reified T : Any> getClazz(): KClass<T> {

    return T::class
}


