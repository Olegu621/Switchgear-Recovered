            package okhttp3.internal.tls;

            import java.security.GeneralSecurityException;
            import java.security.cert.Certificate;
            import java.security.cert.X509Certificate;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import javax.net.ssl.SSLPeerUnverifiedException;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m6176d2 = {"Lokhttp3/internal/tls/BasicCertificateChainCleaner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustRootIndex", "Lokhttp3/internal/tls/TrustRootIndex;", "(Lokhttp3/internal/tls/TrustRootIndex;)V", "clean", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/security/cert/Certificate;", "chain", "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "verifySignature", "toVerify", "Ljava/security/cert/X509Certificate;", "signingCert", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
            public final class BasicCertificateChainCleaner extends CertificateChainCleaner {
                private static final int MAX_SIGNERS = 9;
                private final TrustRootIndex trustRootIndex;

                public BasicCertificateChainCleaner(TrustRootIndex trustRootIndex) {
/* 1 */             trustRootIndex.getClass();
/* 7 */             this.trustRootIndex = trustRootIndex;
                }

                private final boolean verifySignature(X509Certificate toVerify, X509Certificate signingCert) {
/* 14 */            if (!Intrinsics.m6216a(toVerify.getIssuerDN(), signingCert.getSubjectDN())) {
/* 13 */                return false;
                    }
                    try {
/* 21 */                toVerify.verify(signingCert.getPublicKey());
/* 24 */                return true;
                    } catch (GeneralSecurityException unused) {
/* 13 */                return false;
                    }
                }

                @Override // okhttp3.internal.tls.CertificateChainCleaner
                public List<Certificate> clean(List<? extends Certificate> chain, String hostname) throws SSLPeerUnverifiedException {
                    X509Certificate x509Certificate;
/* 1 */             chain.getClass();
/* 4 */             hostname.getClass();
/* 9 */             ArrayDeque arrayDeque = new ArrayDeque(chain);
/* 14 */            ArrayList arrayList = new ArrayList();
/* 17 */            Object objRemoveFirst = arrayDeque.removeFirst();
/* 21 */            objRemoveFirst.getClass();
/* 24 */            arrayList.add(objRemoveFirst);
/* 27 */            int i = 0;
/* 28 */            boolean z = false;
/* 31 */            while (i < 9) {
/* 33 */                i++;
/* 45 */                X509Certificate x509Certificate2 = (X509Certificate) arrayList.get(arrayList.size() - 1);
/* 49 */                X509Certificate x509CertificateFindByIssuerAndSignature = this.trustRootIndex.findByIssuerAndSignature(x509Certificate2);
/* 53 */                if (x509CertificateFindByIssuerAndSignature != null) {
/* 59 */                    if (arrayList.size() > 1 || !Intrinsics.m6216a(x509Certificate2, x509CertificateFindByIssuerAndSignature)) {
/* 67 */                        arrayList.add(x509CertificateFindByIssuerAndSignature);
                            }
/* 74 */                    if (verifySignature(x509CertificateFindByIssuerAndSignature, x509CertificateFindByIssuerAndSignature)) {
/* 122 */                       return arrayList;
                            }
/* 77 */                    z = true;
                        } else {
/* 79 */                    Iterator it = arrayDeque.iterator();
/* 83 */                    it.getClass();
/* 104 */                   do {
/* 90 */                        if (!it.hasNext()) {
/* 120 */                           if (!z) {
/* 134 */                               throw new SSLPeerUnverifiedException(Intrinsics.m6219d(x509Certificate2, "Failed to find a trusted cert that signed "));
                                    }
/* 122 */                           return arrayList;
                                }
/* 92 */                        Object next = it.next();
/* 96 */                        if (next == null) {
/* 115 */                           C1951n4.m6868s("null cannot be cast to non-null type java.security.cert.X509Certificate");
/* 118 */                           return null;
                                }
/* 98 */                        x509Certificate = (X509Certificate) next;
/* 104 */                   } while (!verifySignature(x509Certificate2, x509Certificate));
/* 106 */                   it.remove();
/* 109 */                   arrayList.add(x509Certificate);
                        }
                    }
/* 146 */           throw new SSLPeerUnverifiedException(Intrinsics.m6219d(arrayList, "Certificate chain too long: "));
                }

                public boolean equals(Object other) {
/* 2 */             if (other == this) {
/* 1 */                 return true;
                    }
                    return (other instanceof BasicCertificateChainCleaner) && Intrinsics.m6216a(((BasicCertificateChainCleaner) other).trustRootIndex, this.trustRootIndex);
                }

                public int hashCode() {
/* 3 */             return this.trustRootIndex.hashCode();
                }
            }
