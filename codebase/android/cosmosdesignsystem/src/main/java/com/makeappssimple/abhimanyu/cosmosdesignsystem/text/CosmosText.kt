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

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.makeappssimple.abhimanyu.cosmosdesignsystem.R

/**
 * @param text The text to display.
 * @param softWrap Whether the text should wrap or not.
 * @param maxLines The maximum number of lines for the text to span, or Int.MAX_VALUE for no limit.
 * @param minLines The minimum number of lines for the text to span, at least 1.
 * @param style The style of the text.
 */
@Composable
public fun CosmosText(
    text: String,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    style: CosmosTextStyle = CosmosTextStyle.Body2,
) {
    BasicText(
        text = text,
        softWrap = softWrap,
        style = TextStyle.Default.merge(
            fontFamily = FontFamily(
                Font(
                    resId = R.font.lexend,
                )
            ),
            fontSize = style.fontSize,
            fontWeight = style.fontWeight,
        ),
        maxLines = maxLines,
        minLines = minLines,
    )
}

private val CosmosTextStyle.fontSize: TextUnit
    get() = when (this) {
        CosmosTextStyle.Heading1 -> {
            30.sp
        }

        CosmosTextStyle.Heading2 -> {
            28.sp
        }

        CosmosTextStyle.Heading3 -> {
            24.sp
        }

        CosmosTextStyle.Body1 -> {
            18.sp
        }

        CosmosTextStyle.Body2 -> {
            18.sp
        }

        CosmosTextStyle.Body3 -> {
            16.sp
        }

        CosmosTextStyle.Body4 -> {
            16.sp
        }

        CosmosTextStyle.Footnote -> {
            14.sp
        }

        CosmosTextStyle.Caption -> {
            13.sp
        }

        CosmosTextStyle.Small1 -> {
            12.sp
        }

        CosmosTextStyle.Small2 -> {
            12.sp
        }
    }

private val CosmosTextStyle.fontWeight: FontWeight
    get() = when (this) {
        CosmosTextStyle.Heading1 -> {
            FontWeight.SemiBold
        }

        CosmosTextStyle.Heading2 -> {
            FontWeight.SemiBold
        }

        CosmosTextStyle.Heading3 -> {
            FontWeight.SemiBold
        }

        CosmosTextStyle.Body1 -> {
            FontWeight.SemiBold
        }

        CosmosTextStyle.Body2 -> {
            FontWeight.Normal
        }

        CosmosTextStyle.Body3 -> {
            FontWeight.Medium
        }

        CosmosTextStyle.Body4 -> {
            FontWeight.Normal
        }

        CosmosTextStyle.Footnote -> {
            FontWeight.Normal
        }

        CosmosTextStyle.Caption -> {
            FontWeight.Light
        }

        CosmosTextStyle.Small1 -> {
            FontWeight.Medium
        }

        CosmosTextStyle.Small2 -> {
            FontWeight.Normal
        }
    }
