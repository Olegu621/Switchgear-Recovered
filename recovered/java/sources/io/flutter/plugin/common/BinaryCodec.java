            package io.flutter.plugin.common;

            import java.nio.ByteBuffer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     public final class BinaryCodec implements MessageCodec<ByteBuffer> {
                public static final BinaryCodec INSTANCE = new BinaryCodec();
                public static final BinaryCodec INSTANCE_DIRECT = new BinaryCodec(true);
                private final boolean returnsDirectByteBufferFromDecoding;

                private BinaryCodec() {
/* 5 */             this.returnsDirectByteBufferFromDecoding = false;
                }

                @Override // io.flutter.plugin.common.MessageCodec
                public ByteBuffer decodeMessage(ByteBuffer byteBuffer) {
/* 1 */             if (byteBuffer == null || this.returnsDirectByteBufferFromDecoding) {
/* 8 */                 return byteBuffer;
                    }
/* 13 */            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity());
/* 17 */            byteBufferAllocate.put(byteBuffer);
/* 20 */            byteBufferAllocate.rewind();
/* 23 */            return byteBufferAllocate;
                }

/* 7 */         private BinaryCodec(boolean z) {
/* 9 */             this.returnsDirectByteBufferFromDecoding = z;
                }

                @Override // io.flutter.plugin.common.MessageCodec
/* 7 */         public ByteBuffer encodeMessage(ByteBuffer byteBuffer) {
/* 8 */             return byteBuffer;
                }
            }
