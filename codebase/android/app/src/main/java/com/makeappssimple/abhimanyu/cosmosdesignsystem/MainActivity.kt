package com.makeappssimple.abhimanyu.cosmosdesignsystem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.makeappssimple.abhimanyu.cosmosdesignsystem.text.CdsText

class MainActivity : ComponentActivity() {
    private val shortText = "Hello Cosmos Design System!"
    private val longText = "This is a very long text yaaaaaaaaaaaay. ".repeat(5)

    override fun onCreate(
        savedInstanceState: Bundle?,
    ) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        all = 16.dp,
                    ),
                contentAlignment = Alignment.Center,
            ) {
                Column(
                    verticalArrangement = Arrangement
                        .spacedBy(
                            space = 8.dp,
                        ),
                ) {
                    CdsText(
                        text = shortText,
                    )
                    CdsText(
                        text = shortText,
                        minLines = 2,
                    )
                    CdsText(
                        text = longText,
                        minLines = 2,
                    )
                    CdsText(
                        text = longText,
                    )
                    CdsText(
                        text = longText,
                        softWrap = false,
                    )
                    CdsText(
                        text = longText,
                        maxLines = 2,
                    )
                }
            }
        }
    }
}
