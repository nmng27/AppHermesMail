package br.com.fiap.projetoglobalsolutions.Database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.fiap.projetoglobalsolutions.Model.Usuario

@Dao
interface UsuarioDAO {

    @Insert
    fun cadastrarUsuario(usuario: Usuario):Long

    @Delete
    fun excluirDados(usuario: Usuario):Int

    @Update
    fun atualizarDados(usuario: Usuario):Int

    @Query("SELECT * FROM TB_USUARIO WHERE EMAIL_USUARIO = :usuario AND SENHA_USUARIO = :senha")
    fun validar(usuario:String,senha:String):Usuario?


}