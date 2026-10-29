            package okhttp3;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Objects;
            import javax.net.ssl.SSLSocket;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import okhttp3.internal.Util;
            import p000.C1951n4;
            import p000.ol1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0002#$B7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0002\b\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0015J\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b J\u0015\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000bH\u0007¢\u0006\u0002\b!J\b\u0010\"\u001a\u00020\u0007H\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b\n\u0010\rR\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006%"}, m6176d2 = {"Lokhttp3/ConnectionSpec;", HttpUrl.FRAGMENT_ENCODE_SET, "isTls", HttpUrl.FRAGMENT_ENCODE_SET, "supportsTlsExtensions", "cipherSuitesAsString", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "tlsVersionsAsString", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "cipherSuites", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/CipherSuite;", "()Ljava/util/List;", "[Ljava/lang/String;", "()Z", "tlsVersions", "Lokhttp3/TlsVersion;", "apply", HttpUrl.FRAGMENT_ENCODE_SET, "sslSocket", "Ljavax/net/ssl/SSLSocket;", "isFallback", "apply$okhttp", "-deprecated_cipherSuites", "equals", "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "isCompatible", "socket", "supportedSpec", "-deprecated_supportsTlsExtensions", "-deprecated_tlsVersions", "toString", "Builder", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 29 */    public final class ConnectionSpec {
                private static final CipherSuite[] APPROVED_CIPHER_SUITES;
                public static final ConnectionSpec CLEARTEXT;
                public static final ConnectionSpec COMPATIBLE_TLS;
                public static final ConnectionSpec MODERN_TLS;
                private static final CipherSuite[] RESTRICTED_CIPHER_SUITES;
                public static final ConnectionSpec RESTRICTED_TLS;
                private final String[] cipherSuitesAsString;
                private final boolean isTls;
                private final boolean supportsTlsExtensions;
                private final String[] tlsVersionsAsString;

                static {
/* 9 */             CipherSuite cipherSuite = CipherSuite.TLS_AES_128_GCM_SHA256;
/* 11 */            CipherSuite cipherSuite2 = CipherSuite.TLS_AES_256_GCM_SHA384;
/* 13 */            CipherSuite cipherSuite3 = CipherSuite.TLS_CHACHA20_POLY1305_SHA256;
/* 15 */            CipherSuite cipherSuite4 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;
/* 17 */            CipherSuite cipherSuite5 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;
/* 19 */            CipherSuite cipherSuite6 = CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;
/* 21 */            CipherSuite cipherSuite7 = CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;
/* 23 */            CipherSuite cipherSuite8 = CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
/* 25 */            CipherSuite cipherSuite9 = CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
/* 27 */            CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
/* 31 */            RESTRICTED_CIPHER_SUITES = cipherSuiteArr;
/* 47 */            CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
/* 51 */            APPROVED_CIPHER_SUITES = cipherSuiteArr2;
/* 66 */            Builder builderCipherSuites = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
/* 70 */            TlsVersion tlsVersion = TlsVersion.TLS_1_3;
/* 72 */            TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
/* 90 */            RESTRICTED_TLS = builderCipherSuites.tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
/* 124 */           MODERN_TLS = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(tlsVersion, tlsVersion2).supportsTlsExtensions(true).build();
/* 162 */           COMPATIBLE_TLS = new Builder(true).cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).tlsVersions(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).supportsTlsExtensions(true).build();
/* 174 */           CLEARTEXT = new Builder(false).build();
                }

                public ConnectionSpec(boolean z, boolean z2, String[] strArr, String[] strArr2) {
/* 4 */             this.isTls = z;
/* 6 */             this.supportsTlsExtensions = z2;
/* 8 */             this.cipherSuitesAsString = strArr;
/* 10 */            this.tlsVersionsAsString = strArr2;
                }

                private final ConnectionSpec supportedSpec(SSLSocket sslSocket, boolean isFallback) {
                    String[] enabledCipherSuites;
                    String[] enabledProtocols;
/* 3 */             if (this.cipherSuitesAsString != null) {
/* 5 */                 String[] enabledCipherSuites2 = sslSocket.getEnabledCipherSuites();
/* 9 */                 enabledCipherSuites2.getClass();
/* 20 */                enabledCipherSuites = Util.intersect(enabledCipherSuites2, this.cipherSuitesAsString, CipherSuite.INSTANCE.getORDER_BY_NAME$okhttp());
                    } else {
/* 25 */                enabledCipherSuites = sslSocket.getEnabledCipherSuites();
                    }
/* 31 */            if (this.tlsVersionsAsString != null) {
/* 33 */                String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
/* 37 */                enabledProtocols2.getClass();
/* 40 */                String[] strArr = this.tlsVersionsAsString;
/* 42 */                ol1 ol1Var = ol1.f14800a;
/* 44 */                ol1Var.getClass();
/* 47 */                enabledProtocols = Util.intersect(enabledProtocols2, strArr, ol1Var);
                    } else {
/* 52 */                enabledProtocols = sslSocket.getEnabledProtocols();
                    }
/* 56 */            String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
/* 60 */            supportedCipherSuites.getClass();
/* 71 */            int iIndexOf = Util.indexOf(supportedCipherSuites, "TLS_FALLBACK_SCSV", CipherSuite.INSTANCE.getORDER_BY_NAME$okhttp());
/* 75 */            if (isFallback && iIndexOf != -1) {
/* 80 */                enabledCipherSuites.getClass();
/* 83 */                String str = supportedCipherSuites[iIndexOf];
/* 85 */                str.getClass();
/* 88 */                enabledCipherSuites = Util.concat(enabledCipherSuites, str);
                    }
/* 94 */            Builder builder = new Builder(this);
/* 97 */            enabledCipherSuites.getClass();
/* 107 */           Builder builderCipherSuites = builder.cipherSuites((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
/* 111 */           enabledProtocols.getClass();
/* 125 */           return builderCipherSuites.tlsVersions((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).build();
                }

                /* JADX INFO: renamed from: -deprecated_cipherSuites, reason: not valid java name */
                public final List<CipherSuite> m10527deprecated_cipherSuites() {
/* 1 */             return cipherSuites();
                }

                /* JADX INFO: renamed from: -deprecated_supportsTlsExtensions, reason: not valid java name and from getter */
                public final boolean getSupportsTlsExtensions() {
/* 1 */             return this.supportsTlsExtensions;
                }

                /* JADX INFO: renamed from: -deprecated_tlsVersions, reason: not valid java name */
                public final List<TlsVersion> m10529deprecated_tlsVersions() {
/* 1 */             return tlsVersions();
                }

                public final void apply$okhttp(SSLSocket sslSocket, boolean isFallback) {
/* 1 */             sslSocket.getClass();
/* 4 */             ConnectionSpec connectionSpecSupportedSpec = supportedSpec(sslSocket, isFallback);
/* 12 */            if (connectionSpecSupportedSpec.tlsVersions() != null) {
/* 16 */                sslSocket.setEnabledProtocols(connectionSpecSupportedSpec.tlsVersionsAsString);
                    }
/* 23 */            if (connectionSpecSupportedSpec.cipherSuites() != null) {
/* 27 */                sslSocket.setEnabledCipherSuites(connectionSpecSupportedSpec.cipherSuitesAsString);
                    }
                }

                public final List<CipherSuite> cipherSuites() {
/* 1 */             String[] strArr = this.cipherSuitesAsString;
/* 3 */             if (strArr == null) {
/* 5 */                 return null;
                    }
/* 10 */            ArrayList arrayList = new ArrayList(strArr.length);
/* 15 */            for (String str : strArr) {
/* 25 */                arrayList.add(CipherSuite.INSTANCE.forJavaName(str));
                    }
/* 31 */            return CollectionsKt.m6192K(arrayList);
                }

                public boolean equals(Object other) {
/* 4 */             if (!(other instanceof ConnectionSpec)) {
/* 3 */                 return false;
                    }
/* 8 */             if (other == this) {
/* 7 */                 return true;
                    }
/* 11 */            boolean z = this.isTls;
/* 13 */            ConnectionSpec connectionSpec = (ConnectionSpec) other;
/* 17 */            if (z != connectionSpec.isTls) {
/* 3 */                 return false;
                    }
                    return !z || (Arrays.equals(this.cipherSuitesAsString, connectionSpec.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, connectionSpec.tlsVersionsAsString) && this.supportsTlsExtensions == connectionSpec.supportsTlsExtensions);
                }

                public int hashCode() {
/* 3 */             if (!this.isTls) {
/* 39 */                return 17;
                    }
/* 5 */             String[] strArr = this.cipherSuitesAsString;
/* 19 */            int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
/* 21 */            String[] strArr2 = this.tlsVersionsAsString;
/* 37 */            return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
                }

                public final boolean isCompatible(SSLSocket socket) {
/* 1 */             socket.getClass();
/* 7 */             if (!this.isTls) {
/* 6 */                 return false;
                    }
/* 10 */            String[] strArr = this.tlsVersionsAsString;
/* 12 */            if (strArr != null) {
/* 14 */                String[] enabledProtocols = socket.getEnabledProtocols();
/* 18 */                ol1 ol1Var = ol1.f14800a;
/* 20 */                ol1Var.getClass();
/* 27 */                if (!Util.hasIntersection(strArr, enabledProtocols, ol1Var)) {
/* 6 */                     return false;
                        }
                    }
/* 30 */            String[] strArr2 = this.cipherSuitesAsString;
                    return strArr2 == null || Util.hasIntersection(strArr2, socket.getEnabledCipherSuites(), CipherSuite.INSTANCE.getORDER_BY_NAME$okhttp());
                }

                /* JADX INFO: renamed from: isTls, reason: from getter */
                public final boolean getIsTls() {
/* 1 */             return this.isTls;
                }

                public final boolean supportsTlsExtensions() {
/* 1 */             return this.supportsTlsExtensions;
                }

                public final List<TlsVersion> tlsVersions() {
/* 1 */             String[] strArr = this.tlsVersionsAsString;
/* 3 */             if (strArr == null) {
/* 5 */                 return null;
                    }
/* 10 */            ArrayList arrayList = new ArrayList(strArr.length);
/* 15 */            for (String str : strArr) {
/* 25 */                arrayList.add(TlsVersion.INSTANCE.forJavaName(str));
                    }
/* 31 */            return CollectionsKt.m6192K(arrayList);
                }

                public String toString() {
/* 3 */             if (!this.isTls) {
/* 5 */                 return "ConnectionSpec()";
                    }
/* 59 */            return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(cipherSuites(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(tlsVersions(), "[all enabled]")) + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')';
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0019\u001a\u00020\u0000J\u0006\u0010\u001a\u001a\u00020\u0000J\u0006\u0010\u001b\u001a\u00020\u0006J\u001f\u0010\b\u001a\u00020\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0002\u0010\u001cJ\u001f\u0010\b\u001a\u00020\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\t\"\u00020\u001d¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0007J\u001f\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\t\"\u00020\u001f¢\u0006\u0002\u0010 R$\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\u0015\u0010\u0004R$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006!"}, m6176d2 = {"Lokhttp3/ConnectionSpec$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "tls", HttpUrl.FRAGMENT_ENCODE_SET, "(Z)V", "connectionSpec", "Lokhttp3/ConnectionSpec;", "(Lokhttp3/ConnectionSpec;)V", "cipherSuites", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "supportsTlsExtensions", "getSupportsTlsExtensions$okhttp", "()Z", "setSupportsTlsExtensions$okhttp", "getTls$okhttp", "setTls$okhttp", "tlsVersions", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "allEnabledCipherSuites", "allEnabledTlsVersions", "build", "([Ljava/lang/String;)Lokhttp3/ConnectionSpec$Builder;", "Lokhttp3/CipherSuite;", "([Lokhttp3/CipherSuite;)Lokhttp3/ConnectionSpec$Builder;", "Lokhttp3/TlsVersion;", "([Lokhttp3/TlsVersion;)Lokhttp3/ConnectionSpec$Builder;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 30 */        public static final class Builder {
                    private String[] cipherSuites;
                    private boolean supportsTlsExtensions;
                    private boolean tls;
                    private String[] tlsVersions;

                    public Builder(ConnectionSpec connectionSpec) {
/* 1 */                 connectionSpec.getClass();
/* 11 */                this.tls = connectionSpec.getIsTls();
/* 17 */                this.cipherSuites = connectionSpec.cipherSuitesAsString;
/* 23 */                this.tlsVersions = connectionSpec.tlsVersionsAsString;
/* 29 */                this.supportsTlsExtensions = connectionSpec.supportsTlsExtensions();
                    }

                    public final Builder allEnabledCipherSuites() {
/* 5 */                 if (getTls()) {
/* 8 */                     setCipherSuites$okhttp(null);
/* 11 */                    return this;
                        }
/* 14 */                C1951n4.m6859j("no cipher suites for cleartext connections");
/* 17 */                return null;
                    }

                    public final Builder allEnabledTlsVersions() {
/* 5 */                 if (getTls()) {
/* 8 */                     setTlsVersions$okhttp(null);
/* 11 */                    return this;
                        }
/* 14 */                C1951n4.m6859j("no TLS versions for cleartext connections");
/* 17 */                return null;
                    }

                    public final ConnectionSpec build() {
/* 11 */                return new ConnectionSpec(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
                    }

                    public final Builder cipherSuites(CipherSuite... cipherSuites) {
/* 1 */                 cipherSuites.getClass();
/* 9 */                 if (!getTls()) {
/* 64 */                    C1951n4.m6859j("no cipher suites for cleartext connections");
/* 8 */                     return null;
                        }
/* 14 */                ArrayList arrayList = new ArrayList(cipherSuites.length);
/* 20 */                for (CipherSuite cipherSuite : cipherSuites) {
/* 28 */                    arrayList.add(cipherSuite.javaName());
                        }
/* 36 */                Object[] array = arrayList.toArray(new String[0]);
/* 40 */                if (array != null) {
/* 42 */                    String[] strArr = (String[]) array;
/* 51 */                    return cipherSuites((String[]) Arrays.copyOf(strArr, strArr.length));
                        }
/* 58 */                C1951n4.m6868s("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
/* 8 */                 return null;
                    }

                    /* JADX INFO: renamed from: getCipherSuites$okhttp, reason: from getter */
                    public final String[] getCipherSuites() {
/* 1 */                 return this.cipherSuites;
                    }

                    /* JADX INFO: renamed from: getSupportsTlsExtensions$okhttp, reason: from getter */
                    public final boolean getSupportsTlsExtensions() {
/* 1 */                 return this.supportsTlsExtensions;
                    }

                    /* JADX INFO: renamed from: getTls$okhttp, reason: from getter */
                    public final boolean getTls() {
/* 1 */                 return this.tls;
                    }

                    /* JADX INFO: renamed from: getTlsVersions$okhttp, reason: from getter */
                    public final String[] getTlsVersions() {
/* 1 */                 return this.tlsVersions;
                    }

                    public final void setCipherSuites$okhttp(String[] strArr) {
/* 1 */                 this.cipherSuites = strArr;
                    }

                    public final void setSupportsTlsExtensions$okhttp(boolean z) {
/* 1 */                 this.supportsTlsExtensions = z;
                    }

                    public final void setTls$okhttp(boolean z) {
/* 1 */                 this.tls = z;
                    }

                    public final void setTlsVersions$okhttp(String[] strArr) {
/* 1 */                 this.tlsVersions = strArr;
                    }

                    public final Builder supportsTlsExtensions(boolean supportsTlsExtensions) {
/* 5 */                 if (getTls()) {
/* 7 */                     setSupportsTlsExtensions$okhttp(supportsTlsExtensions);
/* 10 */                    return this;
                        }
/* 13 */                C1951n4.m6859j("no TLS extensions for cleartext connections");
/* 16 */                return null;
                    }

                    public final Builder tlsVersions(TlsVersion... tlsVersions) {
/* 1 */                 tlsVersions.getClass();
/* 9 */                 if (!getTls()) {
/* 64 */                    C1951n4.m6859j("no TLS versions for cleartext connections");
/* 8 */                     return null;
                        }
/* 14 */                ArrayList arrayList = new ArrayList(tlsVersions.length);
/* 20 */                for (TlsVersion tlsVersion : tlsVersions) {
/* 28 */                    arrayList.add(tlsVersion.javaName());
                        }
/* 36 */                Object[] array = arrayList.toArray(new String[0]);
/* 40 */                if (array != null) {
/* 42 */                    String[] strArr = (String[]) array;
/* 51 */                    return tlsVersions((String[]) Arrays.copyOf(strArr, strArr.length));
                        }
/* 58 */                C1951n4.m6868s("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
/* 8 */                 return null;
                    }

/* 31 */            public Builder(boolean z) {
/* 33 */                this.tls = z;
                    }

/* 67 */            public final Builder cipherSuites(String... cipherSuites) {
                        cipherSuites.getClass();
/* 68 */                if (getTls()) {
/* 69 */                    if (!(cipherSuites.length == 0)) {
/* 70 */                        setCipherSuites$okhttp((String[]) cipherSuites.clone());
                                return this;
                            }
/* 71 */                    C1951n4.m6859j("At least one cipher suite is required");
                            return null;
                        }
/* 72 */                C1951n4.m6859j("no cipher suites for cleartext connections");
                        return null;
                    }

/* 67 */            public final Builder tlsVersions(String... tlsVersions) {
                        tlsVersions.getClass();
/* 68 */                if (getTls()) {
/* 69 */                    if (!(tlsVersions.length == 0)) {
/* 70 */                        setTlsVersions$okhttp((String[]) tlsVersions.clone());
                                return this;
                            }
/* 71 */                    C1951n4.m6859j("At least one TLS version is required");
                            return null;
                        }
/* 72 */                C1951n4.m6859j("no TLS versions for cleartext connections");
                        return null;
                    }
                }
            }
