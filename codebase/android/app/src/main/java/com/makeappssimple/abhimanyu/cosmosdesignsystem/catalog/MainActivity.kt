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

package com.makeappssimple.abhimanyu.cosmosdesignsystem.catalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.makeappssimple.abhimanyu.cosmosdesignsystem.text.CosmosText
import com.makeappssimple.abhimanyu.cosmosdesignsystem.text.CosmosTextStyle

class MainActivity : ComponentActivity() {
    private val shortText = "Hello Cosmos Design System!"
    private val longText = "This is a very long text otherworldly. ".repeat(5)

    override fun onCreate(
        savedInstanceState: Bundle?,
    ) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppUI()
        }
    }

    @Composable
    private fun AppUI() {
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
                CosmosTypographyDemo()
            }
        }
    }

    @Composable
    private fun CosmosTypographyDemo() {
        CosmosText(
            text = "Heading1",
            style = CosmosTextStyle.Heading1,
        )
        CosmosText(
            text = "Heading2",
            style = CosmosTextStyle.Heading2,
        )
        CosmosText(
            text = "Heading3",
            style = CosmosTextStyle.Heading3,
        )
        CosmosText(
            text = "Body1",
            style = CosmosTextStyle.Body1,
        )
        CosmosText(
            text = "Body2",
            style = CosmosTextStyle.Body2,
        )
        CosmosText(
            text = "Body3",
            style = CosmosTextStyle.Body3,
        )
        CosmosText(
            text = "Body4",
            style = CosmosTextStyle.Body4,
        )
        CosmosText(
            text = "Footnote",
            style = CosmosTextStyle.Footnote,
        )
        CosmosText(
            text = "Caption",
            style = CosmosTextStyle.Caption,
        )
        CosmosText(
            text = "Small1",
            style = CosmosTextStyle.Small1,
        )
        CosmosText(
            text = "Small2",
            style = CosmosTextStyle.Small2,
        )
    }

    @Composable
    private fun CosmosTextDemo() {
        CosmosText(
            text = shortText,
        )
        CosmosText(
            text = shortText,
            minLines = 2,
        )
        CosmosText(
            text = longText,
            minLines = 2,
        )
        CosmosText(
            text = longText,
        )
        CosmosText(
            text = longText,
            softWrap = false,
        )
        CosmosText(
            text = longText,
            maxLines = 2,
        )
    }
}
