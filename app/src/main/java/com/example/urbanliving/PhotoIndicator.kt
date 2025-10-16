package com.example.urbanliving

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun PhotoIndicator(
    totalPhotos: Int = 4,
    currentPhoto: Int = 0
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(top = 16.dp)
    ) {
        for (i in 0 until totalPhotos) {
            Box(
                modifier = Modifier
                    .width(
                        if (i == currentPhoto) 60.dp else 40.dp
                    )
                    .height(5.dp)
                    .background(
                        color = if (i == currentPhoto) Color.Yellow else Color.White,
                        shape = RoundedCornerShape(2.dp)
                    )
            )
        }
    }
}