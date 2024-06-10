package br.com.fiap.projetoglobalsolutions.Screens.Login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ButtonDefaults
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
import androidx.navigation.NavController
import br.com.fiap.projetoglobalsolutions.Components.Botao.Botao
import br.com.fiap.projetoglobalsolutions.Components.Input.Input
import br.com.fiap.projetoglobalsolutions.Components.Titulo.Titulo
import br.com.fiap.projetoglobalsolutions.Database.repository.UsuarioRepository
import br.com.fiap.projetoglobalsolutions.ui.theme.ProjetoGlobalSolutionsTheme

@Composable
fun Login(navController: NavController) {
    var email by remember {
        mutableStateOf("")
    }
    var senha by remember {
        mutableStateOf("")
    }
    val context = LocalContext.current
    val usuarioRepository = UsuarioRepository(context)
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Titulo(txt = "Cadastro", tipo = true)
        Input(
            valor = email,
            funcao = {email = it},
            txt_label = "Email",
            txt_placeholder = "Digite o seu email",
            icone = Icons.Filled.Email,
            visualTransformation = VisualTransformation.None,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email)
        )
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
            txt = "Entrar",
            funcao = {
                val user = usuarioRepository.validar(email,senha)
                if(user != null){
                    navController.navigate("inbox")
                }

                     },
            posicao = Alignment.CenterHorizontally)
        Botao(cor = ButtonDefaults.buttonColors(Color(0xfffdaa520)),
            txt = "Cadastre-se",
            funcao = { navController.navigate("cadastro") },
            posicao = Alignment.CenterHorizontally)
    }
}

