package br.com.fiap.projetoglobalsolutions.Database.repository

import android.content.Context
import br.com.fiap.projetoglobalsolutions.Database.dao.DatabaseDb
import br.com.fiap.projetoglobalsolutions.Database.dao.UsuarioDAO
import br.com.fiap.projetoglobalsolutions.Model.Usuario

class UsuarioRepository(context: Context):UsuarioDAO {
    private val db = DatabaseDb.getDatabase(context).usuarioDao()
    override fun cadastrarUsuario(usuario: Usuario): Long {
        return db.cadastrarUsuario(usuario)
    }

    override fun excluirDados(usuario: Usuario): Int {
        return db.atualizarDados(usuario)
    }

    override fun atualizarDados(usuario: Usuario): Int {
        return db.atualizarDados(usuario)
    }

    override fun validar(usuario: String, senha: String):Usuario? {
        return db.validar(usuario,senha)
    }




}