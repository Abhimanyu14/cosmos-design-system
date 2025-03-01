package com.makeappssimple.abhimanyu.cosmosdesignsystem.text

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable

/**
 * @param text The text to display.
 * @param softWrap Whether the text should wrap or not.
 * @param maxLines The maximum number of lines for the text to span, or Int.MAX_VALUE for no limit.
 * @param minLines The minimum number of lines for the text to span, at least 1.
 */
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
