package br.com.cotemig.samplemvvm.model.repository

interface AccountDataSource {
    fun login(email: String, password: String): Boolean
    fun register(name: String, email: String, password: String): Boolean
}