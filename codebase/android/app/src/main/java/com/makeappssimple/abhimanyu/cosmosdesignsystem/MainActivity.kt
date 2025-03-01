/*
 * Copyright 2025-2025 Abhimanyu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
