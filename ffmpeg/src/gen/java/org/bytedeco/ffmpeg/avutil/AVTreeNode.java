// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * \addtogroup lavu_tree AVTree
 * \ingroup lavu_data
 *
 * Low-complexity tree container
 *
 * Insertion, removal, finding equal, largest which is smaller than and
 * smallest which is larger than, all have O(log n) worst-case complexity.
 * \{
 */


@Opaque @Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVTreeNode extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AVTreeNode() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVTreeNode(Pointer p) { super(p); }
}
