package com.makeappssimple.abhimanyu.cosmosdesignsystem.text

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable

@Composable
public fun CdsText(
    text: String,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
) {
    BasicText(
        text = text,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
    )
}
