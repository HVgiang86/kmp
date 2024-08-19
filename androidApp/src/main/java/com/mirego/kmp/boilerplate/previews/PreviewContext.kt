package com.mirego.kmp.boilerplate.previews

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.startup.AppInitializer
import com.mirego.kmp.boilerplate.platform.AppContextInitializer
import com.mirego.kmp.boilerplate.viewmodels.ViewModelFactory

@Composable
fun PreviewContext(content: @Composable (ViewModelFactory) -> Unit) {
    // @Composable previews do not call AppInitializer. We must initialize our components manually.
    AppInitializer.getInstance(LocalContext.current)
        .initializeComponent(AppContextInitializer::class.java)

    val viewModelFactory = ViewModelFactory()

    content(viewModelFactory)
}
