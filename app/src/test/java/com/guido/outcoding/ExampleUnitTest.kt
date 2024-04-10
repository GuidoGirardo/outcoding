package com.guido.outcoding

import androidx.navigation.NavController
import com.guido.outcoding.viewmodel.AppViewModel
import org.junit.Test
import com.google.common.truth.Truth.assertThat
import com.guido.outcoding.navigation.AppScreens
import com.guido.outcoding.screens.HomeScreen
import org.junit.Assert.*
import org.junit.Before
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class AppViewModelTest {
    private lateinit var viewModel: AppViewModel

    @Before
    fun setUp() {
        viewModel = AppViewModel()
    }

    @Test
    fun `retornarItems() devuelve una lista no vacía`() {
        val items = viewModel.retornarItems()
        assertThat(items).isNotEmpty()
    }

    @Test
    fun `parseJson() convierte correctamente un JSON en una lista de ModelItems`() {
        val jsonString = """
            [
                {
                    "_id":"2VgBUv9MaBwk5qnK",
                    "tags":["manspreading"],
                    "owner":"null",
                    "createdAt":"Mon Oct 03 2022 07:59:01 GMT+0000 (Coordinated Universal Time)",
                    "updatedAt":"Tue Oct 11 2022 07:52:32 GMT+0000 (Coordinated Universal Time)"
                }
            ]
        """.trimIndent()

        val items = viewModel.parseJson(jsonString)
        assertThat(items).hasSize(1)
        assertThat(items[0].id).isEqualTo("2VgBUv9MaBwk5qnK")
        assertThat(items[0].tags).containsExactly("manspreading")
        assertThat(items[0].owner).isEqualTo("null")
        assertThat(items[0].createdAt).isEqualTo("Mon Oct 03 2022 07:59:01 GMT+0000 (Coordinated Universal Time)")
        assertThat(items[0].updatedAt).isEqualTo("Tue Oct 11 2022 07:52:32 GMT+0000 (Coordinated Universal Time)")
    }

    @Test
    fun `parseJson() maneja correctamente un JSON vacío`() {
        val jsonString = "[]"
        val items = viewModel.parseJson(jsonString)
        assertThat(items).isEmpty()
    }

}