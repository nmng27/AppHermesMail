package br.com.fiap.projetoglobalsolutions.Components.Card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
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
import br.com.fiap.projetoglobalsolutions.ui.theme.ProjetoGlobalSolutionsTheme
import java.time.LocalTime

@Composable
fun CardTemplate(texto:String) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(200.dp)
        .padding(12.dp),
        colors = CardDefaults.cardColors(Color(0xfffdaa520)) ) {
        Column {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp), horizontalAlignment = Alignment.End) {
                val hora = LocalTime.now().hour
                val minuto = LocalTime.now().minute
                Text(text = "$hora : $minuto",
                    color = Color.White, fontWeight = FontWeight.Bold,
                )
            }
            Column(modifier = Modifier.fillMaxWidth() .height(80.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Text(text = texto, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 25.sp)
            }
        }


    }
}

@Preview(showSystemUi = true)
@Composable
private fun CardTemplatePreview() {
    ProjetoGlobalSolutionsTheme {
        CardTemplate("Email Excluído com sucesso")
    }
}