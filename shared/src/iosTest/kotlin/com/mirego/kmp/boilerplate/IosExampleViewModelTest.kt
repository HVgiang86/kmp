package com.mirego.kmp.boilerplate

import com.mirego.kmp.boilerplate.viewmodels.example.ExampleViewModelImpl
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest

class IosExampleViewModelTest {

    @Test
    fun testExample() = runTest {
        assertTrue(
            ExampleViewModelImpl(this).state.first().text.contains("iOS"),
            "Check iOS is mentioned"
        )
    }
}
