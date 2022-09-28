package com.oyamo.kontributor.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import com.oyamo.kontributor.presentation.screens.NavGraphs
import com.oyamo.kontributor.presentation.ui.theme.DlightTheme
import com.ramcosta.composedestinations.DestinationsNavHost
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DlightTheme {
                Scaffold {
                    DestinationsNavHost(navGraph = NavGraphs.root)
                }
            }
        }
    }
}