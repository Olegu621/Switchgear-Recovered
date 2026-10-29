            package okhttp3.internal.tls;

            import java.security.cert.X509Certificate;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import java.util.Set;
            import javax.security.auth.x500.X500Principal;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m6176d2 = {"Lokhttp3/internal/tls/BasicTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "caCerts", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/security/cert/X509Certificate;", "([Ljava/security/cert/X509Certificate;)V", "subjectToCaCerts", HttpUrl.FRAGMENT_ENCODE_SET, "Ljavax/security/auth/x500/X500Principal;", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "findByIssuerAndSignature", "cert", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class BasicTrustRootIndex implements TrustRootIndex {
                private final Map<X500Principal, Set<X509Certificate>> subjectToCaCerts;

                public BasicTrustRootIndex(X509Certificate... x509CertificateArr) {
/* 1 */             x509CertificateArr.getClass();
/* 9 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 12 */            int length = x509CertificateArr.length;
/* 13 */            int i = 0;
/* 14 */            while (i < length) {
/* 16 */                X509Certificate x509Certificate = x509CertificateArr[i];
/* 18 */                i++;
/* 20 */                X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
/* 24 */                subjectX500Principal.getClass();
/* 27 */                Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
/* 31 */                if (linkedHashSet == null) {
/* 35 */                    linkedHashSet = new LinkedHashSet();
/* 38 */                    linkedHashMap.put(subjectX500Principal, linkedHashSet);
                        }
/* 43 */                ((Set) linkedHashSet).add(x509Certificate);
                    }
/* 47 */            this.subjectToCaCerts = linkedHashMap;
                }

                public boolean equals(Object other) {
/* 1 */             if (other != this) {
                        return (other instanceof BasicTrustRootIndex) && Intrinsics.m6216a(((BasicTrustRootIndex) other).subjectToCaCerts, this.subjectToCaCerts);
                    }
/* 22 */            return true;
                }

                @Override // okhttp3.internal.tls.TrustRootIndex
                public X509Certificate findByIssuerAndSignature(X509Certificate cert) {
/* 1 */             cert.getClass();
/* 10 */            Set<X509Certificate> set = this.subjectToCaCerts.get(cert.getIssuerX500Principal());
/* 16 */            Object obj = null;
/* 17 */            if (set == null) {
/* 16 */                return null;
                    }
/* 28 */            for (Object obj2 : set) {
                        try {
/* 41 */                    cert.verify(((X509Certificate) obj2).getPublicKey());
/* 44 */                    obj = obj2;
                            break;
                        } catch (Exception unused) {
                        }
                    }
/* 45 */            return (X509Certificate) obj;
                }

                public int hashCode() {
/* 3 */             return this.subjectToCaCerts.hashCode();
                }
            }
