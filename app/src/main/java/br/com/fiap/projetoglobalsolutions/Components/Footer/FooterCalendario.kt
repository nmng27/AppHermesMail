package br.com.fiap.projetoglobalsolutions.Components.Footer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.projetoglobalsolutions.Components.Botao.Botao
import br.com.fiap.projetoglobalsolutions.ui.theme.ProjetoGlobalSolutionsTheme

@Composable
fun FooterCalendario(funcaoIcone:()->Unit,funcao:()->Unit, txt:String) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Filled.Home, contentDescription = "", tint = Color(0xfffdaa520))
        }
        Button(onClick = { funcao}, colors = ButtonDefaults.buttonColors(Color(0xfffdaa520))) {
            Text(text = txt)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun FooterCalendarioPreview() {
    ProjetoGlobalSolutionsTheme {
        FooterCalendario({},funcao = { /*TODO*/ }, txt = "aaa")
    }
}