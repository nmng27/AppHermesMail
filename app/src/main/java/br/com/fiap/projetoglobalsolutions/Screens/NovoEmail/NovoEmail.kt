package br.com.fiap.projetoglobalsolutions.Screens.NovoEmail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.MailOutline
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
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import br.com.fiap.projetoglobalsolutions.Components.Botao.Botao
import br.com.fiap.projetoglobalsolutions.Components.Footer.Footer
import br.com.fiap.projetoglobalsolutions.Components.Header.Header
import br.com.fiap.projetoglobalsolutions.Components.Input.Input
import br.com.fiap.projetoglobalsolutions.Components.TextArea.TextArea
import br.com.fiap.projetoglobalsolutions.Database.repository.EmailRepository
import br.com.fiap.projetoglobalsolutions.Database.repository.EventoRepository
import br.com.fiap.projetoglobalsolutions.Model.Email
import br.com.fiap.projetoglobalsolutions.ui.theme.ProjetoGlobalSolutionsTheme

@Composable
fun NovoEmail(navController: NavController) {
    val context = LocalContext.current
    val emailRepository = EmailRepository(context)

    var destinatario by remember {
        mutableStateOf("")
    }

    var assunto by remember {
        mutableStateOf("")
    }
    var corpo by remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Header(txt = "Novo Email")
        Input(
            valor = destinatario,
            funcao = {destinatario = it},
            txt_label = "Destinatario",
            txt_placeholder = "Digite o destinatario",
            icone = Icons.Filled.AccountBox,
            visualTransformation = VisualTransformation.None,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email)
        )

        Input(
            valor = assunto,
            funcao = {assunto = it},
            txt_label = "Assunto",
            txt_placeholder = "Digite o assunto",
            icone = Icons.Filled.Create,
            visualTransformation = VisualTransformation.None,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email)
        )
        TextArea(
            valor = corpo,
            funcao = {corpo = it},
            icone = Icons.Filled.MailOutline,
            txt_label = "Corpo do email",
            txt_placeholder = "Digite o corpo do email",
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text),
            visualTransformation = VisualTransformation.None
        )
        Botao(cor = ButtonDefaults.buttonColors(Color(0xfffdaa520)),
            txt = "Enviar",
            funcao = {
                emailRepository.enviarEmail(Email(0,"",destinatario,assunto,corpo,favorito = false))
                navController.navigate("inbox") },
            posicao = Alignment.CenterHorizontally)
       Footer(f1 = { "inbox" },
           f2 = { "novoEmail" },
           f3 = { "favoritos" },
           f4 = { "enviados" },
           f5 = {"excluidos"})
    }
}

