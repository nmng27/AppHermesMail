package br.com.fiap.projetoglobalsolutions.Screens.Cadastro

import android.widget.CheckBox
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.projetoglobalsolutions.Components.Botao.Botao
import br.com.fiap.projetoglobalsolutions.Components.CheckBox.Check
import br.com.fiap.projetoglobalsolutions.Components.Input.Input
import br.com.fiap.projetoglobalsolutions.Components.Titulo.Titulo
import br.com.fiap.projetoglobalsolutions.Database.repository.UsuarioRepository
import br.com.fiap.projetoglobalsolutions.Model.Usuario
import br.com.fiap.projetoglobalsolutions.ui.theme.ProjetoGlobalSolutionsTheme

@Composable
fun Cadastro(navController: NavController) {
    val context = LocalContext.current
    val usuarioRepository = UsuarioRepository(context)
    var nome by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var telefone by remember {
        mutableStateOf("")
    }
    var check by remember {
        mutableStateOf(true)
    }
    var senha by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Titulo(txt = "Cadastro", tipo = true)
        Input(
            valor = nome,
            funcao = {nome = it},
            txt_label = "Nome",
            txt_placeholder = "Digite o seu nome",
            icone = Icons.Filled.AccountCircle,
            visualTransformation = VisualTransformation.None,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text)
        )
        Input(
            valor = email,
            funcao = {email = it},
            txt_label = "Email",
            txt_placeholder = "Digite o seu email",
            icone = Icons.Filled.Email,
            visualTransformation = VisualTransformation.None,
            keyboardOptions =   KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email
        ))
        Input(
            valor = telefone,
            funcao = {telefone = it},
            txt_label = "Telefone",
            txt_placeholder = "Digite o seu telefone",
            icone = Icons.Filled.Phone,
            visualTransformation = VisualTransformation.None,
            keyboardOptions =  KeyboardOptions.Default.copy(keyboardType = KeyboardType.Phone
        ))
        Check(situacao = check, txt = "Eu me declaro responsável por essa conta", funcao = {})
        Input(
            valor = senha,
            funcao = {senha = it},
            txt_label = "Senha",
            txt_placeholder = "Digite a sua senha",
            icone = Icons.Filled.Lock,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password)
        )
        Botao(cor = ButtonDefaults.buttonColors(Color(0xfffdaa520)),
            txt = "Cadastrar",
            funcao = {
                     val usuario = Usuario(0,nome,email,telefone,check,senha)
                if(usuario != null){
                    usuarioRepository.cadastrarUsuario(usuario)
                    navController.navigate("inbox")
                }
            },
            posicao = Alignment.CenterHorizontally)
        Botao(cor = ButtonDefaults.buttonColors(Color(0xfffdaa520)),
            txt = "Voltar", funcao = { navController.navigate("login") },
            posicao = Alignment.CenterHorizontally)
    }















}


