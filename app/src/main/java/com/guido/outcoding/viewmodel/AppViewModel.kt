package com.guido.outcoding.viewmodel

import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.guido.outcoding.model.DatabaseItem
import com.guido.outcoding.model.ModelItem

class AppViewModel: ViewModel() {

    fun retornarItems(): List<ModelItem>{
        val jsonString = DatabaseItem()
        val items = parseJson(jsonString)
        return items
    }

    fun parseJson(jsonString: String): List<ModelItem> {
        return Gson().fromJson(jsonString, Array<ModelItem>::class.java).toList()
    }
}