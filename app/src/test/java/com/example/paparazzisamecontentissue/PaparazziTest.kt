package com.example.paparazzisamecontentissue

import app.cash.paparazzi.Paparazzi
import com.android.ide.common.rendering.api.SessionParams
import org.junit.Rule
import org.junit.Test

class PaparazziTest {

    @get:Rule
    val paparazzi = Paparazzi(
        renderingMode = SessionParams.RenderingMode.SHRINK
    )

    @Test
    fun testMyNiceVerticalLineComponent() {
        paparazzi.snapshot {
            MyNiceVerticalLineComponent()
        }
    }

    @Test
    fun testMyNiceHorizontalLineComponent() {
        paparazzi.snapshot {
            MyNiceHorizontalLineComponent()
        }
    }

    @Test
    fun testMyNiceSquareComponent() {
        paparazzi.snapshot {
            MyNiceSquareComponent()
        }
    }
}