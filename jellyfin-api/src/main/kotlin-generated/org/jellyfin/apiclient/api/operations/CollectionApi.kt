// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import java.util.UUID
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.CollectionCreationResult

class CollectionApi(
	private val api: KtorClient
) {
	/**
	 * Creates a new collection.
	 *
	 * @param name The name of the collection.
	 * @param ids Item Ids to add to the collection.
	 * @param parentId Optional. Create the collection within a specific folder.
	 * @param isLocked Whether or not to lock the new collection.
	 */
	suspend fun createCollection(
		name: String? = null,
		ids: String? = null,
		parentId: UUID? = null,
		isLocked: Boolean = false
	): Response<CollectionCreationResult> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["name"] = name
		queryParameters["ids"] = ids
		queryParameters["parentId"] = parentId
		queryParameters["isLocked"] = isLocked
		val data = null
		val response = api.post<CollectionCreationResult>("/Collections", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Adds items to a collection.
	 *
	 * @param collectionId The collection id.
	 * @param itemIds Item ids, comma delimited.
	 */
	suspend fun addToCollection(collectionId: UUID, itemIds: String): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["collectionId"] = collectionId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["itemIds"] = itemIds
		val data = null
		val response = api.post<Unit>("/Collections/{collectionId}/Items", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Removes items from a collection.
	 *
	 * @param collectionId The collection id.
	 * @param itemIds Item ids, comma delimited.
	 */
	suspend fun removeFromCollection(collectionId: UUID, itemIds: String): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["collectionId"] = collectionId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["itemIds"] = itemIds
		val data = null
		val response = api.delete<Unit>("/Collections/{collectionId}/Items", pathParameters,
				queryParameters, data)
		return response
	}
}
