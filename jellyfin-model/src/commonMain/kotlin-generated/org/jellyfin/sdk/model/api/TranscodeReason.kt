// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public enum class TranscodeReason(
	public val serialName: String,
) {
	@SerialName("ContainerNotSupported")
	CONTAINER_NOT_SUPPORTED("ContainerNotSupported"),
	@SerialName("VideoCodecNotSupported")
	VIDEO_CODEC_NOT_SUPPORTED("VideoCodecNotSupported"),
	@SerialName("AudioCodecNotSupported")
	AUDIO_CODEC_NOT_SUPPORTED("AudioCodecNotSupported"),
	@SerialName("SubtitleCodecNotSupported")
	SUBTITLE_CODEC_NOT_SUPPORTED("SubtitleCodecNotSupported"),
	@SerialName("AudioIsExternal")
	AUDIO_IS_EXTERNAL("AudioIsExternal"),
	@SerialName("SecondaryAudioNotSupported")
	SECONDARY_AUDIO_NOT_SUPPORTED("SecondaryAudioNotSupported"),
	@SerialName("VideoProfileNotSupported")
	VIDEO_PROFILE_NOT_SUPPORTED("VideoProfileNotSupported"),
	@SerialName("VideoLevelNotSupported")
	VIDEO_LEVEL_NOT_SUPPORTED("VideoLevelNotSupported"),
	@SerialName("VideoResolutionNotSupported")
	VIDEO_RESOLUTION_NOT_SUPPORTED("VideoResolutionNotSupported"),
	@SerialName("VideoBitDepthNotSupported")
	VIDEO_BIT_DEPTH_NOT_SUPPORTED("VideoBitDepthNotSupported"),
	@SerialName("VideoFramerateNotSupported")
	VIDEO_FRAMERATE_NOT_SUPPORTED("VideoFramerateNotSupported"),
	@SerialName("RefFramesNotSupported")
	REF_FRAMES_NOT_SUPPORTED("RefFramesNotSupported"),
	@SerialName("AnamorphicVideoNotSupported")
	ANAMORPHIC_VIDEO_NOT_SUPPORTED("AnamorphicVideoNotSupported"),
	@SerialName("InterlacedVideoNotSupported")
	INTERLACED_VIDEO_NOT_SUPPORTED("InterlacedVideoNotSupported"),
	@SerialName("AudioChannelsNotSupported")
	AUDIO_CHANNELS_NOT_SUPPORTED("AudioChannelsNotSupported"),
	@SerialName("AudioProfileNotSupported")
	AUDIO_PROFILE_NOT_SUPPORTED("AudioProfileNotSupported"),
	@SerialName("AudioSampleRateNotSupported")
	AUDIO_SAMPLE_RATE_NOT_SUPPORTED("AudioSampleRateNotSupported"),
	@SerialName("AudioBitDepthNotSupported")
	AUDIO_BIT_DEPTH_NOT_SUPPORTED("AudioBitDepthNotSupported"),
	@SerialName("ContainerBitrateExceedsLimit")
	CONTAINER_BITRATE_EXCEEDS_LIMIT("ContainerBitrateExceedsLimit"),
	@SerialName("VideoBitrateNotSupported")
	VIDEO_BITRATE_NOT_SUPPORTED("VideoBitrateNotSupported"),
	@SerialName("AudioBitrateNotSupported")
	AUDIO_BITRATE_NOT_SUPPORTED("AudioBitrateNotSupported"),
	@SerialName("UnknownVideoStreamInfo")
	UNKNOWN_VIDEO_STREAM_INFO("UnknownVideoStreamInfo"),
	@SerialName("UnknownAudioStreamInfo")
	UNKNOWN_AUDIO_STREAM_INFO("UnknownAudioStreamInfo"),
	@SerialName("DirectPlayError")
	DIRECT_PLAY_ERROR("DirectPlayError"),
	@SerialName("VideoRangeTypeNotSupported")
	VIDEO_RANGE_TYPE_NOT_SUPPORTED("VideoRangeTypeNotSupported"),
	;

	public override fun toString(): String = serialName
}
