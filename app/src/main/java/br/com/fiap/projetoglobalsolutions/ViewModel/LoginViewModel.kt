package br.com.fiap.projetoglobalsolutions.ViewModel

import androidx.lifecycle.ViewModel
import br.com.fiap.projetoglobalsolutions.Database.dao.UsuarioDAO
import br.com.fiap.projetoglobalsolutions.Database.repository.UsuarioRepository

class LoginViewModel(private val usuarioRepository:UsuarioRepository):ViewModel() {
    fun logar(username:String,senha:String):Boolean{
        val user = usuarioRepository.validar(username,senha)
        return user != null
    }
}