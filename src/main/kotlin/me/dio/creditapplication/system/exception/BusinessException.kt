package me.dio.creditapplication.system.exception

data class BusinessException(override val message: String?) : RuntimeException(message)
