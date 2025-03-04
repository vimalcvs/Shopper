package com.codewithfk.data.repository

import com.codewithfk.domain.model.CategoriesListModel
import com.codewithfk.domain.network.NetworkService
import com.codewithfk.domain.network.ResultWrapper
import com.codewithfk.domain.repository.CategoryRepository

class CategoryRepositoryImpl(private val networkService: NetworkService) : CategoryRepository {
    override suspend fun getCategories(): ResultWrapper<CategoriesListModel> {
        return networkService.getCategories()
    }
}