package br.com.testecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Imagem do Itachi Uchiha",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = "Olá, ${name}")
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "Seja bem vindo ao App!")
        }
    }

    @Preview
    @Composable
    fun PreviewMessageCard() {
        MessageCard(name = "Cristian")
    }
}
