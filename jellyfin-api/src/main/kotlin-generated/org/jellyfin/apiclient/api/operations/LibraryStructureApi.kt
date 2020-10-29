// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.AddVirtualFolderDto
import org.jellyfin.apiclient.model.api.MediaPathDto
import org.jellyfin.apiclient.model.api.MediaPathInfo
import org.jellyfin.apiclient.model.api.UpdateLibraryOptionsDto
import org.jellyfin.apiclient.model.api.VirtualFolderInfo

class LibraryStructureApi(
	private val api: KtorClient
) {
	/**
	 * Gets all virtual folders.
	 */
	suspend fun getVirtualFolders(): Response<List<VirtualFolderInfo>> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<List<VirtualFolderInfo>>("/Library/VirtualFolders", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Adds a virtual folder.
	 *
	 * @param name The name of the virtual folder.
	 * @param collectionType The type of the collection.
	 * @param paths The paths of the virtual folder.
	 * @param refreshLibrary Whether to refresh the library.
	 */
	suspend fun addVirtualFolder(
		name: String? = null,
		collectionType: String? = null,
		paths: List<String>? = emptyList(),
		refreshLibrary: Boolean = false,
		data: AddVirtualFolderDto
	): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["name"] = name
		queryParameters["collectionType"] = collectionType
		queryParameters["paths"] = paths
		queryParameters["refreshLibrary"] = refreshLibrary
		val response = api.post<Unit>("/Library/VirtualFolders", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Removes a virtual folder.
	 *
	 * @param name The name of the folder.
	 * @param refreshLibrary Whether to refresh the library.
	 */
	suspend fun removeVirtualFolder(name: String? = null, refreshLibrary: Boolean = false):
			Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["name"] = name
		queryParameters["refreshLibrary"] = refreshLibrary
		val data = null
		val response = api.delete<Unit>("/Library/VirtualFolders", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Update library options.
	 */
	suspend fun updateLibraryOptions(data: UpdateLibraryOptionsDto): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<Unit>("/Library/VirtualFolders/LibraryOptions", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Renames a virtual folder.
	 *
	 * @param name The name of the virtual folder.
	 * @param newName The new name.
	 * @param refreshLibrary Whether to refresh the library.
	 */
	suspend fun renameVirtualFolder(
		name: String? = null,
		newName: String? = null,
		refreshLibrary: Boolean = false
	): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["name"] = name
		queryParameters["newName"] = newName
		queryParameters["refreshLibrary"] = refreshLibrary
		val data = null
		val response = api.post<Unit>("/Library/VirtualFolders/Name", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Add a media path to a library.
	 *
	 * @param refreshLibrary Whether to refresh the library.
	 */
	suspend fun addMediaPath(refreshLibrary: Boolean = false, data: MediaPathDto): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["refreshLibrary"] = refreshLibrary
		val response = api.post<Unit>("/Library/VirtualFolders/Paths", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Remove a media path.
	 *
	 * @param name The name of the library.
	 * @param path The path to remove.
	 * @param refreshLibrary Whether to refresh the library.
	 */
	suspend fun removeMediaPath(
		name: String? = null,
		path: String? = null,
		refreshLibrary: Boolean = false
	): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["name"] = name
		queryParameters["path"] = path
		queryParameters["refreshLibrary"] = refreshLibrary
		val data = null
		val response = api.delete<Unit>("/Library/VirtualFolders/Paths", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Updates a media path.
	 *
	 * @param name The name of the library.
	 */
	suspend fun updateMediaPath(name: String? = null, data: MediaPathInfo): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["name"] = name
		val response = api.post<Unit>("/Library/VirtualFolders/Paths/Update", pathParameters,
				queryParameters, data)
		return response
	}
}
