package com.example.pesanin.repository

import com.example.pesanin.data.car.Car
import kotlinx.coroutines.flow.Flow

interface SellingRepository {
    /**
     * Retrieve all the items from the the given data source.
     */
    fun getAllItemsStream(): Flow<List<Car>>

    /**
     * Retrieve an item from the given data source that matches with the [id].
     */
    fun getItemStream(id: Int): Flow<Car?>

    /**
     * Insert item in the data source
     */
    suspend fun insertItem(item: Car)

    /**
     * Delete item from the data source
     */
    suspend fun deleteItem(item: Car)

    /**
     * Update item in the data source
     */
    suspend fun updateItem(item: Car)
}