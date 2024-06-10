package br.com.fiap.projetoglobalsolutions.Components.Botao

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle

@Composable
fun Botao(cor:ButtonColors,txt:String, funcao:()->Unit,posicao: Alignment.Horizontal) {
    Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = posicao) {
        Button(onClick = { funcao }, colors = cor) {
            Text(text = txt)
        }
    }
}