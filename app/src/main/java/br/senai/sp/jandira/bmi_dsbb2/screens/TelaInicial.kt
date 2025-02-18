package br.senai.sp.jandira.bmi_dsbb2.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi_dsbb2.R


@Composable
fun TelaInicial(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.linearGradient(
                listOf
                    (Color(0xFFC401F6),
                    Color(0xFF1C0423)
                )
            )),
        contentAlignment = Alignment.BottomCenter

    ) {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = stringResource(R.string.logo_descripition),
                modifier = Modifier
                    .padding(top = 32.dp)
            )
            Text(
                text = stringResource(R.string.welcome),
                fontSize = 48.sp,
                color = Color.White
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp),
                shape = RoundedCornerShape(
                    topStart = 50.dp,
                    topEnd = 50.dp)
            ) {
                Text(
                    text = stringResource(R.string.your_name),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 20.dp)


                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    shape = RoundedCornerShape(12.dp),
                    label = {
                        Text(text = stringResource(R.string.your_name_here))
                    }

                )
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(64.dp)
                ){

                    Button(
                        onClick = {}) {
                        Text(
                            text = stringResource(R.string.next)
                        )
                        Icon(
                            imageVector = Icons.Filled.ArrowForward,
                            contentDescription = ""
                        )
                    }
                }


            }
        }

    }
}

@Preview(showSystemUi = true)
@Composable

private fun TelaInicialPreview(

) {
    TelaInicial()
}