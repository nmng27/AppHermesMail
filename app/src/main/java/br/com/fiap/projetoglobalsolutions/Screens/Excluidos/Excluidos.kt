package br.com.fiap.projetoglobalsolutions.Screens.Excluidos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import br.com.fiap.projetoglobalsolutions.Components.Botao.Botao
import br.com.fiap.projetoglobalsolutions.Components.Footer.Footer
import br.com.fiap.projetoglobalsolutions.Components.Header.Header
import br.com.fiap.projetoglobalsolutions.Components.TemplateItem.Email.EmailTemplate

@Composable
fun Excluidos(titulo:String, navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Header(txt = titulo)
        for(i in 0..6){
            EmailTemplate(destinatario = "Destinatario",
                assunto = "Assunto",
                f1 = {navController.navigate("infos")})
        }
        Botao(cor = ButtonDefaults.buttonColors(Color(0xfffdaa520)),
            txt = "Acessar Calendario",
            funcao = { navController.navigate("eventos") },
            posicao = Alignment.End)
        Footer({navController.navigate("inbox")},
            {navController.navigate("novoEmail")},
            {navController.navigate("favoritos")},
            {navController.navigate("enviados")},
            {navController.navigate("excluidos")})
    }
}

