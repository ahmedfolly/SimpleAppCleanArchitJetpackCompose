package com.example

import java.lang.Exception

sealed class Result<out T> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val e: Exception) : Result<Nothing>()
}
