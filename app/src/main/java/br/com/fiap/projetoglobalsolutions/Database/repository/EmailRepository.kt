package br.com.fiap.projetoglobalsolutions.Database.repository

import android.content.Context
import br.com.fiap.projetoglobalsolutions.Database.dao.DatabaseDb
import br.com.fiap.projetoglobalsolutions.Database.dao.EmailDAO
import br.com.fiap.projetoglobalsolutions.Model.Email

class EmailRepository(context: Context):EmailDAO {
    private val db = DatabaseDb.getDatabase(context).emailDao()
    override fun enviarEmail(email: Email): Long {
        return db.enviarEmail(email)
    }

    override fun excluirEmail(email: Email): Int {
        return db.excluirEmail(email)
    }

    override fun favoritar(email: Email): Int {
        return db.favoritar(email)
    }


    override fun listar(): List<Email> {
        return db.listar()
    }

    override fun listarEnviados(usuario: String): List<Email> {
        return db.listarEnviados(usuario)
    }

    override fun listarFavs(): List<Email> {
        return db.listarFavs()
    }
}