package br.com.fiap.projetoglobalsolutions.Screens.InformacoesEmail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.util.trace
import androidx.navigation.NavController
import br.com.fiap.projetoglobalsolutions.Components.Footer.FooterEmail
import br.com.fiap.projetoglobalsolutions.Components.Header.Header
import br.com.fiap.projetoglobalsolutions.Components.Texto.Texto
import br.com.fiap.projetoglobalsolutions.Database.repository.EmailRepository
import br.com.fiap.projetoglobalsolutions.ui.theme.ProjetoGlobalSolutionsTheme

@Composable
fun InfoEmail(remetente:String,assunto:String, corpo:String,navController: NavController) {
        val context = LocalContext.current
    val emailRepository = EmailRepository(context)
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {

            Column {
                Header(txt = "Sobre o E-mail")
                Texto(txt = remetente, tamanho = "Grande", cor = Color(0xfffdaa520))
                Texto(txt = assunto, tamanho = "Médio", cor = Color(0xfffdaa520))
                Texto(txt = corpo, tamanho = "Pequeno", cor = Color(0xfffdaa520))
            }

            FooterEmail(f1 = {
                // responder
                navController.navigate("novoEmail") },
                f2 = {
                    // encaminhar
                    navController.navigate("novoEmail") },
                f3 = {
                     // favoritar

                },
                f4 = {
                    // excluir

                })

        }
    }

