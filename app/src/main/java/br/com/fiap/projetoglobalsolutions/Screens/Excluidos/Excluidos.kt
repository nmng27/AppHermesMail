package br.com.fiap.projetoglobalsolutions.Screens.Excluidos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.util.trace
import androidx.navigation.NavController
import br.com.fiap.projetoglobalsolutions.Components.Botao.Botao
import br.com.fiap.projetoglobalsolutions.Components.Card.CardTemplate
import br.com.fiap.projetoglobalsolutions.Components.Footer.Footer
import br.com.fiap.projetoglobalsolutions.Components.Header.Header
import br.com.fiap.projetoglobalsolutions.Components.TemplateItem.Email.EmailTemplate
import br.com.fiap.projetoglobalsolutions.Components.Titulo.Titulo
import br.com.fiap.projetoglobalsolutions.Database.repository.EmailRepository
import br.com.fiap.projetoglobalsolutions.ui.theme.ProjetoGlobalSolutionsTheme

@Composable
fun Excluidos(navController: NavController) {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
            Titulo(txt = "Hermes informa:", tipo = true)
            CardTemplate(texto = "E-mail excluído com sucesso!")
            Botao(cor = ButtonDefaults.buttonColors(Color(0xfffdaa520)),
                txt = "Voltar",
                funcao = { navController.navigate("/inbox") },
                posicao = Alignment.CenterHorizontally)
        }

}

