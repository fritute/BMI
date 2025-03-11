package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.bmi.R


@Composable
fun UserDateScreen(modifier: Modifier = Modifier) {
    val nomeState = remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        Color(0xFFA71BC0),
                        Color(0xFF3FD31C)
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = stringResource(R.string.HI),
                fontSize = 48.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 32.dp)
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.9f), // Ajuste a altura do Card
                shape = RoundedCornerShape(
                    topStart = 50.dp,
                    topEnd = 50.dp
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.8f) // Ajuste a altura da Row
                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .wrapContentHeight() // Ajuste a altura da Column
                            .padding(16.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.logo5),
                            contentDescription = stringResource(id = R.string.logo_description),
                            modifier = Modifier
                                .padding(top = 32.dp)
                                .clip(CircleShape)
                                .border(2.dp, Color.Red, CircleShape)
                        )
                        Button(onClick = {}) {
                            Text(
                                text = stringResource(R.string.Male)
                            )
                        }
                    }
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .wrapContentHeight()
                            .padding(16.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.logo4),
                            contentDescription = stringResource(id = R.string.logo_description),
                            modifier = Modifier
                                .padding(top = 32.dp)
                                .clip(CircleShape)
                                .border(2.dp, Color.Red, CircleShape)
                        )
                        Button(onClick = {}) {
                            Text(
                                text = stringResource(id = R.string.Female)
                            )
                        }
                    }
                }
            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
private fun UserDateScreenPreview() {
    UserDateScreen()
}