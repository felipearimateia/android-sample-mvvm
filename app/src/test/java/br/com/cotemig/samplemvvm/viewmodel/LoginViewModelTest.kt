package br.com.cotemig.samplemvvm.viewmodel

import br.com.cotemig.samplemvvm.model.repository.AccountDataSource
import br.com.cotemig.samplemvvm.model.repository.AccountRepository
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class LoginViewModelTest {

    private lateinit var repository: AccountDataSource
    private lateinit var viewModel: LoginViewModel

    @Before
    fun setUp() {
        repository = AccountRepository()
        viewModel = LoginViewModel(repository)
    }

    @Test
    fun loginSucesso() {
        val response = viewModel.login("felipe@mail.com", "12345")
        assertEquals(response, "Logado com Sucesso!")
    }

    @Test
    fun loginFalhou() {
        val response = viewModel.login("felipe@mail.com", "12346")
        assertEquals(response, "E-mail ou senha não encontrado")
    }
}