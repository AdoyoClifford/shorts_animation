package com.adoyo.shortsanimation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.adoyo.VideoAnimation
import com.adoyo.shortsanimation.ui.theme.ShortsAnimationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShortsAnimationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ShortsChannel()
                }
            }
        }
    }
}

@Composable
fun ShortsChannel() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Box(modifier = Modifier.size(60.dp)) {
            Image(
                painter = painterResource(id = R.drawable.spotify),
                contentDescription = null,
                modifier = Modifier.clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .zIndex(2f)
                .graphicsLayer {
                    translationX = 60f
                    translationY = 50f
                }) {
                Row(modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(20.dp)) {
                    VideoAnimation()
                }

            }

        }
    }
}
