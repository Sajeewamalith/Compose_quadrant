package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.R.string.box1_discription
import com.example.composequadrant.R.string.box1_title
import com.example.composequadrant.R.string.box2_discription
import com.example.composequadrant.R.string.box2_title
import com.example.composequadrant.R.string.box3_discription
import com.example.composequadrant.R.string.box3_title
import com.example.composequadrant.R.string.box4_discription
import com.example.composequadrant.R.string.box4_title
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
               FourPartScreen()
            }
        }
    }
}

@Composable
fun FourPartScreen() {
    Column(modifier = Modifier.fillMaxSize()){
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFEADDFF))
            ){
                TextInBox(
                    title = stringResource(box1_title),
                    discription = stringResource(box1_discription),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFD0BCFF))
            ){
                TextInBox(
                    title = stringResource(box2_title),
                    discription = stringResource(box2_discription),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
        Row(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFB69DF8)
                    )
            ){
                TextInBox(
                    title = stringResource(box3_title),
                    discription = stringResource(box3_discription),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFF6EDFF))
            ){
                TextInBox(
                    title = stringResource(box4_title),
                    discription = stringResource(box4_discription),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
    }
}



@Composable
fun TextInBox(title: String, discription: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(16.dp)
    ) {
        Text(
            text = title,
            modifier = modifier
                .padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = discription
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FourPartScreenPreview() {
    ComposeQuadrantTheme {
        FourPartScreen()
    }
}