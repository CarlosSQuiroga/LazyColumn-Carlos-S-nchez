package me.carlossanchez.instagramclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import me.carlossanchez.instagramclone.ui.screens.FeedScreen
import me.carlossanchez.instagramclone.ui.theme.InstagramcloneTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            InstagramcloneTheme() {

                FeedScreen()
            }
        }
    }
}