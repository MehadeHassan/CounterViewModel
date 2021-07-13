package dev.mehade.counterviewmodel.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun CounterPage(model: CounterViewModel) {

    val count by model.counterLiveDate.observeAsState(0)

    Scaffold(
        floatingActionButton = {
            MyFAB {
                model.increaseCounter()
            }
        },

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            CounterView(counter = count)
        }
    }
}

@Composable
fun CounterView(counter: Int) =
    Text(
        text = counter.toString(),
        style = TextStyle(fontSize = 25.sp)
    )

@Composable
fun MyFAB(onClick: () -> Unit) =
    FloatingActionButton(onClick = onClick) { Icon(Icons.Rounded.Add, contentDescription = "Add") }
