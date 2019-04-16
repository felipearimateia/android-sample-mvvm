package br.com.cotemig.samplemvvm.model.storage

import br.com.cotemig.samplemvvm.model.entity.User

class LocalStorage {
    companion object {
        private var user: User? = null

        fun addUser(user: User) {
            this.user = user
        }

        fun getUser() = this.user
    }
}