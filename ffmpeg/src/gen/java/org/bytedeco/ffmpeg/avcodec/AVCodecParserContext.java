// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avcodec;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;

import static org.bytedeco.ffmpeg.global.avcodec.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVCodecParserContext extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVCodecParserContext() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVCodecParserContext(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVCodecParserContext(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVCodecParserContext position(long position) {
        return (AVCodecParserContext)super.position(position);
    }

    public native Pointer priv_data(); public native AVCodecParserContext priv_data(Pointer setter);
    public native AVCodecParser parser(); public native AVCodecParserContext parser(AVCodecParser setter);
    public native @Cast("int64_t") long frame_offset(); public native AVCodecParserContext frame_offset(long setter); /* offset of the current frame */
    public native @Cast("int64_t") long cur_offset(); public native AVCodecParserContext cur_offset(long setter); /* current offset
                           (incremented by each av_parser_parse()) */
    public native @Cast("int64_t") long next_frame_offset(); public native AVCodecParserContext next_frame_offset(long setter); /* offset of the next frame */
    /* video info */
    public native int pict_type(); public native AVCodecParserContext pict_type(int setter); /* XXX: Put it back in AVCodecContext. */
    /**
     * This field is used for proper frame duration computation in lavf.
     * It signals, how much longer the frame duration of the current frame
     * is compared to normal frame duration.
     *
     * frame_duration = (1 + repeat_pict) * time_base
     *
     * It is used by codecs like H.264 to display telecined material.
     */
    public native int repeat_pict(); public native AVCodecParserContext repeat_pict(int setter); /* XXX: Put it back in AVCodecContext. */
    public native @Cast("int64_t") long pts(); public native AVCodecParserContext pts(long setter);     /* pts of the current frame */
    public native @Cast("int64_t") long dts(); public native AVCodecParserContext dts(long setter);     /* dts of the current frame */

    /* private data */
    public native @Cast("int64_t") long last_pts(); public native AVCodecParserContext last_pts(long setter);
    public native @Cast("int64_t") long last_dts(); public native AVCodecParserContext last_dts(long setter);
    public native int fetch_timestamp(); public native AVCodecParserContext fetch_timestamp(int setter);

public static final int AV_PARSER_PTS_NB = 4;
    public native int cur_frame_start_index(); public native AVCodecParserContext cur_frame_start_index(int setter);
    public native @Cast("int64_t") long cur_frame_offset(int i); public native AVCodecParserContext cur_frame_offset(int i, long setter);
    @MemberGetter public native @Cast("int64_t*") LongPointer cur_frame_offset();
    public native @Cast("int64_t") long cur_frame_pts(int i); public native AVCodecParserContext cur_frame_pts(int i, long setter);
    @MemberGetter public native @Cast("int64_t*") LongPointer cur_frame_pts();
    public native @Cast("int64_t") long cur_frame_dts(int i); public native AVCodecParserContext cur_frame_dts(int i, long setter);
    @MemberGetter public native @Cast("int64_t*") LongPointer cur_frame_dts();

    public native int flags(); public native AVCodecParserContext flags(int setter);
public static final int PARSER_FLAG_COMPLETE_FRAMES =           0x0001;
public static final int PARSER_FLAG_ONCE =                      0x0002;
/** Set if the parser has a valid file offset */
public static final int PARSER_FLAG_FETCHED_OFFSET =            0x0004;
public static final int PARSER_FLAG_USE_CODEC_TS =              0x1000;

    /** byte offset from starting packet start */
    public native @Cast("int64_t") long offset(); public native AVCodecParserContext offset(long setter);
    public native @Cast("int64_t") long cur_frame_end(int i); public native AVCodecParserContext cur_frame_end(int i, long setter);
    @MemberGetter public native @Cast("int64_t*") LongPointer cur_frame_end();

    /**
     * Set by parser to 1 for key frames and 0 for non-key frames.
     * It is initialized to -1, so if the parser doesn't set this flag,
     * old-style fallback using AV_PICTURE_TYPE_I picture type as key frames
     * will be used.
     */
    public native int key_frame(); public native AVCodecParserContext key_frame(int setter);

// #if FF_API_CONVERGENCE_DURATION
    /**
     * @deprecated unused
     */
    public native @Cast("int64_t") @Deprecated long convergence_duration(); public native AVCodecParserContext convergence_duration(long setter);
// #endif

    // Timestamp generation support:
    /**
     * Synchronization point for start of timestamp generation.
     *
     * Set to >0 for sync point, 0 for no sync point and <0 for undefined
     * (default).
     *
     * For example, this corresponds to presence of H.264 buffering period
     * SEI message.
     */
    public native int dts_sync_point(); public native AVCodecParserContext dts_sync_point(int setter);

    /**
     * Offset of the current timestamp against last timestamp sync point in
     * units of AVCodecContext.time_base.
     *
     * Set to INT_MIN when dts_sync_point unused. Otherwise, it must
     * contain a valid timestamp offset.
     *
     * Note that the timestamp of sync point has usually a nonzero
     * dts_ref_dts_delta, which refers to the previous sync point. Offset of
     * the next frame after timestamp sync point will be usually 1.
     *
     * For example, this corresponds to H.264 cpb_removal_delay.
     */
    public native int dts_ref_dts_delta(); public native AVCodecParserContext dts_ref_dts_delta(int setter);

    /**
     * Presentation delay of current frame in units of AVCodecContext.time_base.
     *
     * Set to INT_MIN when dts_sync_point unused. Otherwise, it must
     * contain valid non-negative timestamp delta (presentation time of a frame
     * must not lie in the past).
     *
     * This delay represents the difference between decoding and presentation
     * time of the frame.
     *
     * For example, this corresponds to H.264 dpb_output_delay.
     */
    public native int pts_dts_delta(); public native AVCodecParserContext pts_dts_delta(int setter);

    /**
     * Position of the packet in file.
     *
     * Analogous to cur_frame_pts/dts
     */
    public native @Cast("int64_t") long cur_frame_pos(int i); public native AVCodecParserContext cur_frame_pos(int i, long setter);
    @MemberGetter public native @Cast("int64_t*") LongPointer cur_frame_pos();

    /**
     * Byte position of currently parsed frame in stream.
     */
    public native @Cast("int64_t") long pos(); public native AVCodecParserContext pos(long setter);

    /**
     * Previous frame byte position.
     */
    public native @Cast("int64_t") long last_pos(); public native AVCodecParserContext last_pos(long setter);

    /**
     * Duration of the current frame.
     * For audio, this is in units of 1 / AVCodecContext.sample_rate.
     * For all other types, this is in units of AVCodecContext.time_base.
     */
    public native int duration(); public native AVCodecParserContext duration(int setter);

    public native @Cast("AVFieldOrder") int field_order(); public native AVCodecParserContext field_order(int setter);

    /**
     * Indicate whether a picture is coded as a frame, top field or bottom field.
     *
     * For example, H.264 field_pic_flag equal to 0 corresponds to
     * AV_PICTURE_STRUCTURE_FRAME. An H.264 picture with field_pic_flag
     * equal to 1 and bottom_field_flag equal to 0 corresponds to
     * AV_PICTURE_STRUCTURE_TOP_FIELD.
     */
    public native @Cast("AVPictureStructure") int picture_structure(); public native AVCodecParserContext picture_structure(int setter);

    /**
     * Picture number incremented in presentation or output order.
     * This field may be reinitialized at the first picture of a new sequence.
     *
     * For example, this corresponds to H.264 PicOrderCnt.
     */
    public native int output_picture_number(); public native AVCodecParserContext output_picture_number(int setter);

    /**
     * Dimensions of the decoded video intended for presentation.
     */
    public native int width(); public native AVCodecParserContext width(int setter);
    public native int height(); public native AVCodecParserContext height(int setter);

    /**
     * Dimensions of the coded video.
     */
    public native int coded_width(); public native AVCodecParserContext coded_width(int setter);
    public native int coded_height(); public native AVCodecParserContext coded_height(int setter);

    /**
     * The format of the coded data, corresponds to enum AVPixelFormat for video
     * and for enum AVSampleFormat for audio.
     *
     * Note that a decoder can have considerable freedom in how exactly it
     * decodes the data, so the format reported here might be different from the
     * one returned by a decoder.
     */
    public native int format(); public native AVCodecParserContext format(int setter);
}
