            package okhttp3;

            import java.security.cert.Certificate;
            import java.security.cert.X509Certificate;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import javax.net.ssl.SSLPeerUnverifiedException;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import okhttp3.internal.HostnamesKt;
            import okhttp3.internal.tls.CertificateChainCleaner;
            import okio.ByteString;
            import p000.C1951n4;
            import p000.C2103qd;
            import p000.C2122qw;
            import p000.b51;
            import p000.ds0;
            import p000.gs2;
            import p000.nd0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0003!\"#B!\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0000¢\u0006\u0002\b\u0014J)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018J\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, m6176d2 = {"Lokhttp3/CertificatePinner;", HttpUrl.FRAGMENT_ENCODE_SET, "pins", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/CertificatePinner$Pin;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "getPins", "()Ljava/util/Set;", "check", HttpUrl.FRAGMENT_ENCODE_SET, "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "cleanedPeerCertificatesFn", "Lkotlin/Function0;", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/security/cert/X509Certificate;", "check$okhttp", "peerCertificates", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/security/cert/Certificate;", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "findMatchingPins", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "withCertificateChainCleaner", "withCertificateChainCleaner$okhttp", "Builder", "Companion", "Pin", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class CertificatePinner {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final CertificatePinner DEFAULT = new Builder().build();
                private final CertificateChainCleaner certificateChainCleaner;
                private final Set<Pin> pins;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000b\"\u00020\n¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m6176d2 = {"Lokhttp3/CertificatePinner$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "pins", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", "add", "pattern", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class Builder {
                    private final List<Pin> pins = new ArrayList();

                    public final Builder add(String pattern, String... pins) {
/* 1 */                 pattern.getClass();
/* 4 */                 pins.getClass();
/* 7 */                 int length = pins.length;
/* 8 */                 int i = 0;
/* 9 */                 while (i < length) {
/* 11 */                    String str = pins[i];
/* 13 */                    i++;
/* 24 */                    getPins().add(new Pin(pattern, str));
                        }
/* 28 */                return this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final CertificatePinner build() {
/* 11 */                return new CertificatePinner(CollectionsKt.m6195N(this.pins), null, 2, 0 == true ? 1 : 0);
                    }

                    public final List<Pin> getPins() {
/* 1 */                 return this.pins;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0003J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m6176d2 = {"Lokhttp3/CertificatePinner$Pin;", HttpUrl.FRAGMENT_ENCODE_SET, "pattern", HttpUrl.FRAGMENT_ENCODE_SET, "pin", "(Ljava/lang/String;Ljava/lang/String;)V", "hash", "Lokio/ByteString;", "getHash", "()Lokio/ByteString;", "hashAlgorithm", "getHashAlgorithm", "()Ljava/lang/String;", "getPattern", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "matchesCertificate", "certificate", "Ljava/security/cert/X509Certificate;", "matchesHostname", "hostname", "toString", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class Pin {
                    private final ByteString hash;
                    private final String hashAlgorithm;
                    private final String pattern;

                    public Pin(String str, String str2) {
/* 1 */                 str.getClass();
/* 4 */                 str2.getClass();
/* 22 */                if ((!C1852e.m6263m(str, "*.", false) || StringsKt.m6227C(str, "*", 1, false, 4) != -1) && ((!C1852e.m6263m(str, "**.", false) || StringsKt.m6227C(str, "*", 2, false, 4) != -1) && StringsKt.m6227C(str, "*", 0, false, 6) != -1)) {
/* 161 */                   ds0.m3200q(Intrinsics.m6219d(str, "Unexpected pattern: "));
/* 164 */                   throw null;
                        }
/* 53 */                String canonicalHost = HostnamesKt.toCanonicalHost(str);
/* 57 */                if (canonicalHost == null) {
/* 151 */                   C1951n4.m6859j(Intrinsics.m6219d(str, "Invalid pattern: "));
/* 154 */                   throw null;
                        }
/* 59 */                this.pattern = canonicalHost;
/* 69 */                if (C1852e.m6263m(str2, "sha1/", false)) {
/* 73 */                    this.hashAlgorithm = "sha1";
/* 82 */                    ByteString byteStringDecodeBase64 = ByteString.INSTANCE.decodeBase64(str2.substring(5));
/* 86 */                    if (byteStringDecodeBase64 != null) {
/* 88 */                        this.hash = byteStringDecodeBase64;
/* 90 */                        return;
                            } else {
/* 95 */                        C1951n4.m6859j(Intrinsics.m6219d(str2, "Invalid pin hash: "));
/* 98 */                        throw null;
                            }
                        }
/* 105 */               if (!C1852e.m6263m(str2, "sha256/", false)) {
/* 141 */                   C1951n4.m6859j(Intrinsics.m6219d(str2, "pins must start with 'sha256/' or 'sha1/': "));
/* 144 */                   throw null;
                        }
/* 109 */               this.hashAlgorithm = "sha256";
/* 118 */               ByteString byteStringDecodeBase65 = ByteString.INSTANCE.decodeBase64(str2.substring(7));
/* 122 */               if (byteStringDecodeBase65 != null) {
/* 124 */                   this.hash = byteStringDecodeBase65;
                        } else {
/* 131 */                   C1951n4.m6859j(Intrinsics.m6219d(str2, "Invalid pin hash: "));
/* 134 */                   throw null;
                        }
                    }

                    public boolean equals(Object other) {
/* 2 */                 if (this == other) {
/* 1 */                     return true;
                        }
/* 8 */                 if (!(other instanceof Pin)) {
/* 7 */                     return false;
                        }
/* 13 */                Pin pin = (Pin) other;
                        return Intrinsics.m6216a(this.pattern, pin.pattern) && Intrinsics.m6216a(this.hashAlgorithm, pin.hashAlgorithm) && Intrinsics.m6216a(this.hash, pin.hash);
                    }

                    public final ByteString getHash() {
/* 1 */                 return this.hash;
                    }

                    public final String getHashAlgorithm() {
/* 1 */                 return this.hashAlgorithm;
                    }

                    public final String getPattern() {
/* 1 */                 return this.pattern;
                    }

                    public int hashCode() {
/* 22 */                return this.hash.hashCode() + pm2.m7485h(this.pattern.hashCode() * 31, 31, this.hashAlgorithm);
                    }

                    public final boolean matchesCertificate(X509Certificate certificate) {
/* 1 */                 certificate.getClass();
/* 4 */                 String str = this.hashAlgorithm;
/* 12 */                if (Intrinsics.m6216a(str, "sha256")) {
/* 22 */                    return Intrinsics.m6216a(this.hash, CertificatePinner.INSTANCE.sha256Hash(certificate));
                        }
/* 33 */                if (Intrinsics.m6216a(str, "sha1")) {
/* 43 */                    return Intrinsics.m6216a(this.hash, CertificatePinner.INSTANCE.sha1Hash(certificate));
                        }
/* 48 */                return false;
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x0068 A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:17:0x0069 A[RETURN] */
                    public final boolean matchesHostname(String hostname) {
/* 1 */                 hostname.getClass();
/* 9 */                 boolean zM6263m = C1852e.m6263m(this.pattern, "**.", false);
/* 13 */                String str = this.pattern;
/* 18 */                if (zM6263m) {
/* 24 */                    int length = str.length() - 3;
/* 30 */                    int length2 = hostname.length() - length;
/* 46 */                    if (C1852e.m6259i(hostname.length() - length, 3, length, hostname, this.pattern, false) && (length2 == 0 || hostname.charAt(length2 - 1) == '.')) {
/* 17 */                        return true;
                            }
/* 8 */                     return false;
                        }
/* 61 */                boolean zM6263m2 = C1852e.m6263m(str, "*.", false);
/* 65 */                String str2 = this.pattern;
/* 67 */                if (!zM6263m2) {
/* 107 */                   return hostname.equals(str2);
                        }
/* 73 */                int length3 = str2.length() - 1;
/* 79 */                int length4 = hostname.length() - length3;
/* 94 */                if (C1852e.m6259i(hostname.length() - length3, 1, length3, hostname, this.pattern, false) && StringsKt.m6230F(hostname, '.', length4 - 1, 4) == -1) {
/* 17 */                    return true;
                        }
/* 8 */                 return false;
                    }

                    public String toString() {
/* 25 */                return this.hashAlgorithm + '/' + this.hash.base64();
                    }
                }

                /* JADX INFO: renamed from: okhttp3.CertificatePinner$check$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m6176d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/security/cert/X509Certificate;", "invoke"}, m6177k = 3, m6178mv = {1, 6, 0}, m6180xi = 48)
                public static final class C20081 extends b51 implements Function0<List<? extends X509Certificate>> {
                    final /* synthetic */ String $hostname;
                    final /* synthetic */ List<Certificate> $peerCertificates;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C20081(List<? extends Certificate> list, String str) {
/* 8 */                 super(0);
/* 3 */                 this.$peerCertificates = list;
/* 5 */                 this.$hostname = str;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final List<X509Certificate> invoke() {
/* 3 */                 CertificateChainCleaner certificateChainCleaner = CertificatePinner.this.getCertificateChainCleaner();
/* 15 */                List<Certificate> listClean = certificateChainCleaner == null ? null : certificateChainCleaner.clean(this.$peerCertificates, this.$hostname);
/* 19 */                if (listClean == null) {
/* 21 */                    listClean = this.$peerCertificates;
                        }
/* 31 */                ArrayList arrayList = new ArrayList(C2122qw.m8020h(listClean, 10));
/* 34 */                Iterator<T> it = listClean.iterator();
/* 42 */                while (it.hasNext()) {
/* 52 */                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                        }
/* 56 */                return arrayList;
                    }
                }

                public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
/* 1 */             set.getClass();
/* 7 */             this.pins = set;
/* 9 */             this.certificateChainCleaner = certificateChainCleaner;
                }

                public static final String pin(Certificate certificate) {
/* 3 */             return INSTANCE.pin(certificate);
                }

                public static final ByteString sha1Hash(X509Certificate x509Certificate) {
/* 3 */             return INSTANCE.sha1Hash(x509Certificate);
                }

                public static final ByteString sha256Hash(X509Certificate x509Certificate) {
/* 3 */             return INSTANCE.sha256Hash(x509Certificate);
                }

                public final void check(String hostname, List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
/* 1 */             hostname.getClass();
/* 4 */             peerCertificates.getClass();
/* 12 */            check$okhttp(hostname, new C20081(peerCertificates, hostname));
                }

                public final void check$okhttp(String hostname, Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
/* 1 */             hostname.getClass();
/* 4 */             cleanedPeerCertificatesFn.getClass();
/* 7 */             List<Pin> listFindMatchingPins = findMatchingPins(hostname);
/* 15 */            if (listFindMatchingPins.isEmpty()) {
/* 115 */               return;
                    }
/* 22 */            List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
/* 32 */            for (X509Certificate x509Certificate : list) {
/* 44 */                ByteString byteStringSha256Hash = null;
/* 45 */                ByteString byteStringSha1Hash = null;
/* 50 */                for (Pin pin : listFindMatchingPins) {
/* 58 */                    String hashAlgorithm = pin.getHashAlgorithm();
/* 68 */                    if (Intrinsics.m6216a(hashAlgorithm, "sha256")) {
/* 70 */                        if (byteStringSha256Hash == null) {
/* 74 */                            byteStringSha256Hash = INSTANCE.sha256Hash(x509Certificate);
                                }
/* 86 */                        if (Intrinsics.m6216a(pin.getHash(), byteStringSha256Hash)) {
/* 115 */                           return;
                                }
                            } else {
/* 95 */                        if (!Intrinsics.m6216a(hashAlgorithm, "sha1")) {
/* 126 */                           C1951n4.m6856g(Intrinsics.m6219d(pin.getHashAlgorithm(), "unsupported hashAlgorithm: "));
/* 129 */                           return;
                                }
/* 97 */                        if (byteStringSha1Hash == null) {
/* 101 */                           byteStringSha1Hash = INSTANCE.sha1Hash(x509Certificate);
                                }
/* 113 */                       if (Intrinsics.m6216a(pin.getHash(), byteStringSha1Hash)) {
/* 115 */                           return;
                                }
                            }
                        }
                    }
/* 134 */           StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
/* 147 */           for (X509Certificate x509Certificate2 : list) {
/* 155 */               sb.append("\n    ");
/* 164 */               sb.append(INSTANCE.pin(x509Certificate2));
/* 169 */               sb.append(": ");
/* 180 */               sb.append(x509Certificate2.getSubjectDN().getName());
                    }
/* 186 */           sb.append("\n  Pinned certificates for ");
/* 189 */           sb.append(hostname);
/* 194 */           sb.append(":");
/* 205 */           for (Pin pin2 : listFindMatchingPins) {
/* 213 */               sb.append("\n    ");
/* 216 */               sb.append(pin2);
                    }
/* 229 */           throw new SSLPeerUnverifiedException(sb.toString());
                }

                public boolean equals(Object other) {
/* 3 */             if (!(other instanceof CertificatePinner)) {
/* 29 */                return false;
                    }
/* 5 */             CertificatePinner certificatePinner = (CertificatePinner) other;
                    return Intrinsics.m6216a(certificatePinner.pins, this.pins) && Intrinsics.m6216a(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
                }

                public final List<Pin> findMatchingPins(String hostname) {
/* 1 */             hostname.getClass();
/* 4 */             Set<Pin> set = this.pins;
/* 6 */             List arrayList = nd0.f14189a;
/* 16 */            for (Object obj : set) {
/* 29 */                if (((Pin) obj).matchesHostname(hostname)) {
/* 35 */                    if (arrayList.isEmpty()) {
/* 39 */                        arrayList = new ArrayList();
                            }
/* 46 */                    gs2.m4010a(arrayList).add(obj);
                        }
                    }
/* 50 */            return arrayList;
                }

                /* JADX INFO: renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
                public final CertificateChainCleaner getCertificateChainCleaner() {
/* 1 */             return this.certificateChainCleaner;
                }

                public final Set<Pin> getPins() {
/* 1 */             return this.pins;
                }

                public int hashCode() {
/* 9 */             int iHashCode = (this.pins.hashCode() + 1517) * 41;
/* 11 */            CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
/* 21 */            return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
                }

                public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
/* 1 */             certificateChainCleaner.getClass();
                    return Intrinsics.m6216a(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0007J\f\u0010\f\u001a\u00020\n*\u00020\u000bH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m6176d2 = {"Lokhttp3/CertificatePinner$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "DEFAULT", "Lokhttp3/CertificatePinner;", "pin", HttpUrl.FRAGMENT_ENCODE_SET, "certificate", "Ljava/security/cert/Certificate;", "sha1Hash", "Lokio/ByteString;", "Ljava/security/cert/X509Certificate;", "sha256Hash", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final String pin(Certificate certificate) {
/* 1 */                 certificate.getClass();
/* 6 */                 if (certificate instanceof X509Certificate) {
/* 20 */                    return Intrinsics.m6219d(sha256Hash((X509Certificate) certificate).base64(), "sha256/");
                        }
/* 27 */                C1951n4.m6859j("Certificate pinning requires X509 certificates");
/* 30 */                return null;
                    }

                    public final ByteString sha1Hash(X509Certificate x509Certificate) {
/* 1 */                 x509Certificate.getClass();
/* 4 */                 ByteString.Companion companion = ByteString.INSTANCE;
/* 10 */                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
/* 14 */                encoded.getClass();
/* 25 */                return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha1();
                    }

                    public final ByteString sha256Hash(X509Certificate x509Certificate) {
/* 1 */                 x509Certificate.getClass();
/* 4 */                 ByteString.Companion companion = ByteString.INSTANCE;
/* 10 */                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
/* 14 */                encoded.getClass();
/* 25 */                return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
                    }

/* 4 */             private Companion() {
                    }
                }

/* 11 */        public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 12 */            this(set, (i & 2) != 0 ? null : certificateChainCleaner);
                }

/* 15 */        public final void check(String hostname, Certificate... peerCertificates) throws SSLPeerUnverifiedException {
                    hostname.getClass();
                    peerCertificates.getClass();
/* 16 */            check(hostname, C2103qd.m7779n(peerCertificates));
                }
            }
