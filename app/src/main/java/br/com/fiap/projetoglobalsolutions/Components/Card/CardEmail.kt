package br.com.fiap.projetoglobalsolutions.Components.Card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.projetoglobalsolutions.Components.Texto.Texto
import br.com.fiap.projetoglobalsolutions.Components.Titulo.Titulo
import br.com.fiap.projetoglobalsolutions.ui.theme.ProjetoGlobalSolutionsTheme
import java.time.LocalTime

@Composable
fun CardEmail(destinatario:String,remetente:String,assunto:String,corpo:String) {
    val hora = LocalTime.now().hour
    val min = LocalTime.now().minute
    Column {
        Card(modifier = Modifier
            .fillMaxWidth()
            .height(450.dp)
            .padding(12.dp)
        , colors = CardDefaults.cardColors(Color(0xfffdaa520))) {
            Column(modifier = Modifier.padding(12.dp)) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                    Texto(txt = assunto, tamanho = 30, cor = Color.White)
                    Texto(txt = "$hora:$min", tamanho = 12, cor = Color.White)
                }

                Texto(txt = destinatario, tamanho = 20, cor = Color.White)
                Text(text = "Para: $remetente", color = Color.White)
                Text(text = corpo, color = Color.White)
            }

        }

    }

}

@Preview(showSystemUi = true)
@Composable
private fun CardEmailPreview() {
    ProjetoGlobalSolutionsTheme {
        CardEmail("Destinatario",
            "Usuario123",
            "Apontamento",
            "Este é o corpo do email")
    }
}