package br.com.fiap.projetoglobalsolutions.Components.Texto

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.toLowerCase
import androidx.compose.ui.unit.sp

@Composable
fun Texto(txt:String,tamanho:String,cor:Color) {
    if(tamanho.toLowerCase() == "grande"){
        Column {
            Text(text = txt, fontSize = 30.sp, fontWeight = FontWeight.Bold, color = cor)
        }
    }
    else if(tamanho.toLowerCase() == "médio"){
        Text(text = txt, fontSize = 22.sp, color = cor)
    }
    else{
        Text(text = txt)
    }

}