            package okhttp3;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Date;
            import java.util.GregorianCalendar;
            import java.util.List;
            import java.util.Locale;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.Regex;
            import kotlin.text.StringsKt;
            import okhttp3.internal.HostnamesKt;
            import okhttp3.internal.Util;
            import okhttp3.internal.http.DatesKt;
            import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.f42;
            import p000.nd0;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 &2\u00020\u0001:\u0002%&BO\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\r\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0012J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0017J\r\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0018J\r\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001eJ\r\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0002\b\u001fJ\r\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b J\b\u0010!\u001a\u00020\u0003H\u0016J\u0015\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\nH\u0000¢\u0006\u0002\b#J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b$R\u0013\u0010\u0007\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0013\u0010\r\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0011R\u0013\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\b\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0013\u0010\f\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0011R\u0013\u0010\t\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000f¨\u0006'"}, m6176d2 = {"Lokhttp3/Cookie;", HttpUrl.FRAGMENT_ENCODE_SET, "name", HttpUrl.FRAGMENT_ENCODE_SET, FirebaseAnalytics.Param.VALUE, "expiresAt", HttpUrl.FRAGMENT_ENCODE_SET, "domain", "path", "secure", HttpUrl.FRAGMENT_ENCODE_SET, "httpOnly", "persistent", "hostOnly", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "()Ljava/lang/String;", "()J", "()Z", "-deprecated_domain", "equals", "other", "-deprecated_expiresAt", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_hostOnly", "-deprecated_httpOnly", "matches", "url", "Lokhttp3/HttpUrl;", "-deprecated_name", "-deprecated_path", "-deprecated_persistent", "-deprecated_secure", "toString", "forObsoleteRfc2965", "toString$okhttp", "-deprecated_value", "Builder", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class Cookie {
                private final String domain;
                private final long expiresAt;
                private final boolean hostOnly;
                private final boolean httpOnly;
                private final String name;
                private final String path;
                private final boolean persistent;
                private final boolean secure;
                private final String value;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
                private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
                private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
                private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

                private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
/* 4 */             this.name = str;
/* 6 */             this.value = str2;
/* 8 */             this.expiresAt = j;
/* 10 */            this.domain = str3;
/* 12 */            this.path = str4;
/* 14 */            this.secure = z;
/* 16 */            this.httpOnly = z2;
/* 18 */            this.persistent = z3;
/* 20 */            this.hostOnly = z4;
                }

                public static final Cookie parse(HttpUrl httpUrl, String str) {
/* 3 */             return INSTANCE.parse(httpUrl, str);
                }

                public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
