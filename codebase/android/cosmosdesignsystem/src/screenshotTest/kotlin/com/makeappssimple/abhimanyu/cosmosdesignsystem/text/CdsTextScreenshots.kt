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

class CdsText {
    @Preview(showBackground = true)
    @Composable
    fun Heading1() {
        CdsText(
            text = "Heading1",
            style = CdsTextStyle.Heading1,
        )
    }


    @Preview(showBackground = true)
    @Composable
    fun Heading2() {
        CdsText(
            text = "Heading2",
            style = CdsTextStyle.Heading2,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Heading3() {
        CdsText(
            text = "Heading3",
            style = CdsTextStyle.Heading3,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Body1() {
        CdsText(
            text = "Body1",
            style = CdsTextStyle.Body1,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Body2() {
        CdsText(
            text = "Body2",
            style = CdsTextStyle.Body2,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Body3() {
        CdsText(
            text = "Body3",
            style = CdsTextStyle.Body3,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Body4() {
        CdsText(
            text = "Body4",
            style = CdsTextStyle.Body4,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Footnote() {
        CdsText(
            text = "Footnote",
            style = CdsTextStyle.Footnote,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Caption() {
        CdsText(
            text = "Caption",
            style = CdsTextStyle.Caption,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Small1() {
        CdsText(
            text = "Small1",
            style = CdsTextStyle.Small1,
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun Small2() {
        CdsText(
            text = "Small2",
            style = CdsTextStyle.Small2,
        )
    }
}
