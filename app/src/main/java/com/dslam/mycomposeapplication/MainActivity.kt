package com.dslam.mycomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.dslam.mycomposeapplication.ui.theme.MyComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(
            content = {
                MyComposeApplicationTheme {
                    UserInfo(name = "Daniyar", age = 24)
                }
            }
        )
    }
}

@Composable
private fun UserInfo(name: String, age: Int) {
    Column {
        repeat(10) {
            Text(text = "Hello $name! You are $age years old!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingUser() {
    UserInfo(name = "Daniyar", age = 12)
}