/* 3 */             return INSTANCE.parseAll(httpUrl, headers);
                }

                /* JADX INFO: renamed from: -deprecated_domain, reason: not valid java name and from getter */
                public final String getDomain() {
/* 1 */             return this.domain;
                }

                /* JADX INFO: renamed from: -deprecated_expiresAt, reason: not valid java name and from getter */
                public final long getExpiresAt() {
/* 1 */             return this.expiresAt;
                }

                /* JADX INFO: renamed from: -deprecated_hostOnly, reason: not valid java name and from getter */
                public final boolean getHostOnly() {
/* 1 */             return this.hostOnly;
                }

                /* JADX INFO: renamed from: -deprecated_httpOnly, reason: not valid java name and from getter */
                public final boolean getHttpOnly() {
/* 1 */             return this.httpOnly;
                }

                /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name and from getter */
                public final String getName() {
/* 1 */             return this.name;
                }

                /* JADX INFO: renamed from: -deprecated_path, reason: not valid java name and from getter */
                public final String getPath() {
/* 1 */             return this.path;
                }

                /* JADX INFO: renamed from: -deprecated_persistent, reason: not valid java name and from getter */
                public final boolean getPersistent() {
/* 1 */             return this.persistent;
                }

                /* JADX INFO: renamed from: -deprecated_secure, reason: not valid java name and from getter */
                public final boolean getSecure() {
/* 1 */             return this.secure;
                }

                /* JADX INFO: renamed from: -deprecated_value, reason: not valid java name and from getter */
                public final String getValue() {
/* 1 */             return this.value;
                }

                public final String domain() {
/* 1 */             return this.domain;
                }

                public boolean equals(Object other) {
/* 3 */             if (!(other instanceof Cookie)) {
/* 81 */                return false;
                    }
/* 5 */             Cookie cookie = (Cookie) other;
                    return Intrinsics.m6216a(cookie.name, this.name) && Intrinsics.m6216a(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && Intrinsics.m6216a(cookie.domain, this.domain) && Intrinsics.m6216a(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly;
                }

                public final long expiresAt() {
/* 1 */             return this.expiresAt;
                }

                public int hashCode() {
/* 61 */            return Boolean.hashCode(this.hostOnly) + AbstractC0886en.m3504h(AbstractC0886en.m3504h(AbstractC0886en.m3504h(pm2.m7485h(pm2.m7485h((Long.hashCode(this.expiresAt) + pm2.m7485h(pm2.m7485h(527, 31, this.name), 31, this.value)) * 31, 31, this.domain), 31, this.path), 31, this.secure), 31, this.httpOnly), 31, this.persistent);
                }

                public final boolean hostOnly() {
/* 1 */             return this.hostOnly;
                }

                public final boolean httpOnly() {
/* 1 */             return this.httpOnly;
                }

                public final boolean matches(HttpUrl url) {
/* 1 */             url.getClass();
/* 32 */            if ((this.hostOnly ? Intrinsics.m6216a(url.host(), this.domain) : INSTANCE.domainMatch(url.host(), this.domain)) && INSTANCE.pathMatch(url, this.path)) {
                        return !this.secure || url.getIsHttps();
                    }
/* 31 */            return false;
                }

                public final String name() {
/* 1 */             return this.name;
                }

                public final String path() {
/* 1 */             return this.path;
                }

                public final boolean persistent() {
/* 1 */             return this.persistent;
                }

                public final boolean secure() {
/* 1 */             return this.secure;
                }

                public String toString() {
/* 2 */             return toString$okhttp(false);
                }

                public final String toString$okhttp(boolean forObsoleteRfc2965) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(name());
/* 15 */            sb.append('=');
/* 22 */            sb.append(value());
/* 29 */            if (persistent()) {
/* 39 */                if (expiresAt() == Long.MIN_VALUE) {
/* 43 */                    sb.append("; max-age=0");
                        } else {
/* 49 */                    sb.append("; expires=");
/* 65 */                    sb.append(DatesKt.toHttpDateString(new Date(expiresAt())));
                        }
                    }
/* 72 */            if (!hostOnly()) {
/* 76 */                sb.append("; domain=");
/* 79 */                if (forObsoleteRfc2965) {
/* 83 */                    sb.append(".");
                        }
/* 90 */                sb.append(domain());
                    }
/* 95 */            sb.append("; path=");
/* 102 */           sb.append(path());
/* 109 */           if (secure()) {
/* 113 */               sb.append("; secure");
                    }
/* 120 */           if (httpOnly()) {
/* 124 */               sb.append("; httponly");
                    }
/* 127 */           return sb.toString();
                }

                public final String value() {
/* 1 */             return this.value;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0002J'\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0000¢\u0006\u0002\b\u001bJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0002J \u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\fH\u0002J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\fH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m6176d2 = {"Lokhttp3/Cookie$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "dateCharacterOffset", HttpUrl.FRAGMENT_ENCODE_SET, "input", HttpUrl.FRAGMENT_ENCODE_SET, "pos", "limit", "invert", HttpUrl.FRAGMENT_ENCODE_SET, "domainMatch", "urlHost", "domain", "parse", "Lokhttp3/Cookie;", "currentTimeMillis", HttpUrl.FRAGMENT_ENCODE_SET, "url", "Lokhttp3/HttpUrl;", "setCookie", "parse$okhttp", "parseAll", HttpUrl.FRAGMENT_ENCODE_SET, "headers", "Lokhttp3/Headers;", "parseDomain", "s", "parseExpires", "parseMaxAge", "pathMatch", "path", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    private final int dateCharacterOffset(String input, int pos, int limit, boolean invert) {
/* 1 */                 while (pos < limit) {
/* 3 */                     int i = pos + 1;
/* 5 */                     char cCharAt = input.charAt(pos);
/* 59 */                    if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt <= '9' && '0' <= cCharAt) || ((cCharAt <= 'z' && 'a' <= cCharAt) || ((cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':'))) == (!invert)) {
/* 61 */                        return pos;
                            }
/* 62 */                    pos = i;
                        }
