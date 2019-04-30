package br.com.cotemig.samplemvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import br.com.cotemig.samplemvvm.model.repository.AccountDataSource
import br.com.cotemig.samplemvvm.model.repository.AccountRepository
import br.com.cotemig.samplemvvm.utils.SingleLiveEvent

class LoginViewModel: ViewModel() {

    private val repository: AccountDataSource = AccountRepository()

    var email: String? = null
    var password: String? = null

    private val _loginEvent = SingleLiveEvent<String>()
    val loginEvent: LiveData<String>
        get() = _loginEvent

    fun login(email: String, password: String) {
        this.email = email
        this.password = password
        val response = repository.login(email, password)
        if (response)
            _loginEvent.postValue("Logado com Sucesso!")
        else
            _loginEvent.postValue("E-mail ou senha não encontrado")
    }
}