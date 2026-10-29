            package okhttp3.internal.p013ws;

            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okio.Buffer;
            import okio.ByteString;
            import p000.AbstractC0886en;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u0006J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020$J\u000e\u0010%\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000¨\u0006&"}, m6176d2 = {"Lokhttp3/internal/ws/WebSocketProtocol;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "ACCEPT_MAGIC", HttpUrl.FRAGMENT_ENCODE_SET, "B0_FLAG_FIN", HttpUrl.FRAGMENT_ENCODE_SET, "B0_FLAG_RSV1", "B0_FLAG_RSV2", "B0_FLAG_RSV3", "B0_MASK_OPCODE", "B1_FLAG_MASK", "B1_MASK_LENGTH", "CLOSE_CLIENT_GOING_AWAY", "CLOSE_MESSAGE_MAX", HttpUrl.FRAGMENT_ENCODE_SET, "CLOSE_NO_STATUS_CODE", "OPCODE_BINARY", "OPCODE_CONTINUATION", "OPCODE_CONTROL_CLOSE", "OPCODE_CONTROL_PING", "OPCODE_CONTROL_PONG", "OPCODE_FLAG_CONTROL", "OPCODE_TEXT", "PAYLOAD_BYTE_MAX", "PAYLOAD_LONG", "PAYLOAD_SHORT", "PAYLOAD_SHORT_MAX", "acceptHeader", "key", "closeCodeExceptionMessage", "code", "toggleMask", HttpUrl.FRAGMENT_ENCODE_SET, "cursor", "Lokio/Buffer$UnsafeCursor;", HttpUrl.FRAGMENT_ENCODE_SET, "validateCloseCode", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class WebSocketProtocol {
                public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
                public static final int B0_FLAG_FIN = 128;
                public static final int B0_FLAG_RSV1 = 64;
                public static final int B0_FLAG_RSV2 = 32;
                public static final int B0_FLAG_RSV3 = 16;
                public static final int B0_MASK_OPCODE = 15;
                public static final int B1_FLAG_MASK = 128;
                public static final int B1_MASK_LENGTH = 127;
                public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
                public static final long CLOSE_MESSAGE_MAX = 123;
                public static final int CLOSE_NO_STATUS_CODE = 1005;
                public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
                public static final int OPCODE_BINARY = 2;
                public static final int OPCODE_CONTINUATION = 0;
                public static final int OPCODE_CONTROL_CLOSE = 8;
                public static final int OPCODE_CONTROL_PING = 9;
                public static final int OPCODE_CONTROL_PONG = 10;
                public static final int OPCODE_FLAG_CONTROL = 8;
                public static final int OPCODE_TEXT = 1;
                public static final long PAYLOAD_BYTE_MAX = 125;
                public static final int PAYLOAD_LONG = 127;
                public static final int PAYLOAD_SHORT = 126;
                public static final long PAYLOAD_SHORT_MAX = 65535;

                private WebSocketProtocol() {
                }

                public final String acceptHeader(String key) {
/* 1 */             key.getClass();
/* 20 */            return ByteString.INSTANCE.encodeUtf8(Intrinsics.m6219d(ACCEPT_MAGIC, key)).sha1().base64();
                }

                public final String closeCodeExceptionMessage(int code) {
/* 3 */             if (code < 1000 || code >= 5000) {
/* 44 */                return Intrinsics.m6219d(Integer.valueOf(code), "Code must be in range [1000,5000): ");
                    }
/* 12 */            if ((1004 > code || code >= 1007) && (1015 > code || code >= 3000)) {
/* 36 */                return null;
                    }
/* 31 */            return AbstractC0886en.m3505i(code, "Code ", " is reserved and may not be used.");
                }

                public final void toggleMask(Buffer.UnsafeCursor cursor, byte[] key) {
/* 1 */             cursor.getClass();
/* 4 */             key.getClass();
/* 7 */             int length = key.length;
/* 8 */             int i = 0;
/* 38 */            do {
/* 9 */                 byte[] bArr = cursor.data;
/* 11 */                int i2 = cursor.start;
/* 13 */                int i3 = cursor.end;
/* 15 */                if (bArr != null) {
/* 17 */                    while (i2 < i3) {
/* 19 */                        int i4 = i % length;
/* 26 */                        bArr[i2] = (byte) (bArr[i2] ^ key[i4]);
/* 28 */                        i2++;
/* 30 */                        i = i4 + 1;
                            }
                        }
/* 38 */            } while (cursor.next() != -1);
                }

                public final void validateCloseCode(int code) {
/* 1 */             String strCloseCodeExceptionMessage = closeCodeExceptionMessage(code);
/* 5 */             if (strCloseCodeExceptionMessage == null) {
/* 7 */                 return;
                    }
/* 8 */             strCloseCodeExceptionMessage.getClass();
/* 11 */            ds0.m3200q(strCloseCodeExceptionMessage);
                }
            }
