            package okhttp3;

            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0006R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m6176d2 = {"Lokhttp3/TlsVersion;", HttpUrl.FRAGMENT_ENCODE_SET, "javaName", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;ILjava/lang/String;)V", "()Ljava/lang/String;", "-deprecated_javaName", "TLS_1_3", "TLS_1_2", "TLS_1_1", "TLS_1_0", "SSL_3_0", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public enum TlsVersion {
                TLS_1_3("TLSv1.3"),
                TLS_1_2("TLSv1.2"),
                TLS_1_1("TLSv1.1"),
                TLS_1_0("TLSv1"),
                SSL_3_0("SSLv3");


                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String javaName;

                TlsVersion(String str) {
/* 4 */             this.javaName = str;
                }

                public static final TlsVersion forJavaName(String str) {
/* 3 */             return INSTANCE.forJavaName(str);
                }

                /* JADX INFO: renamed from: -deprecated_javaName, reason: not valid java name and from getter */
                public final String getJavaName() {
/* 1 */             return this.javaName;
                }

                public final String javaName() {
/* 1 */             return this.javaName;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m6176d2 = {"Lokhttp3/TlsVersion$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "forJavaName", "Lokhttp3/TlsVersion;", "javaName", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    public final TlsVersion forJavaName(String javaName) {
/* 1 */                 javaName.getClass();
/* 4 */                 int iHashCode = javaName.hashCode();
/* 11 */                if (iHashCode != 79201641) {
/* 16 */                    if (iHashCode != 79923350) {
                                switch (iHashCode) {
                                    case -503070503:
/* 50 */                                if (javaName.equals("TLSv1.1")) {
/* 52 */                                    return TlsVersion.TLS_1_1;
                                        }
                                        break;
                                    case -503070502:
/* 39 */                                if (javaName.equals("TLSv1.2")) {
/* 41 */                                    return TlsVersion.TLS_1_2;
                                        }
                                        break;
                                    case -503070501:
/* 28 */                                if (javaName.equals("TLSv1.3")) {
/* 30 */                                    return TlsVersion.TLS_1_3;
                                        }
                                        break;
                                }
                            } else if (javaName.equals("TLSv1")) {
/* 63 */                        return TlsVersion.TLS_1_0;
                            }
                        } else if (javaName.equals("SSLv3")) {
/* 74 */                    return TlsVersion.SSL_3_0;
                        }
/* 83 */                C1951n4.m6859j(Intrinsics.m6219d(javaName, "Unexpected TLS version: "));
/* 86 */                return null;
                    }

/* 4 */             private Companion() {
                    }
                }
            }
