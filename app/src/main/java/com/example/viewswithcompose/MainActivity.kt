package com.example.viewswithcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val composeView = findViewById<ComposeView>(R.id.composeView_id)
        composeView.setContent {
        }
    }
}

@Composable
fun sayHello(name: String = "Not Set") {
    Text(text = name)
}

@Composable
fun sayBuy(name: String = "Not Set") {
    Text(text = name)
}

@Preview(name = "first", showBackground = true, showSystemUi = true)
@Composable
fun previewFunction() {
    //sayHello("Hello")
    sayBuy("Bye")
}