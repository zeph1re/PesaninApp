package com.example.pesanin.model

import kotlinx.coroutines.flow.Flow

class OfflineKendaraanRepo (private val kendaraanDao : KendaraanDao) : KendaraanRepo {
    override fun getAllItemsStream(): Flow<List<Kendaraan>> = kendaraanDao.getAllItems()

    override fun getItemStream(id: Int): Flow<Kendaraan?> = kendaraanDao.getItem(id)

    override suspend fun insertItem(item: Kendaraan) = kendaraanDao.insert(item)

    override suspend fun deleteItem(item: Kendaraan) = kendaraanDao.delete(item)

    override suspend fun updateItem(item: Kendaraan) = kendaraanDao.update(item)
}