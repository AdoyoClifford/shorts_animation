package com.adoyo

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun VideoAnimation() {
    val infiniteAnimation = rememberInfiniteTransition()
    val height1 by infiniteAnimation.animateFloat(
        initialValue = 13f,
        targetValue = 13f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 500
                0.7f at 200
            },
            repeatMode = RepeatMode.Reverse
        )
    )
    val height2 by infiniteAnimation.animateFloat(
        initialValue = 10f,
        targetValue = 10f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 450
                0.7f at 200
            },
            repeatMode = RepeatMode.Reverse
        )
    )
    val height3 by infiniteAnimation.animateFloat(
        initialValue = 8f,
        targetValue = 8f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 400
                0.7f at 200
            },
            repeatMode = RepeatMode.Reverse
        )
    )

    Box(
        modifier = Modifier
            .background(Color.DarkGray)
            .clip(CircleShape), contentAlignment = Alignment.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(2.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier.width(2.dp).height(height1.dp).clip(RoundedCornerShape(50.dp))
                    .background(
                        Color.White
                    )
            )
            Box(
                modifier = Modifier.width(2.dp).height(height2.dp).clip(RoundedCornerShape(50.dp))
                    .background(
                        Color.White
                    )
            )
            Box(
                modifier = Modifier.width(2.dp).height(height3.dp).clip(RoundedCornerShape(50.dp))
                    .background(
                        Color.White
                    )
            )
        }
    }
}