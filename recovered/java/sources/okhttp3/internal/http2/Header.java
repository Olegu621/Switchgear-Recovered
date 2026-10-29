            package okhttp3.internal.http2;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import okio.ByteString;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\nHÖ\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m6176d2 = {"Lokhttp3/internal/http2/Header;", HttpUrl.FRAGMENT_ENCODE_SET, "name", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.VALUE, "(Ljava/lang/String;Ljava/lang/String;)V", "Lokio/ByteString;", "(Lokio/ByteString;Ljava/lang/String;)V", "(Lokio/ByteString;Lokio/ByteString;)V", "hpackSize", HttpUrl.FRAGMENT_ENCODE_SET, "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", "toString", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 26 */    public final /* data */ class Header {
                public static final ByteString PSEUDO_PREFIX;
                public static final ByteString RESPONSE_STATUS;
                public static final String RESPONSE_STATUS_UTF8 = ":status";
                public static final ByteString TARGET_AUTHORITY;
                public static final String TARGET_AUTHORITY_UTF8 = ":authority";
                public static final ByteString TARGET_METHOD;
                public static final String TARGET_METHOD_UTF8 = ":method";
                public static final ByteString TARGET_PATH;
                public static final String TARGET_PATH_UTF8 = ":path";
                public static final ByteString TARGET_SCHEME;
                public static final String TARGET_SCHEME_UTF8 = ":scheme";
                public final int hpackSize;
                public final ByteString name;
                public final ByteString value;

                static {
/* 9 */             ByteString.Companion companion = ByteString.INSTANCE;
/* 17 */            PSEUDO_PREFIX = companion.encodeUtf8(":");
/* 25 */            RESPONSE_STATUS = companion.encodeUtf8(RESPONSE_STATUS_UTF8);
/* 33 */            TARGET_METHOD = companion.encodeUtf8(TARGET_METHOD_UTF8);
/* 41 */            TARGET_PATH = companion.encodeUtf8(TARGET_PATH_UTF8);
/* 49 */            TARGET_SCHEME = companion.encodeUtf8(TARGET_SCHEME_UTF8);
/* 57 */            TARGET_AUTHORITY = companion.encodeUtf8(TARGET_AUTHORITY_UTF8);
                }

                public Header(ByteString byteString, ByteString byteString2) {
/* 1 */             byteString.getClass();
/* 4 */             byteString2.getClass();
/* 10 */            this.name = byteString;
/* 12 */            this.value = byteString2;
/* 25 */            this.hpackSize = byteString2.size() + byteString.size() + 32;
                }

                public static /* synthetic */ Header copy$default(Header header, ByteString byteString, ByteString byteString2, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 byteString = header.name;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                byteString2 = header.value;
                    }
/* 13 */            return header.copy(byteString, byteString2);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final ByteString getName() {
/* 1 */             return this.name;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final ByteString getValue() {
/* 1 */             return this.value;
                }

                public final Header copy(ByteString name, ByteString value) {
/* 1 */             name.getClass();
/* 4 */             value.getClass();
/* 9 */             return new Header(name, value);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof Header)) {
/* 7 */                 return false;
                    }
/* 11 */            Header header = (Header) other;
                    return Intrinsics.m6216a(this.name, header.name) && Intrinsics.m6216a(this.value, header.value);
                }

                public int hashCode() {
/* 15 */            return this.value.hashCode() + (this.name.hashCode() * 31);
                }

                public String toString() {
/* 29 */            return this.name.utf8() + ": " + this.value.utf8();
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 27 */        public Header(String str, String str2) {
                    str.getClass();
                    str2.getClass();
/* 28 */            ByteString.Companion companion = ByteString.INSTANCE;
                    this(companion.encodeUtf8(str), companion.encodeUtf8(str2));
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 28 */        public Header(ByteString byteString, String str) {
/* 29 */            this(byteString, ByteString.INSTANCE.encodeUtf8(str));
                    byteString.getClass();
                    str.getClass();
                }
            }
