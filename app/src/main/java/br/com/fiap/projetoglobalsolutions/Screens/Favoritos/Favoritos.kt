package br.com.fiap.projetoglobalsolutions.Screens.Favoritos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import br.com.fiap.projetoglobalsolutions.Components.Botao.Botao
import br.com.fiap.projetoglobalsolutions.Components.Footer.Footer
import br.com.fiap.projetoglobalsolutions.Components.Header.Header
import br.com.fiap.projetoglobalsolutions.Components.TemplateItem.Email.EmailTemplate
import br.com.fiap.projetoglobalsolutions.Database.repository.EmailRepository

@Composable
fun Favoritos(titulo:String, navController: NavController) {
    val context = LocalContext.current
    val emailRepository = EmailRepository(context)
    val lista = emailRepository.listarFavs()
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Header(txt = titulo)
        for(i in lista){
            EmailTemplate(email = i,
                f1 = {navController.navigate("infos")})
        }
        Botao(cor = ButtonDefaults.buttonColors(Color(0xfffdaa520)),
            txt = "Acessar Calendario",
            funcao = { navController.navigate("/eventos") },
            posicao = Alignment.End)
        Footer({navController.navigate("/inbox")},
            {navController.navigate("/novoEmail")},
            {navController.navigate("/favoritos")},
            {navController.navigate("/enviados")},
            {navController.navigate("/excluidos")})
    }
}

