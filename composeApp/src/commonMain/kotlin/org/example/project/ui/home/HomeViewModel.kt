package org.example.project.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.example.project.data.model.Animal
import org.example.project.data.model.Category

class HomeViewModel() : ViewModel() {
    private val _categoriesState: MutableStateFlow<List<Category>?> = MutableStateFlow(null)
    val categoriesState: StateFlow<List<Category>?> = _categoriesState.asStateFlow()

    var selectedCategory = "All"

    private val _animalState: MutableStateFlow<List<Animal>?> = MutableStateFlow(null)
    val animalState: StateFlow<List<Animal>?> = _animalState.asStateFlow()

    init {
        getCategoryList()
        selectCategory("All")
    }

    private fun getCategoryList() = viewModelScope.launch {
        _categoriesState.emit(Category.categoryList)
    }

    private fun getAnimalList(categoryName: String) = viewModelScope.launch {
        val animalList =
            if (categoryName != "All") {
                Animal.animalList.filter { it.category.name == categoryName }
            } else Animal.animalList
        _animalState.emit(animalList)
    }

    fun selectCategory(name: String) {
        selectedCategory = name
        getAnimalList(categoryName = name)
    }
}