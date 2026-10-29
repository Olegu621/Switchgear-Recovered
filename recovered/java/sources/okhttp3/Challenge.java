            package okhttp3;

            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.util.Collections;
            import java.util.LinkedHashMap;
            import java.util.Locale;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.jvm.internal.Intrinsics;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0002\b\u000eJ\r\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\b\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bR!\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00030\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0004\u0010\rR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\r¨\u0006\u0019"}, m6176d2 = {"Lokhttp3/Challenge;", HttpUrl.FRAGMENT_ENCODE_SET, "scheme", HttpUrl.FRAGMENT_ENCODE_SET, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, "(Ljava/lang/String;Ljava/lang/String;)V", "authParams", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/util/Map;)V", "()Ljava/util/Map;", "charset", "Ljava/nio/charset/Charset;", "()Ljava/nio/charset/Charset;", "()Ljava/lang/String;", "-deprecated_authParams", "-deprecated_charset", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_realm", "-deprecated_scheme", "toString", "withCharset", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 77 */    public final class Challenge {
                private final Map<String, String> authParams;
                private final String scheme;

                public Challenge(String str, Map<String, String> map) {
                    String lowerCase;
/* 1 */             str.getClass();
/* 4 */             map.getClass();
/* 10 */            this.scheme = str;
/* 14 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 29 */            for (Map.Entry<String, String> entry : map.entrySet()) {
/* 37 */                String key = entry.getKey();
/* 43 */                String value = entry.getValue();
/* 49 */                if (key == null) {
/* 51 */                    lowerCase = null;
                        } else {
/* 53 */                    Locale locale = Locale.US;
/* 55 */                    locale.getClass();
/* 58 */                    lowerCase = key.toLowerCase(locale);
/* 62 */                    lowerCase.getClass();
                        }
/* 65 */                linkedHashMap.put(lowerCase, value);
                    }
/* 69 */            Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
/* 73 */            mapUnmodifiableMap.getClass();
/* 76 */            this.authParams = mapUnmodifiableMap;
                }

                /* JADX INFO: renamed from: -deprecated_authParams, reason: not valid java name */
                public final Map<String, String> m10522deprecated_authParams() {
/* 1 */             return this.authParams;
                }

                /* JADX INFO: renamed from: -deprecated_charset, reason: not valid java name */
                public final Charset m10523deprecated_charset() {
/* 1 */             return charset();
                }

                /* JADX INFO: renamed from: -deprecated_realm, reason: not valid java name */
                public final String m10524deprecated_realm() {
/* 1 */             return realm();
                }

                /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name and from getter */
                public final String getScheme() {
/* 1 */             return this.scheme;
                }

                public final Map<String, String> authParams() {
/* 1 */             return this.authParams;
                }

                public final Charset charset() {
/* 5 */             String str = this.authParams.get("charset");
/* 11 */            if (str != null) {
                        try {
/* 13 */                    Charset charsetForName = Charset.forName(str);
/* 17 */                    charsetForName.getClass();
/* 20 */                    return charsetForName;
                        } catch (Exception unused) {
                        }
                    }
/* 21 */            Charset charset = StandardCharsets.ISO_8859_1;
/* 23 */            charset.getClass();
/* 26 */            return charset;
                }

                public boolean equals(Object other) {
/* 3 */             if (!(other instanceof Challenge)) {
/* 29 */                return false;
                    }
/* 5 */             Challenge challenge = (Challenge) other;
                    return Intrinsics.m6216a(challenge.scheme, this.scheme) && Intrinsics.m6216a(challenge.authParams, this.authParams);
                }

                public int hashCode() {
/* 17 */            return this.authParams.hashCode() + pm2.m7485h(899, 31, this.scheme);
                }

                public final String realm() {
/* 5 */             return this.authParams.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM);
                }

                public final String scheme() {
/* 1 */             return this.scheme;
                }

                public String toString() {
/* 21 */            return this.scheme + " authParams=" + this.authParams;
                }

                public final Challenge withCharset(Charset charset) {
/* 1 */             charset.getClass();
/* 4 */             Map<String, String> map = this.authParams;
/* 6 */             map.getClass();
/* 11 */            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
/* 14 */            String strName = charset.name();
/* 18 */            strName.getClass();
/* 23 */            linkedHashMap.put("charset", strName);
/* 30 */            return new Challenge(this.scheme, linkedHashMap);
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 78 */        public Challenge(String str, String str2) {
                    str.getClass();
                    str2.getClass();
/* 79 */            Map mapSingletonMap = Collections.singletonMap(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, str2);
                    mapSingletonMap.getClass();
                    this(str, (Map<String, String>) mapSingletonMap);
                }
            }
