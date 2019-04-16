package br.com.cotemig.samplemvvm.viewmodel

import br.com.cotemig.samplemvvm.model.repository.AccountDataSource

class LoginViewModel(private val repository: AccountDataSource) {

    fun login(email: String, password: String): String {
        val response = repository.login(email, password)
        if (response)
            return "Logado com Sucesso!"
        else
            return "E-mail ou senha não encontrado"
    }
}