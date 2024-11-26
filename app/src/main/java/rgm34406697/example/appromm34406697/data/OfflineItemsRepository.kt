package com.example.inventory.data

import kotlinx.coroutines.flow.Flow

abstract class OfflineItemsRepository(private val itemDao: ItemDao) : ItemsRepository {

    // Retorna o fluxo de todos os itens
    override fun getAllItemsStream(): Flow<List<Item>> = itemDao.getAllItems()

    // Retorna o fluxo de um item específico pelo ID
    override fun getItemStream(id: Int): Flow<Item?> = itemDao.getItem(id)

    // Insere um novo item no banco de dados
    override suspend fun insertItem(item: Item) = itemDao.insert(item)

    // Atualiza um item existente no banco de dados
    override suspend fun updateItem(item: Item) = itemDao.update(item)

    // Exclui um item do banco de dados
    override suspend fun deleteItem(item: Item) = itemDao.delete(item)
}
