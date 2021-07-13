package dev.mehade.counterviewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import dev.mehade.counterviewmodel.pages.CounterPage
import dev.mehade.counterviewmodel.pages.CounterViewModel
import dev.mehade.counterviewmodel.ui.theme.CounterViewModelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterViewModelTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background,
                ) {
                    CounterPage(CounterViewModel())
                }
            }
        }
    }
}
