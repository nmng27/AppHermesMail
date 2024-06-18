package br.com.fiap.projetoglobalsolutions.Screens.InformacoesEmail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.projetoglobalsolutions.Components.Botao.Botao
import br.com.fiap.projetoglobalsolutions.Components.Card.CardEmail
import br.com.fiap.projetoglobalsolutions.Components.Footer.FooterEmail
import br.com.fiap.projetoglobalsolutions.Components.Header.Header
import br.com.fiap.projetoglobalsolutions.Components.Texto.Texto
import br.com.fiap.projetoglobalsolutions.Database.repository.EmailRepository
import br.com.fiap.projetoglobalsolutions.Model.Email
import br.com.fiap.projetoglobalsolutions.ui.theme.ProjetoGlobalSolutionsTheme

@Composable
fun InformacoesEmail(destinatario:String,remetente:String,assunto:String,corpo:String,navController: NavController) {
    val context = LocalContext.current
    val emailRepository = EmailRepository(context)
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Header(txt = "Sobre o E-mail")
        CardEmail(destinatario = destinatario,
            remetente = remetente,
            assunto = assunto,
            corpo = corpo)
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Button(onClick = { navController.navigate("/novoEmail") }, colors = ButtonDefaults.buttonColors(Color(0xffdaa520))) {
                Text(text = "Responder")
            }
            Button(onClick = {
                emailRepository.favoritar(Email(0,remetente,destinatario,assunto,corpo,true))
                             }, colors = ButtonDefaults.buttonColors(Color(0xfffdaa520))) {
                Text(text = "Favoritar")
            }
            Button(onClick = { emailRepository.excluirEmail(Email(0,remetente,destinatario,assunto,corpo,false)) }, colors = ButtonDefaults.buttonColors(Color(0xfffdaa520))) {
                Text(text = "Excluir")
            }
        }
    }

}

