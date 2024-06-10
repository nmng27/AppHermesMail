package br.com.fiap.projetoglobalsolutions.Components.Header

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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

@Composable
fun Header(txt:String) {
    Column(modifier = Modifier
        .height(100.dp)
        .fillMaxWidth()
        .background(Color(0xfffdaa520)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = txt, color = Color.White, fontSize = 30.sp, fontWeight = FontWeight.Bold)
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HeaderPreview() {
    ProjetoGlobalSolutionsTheme {
        Header(txt = "Teste")
    }
}