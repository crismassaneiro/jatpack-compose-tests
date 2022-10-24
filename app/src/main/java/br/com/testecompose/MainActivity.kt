package br.com.testecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.testecompose.ui.theme.TesteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MessageCard(name = "Cristian")
        }
    }

    @Composable
    fun MessageCard(name: String) {
        Image(
            painter = painterResource(id = R.drawable.Itachi),
            contentDescription = "Imagem do Itachi Uchiha"
        )
        Column() {
            Text(text = "Olá, ${name}")
            Text(text = "Seja bem vindo ao App!")
        }
    }

    @Preview
    @Composable
    fun PreviewMessageCard() {
        MessageCard(name = "Cristian")
    }
}
