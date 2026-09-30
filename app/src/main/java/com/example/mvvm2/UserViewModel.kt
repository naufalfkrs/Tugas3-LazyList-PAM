package com.example.mvvm2

import androidx.lifecycle.ViewModel
import com.example.mvvm2.model.User
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class UserViewModel : ViewModel() {
    private val _user = MutableStateFlow<User>(User(id = 0, name = "", date = "", imageRes = 0))
    val user: StateFlow<User> = _user

    fun setUser(id: Int, name: String, date: String) {
        // _user.value = User(id = id, name = name)
        _user.update { user ->user.copy(id=id,name=name, date=date) }
    }
}