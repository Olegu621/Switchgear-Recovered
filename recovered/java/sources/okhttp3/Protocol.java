            package okhttp3;

            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.io.IOException;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m6176d2 = {"Lokhttp3/Protocol;", HttpUrl.FRAGMENT_ENCODE_SET, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public enum Protocol {
                HTTP_1_0("http/1.0"),
                HTTP_1_1("http/1.1"),
                SPDY_3("spdy/3.1"),
                HTTP_2("h2"),
                H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
                QUIC("quic");


                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String protocol;

                Protocol(String str) {
/* 4 */             this.protocol = str;
                }

                public static final Protocol get(String str) throws IOException {
/* 3 */             return INSTANCE.get(str);
                }

                @Override // java.lang.Enum
                public String toString() {
/* 1 */             return this.protocol;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m6176d2 = {"Lokhttp3/Protocol$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "get", "Lokhttp3/Protocol;", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final Protocol get(String protocol) throws IOException {
/* 1 */                 protocol.getClass();
/* 4 */                 Protocol protocol2 = Protocol.HTTP_1_0;
/* 14 */                if (Intrinsics.m6216a(protocol, protocol2.protocol)) {
/* 16 */                    return protocol2;
                        }
/* 17 */                Protocol protocol3 = Protocol.HTTP_1_1;
/* 27 */                if (Intrinsics.m6216a(protocol, protocol3.protocol)) {
/* 29 */                    return protocol3;
                        }
/* 30 */                Protocol protocol4 = Protocol.H2_PRIOR_KNOWLEDGE;
/* 40 */                if (Intrinsics.m6216a(protocol, protocol4.protocol)) {
/* 42 */                    return protocol4;
                        }
/* 43 */                Protocol protocol5 = Protocol.HTTP_2;
/* 53 */                if (Intrinsics.m6216a(protocol, protocol5.protocol)) {
/* 55 */                    return protocol5;
                        }
/* 56 */                Protocol protocol6 = Protocol.SPDY_3;
/* 66 */                if (Intrinsics.m6216a(protocol, protocol6.protocol)) {
/* 68 */                    return protocol6;
                        }
/* 69 */                Protocol protocol7 = Protocol.QUIC;
/* 79 */                if (Intrinsics.m6216a(protocol, protocol7.protocol)) {
/* 81 */                    return protocol7;
                        }
/* 88 */                ds0.m3195l(Intrinsics.m6219d(protocol, "Unexpected protocol: "));
/* 91 */                return null;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
