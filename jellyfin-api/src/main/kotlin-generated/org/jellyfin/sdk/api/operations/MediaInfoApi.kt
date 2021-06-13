// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.api.operations

import io.ktor.utils.io.ByteReadChannel
import java.util.UUID
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import org.jellyfin.sdk.api.client.KtorClient
import org.jellyfin.sdk.api.client.Response
import org.jellyfin.sdk.api.client.exception.MissingUserIdException
import org.jellyfin.sdk.model.api.LiveStreamResponse
import org.jellyfin.sdk.model.api.OpenLiveStreamDto
import org.jellyfin.sdk.model.api.PlaybackInfoDto
import org.jellyfin.sdk.model.api.PlaybackInfoResponse

public class MediaInfoApi(
	private val api: KtorClient
) {
	/**
	 * Closes a media source.
	 *
	 * @param liveStreamId The livestream id.
	 */
	public suspend fun closeLiveStream(liveStreamId: String): Response<Unit> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["liveStreamId"] = liveStreamId
		val data = null
		val response = api.post<Unit>("/LiveStreams/Close", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Tests the network with a request with the size of the bitrate.
	 *
	 * @param size The bitrate. Defaults to 102400.
	 */
	public suspend fun getBitrateTestBytes(size: Int? = 102400): Response<ByteReadChannel> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["size"] = size
		val data = null
		val response = api.`get`<ByteReadChannel>("/Playback/BitrateTest", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Tests the network with a request with the size of the bitrate.
	 *
	 * @param size The bitrate. Defaults to 102400.
	 * @param includeCredentials Add the access token to the url to make an authenticated request.
	 */
	public fun getBitrateTestBytesUrl(size: Int? = 102400, includeCredentials: Boolean = true):
			String {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["size"] = size
		return api.createUrl("/Playback/BitrateTest", pathParameters, queryParameters, includeCredentials)
	}

	/**
	 * Gets live playback media info for an item.
	 *
	 * @param itemId The item id.
	 * @param userId The user id.
	 */
	public suspend fun getPlaybackInfo(itemId: UUID, userId: UUID = api.userId ?: throw
			MissingUserIdException()): Response<PlaybackInfoResponse> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		val data = null
		val response = api.`get`<PlaybackInfoResponse>("/Items/{itemId}/PlaybackInfo", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * For backwards compatibility parameters can be sent via Query or Body, with Query having higher
	 * precedence.
	 * Query parameters are obsolete.
	 *
	 * @param itemId The item id.
	 */
	public suspend fun getPostedPlaybackInfo(itemId: UUID, `data`: PlaybackInfoDto? = null):
			Response<PlaybackInfoResponse> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<PlaybackInfoResponse>("/Items/{itemId}/PlaybackInfo", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * For backwards compatibility parameters can be sent via Query or Body, with Query having higher
	 * precedence.
	 * Query parameters are obsolete.
	 *
	 * @param itemId The item id.
	 * @param userId The user id.
	 * @param maxStreamingBitrate The maximum streaming bitrate.
	 * @param startTimeTicks The start time in ticks.
	 * @param audioStreamIndex The audio stream index.
	 * @param subtitleStreamIndex The subtitle stream index.
	 * @param maxAudioChannels The maximum number of audio channels.
	 * @param mediaSourceId The media source id.
	 * @param liveStreamId The livestream id.
	 * @param autoOpenLiveStream Whether to auto open the livestream.
	 * @param enableDirectPlay Whether to enable direct play. Default: true.
	 * @param enableDirectStream Whether to enable direct stream. Default: true.
	 * @param enableTranscoding Whether to enable transcoding. Default: true.
	 * @param allowVideoStreamCopy Whether to allow to copy the video stream. Default: true.
	 * @param allowAudioStreamCopy Whether to allow to copy the audio stream. Default: true.
	 */
	@Deprecated("This member is deprecated and may be removed in the future")
	public suspend fun getPostedPlaybackInfoDeprecated(
		itemId: UUID,
		userId: UUID? = null,
		maxStreamingBitrate: Int? = null,
		startTimeTicks: Long? = null,
		audioStreamIndex: Int? = null,
		subtitleStreamIndex: Int? = null,
		maxAudioChannels: Int? = null,
		mediaSourceId: String? = null,
		liveStreamId: String? = null,
		autoOpenLiveStream: Boolean? = null,
		enableDirectPlay: Boolean? = null,
		enableDirectStream: Boolean? = null,
		enableTranscoding: Boolean? = null,
		allowVideoStreamCopy: Boolean? = null,
		allowAudioStreamCopy: Boolean? = null,
		`data`: PlaybackInfoDto? = null
	): Response<PlaybackInfoResponse> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["userId"] = userId
		queryParameters["maxStreamingBitrate"] = maxStreamingBitrate
		queryParameters["startTimeTicks"] = startTimeTicks
		queryParameters["audioStreamIndex"] = audioStreamIndex
		queryParameters["subtitleStreamIndex"] = subtitleStreamIndex
		queryParameters["maxAudioChannels"] = maxAudioChannels
		queryParameters["mediaSourceId"] = mediaSourceId
		queryParameters["liveStreamId"] = liveStreamId
		queryParameters["autoOpenLiveStream"] = autoOpenLiveStream
		queryParameters["enableDirectPlay"] = enableDirectPlay
		queryParameters["enableDirectStream"] = enableDirectStream
		queryParameters["enableTranscoding"] = enableTranscoding
		queryParameters["allowVideoStreamCopy"] = allowVideoStreamCopy
		queryParameters["allowAudioStreamCopy"] = allowAudioStreamCopy
		val response = api.post<PlaybackInfoResponse>("/Items/{itemId}/PlaybackInfo", pathParameters,
				queryParameters, data)
		return response
	}

	/**
	 * Opens a media source.
	 *
	 * @param openToken The open token.
	 * @param userId The user id.
	 * @param playSessionId The play session id.
	 * @param maxStreamingBitrate The maximum streaming bitrate.
	 * @param startTimeTicks The start time in ticks.
	 * @param audioStreamIndex The audio stream index.
	 * @param subtitleStreamIndex The subtitle stream index.
	 * @param maxAudioChannels The maximum number of audio channels.
	 * @param itemId The item id.
	 * @param enableDirectPlay Whether to enable direct play. Default: true.
	 * @param enableDirectStream Whether to enable direct stream. Default: true.
	 */
	public suspend fun openLiveStream(
		openToken: String? = null,
		userId: UUID? = null,
		playSessionId: String? = null,
		maxStreamingBitrate: Int? = null,
		startTimeTicks: Long? = null,
		audioStreamIndex: Int? = null,
		subtitleStreamIndex: Int? = null,
		maxAudioChannels: Int? = null,
		itemId: UUID? = null,
		enableDirectPlay: Boolean? = null,
		enableDirectStream: Boolean? = null,
		`data`: OpenLiveStreamDto? = null
	): Response<LiveStreamResponse> {
		val pathParameters = emptyMap<String, Any?>()
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["openToken"] = openToken
		queryParameters["userId"] = userId
		queryParameters["playSessionId"] = playSessionId
		queryParameters["maxStreamingBitrate"] = maxStreamingBitrate
		queryParameters["startTimeTicks"] = startTimeTicks
		queryParameters["audioStreamIndex"] = audioStreamIndex
		queryParameters["subtitleStreamIndex"] = subtitleStreamIndex
		queryParameters["maxAudioChannels"] = maxAudioChannels
		queryParameters["itemId"] = itemId
		queryParameters["enableDirectPlay"] = enableDirectPlay
		queryParameters["enableDirectStream"] = enableDirectStream
		val response = api.post<LiveStreamResponse>("/LiveStreams/Open", pathParameters, queryParameters,
				data)
		return response
	}
}
