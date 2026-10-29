            package okhttp3;

            import java.io.IOException;
            import java.security.Principal;
            import java.security.cert.Certificate;
            import java.security.cert.X509Certificate;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import javax.net.ssl.SSLPeerUnverifiedException;
            import javax.net.ssl.SSLSession;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.internal.Util;
            import p000.C2122qw;
            import p000.b51;
            import p000.ds0;
            import p000.f42;
            import p000.nd0;
            import p000.p51;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 -2\u00020\u0001:\u0001-B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b\u0003\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b\u0005\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b\b\u0010\u0012R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010,\u001a\u00020\"*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016¨\u0006."}, m6176d2 = {"Lokhttp3/Handshake;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/TlsVersion;", "tlsVersion", "Lokhttp3/CipherSuite;", "cipherSuite", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/security/cert/Certificate;", "localCertificates", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "-deprecated_tlsVersion", "()Lokhttp3/TlsVersion;", "-deprecated_cipherSuite", "()Lokhttp3/CipherSuite;", "-deprecated_peerCertificates", "()Ljava/util/List;", "peerCertificates", "Ljava/security/Principal;", "-deprecated_peerPrincipal", "()Ljava/security/Principal;", "peerPrincipal", "-deprecated_localCertificates", "-deprecated_localPrincipal", "localPrincipal", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "Lokhttp3/TlsVersion;", "Lokhttp3/CipherSuite;", "Ljava/util/List;", "peerCertificates$delegate", "Lp51;", "getName", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class Handshake {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final CipherSuite cipherSuite;
                private final List<Certificate> localCertificates;

                /* JADX INFO: renamed from: peerCertificates$delegate, reason: from kotlin metadata */
                private final p51 peerCertificates;
                private final TlsVersion tlsVersion;

                /* JADX INFO: renamed from: okhttp3.Handshake$peerCertificates$2 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m6176d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/security/cert/Certificate;", "invoke"}, m6177k = 3, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class C20092 extends b51 implements Function0<List<? extends Certificate>> {
                    final /* synthetic */ Function0<List<Certificate>> $peerCertificatesFn;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C20092(Function0<? extends List<? extends Certificate>> function0) {
/* 4 */                 super(0);
/* 1 */                 this.$peerCertificatesFn = function0;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final List<Certificate> invoke() {
                        try {
/* 7 */                     return (List) this.$peerCertificatesFn.invoke();
                        } catch (SSLPeerUnverifiedException unused) {
/* 10 */                    return nd0.f14189a;
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, Function0<? extends List<? extends Certificate>> function0) {
/* 1 */             tlsVersion.getClass();
/* 4 */             cipherSuite.getClass();
/* 7 */             list.getClass();
/* 10 */            function0.getClass();
/* 16 */            this.tlsVersion = tlsVersion;
/* 18 */            this.cipherSuite = cipherSuite;
/* 20 */            this.localCertificates = list;
/* 31 */            this.peerCertificates = r51.m8065b(new C20092(function0));
                }

                public static final Handshake get(SSLSession sSLSession) throws IOException {
/* 3 */             return INSTANCE.get(sSLSession);
                }

                private final String getName(Certificate certificate) {
/* 3 */             if (certificate instanceof X509Certificate) {
/* 11 */                return ((X509Certificate) certificate).getSubjectDN().toString();
                    }
/* 16 */            String type = certificate.getType();
/* 20 */            type.getClass();
/* 23 */            return type;
                }

                /* JADX INFO: renamed from: -deprecated_cipherSuite, reason: not valid java name and from getter */
                public final CipherSuite getCipherSuite() {
/* 1 */             return this.cipherSuite;
                }

                /* JADX INFO: renamed from: -deprecated_localCertificates, reason: not valid java name */
                public final List<Certificate> m10542deprecated_localCertificates() {
/* 1 */             return this.localCertificates;
                }

                /* JADX INFO: renamed from: -deprecated_localPrincipal, reason: not valid java name */
                public final Principal m10543deprecated_localPrincipal() {
/* 1 */             return localPrincipal();
                }

                /* JADX INFO: renamed from: -deprecated_peerCertificates, reason: not valid java name */
                public final List<Certificate> m10544deprecated_peerCertificates() {
/* 1 */             return peerCertificates();
                }

                /* JADX INFO: renamed from: -deprecated_peerPrincipal, reason: not valid java name */
                public final Principal m10545deprecated_peerPrincipal() {
/* 1 */             return peerPrincipal();
                }

                /* JADX INFO: renamed from: -deprecated_tlsVersion, reason: not valid java name and from getter */
                public final TlsVersion getTlsVersion() {
/* 1 */             return this.tlsVersion;
                }

                public final CipherSuite cipherSuite() {
/* 1 */             return this.cipherSuite;
                }

                public boolean equals(Object other) {
/* 3 */             if (!(other instanceof Handshake)) {
/* 49 */                return false;
                    }
/* 5 */             Handshake handshake = (Handshake) other;
                    return handshake.tlsVersion == this.tlsVersion && Intrinsics.m6216a(handshake.cipherSuite, this.cipherSuite) && Intrinsics.m6216a(handshake.peerCertificates(), peerCertificates()) && Intrinsics.m6216a(handshake.localCertificates, this.localCertificates);
                }

                public int hashCode() {
/* 37 */            return this.localCertificates.hashCode() + ((peerCertificates().hashCode() + ((this.cipherSuite.hashCode() + ((this.tlsVersion.hashCode() + 527) * 31)) * 31)) * 31);
                }

                public final List<Certificate> localCertificates() {
/* 1 */             return this.localCertificates;
                }

                public final Principal localPrincipal() {
/* 3 */             Object objFirstOrNull = CollectionsKt.firstOrNull(this.localCertificates);
/* 15 */            X509Certificate x509Certificate = objFirstOrNull instanceof X509Certificate ? (X509Certificate) objFirstOrNull : null;
/* 16 */            if (x509Certificate == null) {
/* 9 */                 return null;
                    }
/* 19 */            return x509Certificate.getSubjectX500Principal();
                }

                public final List<Certificate> peerCertificates() {
/* 7 */             return (List) this.peerCertificates.getValue();
                }

                public final Principal peerPrincipal() {
/* 5 */             Object objFirstOrNull = CollectionsKt.firstOrNull(peerCertificates());
/* 17 */            X509Certificate x509Certificate = objFirstOrNull instanceof X509Certificate ? (X509Certificate) objFirstOrNull : null;
/* 18 */            if (x509Certificate == null) {
/* 11 */                return null;
                    }
/* 21 */            return x509Certificate.getSubjectX500Principal();
                }

                public final TlsVersion tlsVersion() {
/* 1 */             return this.tlsVersion;
                }

                public String toString() {
/* 1 */             List<Certificate> listPeerCertificates = peerCertificates();
/* 13 */            ArrayList arrayList = new ArrayList(C2122qw.m8020h(listPeerCertificates, 10));
/* 16 */            Iterator<T> it = listPeerCertificates.iterator();
/* 24 */            while (it.hasNext()) {
/* 36 */                arrayList.add(getName((Certificate) it.next()));
                    }
/* 40 */            String string = arrayList.toString();
/* 48 */            StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
/* 53 */            sb.append(this.tlsVersion);
/* 58 */            sb.append(" cipherSuite=");
/* 63 */            sb.append(this.cipherSuite);
/* 68 */            sb.append(" peerCertificates=");
/* 71 */            sb.append(string);
/* 76 */            sb.append(" localCertificates=");
/* 79 */            List<Certificate> list = this.localCertificates;
/* 87 */            ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(list, 10));
/* 90 */            Iterator<T> it2 = list.iterator();
/* 98 */            while (it2.hasNext()) {
/* 110 */               arrayList2.add(getName((Certificate) it2.next()));
                    }
/* 114 */           sb.append(arrayList2);
/* 119 */           sb.append('}');
/* 122 */           return sb.toString();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0007J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0006H\u0007¢\u0006\u0002\b\u0003J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m6176d2 = {"Lokhttp3/Handshake$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "get", "Lokhttp3/Handshake;", "sslSession", "Ljavax/net/ssl/SSLSession;", "-deprecated_get", "tlsVersion", "Lokhttp3/TlsVersion;", "cipherSuite", "Lokhttp3/CipherSuite;", "peerCertificates", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/security/cert/Certificate;", "localCertificates", "handshake", "toImmutableList", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/security/cert/Certificate;)Ljava/util/List;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
                        return certificateArr != null ? Util.immutableListOf(Arrays.copyOf(certificateArr, certificateArr.length)) : nd0.f14189a;
                    }

                    /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
                    public final Handshake m10547deprecated_get(SSLSession sslSession) throws IOException {
/* 1 */                 sslSession.getClass();
/* 4 */                 return get(sslSession);
                    }

                    public final Handshake get(SSLSession sSLSession) throws IOException {
                        List<Certificate> immutableList;
/* 1 */                 sSLSession.getClass();
/* 4 */                 String cipherSuite = sSLSession.getCipherSuite();
/* 9 */                 if (cipherSuite == null) {
/* 109 */                   f42.m3656l("cipherSuite == null");
/* 8 */                     return null;
                        }
/* 27 */                if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
/* 103 */                   ds0.m3195l(Intrinsics.m6219d(cipherSuite, "cipherSuite == "));
/* 8 */                     return null;
                        }
/* 31 */                CipherSuite cipherSuiteForJavaName = CipherSuite.INSTANCE.forJavaName(cipherSuite);
/* 35 */                String protocol = sSLSession.getProtocol();
/* 39 */                if (protocol == null) {
/* 93 */                    f42.m3656l("tlsVersion == null");
/* 8 */                     return null;
                        }
/* 47 */                if ("NONE".equals(protocol)) {
/* 87 */                    ds0.m3195l("tlsVersion == NONE");
/* 8 */                     return null;
                        }
/* 51 */                TlsVersion tlsVersionForJavaName = TlsVersion.INSTANCE.forJavaName(protocol);
                        try {
/* 59 */                    immutableList = toImmutableList(sSLSession.getPeerCertificates());
                        } catch (SSLPeerUnverifiedException unused) {
/* 64 */                    immutableList = nd0.f14189a;
                        }
/* 81 */                return new Handshake(tlsVersionForJavaName, cipherSuiteForJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(immutableList));
                    }

/* 4 */             private Companion() {
                    }

/* 112 */           public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> peerCertificates, List<? extends Certificate> localCertificates) {
                        tlsVersion.getClass();
                        cipherSuite.getClass();
                        peerCertificates.getClass();
                        localCertificates.getClass();
/* 114 */               return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(localCertificates), new Handshake$Companion$get$1(Util.toImmutableList(peerCertificates)));
                    }
                }

/* 7 */         public static final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
/* 8 */             return INSTANCE.get(tlsVersion, cipherSuite, list, list2);
                }
            }
