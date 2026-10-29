            package okhttp3.internal.http2;

            import androidx.core.app.NotificationCompat;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import okhttp3.HttpUrl;
            import okhttp3.internal.Util;
            import okio.ByteString;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bJ\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000bH\u0000¢\u0006\u0002\b#J.\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0014\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006)"}, m6176d2 = {"Lokhttp3/internal/http2/Http2;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "BINARY", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "[Ljava/lang/String;", "CONNECTION_PREFACE", "Lokio/ByteString;", "FLAGS", "FLAG_ACK", HttpUrl.FRAGMENT_ENCODE_SET, "FLAG_COMPRESSED", "FLAG_END_HEADERS", "FLAG_END_PUSH_PROMISE", "FLAG_END_STREAM", "FLAG_NONE", "FLAG_PADDED", "FLAG_PRIORITY", "FRAME_NAMES", "INITIAL_MAX_FRAME_SIZE", "TYPE_CONTINUATION", "TYPE_DATA", "TYPE_GOAWAY", "TYPE_HEADERS", "TYPE_PING", "TYPE_PRIORITY", "TYPE_PUSH_PROMISE", "TYPE_RST_STREAM", "TYPE_SETTINGS", "TYPE_WINDOW_UPDATE", "formatFlags", "type", "flags", "formattedType", "formattedType$okhttp", "frameLog", "inbound", HttpUrl.FRAGMENT_ENCODE_SET, "streamId", "length", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class Http2 {
                private static final String[] BINARY;
                public static final int FLAG_ACK = 1;
                public static final int FLAG_COMPRESSED = 32;
                public static final int FLAG_END_HEADERS = 4;
                public static final int FLAG_END_PUSH_PROMISE = 4;
                public static final int FLAG_END_STREAM = 1;
                public static final int FLAG_NONE = 0;
                public static final int FLAG_PADDED = 8;
                public static final int FLAG_PRIORITY = 32;
                public static final int INITIAL_MAX_FRAME_SIZE = 16384;
                public static final int TYPE_CONTINUATION = 9;
                public static final int TYPE_DATA = 0;
                public static final int TYPE_GOAWAY = 7;
                public static final int TYPE_HEADERS = 1;
                public static final int TYPE_PING = 6;
                public static final int TYPE_PRIORITY = 2;
                public static final int TYPE_PUSH_PROMISE = 5;
                public static final int TYPE_RST_STREAM = 3;
                public static final int TYPE_SETTINGS = 4;
                public static final int TYPE_WINDOW_UPDATE = 8;
                public static final Http2 INSTANCE = new Http2();
                public static final ByteString CONNECTION_PREFACE = ByteString.INSTANCE.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
                private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
                private static final String[] FLAGS = new String[64];

                static {
/* 52 */            String[] strArr = new String[NotificationCompat.FLAG_LOCAL_ONLY];
/* 54 */            int i = 0;
/* 58 */            for (int i2 = 0; i2 < 256; i2++) {
/* 60 */                String binaryString = Integer.toBinaryString(i2);
/* 64 */                binaryString.getClass();
/* 73 */                String str = Util.format("%8s", binaryString);
/* 77 */                str.getClass();
/* 82 */                String strReplace = str.replace(' ', '0');
/* 86 */                strReplace.getClass();
/* 89 */                strArr[i2] = strReplace;
                    }
/* 94 */            BINARY = strArr;
/* 96 */            String[] strArr2 = FLAGS;
/* 100 */           strArr2[0] = HttpUrl.FRAGMENT_ENCODE_SET;
/* 105 */           strArr2[1] = "END_STREAM";
/* 107 */           int[] iArr = {1};
/* 115 */           strArr2[8] = "PADDED";
/* 117 */           int i3 = iArr[0];
/* 129 */           strArr2[i3 | 8] = Intrinsics.m6219d("|PADDED", strArr2[i3]);
/* 134 */           strArr2[4] = "END_HEADERS";
/* 138 */           strArr2[32] = "PRIORITY";
/* 144 */           strArr2[36] = "END_HEADERS|PRIORITY";
/* 146 */           int[] iArr2 = {4, 32, 36};
/* 150 */           int i4 = 0;
/* 152 */           while (i4 < 3) {
/* 154 */               int i5 = iArr2[i4];
/* 156 */               i4++;
/* 158 */               int i6 = iArr[0];
/* 160 */               String[] strArr3 = FLAGS;
/* 162 */               int i7 = i6 | i5;
/* 166 */               StringBuilder sb = new StringBuilder();
/* 171 */               sb.append((Object) strArr3[i6]);
/* 176 */               sb.append('|');
/* 181 */               sb.append((Object) strArr3[i5]);
/* 188 */               strArr3[i7] = sb.toString();
/* 216 */               strArr3[i7 | 8] = ((Object) strArr3[i6]) + '|' + ((Object) strArr3[i5]) + "|PADDED";
                    }
/* 221 */           int length = FLAGS.length;
/* 222 */           while (i < length) {
/* 224 */               int i8 = i + 1;
/* 226 */               String[] strArr4 = FLAGS;
/* 230 */               if (strArr4[i] == null) {
/* 236 */                   strArr4[i] = BINARY[i];
                        }
/* 238 */               i = i8;
                    }
                }

                private Http2() {
                }

                public final String formatFlags(int type, int flags) {
                    String str;
/* 1 */             if (flags == 0) {
/* 3 */                 return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 7 */             if (type != 2 && type != 3) {
/* 13 */                if (type == 4 || type == 6) {
                            return flags == 1 ? "ACK" : BINARY[flags];
                        }
/* 19 */                if (type != 7 && type != 8) {
/* 25 */                    String[] strArr = FLAGS;
/* 28 */                    if (flags < strArr.length) {
/* 30 */                        str = strArr[flags];
/* 32 */                        str.getClass();
                            } else {
/* 38 */                        str = BINARY[flags];
                            }
/* 41 */                    if (type != 5 || (flags & 4) == 0) {
                                return (type != 0 || (flags & 32) == 0) ? str : C1852e.m6261k(str, "PRIORITY", "COMPRESSED");
                            }
/* 51 */                    return C1852e.m6261k(str, "HEADERS", "PUSH_PROMISE");
                        }
                    }
/* 84 */            return BINARY[flags];
                }

                public final String formattedType$okhttp(int type) {
/* 1 */             String[] strArr = FRAME_NAMES;
                    return type < strArr.length ? strArr[type] : Util.format("0x%02x", Integer.valueOf(type));
                }

                public final String frameLog(boolean inbound, int streamId, int length, int type, int flags) {
/* 30 */            return Util.format("%s 0x%08x %5d %-13s %s", inbound ? "<<" : ">>", Integer.valueOf(streamId), Integer.valueOf(length), formattedType$okhttp(type), formatFlags(type, flags));
                }
            }
