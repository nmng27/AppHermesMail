package br.com.fiap.projetoglobalsolutions.Screens.NovoEvento

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
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
import br.com.fiap.projetoglobalsolutions.Components.Header.Header
import br.com.fiap.projetoglobalsolutions.Components.Input.Input
import br.com.fiap.projetoglobalsolutions.Database.repository.EventoRepository
import br.com.fiap.projetoglobalsolutions.Model.Evento
import br.com.fiap.projetoglobalsolutions.Screens.NovoEmail.NovoEmail
import br.com.fiap.projetoglobalsolutions.ui.theme.ProjetoGlobalSolutionsTheme
import java.time.LocalDateTime

@Composable
fun NovoEvento(navController: NavController) {
    val context = LocalContext.current
    val eventoRepository = EventoRepository(context)
    var nome by remember {
        mutableStateOf("")
    }
    var participantes by remember {
        mutableStateOf("")
    }
    var data by remember {
        mutableStateOf("")
    }
    var periodo by remember {
        mutableStateOf("")
    }
    var local by remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {

        Column {
            Header(txt = "Novo Evento")
            Input(
                valor = nome,
                funcao = {nome = it},
                txt_label = "Nome",
                txt_placeholder = "Digite o nome do seu evento",
                icone = Icons.Filled.Home,
                visualTransformation = VisualTransformation.None,
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text)
            )

            Input(
                valor = data,
                funcao = {data = it},
                txt_label = "Data do evento",
                txt_placeholder = "Digite a data do evento",
                icone = Icons.Filled.DateRange,
                visualTransformation = VisualTransformation.None,
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text)

            )

            Input(
                valor = periodo,
                funcao = {periodo = it},
                txt_label = "Periodo do evento",
                txt_placeholder = "Digite o periodo do evento",
                icone = Icons.Filled.DateRange,
                visualTransformation = VisualTransformation.None,
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text)

            )





            Input(
                valor = local,
                funcao = {local = it},
                txt_label = "Local",
                txt_placeholder = "Digite o local do evento",
                icone = Icons.Filled.LocationOn,
                visualTransformation = VisualTransformation.None,
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text)

            )
        }
        Column {
            Botao(cor = ButtonDefaults.buttonColors(Color(0xfffdaa520)),
                txt = "Adicionar",
                funcao = {
                    val evento = Evento(0,nome,data,periodo,local)
                    eventoRepository.cadastrar(evento)
                    navController.navigate("inbox") },
                posicao = Alignment.CenterHorizontally)
            Botao(cor = ButtonDefaults.buttonColors(Color(0xfffdaa520)),
                txt = "Voltar",
                funcao = { navController.navigate("eventos") },
                posicao = Alignment.CenterHorizontally)
        }

    }
}

