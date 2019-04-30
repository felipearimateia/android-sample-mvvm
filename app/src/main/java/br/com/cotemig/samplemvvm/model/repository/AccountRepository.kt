package br.com.cotemig.samplemvvm.model.repository

import br.com.cotemig.samplemvvm.model.entity.User
import br.com.cotemig.samplemvvm.model.storage.LocalStorage
import java.lang.Exception

class AccountRepository: AccountDataSource {

    override fun login(email: String, password: String): Boolean {
        if (email == "felipe@mail.com" && password == "12345")
            return true

        return false
    }

    override fun register(name: String, email: String, password: String): Boolean {
        try {
            val user = User(name, email, password)
            LocalStorage.addUser(user)
            return true
        } catch (e: Exception) {
            return false
        }
    }
}