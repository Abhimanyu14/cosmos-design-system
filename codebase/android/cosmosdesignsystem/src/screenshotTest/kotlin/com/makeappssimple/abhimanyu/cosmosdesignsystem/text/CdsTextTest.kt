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

package com.makeappssimple.abhimanyu.cosmosdesignsystem.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class CosmosTextTest {
    @Preview(showBackground = true)
    @Composable
    fun Heading1() {
        CosmosText(
            text = "Heading1",
            style = CosmosTextStyle.Heading1,
        )
    }


    @Preview(showBackground = true)
    @Composable
    fun Heading2() {
        CosmosText(
            text = "Heading2",
            style = CosmosTextStyle.Heading2,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Heading3() {
        CosmosText(
            text = "Heading3",
            style = CosmosTextStyle.Heading3,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Body1() {
        CosmosText(
            text = "Body1",
            style = CosmosTextStyle.Body1,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Body2() {
        CosmosText(
            text = "Body2",
            style = CosmosTextStyle.Body2,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Body3() {
        CosmosText(
            text = "Body3",
            style = CosmosTextStyle.Body3,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Body4() {
        CosmosText(
            text = "Body4",
            style = CosmosTextStyle.Body4,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Footnote() {
        CosmosText(
            text = "Footnote",
            style = CosmosTextStyle.Footnote,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Caption() {
        CosmosText(
            text = "Caption",
            style = CosmosTextStyle.Caption,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Small1() {
        CosmosText(
            text = "Small1",
            style = CosmosTextStyle.Small1,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Small2() {
        CosmosText(
            text = "Small2",
            style = CosmosTextStyle.Small2,
        )
    }
}
