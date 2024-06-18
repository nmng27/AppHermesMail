package br.com.fiap.projetoglobalsolutions.Database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.fiap.projetoglobalsolutions.Model.Email

@Dao
interface EmailDAO {
    @Insert
    fun enviarEmail(email: Email):Long

    @Delete
    fun excluirEmail(email: Email):Int

    @Update
    fun favoritar(email: Email):Int

    @Query("SELECT * FROM TB_EMAIL")
    fun listar():List<Email>

    @Query("SELECT * FROM TB_EMAIL WHERE REMETENTE = :usuario")
    fun listarEnviados(usuario:String):List<Email>

    @Query("SELECT * FROM TB_EMAIL WHERE FAVORITO = TRUE")
    fun listarFavs():List<Email>




}