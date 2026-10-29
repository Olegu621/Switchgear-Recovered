            package okhttp3.internal.tls;

            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.security.cert.Certificate;
            import java.security.cert.CertificateParsingException;
            import java.security.cert.X509Certificate;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import javax.net.ssl.HostnameVerifier;
            import javax.net.ssl.SSLException;
            import javax.net.ssl.SSLSession;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import okhttp3.internal.HostnamesKt;
            import okhttp3.internal.Util;
            import okio.Utf8;
            import p000.nd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u0017\u001a\u00020\b*\u00020\bH\u0002J\f\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m6176d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "ALT_DNS_NAME", HttpUrl.FRAGMENT_ENCODE_SET, "ALT_IPA_NAME", "allSubjectAltNames", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "certificate", "Ljava/security/cert/X509Certificate;", "getSubjectAltNames", "type", "verify", HttpUrl.FRAGMENT_ENCODE_SET, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "session", "Ljavax/net/ssl/SSLSession;", "verifyHostname", "hostname", "pattern", "verifyIpAddress", "ipAddress", "asciiToLowercase", "isAscii", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 37 */    public final class OkHostnameVerifier implements HostnameVerifier {
                private static final int ALT_DNS_NAME = 2;
                private static final int ALT_IPA_NAME = 7;
                public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

                private OkHostnameVerifier() {
                }

                private final String asciiToLowercase(String str) {
/* 5 */             if (!isAscii(str)) {
/* 20 */                return str;
                    }
/* 7 */             Locale locale = Locale.US;
/* 9 */             locale.getClass();
/* 12 */            String lowerCase = str.toLowerCase(locale);
/* 16 */            lowerCase.getClass();
/* 19 */            return lowerCase;
                }

                private final List<String> getSubjectAltNames(X509Certificate certificate, int type) {
                    Object obj;
                    try {
/* 1 */                 Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
/* 5 */                 if (subjectAlternativeNames == null) {
/* 7 */                     return nd0.f14189a;
                        }
/* 12 */                ArrayList arrayList = new ArrayList();
/* 23 */                for (List<?> list : subjectAlternativeNames) {
/* 31 */                    if (list != null && list.size() >= 2 && Intrinsics.m6216a(list.get(0), Integer.valueOf(type)) && (obj = list.get(1)) != null) {
/* 67 */                        arrayList.add((String) obj);
                            }
                        }
/* 71 */                return arrayList;
                    } catch (CertificateParsingException unused) {
/* 72 */                return nd0.f14189a;
                    }
                }

                private final boolean isAscii(String str) {
                    return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null));
                }

                private final boolean verifyHostname(String hostname, String pattern) {
                    int length;
/* 2 */             if (hostname != null && hostname.length() != 0 && !C1852e.m6263m(hostname, ".", false) && !C1852e.m6257g(hostname, "..", false) && pattern != null && pattern.length() != 0 && !C1852e.m6263m(pattern, ".", false) && !C1852e.m6257g(pattern, "..", false)) {
/* 58 */                if (!C1852e.m6257g(hostname, ".", false)) {
/* 60 */                    hostname = Intrinsics.m6219d(".", hostname);
                        }
/* 68 */                if (!C1852e.m6257g(pattern, ".", false)) {
/* 70 */                    pattern = Intrinsics.m6219d(".", pattern);
                        }
/* 74 */                String strAsciiToLowercase = asciiToLowercase(pattern);
/* 84 */                if (!StringsKt.m6240z(strAsciiToLowercase, "*", false)) {
/* 86 */                    return hostname.equals(strAsciiToLowercase);
                        }
/* 97 */                if (C1852e.m6263m(strAsciiToLowercase, "*.", false) && StringsKt.m6226B(strAsciiToLowercase, '*', 1, 4) == -1 && hostname.length() >= strAsciiToLowercase.length() && !"*.".equals(strAsciiToLowercase)) {
/* 129 */                   String strSubstring = strAsciiToLowercase.substring(1);
/* 137 */                   if (C1852e.m6257g(hostname, strSubstring, false) && ((length = hostname.length() - strSubstring.length()) <= 0 || StringsKt.m6230F(hostname, '.', length - 1, 4) == -1)) {
/* 101 */                       return true;
                            }
                        }
                    }
/* 1 */             return false;
                }

                private final boolean verifyIpAddress(String ipAddress, X509Certificate certificate) {
/* 1 */             String canonicalHost = HostnamesKt.toCanonicalHost(ipAddress);
/* 6 */             List<String> subjectAltNames = getSubjectAltNames(certificate, 7);
/* 11 */            if (subjectAltNames != null && subjectAltNames.isEmpty()) {
/* 10 */                return false;
                    }
/* 20 */            Iterator<T> it = subjectAltNames.iterator();
/* 28 */            while (it.hasNext()) {
/* 44 */                if (Intrinsics.m6216a(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
/* 46 */                    return true;
                        }
                    }
/* 10 */            return false;
                }

                public final List<String> allSubjectAltNames(X509Certificate certificate) {
/* 1 */             certificate.getClass();
/* 14 */            return CollectionsKt.m6183B(getSubjectAltNames(certificate, 7), getSubjectAltNames(certificate, 2));
                }

                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String host, SSLSession session) {
/* 1 */             host.getClass();
/* 4 */             session.getClass();
/* 12 */            if (!isAscii(host)) {
/* 11 */                return false;
                    }
                    try {
/* 19 */                Certificate certificate = session.getPeerCertificates()[0];
/* 21 */                if (certificate != null) {
/* 25 */                    return verify(host, (X509Certificate) certificate);
                        }
/* 37 */                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    } catch (SSLException unused) {
/* 11 */                return false;
                    }
                }

/* 38 */        public final boolean verify(String host, X509Certificate certificate) {
                    host.getClass();
                    certificate.getClass();
                    return Util.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
                }

/* 162 */       private final boolean verifyHostname(String hostname, X509Certificate certificate) {
/* 163 */           String strAsciiToLowercase = asciiToLowercase(hostname);
/* 164 */           List<String> subjectAltNames = getSubjectAltNames(certificate, 2);
/* 165 */           if (subjectAltNames != null && subjectAltNames.isEmpty()) {
                        return false;
                    }
/* 166 */           Iterator<T> it = subjectAltNames.iterator();
                    while (it.hasNext()) {
/* 167 */               if (INSTANCE.verifyHostname(strAsciiToLowercase, (String) it.next())) {
                            return true;
                        }
                    }
                    return false;
                }
            }
