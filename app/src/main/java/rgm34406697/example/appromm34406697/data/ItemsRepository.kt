package rgm34406697.example.appromm34406697.data

import kotlinx.coroutines.flow.Flow
import rgm34406697.example.appromm34406697.data.Item

/**
 * Repository interface for accessing and manipulating items.
 */
interface ItemsRepository {
    fun getAllItemsStream(): Flow<List<Item>>
    fun getItemStream(id: Int): Flow<Item?>
    suspend fun insertItem(item: Item)
    suspend fun updateItem(item: Item)
    suspend fun deleteItem(item: Item)
}
