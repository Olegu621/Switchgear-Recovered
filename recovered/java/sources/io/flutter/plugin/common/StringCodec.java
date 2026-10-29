            package io.flutter.plugin.common;

            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class StringCodec implements MessageCodec<String> {
                private static final Charset UTF8 = Charset.forName("UTF8");
                public static final StringCodec INSTANCE = new StringCodec();

                private StringCodec() {
                }

                @Override // io.flutter.plugin.common.MessageCodec
                public String decodeMessage(ByteBuffer byteBuffer) {
                    byte[] bArrArray;
                    int iArrayOffset;
/* 1 */             if (byteBuffer == null) {
/* 3 */                 return null;
                    }
/* 5 */             int iRemaining = byteBuffer.remaining();
/* 13 */            if (byteBuffer.hasArray()) {
/* 15 */                bArrArray = byteBuffer.array();
/* 19 */                iArrayOffset = byteBuffer.arrayOffset();
                    } else {
/* 24 */                bArrArray = new byte[iRemaining];
/* 26 */                byteBuffer.get(bArrArray);
/* 29 */                iArrayOffset = 0;
                    }
/* 34 */            return new String(bArrArray, iArrayOffset, iRemaining, UTF8);
                }

                @Override // io.flutter.plugin.common.MessageCodec
                public ByteBuffer encodeMessage(String str) {
/* 1 */             if (str == null) {
/* 3 */                 return null;
                    }
/* 7 */             byte[] bytes = str.getBytes(UTF8);
/* 12 */            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bytes.length);
/* 16 */            byteBufferAllocateDirect.put(bytes);
/* 19 */            return byteBufferAllocateDirect;
                }
            }
