package br.com.fiap.projetoglobalsolutions.Database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.fiap.projetoglobalsolutions.Model.Evento
@Dao
interface EventoDAO {
    @Insert
    fun cadastrar(evento: Evento):Long

    @Update
    fun atualizar(evento: Evento):Int

    @Delete
    fun excluir(evento: Evento):Int

    @Query("SELECT * FROM TB_EVENTO")
    fun listar():List<Evento>

    @Query("select * from tb_evento where nome = :nome")
    fun buscarEvento(nome:String):Evento
}