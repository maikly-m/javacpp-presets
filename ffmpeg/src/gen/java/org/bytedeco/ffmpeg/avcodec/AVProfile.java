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

// #endif

/**
 * AVProfile.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVProfile extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVProfile() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVProfile(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVProfile(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVProfile position(long position) {
        return (AVProfile)super.position(position);
    }

    public native int profile(); public native AVProfile profile(int setter);
    /** short name for the profile */
    public native @Cast("const char*") BytePointer name(); public native AVProfile name(BytePointer setter);
}
