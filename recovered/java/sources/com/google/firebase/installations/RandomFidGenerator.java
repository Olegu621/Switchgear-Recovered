            package com.google.firebase.installations;

            import android.util.Base64;
            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import java.util.UUID;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class RandomFidGenerator {
                private static final int FID_LENGTH = 22;
                private static final byte FID_4BIT_PREFIX = Byte.parseByte("01110000", 2);
                private static final byte REMOVE_PREFIX_MASK = Byte.parseByte("00001111", 2);

                private static String encodeFidBase64UrlSafe(byte[] bArr) {
/* 19 */            return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
                }

                private static byte[] getBytesFromUUID(UUID uuid, byte[] bArr) {
/* 1 */             ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
/* 9 */             byteBufferWrap.putLong(uuid.getMostSignificantBits());
/* 16 */            byteBufferWrap.putLong(uuid.getLeastSignificantBits());
/* 19 */            return byteBufferWrap.array();
                }

                public String createRandomFid() {
/* 9 */             byte[] bytesFromUUID = getBytesFromUUID(UUID.randomUUID(), new byte[17]);
/* 14 */            byte b = bytesFromUUID[0];
/* 18 */            bytesFromUUID[16] = b;
/* 27 */            bytesFromUUID[0] = (byte) ((b & REMOVE_PREFIX_MASK) | FID_4BIT_PREFIX);
/* 29 */            return encodeFidBase64UrlSafe(bytesFromUUID);
                }
            }
