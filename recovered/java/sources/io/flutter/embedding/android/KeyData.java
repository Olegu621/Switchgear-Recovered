            package io.flutter.embedding.android;

            import java.io.UnsupportedEncodingException;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 143 */   public class KeyData {
                private static final int BYTES_PER_FIELD = 8;
                public static final String CHANNEL = "flutter/keydata";
                private static final int FIELD_COUNT = 6;
                private static final String TAG = "KeyData";
                String character;
                DeviceType deviceType;
                long logicalKey;
                long physicalKey;
                boolean synthesized;
                long timestamp;
                Type type;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum DeviceType {
                    kKeyboard(0),
                    kDirectionalPad(1),
                    kGamepad(2),
                    kJoystick(3),
                    kHdmi(4);

                    private final long value;

                    DeviceType(long j) {
/* 4 */                 this.value = j;
                    }

                    public static DeviceType fromLong(long j) {
/* 1 */                 int i = (int) j;
/* 2 */                 if (i == 0) {
/* 35 */                    return kKeyboard;
                        }
/* 5 */                 if (i == 1) {
/* 32 */                    return kDirectionalPad;
                        }
/* 8 */                 if (i == 2) {
/* 29 */                    return kGamepad;
                        }
/* 11 */                if (i == 3) {
/* 26 */                    return kJoystick;
                        }
/* 14 */                if (i == 4) {
/* 16 */                    return kHdmi;
                        }
/* 21 */                C1951n4.m6856g("Unexpected DeviceType value");
/* 24 */                return null;
                    }

                    public long getValue() {
/* 1 */                 return this.value;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum Type {
                    kDown(0),
                    kUp(1),
                    kRepeat(2);

                    private long value;

                    Type(long j) {
/* 4 */                 this.value = j;
                    }

                    public static Type fromLong(long j) {
/* 1 */                 int i = (int) j;
/* 2 */                 if (i == 0) {
/* 23 */                    return kDown;
                        }
/* 5 */                 if (i == 1) {
/* 20 */                    return kUp;
                        }
/* 8 */                 if (i == 2) {
/* 10 */                    return kRepeat;
                        }
/* 15 */                C1951n4.m6856g("Unexpected Type value");
/* 18 */                return null;
                    }

                    public long getValue() {
/* 1 */                 return this.value;
                    }
                }

                public KeyData(ByteBuffer byteBuffer) {
/* 4 */             long j = byteBuffer.getLong();
/* 12 */            this.timestamp = byteBuffer.getLong();
/* 22 */            this.type = Type.fromLong(byteBuffer.getLong());
/* 28 */            this.physicalKey = byteBuffer.getLong();
/* 34 */            this.logicalKey = byteBuffer.getLong();
/* 50 */            this.synthesized = byteBuffer.getLong() != 0;
/* 60 */            this.deviceType = DeviceType.fromLong(byteBuffer.getLong());
/* 69 */            if (byteBuffer.remaining() != j) {
/* 144 */               throw new AssertionError(String.format("Unexpected char length: charSize is %d while buffer has position %d, capacity %d, limit %d", Long.valueOf(j), Integer.valueOf(byteBuffer.position()), Integer.valueOf(byteBuffer.capacity()), Integer.valueOf(byteBuffer.limit())));
                    }
/* 72 */            this.character = null;
/* 76 */            if (j != 0) {
/* 78 */                int i = (int) j;
/* 79 */                byte[] bArr = new byte[i];
/* 81 */                byteBuffer.get(bArr, 0, i);
                        try {
/* 91 */                    this.character = new String(bArr, "UTF-8");
                        } catch (UnsupportedEncodingException unused) {
/* 96 */                    C1951n4.m6856g("UTF-8 unsupported");
/* 99 */                    throw null;
                        }
                    }
                }

                public ByteBuffer toBytes() {
/* 1 */             byte[] bytes = null;
                    try {
/* 2 */                 String str = this.character;
/* 4 */                 if (str != null) {
/* 9 */                     bytes = str.getBytes("UTF-8");
                        }
/* 17 */                int length = bytes == null ? 0 : bytes.length;
/* 20 */                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length + 56);
/* 26 */                byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
/* 30 */                byteBufferAllocateDirect.putLong(length);
/* 35 */                byteBufferAllocateDirect.putLong(this.timestamp);
/* 44 */                byteBufferAllocateDirect.putLong(this.type.getValue());
/* 49 */                byteBufferAllocateDirect.putLong(this.physicalKey);
/* 54 */                byteBufferAllocateDirect.putLong(this.logicalKey);
/* 66 */                byteBufferAllocateDirect.putLong(this.synthesized ? 1L : 0L);
/* 75 */                byteBufferAllocateDirect.putLong(this.deviceType.getValue());
/* 78 */                if (bytes != null) {
/* 80 */                    byteBufferAllocateDirect.put(bytes);
                        }
/* 83 */                return byteBufferAllocateDirect;
                    } catch (UnsupportedEncodingException unused) {
/* 86 */                C1951n4.m6856g("UTF-8 not supported");
/* 1 */                 return null;
                    }
                }

/* 144 */       public KeyData() {
                }
            }