/* 64 */                return limit;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public final boolean domainMatch(String urlHost, String domain) {
                        return Intrinsics.m6216a(urlHost, domain) || (C1852e.m6257g(urlHost, domain, false) && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !Util.canParseAsIpAddress(urlHost));
                    }

                    private final String parseDomain(String s) {
/* 9 */                 if (C1852e.m6257g(s, ".", false)) {
/* 28 */                    C1951n4.m6859j("Failed requirement.");
/* 8 */                     return null;
                        }
/* 15 */                String canonicalHost = HostnamesKt.toCanonicalHost(StringsKt.m6233I(s, "."));
/* 19 */                if (canonicalHost != null) {
/* 21 */                    return canonicalHost;
                        }
/* 22 */                f42.m3649e();
/* 8 */                 return null;
                    }

                    private final long parseExpires(String s, int pos, int limit) {
/* 2 */                 int iDateCharacterOffset = dateCharacterOffset(s, pos, limit, false);
/* 10 */                Matcher matcher = Cookie.TIME_PATTERN.matcher(s);
/* 15 */                int i = -1;
/* 16 */                int i2 = -1;
/* 17 */                int i3 = -1;
/* 18 */                int iM6227C = -1;
/* 19 */                int i4 = -1;
/* 20 */                int i5 = -1;
/* 23 */                while (iDateCharacterOffset < limit) {
/* 27 */                    int iDateCharacterOffset2 = dateCharacterOffset(s, iDateCharacterOffset + 1, limit, true);
/* 31 */                    matcher.region(iDateCharacterOffset, iDateCharacterOffset2);
/* 34 */                    if (i2 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
/* 50 */                        String strGroup = matcher.group(1);
/* 54 */                        strGroup.getClass();
/* 57 */                        i2 = Integer.parseInt(strGroup);
/* 61 */                        String strGroup2 = matcher.group(2);
/* 65 */                        strGroup2.getClass();
/* 68 */                        i4 = Integer.parseInt(strGroup2);
/* 73 */                        String strGroup3 = matcher.group(3);
/* 77 */                        strGroup3.getClass();
/* 80 */                        i5 = Integer.parseInt(strGroup3);
                            } else if (i3 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
/* 101 */                       String strGroup4 = matcher.group(1);
/* 105 */                       strGroup4.getClass();
/* 108 */                       i3 = Integer.parseInt(strGroup4);
                            } else if (iM6227C == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
/* 129 */                       String strGroup5 = matcher.group(1);
/* 133 */                       strGroup5.getClass();
/* 136 */                       Locale locale = Locale.US;
/* 138 */                       locale.getClass();
/* 141 */                       String lowerCase = strGroup5.toLowerCase(locale);
/* 145 */                       lowerCase.getClass();
/* 152 */                       String strPattern = Cookie.MONTH_PATTERN.pattern();
/* 156 */                       strPattern.getClass();
/* 164 */                       iM6227C = StringsKt.m6227C(strPattern, lowerCase, 0, false, 6) / 4;
                            } else if (i == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
/* 183 */                       String strGroup6 = matcher.group(1);
/* 187 */                       strGroup6.getClass();
/* 190 */                       i = Integer.parseInt(strGroup6);
                            }
/* 196 */                   iDateCharacterOffset = dateCharacterOffset(s, iDateCharacterOffset2 + 1, limit, false);
                        }
/* 204 */               if (70 <= i && i < 100) {
/* 210 */                   i += 1900;
                        }
/* 212 */               if (i >= 0 && i < 70) {
/* 216 */                   i += 2000;
                        }
/* 224 */               if (i < 1601) {
/* 316 */                   C1951n4.m6859j("Failed requirement.");
/* 220 */                   return 0L;
                        }
/* 226 */               if (iM6227C == -1) {
/* 312 */                   C1951n4.m6859j("Failed requirement.");
/* 220 */                   return 0L;
                        }
/* 228 */               if (1 > i3 || i3 >= 32) {
/* 308 */                   C1951n4.m6859j("Failed requirement.");
/* 220 */                   return 0L;
                        }
/* 234 */               if (i2 < 0 || i2 >= 24) {
/* 304 */                   C1951n4.m6859j("Failed requirement.");
/* 220 */                   return 0L;
                        }
/* 240 */               if (i4 < 0 || i4 >= 60) {
/* 300 */                   C1951n4.m6859j("Failed requirement.");
/* 220 */                   return 0L;
                        }
/* 246 */               if (i5 < 0 || i5 >= 60) {
/* 296 */                   C1951n4.m6859j("Failed requirement.");
/* 220 */                   return 0L;
                        }
/* 254 */               GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
/* 257 */               gregorianCalendar.setLenient(false);
/* 260 */               gregorianCalendar.set(1, i);
/* 264 */               gregorianCalendar.set(2, iM6227C - 1);
/* 268 */               gregorianCalendar.set(5, i3);
/* 273 */               gregorianCalendar.set(11, i2);
/* 278 */               gregorianCalendar.set(12, i4);
/* 283 */               gregorianCalendar.set(13, i5);
/* 288 */               gregorianCalendar.set(14, 0);
/* 291 */               return gregorianCalendar.getTimeInMillis();
                    }

                    private final long parseMaxAge(String s) {
                        try {
/* 3 */                     long j = Long.parseLong(s);
/* 11 */                    if (j <= 0) {
/* 1 */                         return Long.MIN_VALUE;
                            }
/* 14 */                    return j;
                        } catch (NumberFormatException e) {
/* 27 */                    if (new Regex("-?\\d+").m6223b(s)) {
                                return C1852e.m6263m(s, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                            }
/* 45 */                    throw e;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public final boolean pathMatch(HttpUrl url, String path) {
/* 1 */                 String strEncodedPath = url.encodedPath();
/* 9 */                 if (Intrinsics.m6216a(strEncodedPath, path)) {
/* 40 */                    return true;
                        }
                        return C1852e.m6263m(strEncodedPath, path, false) && (C1852e.m6257g(path, "/", false) || strEncodedPath.charAt(path.length()) == '/');
                    }

                    public final Cookie parse(HttpUrl url, String setCookie) {
/* 1 */                 url.getClass();
/* 4 */                 setCookie.getClass();
/* 11 */                return parse$okhttp(System.currentTimeMillis(), url, setCookie);
                    }

                    public final Cookie parse$okhttp(long currentTimeMillis, HttpUrl url, String setCookie) {
                        long j;
                        String str;
/* 3 */                 url.getClass();
/* 6 */                 setCookie.getClass();
/* 17 */                int iDelimiterOffset$default = Util.delimiterOffset$default(setCookie, ';', 0, 0, 6, (Object) null);
/* 24 */                int iDelimiterOffset$default2 = Util.delimiterOffset$default(setCookie, '=', 0, iDelimiterOffset$default, 2, (Object) null);
/* 28 */                String strSubstring = null;
/* 29 */                if (iDelimiterOffset$default2 != iDelimiterOffset$default) {
/* 37 */                    String strTrimSubstring$default = Util.trimSubstring$default(setCookie, 0, iDelimiterOffset$default2, 1, null);
/* 45 */                    if (strTrimSubstring$default.length() != 0 && Util.indexOfControlOrNonAscii(strTrimSubstring$default) == -1) {
/* 57 */                        String strTrimSubstring = Util.trimSubstring(setCookie, iDelimiterOffset$default2 + 1, iDelimiterOffset$default);
/* 65 */                        if (Util.indexOfControlOrNonAscii(strTrimSubstring) == -1) {
/* 68 */                            int i = iDelimiterOffset$default + 1;
/* 69 */                            int length = setCookie.length();
/* 78 */                            String domain = null;
/* 81 */                            boolean z = false;
/* 83 */                            boolean z2 = false;
/* 85 */                            boolean z3 = false;
/* 87 */                            boolean z4 = true;
/* 89 */                            long expires = 253402300799999L;
/* 91 */                            long maxAge = -1;
/* 93 */                            while (i < length) {
/* 97 */                                int iDelimiterOffset = Util.delimiterOffset(setCookie, ';', i, length);
/* 105 */                               int iDelimiterOffset2 = Util.delimiterOffset(setCookie, '=', i, iDelimiterOffset);
/* 109 */                               String strTrimSubstring2 = Util.trimSubstring(setCookie, i, iDelimiterOffset2);
/* 122 */                               String strTrimSubstring3 = iDelimiterOffset2 < iDelimiterOffset ? Util.trimSubstring(setCookie, iDelimiterOffset2 + 1, iDelimiterOffset) : HttpUrl.FRAGMENT_ENCODE_SET;
/* 130 */                               if (C1852e.m6258h(strTrimSubstring2, "expires")) {
                                            try {
/* 136 */                                       expires = parseExpires(strTrimSubstring3, 0, strTrimSubstring3.length());
/* 140 */                                       z2 = true;
                                            } catch (NumberFormatException | IllegalArgumentException unused) {
                                            }
                                        } else if (C1852e.m6258h(strTrimSubstring2, "max-age")) {
/* 151 */                                   maxAge = parseMaxAge(strTrimSubstring3);
/* 140 */                                   z2 = true;
                                        } else if (C1852e.m6258h(strTrimSubstring2, "domain")) {
/* 164 */                                   domain = parseDomain(strTrimSubstring3);
/* 168 */                                   z4 = false;
                                        } else if (C1852e.m6258h(strTrimSubstring2, "path")) {
/* 179 */                                   strSubstring = strTrimSubstring3;
                                        } else if (C1852e.m6258h(strTrimSubstring2, "secure")) {
/* 189 */                                   z3 = true;
                                        } else if (C1852e.m6258h(strTrimSubstring2, "httponly")) {
/* 200 */                                   z = true;
                                        }
/* 202 */                               i = iDelimiterOffset + 1;
                                    }
/* 212 */                           if (maxAge == Long.MIN_VALUE) {
/* 214 */                               j = Long.MIN_VALUE;
                                    } else if (maxAge != -1) {
/* 238 */                               long j2 = currentTimeMillis + (maxAge <= 9223372036854775L ? maxAge * 1000 : Long.MAX_VALUE);
/* 251 */                               j = (j2 < currentTimeMillis || j2 > DatesKt.MAX_DATE) ? 253402300799999L : j2;
                                    } else {
/* 253 */                               j = expires;
                                    }
/* 255 */                           String strHost = url.host();
/* 259 */                           if (domain == null) {
/* 261 */                               str = strHost;
                                    } else {
/* 267 */                               if (!domainMatch(strHost, domain)) {
/* 78 */                                    return null;
                                        }
/* 270 */                               str = domain;
                                    }
/* 279 */                           if (strHost.length() != str.length() && PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(str) == null) {
/* 78 */                                return null;
                                    }
/* 296 */                           if (strSubstring == null || !C1852e.m6263m(strSubstring, "/", false)) {
/* 307 */                               String strEncodedPath = url.encodedPath();
/* 314 */                               int iM6230F = StringsKt.m6230F(strEncodedPath, '/', 0, 6);
/* 320 */                               strSubstring = iM6230F != 0 ? strEncodedPath.substring(0, iM6230F) : "/";
                                    }
/* 339 */                           return new Cookie(strTrimSubstring$default, strTrimSubstring, j, str, strSubstring, z3, z, z2, z4, null);
                                }
                            }
                        }
/* 28 */                return null;
                    }

                    public final List<Cookie> parseAll(HttpUrl url, Headers headers) {
/* 1 */                 url.getClass();
/* 4 */                 headers.getClass();
/* 9 */                 List<String> listValues = headers.values("Set-Cookie");
/* 13 */                int size = listValues.size();
/* 17 */                ArrayList arrayList = null;
/* 18 */                int i = 0;
/* 19 */                while (i < size) {
/* 21 */                    int i2 = i + 1;
/* 29 */                    Cookie cookie = parse(url, listValues.get(i));
/* 33 */                    if (cookie != null) {
/* 37 */                        if (arrayList == null) {
/* 41 */                            arrayList = new ArrayList();
                                }
/* 44 */                        arrayList.add(cookie);
                            }
/* 35 */                    i = i2;
                        }
/* 48 */                if (arrayList == null) {
/* 58 */                    return nd0.f14189a;
                        }
/* 50 */                List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
/* 54 */                listUnmodifiableList.getClass();
/* 57 */                return listUnmodifiableList;
                    }

/* 4 */             private Companion() {
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0000J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0000J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m6176d2 = {"Lokhttp3/Cookie$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "domain", HttpUrl.FRAGMENT_ENCODE_SET, "expiresAt", HttpUrl.FRAGMENT_ENCODE_SET, "hostOnly", HttpUrl.FRAGMENT_ENCODE_SET, "httpOnly", "name", "path", "persistent", "secure", FirebaseAnalytics.Param.VALUE, "build", "Lokhttp3/Cookie;", "hostOnlyDomain", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 21 */        public static final class Builder {
                    private String domain;
                    private boolean hostOnly;
                    private boolean httpOnly;
                    private String name;
                    private boolean persistent;
                    private boolean secure;
                    private String value;
                    private long expiresAt = DatesKt.MAX_DATE;
                    private String path = "/";

                    private final Builder domain(String domain, boolean hostOnly) {
/* 1 */                 String canonicalHost = HostnamesKt.toCanonicalHost(domain);
/* 5 */                 if (canonicalHost == null) {
/* 18 */                    C1951n4.m6859j(Intrinsics.m6219d(domain, "unexpected domain: "));
/* 21 */                    return null;
                        }
/* 7 */                 this.domain = canonicalHost;
/* 9 */                 this.hostOnly = hostOnly;
/* 11 */                return this;
                    }

                    public final Cookie build() {
/* 3 */                 String str = this.name;
/* 6 */                 if (str == null) {
/* 52 */                    C1951n4.m6868s("builder.name == null");
/* 5 */                     return null;
                        }
/* 9 */                 String str2 = this.value;
/* 11 */                if (str2 == null) {
/* 45 */                    C1951n4.m6868s("builder.value == null");
/* 5 */                     return null;
                        }
/* 14 */                long j = this.expiresAt;
/* 17 */                String str3 = this.domain;
/* 19 */                if (str3 != null) {
/* 32 */                    return new Cookie(str, str2, j, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
                        }
/* 38 */                C1951n4.m6868s("builder.domain == null");
/* 5 */                 return null;
                    }

                    public final Builder expiresAt(long expiresAt) {
/* 5 */                 if (expiresAt <= 0) {
/* 7 */                     expiresAt = Long.MIN_VALUE;
                        }
/* 16 */                if (expiresAt > DatesKt.MAX_DATE) {
/* 18 */                    expiresAt = 253402300799999L;
                        }
/* 19 */                this.expiresAt = expiresAt;
/* 22 */                this.persistent = true;
/* 24 */                return this;
                    }

                    public final Builder hostOnlyDomain(String domain) {
/* 1 */                 domain.getClass();
/* 5 */                 return domain(domain, true);
                    }

                    public final Builder httpOnly() {
/* 2 */                 this.httpOnly = true;
/* 4 */                 return this;
                    }

                    public final Builder name(String name) {
/* 1 */                 name.getClass();
/* 16 */                if (Intrinsics.m6216a(StringsKt.m6239O(name).toString(), name)) {
/* 18 */                    this.name = name;
/* 20 */                    return this;
                        }
/* 23 */                C1951n4.m6859j("name is not trimmed");
/* 26 */                return null;
                    }

                    public final Builder path(String path) {
/* 1 */                 path.getClass();
/* 11 */                if (C1852e.m6263m(path, "/", false)) {
/* 13 */                    this.path = path;
/* 15 */                    return this;
                        }
/* 18 */                C1951n4.m6859j("path must start with '/'");
/* 21 */                return null;
                    }

                    public final Builder secure() {
/* 2 */                 this.secure = true;
/* 4 */                 return this;
                    }

                    public final Builder value(String value) {
/* 1 */                 value.getClass();
/* 16 */                if (Intrinsics.m6216a(StringsKt.m6239O(value).toString(), value)) {
/* 18 */                    this.value = value;
/* 20 */                    return this;
                        }
/* 23 */                C1951n4.m6859j("value is not trimmed");
/* 26 */                return null;
                    }

/* 22 */            public final Builder domain(String domain) {
                        domain.getClass();
/* 23 */                return domain(domain, false);
                    }
                }

/* 22 */        public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
/* 23 */            this(str, str2, j, str3, str4, z, z2, z3, z4);
                }
            }
