package br.com.fiap.projetoglobalsolutions.Database.repository

import android.content.Context
import br.com.fiap.projetoglobalsolutions.Database.dao.DatabaseDb
import br.com.fiap.projetoglobalsolutions.Database.dao.EventoDAO
import br.com.fiap.projetoglobalsolutions.Model.Evento

class EventoRepository(context: Context):EventoDAO {
    private val db = DatabaseDb.getDatabase(context).eventoDao()
    override fun cadastrar(evento: Evento): Long {
        return db.cadastrar(evento)
    }

    override fun atualizar(evento: Evento): Int {
        return db.atualizar(evento)
    }

    override fun excluir(evento: Evento): Int {
        return db.excluir(evento)
    }

    override fun listar(): List<Evento> {
        return db.listar()
    }

    override fun buscarEvento(nome: String): Evento {
        return db.buscarEvento(nome)
    }
}