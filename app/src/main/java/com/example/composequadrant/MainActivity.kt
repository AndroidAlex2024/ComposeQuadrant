package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Greeting(
                        name = "Android",
                    )
                }
            }
        }
    }
}


@Composable
fun Block(title: String,memo: String, color: Color,fr: Float,modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier

                    .background(color)
                    .fillMaxWidth(fr)

                    .fillMaxHeight()
                    .padding(16.dp)

    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = modifier
                .padding( bottom = 16.dp)

        )
        Text(
            text = memo,
          //fontSize = 15.sp,
            textAlign = TextAlign.Justify ,
            modifier = modifier


        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {


    Column(
        Modifier

            .background(Color.Green)

    ) {
        Row (

            Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
                .background(Color.White)
        ){
            Block(stringResource(R.string.text_composable),
                stringResource(R.string.text1),Color(0xFFEADDFF),0.5f)

            Block(stringResource(R.string.image_composable),
                stringResource(R.string.text2),Color(0xFFD0BCFF),1f)
        }

        Row (
            Modifier

                .fillMaxWidth()
                .background(Color.White)
        ){
            Block(stringResource(R.string.row_composable),
                stringResource(R.string.text3),Color(0xFFB69DF8),0.5f)

            Block(stringResource(R.string.column_composable),
                stringResource(R.string.text4),Color(0xFFF6EDFF),1f)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Greeting("Android")
    }
}