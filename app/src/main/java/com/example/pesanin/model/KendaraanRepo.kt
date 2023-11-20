package com.example.pesanin.model

import kotlinx.coroutines.flow.Flow

interface KendaraanRepo {
    /**
     * Retrieve all the items from the the given data source.
     */
    fun getAllItemsStream(): Flow<List<Kendaraan>>

    /**
     * Retrieve an item from the given data source that matches with the [id].
     */
    fun getItemStream(id: Int): Flow<Kendaraan?>

    /**
     * Insert item in the data source
     */
    suspend fun insertItem(item: Kendaraan)

    /**
     * Delete item from the data source
     */
    suspend fun deleteItem(item: Kendaraan)

    /**
     * Update item in the data source
     */
    suspend fun updateItem(item: Kendaraan)
}