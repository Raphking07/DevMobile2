package com.example.taches

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taches.ui.theme.TachesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TachesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    App(
                        "All tasks completed",
                        "Nice work!"
                    )
                }
            }
        }
    }
}

@Composable
fun App(libel1: String,libel2 : String, modifier: Modifier = Modifier) {

    Column(

       verticalArrangement = Arrangement.Center,
       horizontalAlignment =  Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){

        Image(

            painter = painterResource(R.drawable.ic_task_completed),
            contentDescription = "Valid",

        )

        Text(
            text = libel1,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp)
        )

        Text(
            text = libel2,
            fontSize = 16.sp,
            modifier = modifier
        )


    }



}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TachesTheme {
        App(
            stringResource(R.string.libel1),
            stringResource(R.string.libel2)
        )
    }
}