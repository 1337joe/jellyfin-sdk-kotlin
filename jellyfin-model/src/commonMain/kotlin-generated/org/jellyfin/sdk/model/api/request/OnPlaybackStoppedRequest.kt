// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(UUIDSerializer::class)

package org.jellyfin.sdk.model.api.request

import kotlin.Long
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.UUID
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Reports that a user has stopped playing an item.
 */
@Serializable
public data class OnPlaybackStoppedRequest(
	/**
	 * User id.
	 */
	@SerialName("userId")
	public val userId: UUID,
	/**
	 * Item id.
	 */
	@SerialName("itemId")
	public val itemId: UUID,
	/**
	 * The id of the MediaSource.
	 */
	@SerialName("mediaSourceId")
	public val mediaSourceId: String? = null,
	/**
	 * The next media type that will play.
	 */
	@SerialName("nextMediaType")
	public val nextMediaType: String? = null,
	/**
	 * Optional. The position, in ticks, where playback stopped. 1 tick = 10000 ms.
	 */
	@SerialName("positionTicks")
	public val positionTicks: Long? = null,
	/**
	 * The live stream id.
	 */
	@SerialName("liveStreamId")
	public val liveStreamId: String? = null,
	/**
	 * The play session id.
	 */
	@SerialName("playSessionId")
	public val playSessionId: String? = null,
)
