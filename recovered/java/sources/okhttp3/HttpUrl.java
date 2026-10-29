            package okhttp3;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import java.io.EOFException;
            import java.net.MalformedURLException;
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.net.URL;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.ranges.C1847a;
            import kotlin.text.C1852e;
            import kotlin.text.Regex;
            import kotlin.text.StringsKt;
            import okhttp3.internal.HostnamesKt;
            import okhttp3.internal.Util;
            import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
            import okio.Buffer;
            import p000.C1951n4;
            import p000.C2122qw;
            import p000.di2;
            import p000.ds0;
            import p000.f42;
            import p000.fm0;
            import p000.k50;
            import p000.nd0;
            import p000.qd0;
            import p000.r02;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002IJBa\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0002\b#J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b$J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b%J\r\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0002\b&J\u0013\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\bH\u0016J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b+J\u0006\u0010,\u001a\u00020-J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b/J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b0J\r\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0002\b1J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b2J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0007¢\u0006\u0002\b8J\u0010\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u00020\bJ\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u00105\u001a\u00020\u0003J\r\u0010 \u001a\u00020\bH\u0007¢\u0006\u0002\b;J\u0006\u0010<\u001a\u00020\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\b\u0010?\u001a\u00020\u0003H\u0016J\r\u0010@\u001a\u00020AH\u0007¢\u0006\u0002\bBJ\r\u0010C\u001a\u00020DH\u0007¢\u0006\u0002\b\rJ\b\u0010E\u001a\u0004\u0018\u00010\u0003J\r\u0010B\u001a\u00020AH\u0007¢\u0006\u0002\bFJ\r\u0010\r\u001a\u00020DH\u0007¢\u0006\u0002\bGJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\bHR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0011\u0010 \u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010¨\u0006K"}, m6176d2 = {"Lokhttp3/HttpUrl;", HttpUrl.FRAGMENT_ENCODE_SET, "scheme", HttpUrl.FRAGMENT_ENCODE_SET, URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT, HttpUrl.FRAGMENT_ENCODE_SET, "pathSegments", HttpUrl.FRAGMENT_ENCODE_SET, "queryNamesAndValues", "fragment", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "encodedFragment", "()Ljava/lang/String;", "encodedPassword", "encodedPath", "encodedPathSegments", "()Ljava/util/List;", "encodedQuery", "encodedUsername", "isHttps", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "pathSize", "()I", "query", "queryParameterNames", HttpUrl.FRAGMENT_ENCODE_SET, "()Ljava/util/Set;", "querySize", "-deprecated_encodedFragment", "-deprecated_encodedPassword", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_encodedQuery", "-deprecated_encodedUsername", "equals", "other", "-deprecated_fragment", "hashCode", "-deprecated_host", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "link", "-deprecated_password", "-deprecated_pathSegments", "-deprecated_pathSize", "-deprecated_port", "-deprecated_query", "queryParameter", "name", "queryParameterName", FirebaseAnalytics.Param.INDEX, "-deprecated_queryParameterNames", "queryParameterValue", "queryParameterValues", "-deprecated_querySize", "redact", "resolve", "-deprecated_scheme", "toString", "toUri", "Ljava/net/URI;", "uri", "toUrl", "Ljava/net/URL;", "topPrivateDomain", "-deprecated_uri", "-deprecated_url", "-deprecated_username", "Builder", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 1 */     public final class HttpUrl {
                public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
                public static final String FRAGMENT_ENCODE_SET = "";
                public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
                public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
                public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
                public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
                public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
                public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
                public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
                public static final String QUERY_ENCODE_SET = " \"'<>#";
                public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
                private final String fragment;
                private final String host;
                private final boolean isHttps;
                private final String password;
                private final List<String> pathSegments;
                private final int port;
                private final List<String> queryNamesAndValues;
                private final String scheme;
                private final String url;
                private final String username;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

                public HttpUrl(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
/* 1 */             str.getClass();
/* 4 */             str2.getClass();
/* 7 */             str3.getClass();
/* 10 */            str4.getClass();
/* 13 */            list.getClass();
/* 16 */            str6.getClass();
/* 22 */            this.scheme = str;
/* 24 */            this.username = str2;
/* 26 */            this.password = str3;
/* 28 */            this.host = str4;
/* 30 */            this.port = i;
/* 32 */            this.pathSegments = list;
/* 34 */            this.queryNamesAndValues = list2;
/* 36 */            this.fragment = str5;
/* 38 */            this.url = str6;
/* 46 */            this.isHttps = Intrinsics.m6216a(str, "https");
                }

                public static final int defaultPort(String str) {
/* 3 */             return INSTANCE.defaultPort(str);
                }

                public static final HttpUrl get(String str) {
/* 3 */             return INSTANCE.get(str);
                }

                public static final HttpUrl parse(String str) {
/* 3 */             return INSTANCE.parse(str);
                }

                /* JADX INFO: renamed from: -deprecated_encodedFragment, reason: not valid java name */
                public final String m10551deprecated_encodedFragment() {
/* 1 */             return encodedFragment();
                }

                /* JADX INFO: renamed from: -deprecated_encodedPassword, reason: not valid java name */
                public final String m10552deprecated_encodedPassword() {
/* 1 */             return encodedPassword();
                }

                /* JADX INFO: renamed from: -deprecated_encodedPath, reason: not valid java name */
                public final String m10553deprecated_encodedPath() {
/* 1 */             return encodedPath();
                }

                /* JADX INFO: renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
                public final List<String> m10554deprecated_encodedPathSegments() {
/* 1 */             return encodedPathSegments();
                }

                /* JADX INFO: renamed from: -deprecated_encodedQuery, reason: not valid java name */
                public final String m10555deprecated_encodedQuery() {
/* 1 */             return encodedQuery();
                }

                /* JADX INFO: renamed from: -deprecated_encodedUsername, reason: not valid java name */
                public final String m10556deprecated_encodedUsername() {
/* 1 */             return encodedUsername();
                }

                /* JADX INFO: renamed from: -deprecated_fragment, reason: not valid java name and from getter */
                public final String getFragment() {
/* 1 */             return this.fragment;
                }

                /* JADX INFO: renamed from: -deprecated_host, reason: not valid java name and from getter */
                public final String getHost() {
/* 1 */             return this.host;
                }

                /* JADX INFO: renamed from: -deprecated_password, reason: not valid java name and from getter */
                public final String getPassword() {
/* 1 */             return this.password;
                }

                /* JADX INFO: renamed from: -deprecated_pathSegments, reason: not valid java name */
                public final List<String> m10560deprecated_pathSegments() {
/* 1 */             return this.pathSegments;
                }

                /* JADX INFO: renamed from: -deprecated_pathSize, reason: not valid java name */
                public final int m10561deprecated_pathSize() {
/* 1 */             return pathSize();
                }

                /* JADX INFO: renamed from: -deprecated_port, reason: not valid java name and from getter */
                public final int getPort() {
/* 1 */             return this.port;
                }

                /* JADX INFO: renamed from: -deprecated_query, reason: not valid java name */
                public final String m10563deprecated_query() {
/* 1 */             return query();
                }

                /* JADX INFO: renamed from: -deprecated_queryParameterNames, reason: not valid java name */
                public final Set<String> m10564deprecated_queryParameterNames() {
/* 1 */             return queryParameterNames();
                }

                /* JADX INFO: renamed from: -deprecated_querySize, reason: not valid java name */
                public final int m10565deprecated_querySize() {
/* 1 */             return querySize();
                }

                /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name and from getter */
                public final String getScheme() {
/* 1 */             return this.scheme;
                }

                /* JADX INFO: renamed from: -deprecated_uri, reason: not valid java name */
                public final URI m10567deprecated_uri() {
/* 1 */             return uri();
                }

                /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
                public final URL m10568deprecated_url() {
/* 1 */             return url();
                }

                /* JADX INFO: renamed from: -deprecated_username, reason: not valid java name and from getter */
                public final String getUsername() {
/* 1 */             return this.username;
                }

                public final String encodedFragment() {
/* 3 */             if (this.fragment == null) {
/* 5 */                 return null;
                    }
/* 21 */            return this.url.substring(StringsKt.m6226B(this.url, '#', 0, 6) + 1);
                }

                public final String encodedPassword() {
/* 7 */             if (this.password.length() == 0) {
/* 9 */                 return FRAGMENT_ENCODE_SET;
                    }
/* 43 */            return this.url.substring(StringsKt.m6226B(this.url, ':', this.scheme.length() + 3, 4) + 1, StringsKt.m6226B(this.url, '@', 0, 6));
                }

                public final String encodedPath() {
/* 14 */            int iM6226B = StringsKt.m6226B(this.url, '/', this.scheme.length() + 3, 4);
/* 18 */            String str = this.url;
/* 32 */            return this.url.substring(iM6226B, Util.delimiterOffset(str, "?#", iM6226B, str.length()));
                }

                public final List<String> encodedPathSegments() {
/* 14 */            int iM6226B = StringsKt.m6226B(this.url, '/', this.scheme.length() + 3, 4);
/* 18 */            String str = this.url;
/* 26 */            int iDelimiterOffset = Util.delimiterOffset(str, "?#", iM6226B, str.length());
/* 32 */            ArrayList arrayList = new ArrayList();
/* 35 */            while (iM6226B < iDelimiterOffset) {
/* 37 */                int i = iM6226B + 1;
/* 41 */                int iDelimiterOffset2 = Util.delimiterOffset(this.url, '/', i, iDelimiterOffset);
/* 51 */                arrayList.add(this.url.substring(i, iDelimiterOffset2));
/* 54 */                iM6226B = iDelimiterOffset2;
                    }
/* 56 */            return arrayList;
                }

                public final String encodedQuery() {
/* 3 */             if (this.queryNamesAndValues == null) {
/* 5 */                 return null;
                    }
/* 17 */            int iM6226B = StringsKt.m6226B(this.url, '?', 0, 6) + 1;
/* 19 */            String str = this.url;
/* 33 */            return this.url.substring(iM6226B, Util.delimiterOffset(str, '#', iM6226B, str.length()));
                }

                public final String encodedUsername() {
/* 7 */             if (this.username.length() == 0) {
/* 9 */                 return FRAGMENT_ENCODE_SET;
                    }
/* 18 */            int length = this.scheme.length() + 3;
/* 20 */            String str = this.url;
/* 34 */            return this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
                }

                public boolean equals(Object other) {
                    return (other instanceof HttpUrl) && Intrinsics.m6216a(((HttpUrl) other).url, this.url);
                }

                public final String fragment() {
/* 1 */             return this.fragment;
                }

                public int hashCode() {
/* 3 */             return this.url.hashCode();
                }

                public final String host() {
/* 1 */             return this.host;
                }

                /* JADX INFO: renamed from: isHttps, reason: from getter */
                public final boolean getIsHttps() {
/* 1 */             return this.isHttps;
                }

                public final Builder newBuilder() {
/* 3 */             Builder builder = new Builder();
/* 8 */             builder.setScheme$okhttp(this.scheme);
/* 15 */            builder.setEncodedUsername$okhttp(encodedUsername());
/* 22 */            builder.setEncodedPassword$okhttp(encodedPassword());
/* 27 */            builder.setHost$okhttp(this.host);
/* 46 */            builder.setPort$okhttp(this.port != INSTANCE.defaultPort(this.scheme) ? this.port : -1);
/* 53 */            builder.getEncodedPathSegments$okhttp().clear();
/* 64 */            builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
/* 71 */            builder.encodedQuery(encodedQuery());
/* 78 */            builder.setEncodedFragment$okhttp(encodedFragment());
/* 81 */            return builder;
                }

                public final String password() {
/* 1 */             return this.password;
                }

                public final List<String> pathSegments() {
/* 1 */             return this.pathSegments;
                }

                public final int pathSize() {
/* 3 */             return this.pathSegments.size();
                }

                public final int port() {
/* 1 */             return this.port;
                }

                public final String query() {
/* 3 */             if (this.queryNamesAndValues == null) {
/* 5 */                 return null;
                    }
/* 9 */             StringBuilder sb = new StringBuilder();
/* 16 */            INSTANCE.toQueryString$okhttp(this.queryNamesAndValues, sb);
/* 19 */            return sb.toString();
                }

                public final String queryParameter(String name) {
/* 1 */             name.getClass();
/* 4 */             List<String> list = this.queryNamesAndValues;
/* 6 */             if (list == null) {
/* 67 */                return null;
                    }
/* 19 */            C1847a c1847aM8047d = r02.m8047d(r02.m8048e(0, list.size()), 2);
/* 23 */            int i = c1847aM8047d.f12926a;
/* 25 */            int i2 = c1847aM8047d.f12927b;
/* 27 */            int i3 = c1847aM8047d.f12928c;
/* 29 */            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
/* 67 */                return null;
                    }
                    while (true) {
/* 37 */                int i4 = i + i3;
/* 49 */                if (name.equals(this.queryNamesAndValues.get(i))) {
/* 55 */                    return this.queryNamesAndValues.get(i + 1);
                        }
/* 62 */                if (i == i2) {
/* 67 */                    return null;
                        }
/* 65 */                i = i4;
                    }
                }

                public final String queryParameterName(int index) {
/* 1 */             List<String> list = this.queryNamesAndValues;
/* 3 */             if (list == null) {
/* 22 */                throw new IndexOutOfBoundsException();
                    }
/* 7 */             String str = list.get(index * 2);
/* 11 */            str.getClass();
/* 14 */            return str;
                }

                public final Set<String> queryParameterNames() {
/* 3 */             if (this.queryNamesAndValues == null) {
/* 5 */                 return qd0.f15493a;
                    }
/* 10 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 25 */            C1847a c1847aM8047d = r02.m8047d(r02.m8048e(0, this.queryNamesAndValues.size()), 2);
/* 29 */            int i = c1847aM8047d.f12926a;
/* 31 */            int i2 = c1847aM8047d.f12927b;
/* 33 */            int i3 = c1847aM8047d.f12928c;
/* 35 */            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                        while (true) {
/* 43 */                    int i4 = i + i3;
/* 47 */                    String str = this.queryNamesAndValues.get(i);
/* 51 */                    str.getClass();
/* 54 */                    linkedHashSet.add(str);
/* 57 */                    if (i == i2) {
                                break;
                            }
/* 60 */                    i = i4;
                        }
                    }
/* 62 */            Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
/* 66 */            setUnmodifiableSet.getClass();
/* 69 */            return setUnmodifiableSet;
                }

                public final String queryParameterValue(int index) {
/* 1 */             List<String> list = this.queryNamesAndValues;
/* 3 */             if (list != null) {
/* 9 */                 return list.get((index * 2) + 1);
                    }
/* 21 */            throw new IndexOutOfBoundsException();
                }

                public final List<String> queryParameterValues(String name) {
/* 1 */             name.getClass();
/* 6 */             if (this.queryNamesAndValues == null) {
/* 8 */                 return nd0.f14189a;
                    }
/* 13 */            ArrayList arrayList = new ArrayList();
/* 28 */            C1847a c1847aM8047d = r02.m8047d(r02.m8048e(0, this.queryNamesAndValues.size()), 2);
/* 32 */            int i = c1847aM8047d.f12926a;
/* 34 */            int i2 = c1847aM8047d.f12927b;
/* 36 */            int i3 = c1847aM8047d.f12928c;
/* 38 */            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                        while (true) {
/* 46 */                    int i4 = i + i3;
/* 58 */                    if (name.equals(this.queryNamesAndValues.get(i))) {
/* 68 */                        arrayList.add(this.queryNamesAndValues.get(i + 1));
                            }
/* 71 */                    if (i == i2) {
                                break;
                            }
/* 74 */                    i = i4;
                        }
                    }
/* 76 */            List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
/* 80 */            listUnmodifiableList.getClass();
/* 83 */            return listUnmodifiableList;
                }

                public final int querySize() {
/* 1 */             List<String> list = this.queryNamesAndValues;
/* 3 */             if (list != null) {
/* 9 */                 return list.size() / 2;
                    }
/* 12 */            return 0;
                }

                public final String redact() {
/* 3 */             Builder builderNewBuilder = newBuilder("/...");
/* 7 */             builderNewBuilder.getClass();
/* 24 */            return builderNewBuilder.username(FRAGMENT_ENCODE_SET).password(FRAGMENT_ENCODE_SET).build().getUrl();
                }

                public final HttpUrl resolve(String link) {
/* 1 */             link.getClass();
/* 4 */             Builder builderNewBuilder = newBuilder(link);
/* 8 */             if (builderNewBuilder == null) {
/* 10 */                return null;
                    }
/* 12 */            return builderNewBuilder.build();
                }

                public final String scheme() {
/* 1 */             return this.scheme;
                }

                /* JADX INFO: renamed from: toString, reason: from getter */
                public String getUrl() {
/* 1 */             return this.url;
                }

                public final String topPrivateDomain() {
/* 7 */             if (Util.canParseAsIpAddress(this.host)) {
/* 9 */                 return null;
                    }
/* 19 */            return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
                }

                public final URI uri() {
/* 9 */             String string = newBuilder().reencodeForUri$okhttp().toString();
                    try {
/* 15 */                return new URI(string);
                    } catch (URISyntaxException e) {
                        try {
/* 33 */                    URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, FRAGMENT_ENCODE_SET));
/* 37 */                    uriCreate.getClass();
/* 40 */                    return uriCreate;
                        } catch (Exception unused) {
/* 41 */                    ds0.m3199p(e);
/* 44 */                    return null;
                        }
                    }
                }

                public final URL url() {
                    try {
/* 5 */                 return new URL(this.url);
                    } catch (MalformedURLException e) {
/* 10 */                ds0.m3199p(e);
/* 13 */                return null;
                    }
                }

                public final String username() {
/* 1 */             return this.username;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0017\u0018\u0000 V2\u00020\u0001:\u0001VB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0004J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004J\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020\u001bH\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u000e\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0004J\u0010\u00106\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u00107\u001a\u00020\u00002\b\u00107\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0004J\u0010\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020\u0004H\u0002J\u0010\u0010:\u001a\u00020.2\u0006\u00109\u001a\u00020\u0004H\u0002J\u001f\u0010;\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u0001032\u0006\u00109\u001a\u00020\u0004H\u0000¢\u0006\u0002\b=J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0004J\b\u0010?\u001a\u00020@H\u0002J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ0\u0010A\u001a\u00020@2\u0006\u00109\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020.2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010E\u001a\u00020\u00002\b\u0010E\u001a\u0004\u0018\u00010\u0004J\r\u0010F\u001a\u00020\u0000H\u0000¢\u0006\u0002\bGJ\u0010\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020\u0004H\u0002J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010K\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0004J\u000e\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001bJ \u0010N\u001a\u00020@2\u0006\u00109\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001bH\u0002J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0004J\u0016\u0010P\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0004J\u0018\u0010Q\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0016\u0010R\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0004J\u0018\u0010S\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004J\b\u0010T\u001a\u00020\u0004H\u0016J\u000e\u0010U\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\b¨\u0006W"}, m6176d2 = {"Lokhttp3/HttpUrl$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "encodedFragment", HttpUrl.FRAGMENT_ENCODE_SET, "getEncodedFragment$okhttp", "()Ljava/lang/String;", "setEncodedFragment$okhttp", "(Ljava/lang/String;)V", "encodedPassword", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "encodedPathSegments", HttpUrl.FRAGMENT_ENCODE_SET, "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedUsername", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "getHost$okhttp", "setHost$okhttp", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT, HttpUrl.FRAGMENT_ENCODE_SET, "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "scheme", "getScheme$okhttp", "setScheme$okhttp", "addEncodedPathSegment", "encodedPathSegment", "addEncodedPathSegments", "addEncodedQueryParameter", "encodedName", "encodedValue", "addPathSegment", "pathSegment", "addPathSegments", "pathSegments", "alreadyEncoded", HttpUrl.FRAGMENT_ENCODE_SET, "addQueryParameter", "name", FirebaseAnalytics.Param.VALUE, "build", "Lokhttp3/HttpUrl;", "effectivePort", "encodedPath", "encodedQuery", "fragment", "isDot", "input", "isDotDot", "parse", "base", "parse$okhttp", URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, "pop", HttpUrl.FRAGMENT_ENCODE_SET, "push", "pos", "limit", "addTrailingSlash", "query", "reencodeForUri", "reencodeForUri$okhttp", "removeAllCanonicalQueryParameters", "canonicalName", "removeAllEncodedQueryParameters", "removeAllQueryParameters", "removePathSegment", FirebaseAnalytics.Param.INDEX, "resolvePath", "startPos", "setEncodedPathSegment", "setEncodedQueryParameter", "setPathSegment", "setQueryParameter", "toString", URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */         public static final class Builder {

                    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    public static final String INVALID_HOST = "Invalid URL host";
                    private String encodedFragment;
                    private final List<String> encodedPathSegments;
                    private List<String> encodedQueryNamesAndValues;
                    private String host;
                    private String scheme;
                    private String encodedUsername = HttpUrl.FRAGMENT_ENCODE_SET;
                    private String encodedPassword = HttpUrl.FRAGMENT_ENCODE_SET;
                    private int port = -1;

                    public Builder() {
/* 15 */                ArrayList arrayList = new ArrayList();
/* 18 */                this.encodedPathSegments = arrayList;
/* 20 */                arrayList.add(HttpUrl.FRAGMENT_ENCODE_SET);
                    }

                    private final Builder addPathSegments(String pathSegments, boolean alreadyEncoded) {
/* 2 */                 int i = 0;
                        while (true) {
/* 9 */                     int iDelimiterOffset = Util.delimiterOffset(pathSegments, "/\\", i, pathSegments.length());
/* 29 */                    this.push(pathSegments, i, iDelimiterOffset, iDelimiterOffset < pathSegments.length(), alreadyEncoded);
/* 32 */                    i = iDelimiterOffset + 1;
/* 38 */                    if (i > pathSegments.length()) {
/* 40 */                        return this;
                            }
/* 41 */                    this = this;
/* 42 */                    pathSegments = pathSegments;
/* 43 */                    alreadyEncoded = alreadyEncoded;
                        }
                    }

                    private final int effectivePort() {
/* 1 */                 int i = this.port;
/* 4 */                 if (i != -1) {
/* 6 */                     return i;
                        }
/* 7 */                 Companion companion = HttpUrl.INSTANCE;
/* 9 */                 String str = this.scheme;
/* 11 */                str.getClass();
/* 14 */                return companion.defaultPort(str);
                    }

                    private final boolean isDot(String input) {
                        return Intrinsics.m6216a(input, ".") || C1852e.m6258h(input, "%2e");
                    }

                    private final boolean isDotDot(String input) {
                        return Intrinsics.m6216a(input, "..") || C1852e.m6258h(input, "%2e.") || C1852e.m6258h(input, ".%2e") || C1852e.m6258h(input, "%2e%2e");
                    }

                    private final void pop() {
/* 1 */                 List<String> list = this.encodedPathSegments;
/* 21 */                if (list.remove(list.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
/* 45 */                    this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
                        } else {
/* 31 */                    List<String> list2 = this.encodedPathSegments;
/* 39 */                    list2.set(list2.size() - 1, HttpUrl.FRAGMENT_ENCODE_SET);
                        }
                    }

                    private final void push(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
/* 17 */                String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, pos, limit, HttpUrl.PATH_SEGMENT_ENCODE_SET, alreadyEncoded, false, false, false, null, 240, null);
/* 25 */                if (isDot(strCanonicalize$okhttp$default)) {
/* 82 */                    return;
                        }
/* 32 */                if (isDotDot(strCanonicalize$okhttp$default)) {
/* 34 */                    pop();
/* 37 */                    return;
                        }
/* 38 */                List<String> list = this.encodedPathSegments;
/* 52 */                int length = list.get(list.size() - 1).length();
/* 56 */                List<String> list2 = this.encodedPathSegments;
/* 58 */                if (length == 0) {
/* 66 */                    list2.set(list2.size() - 1, strCanonicalize$okhttp$default);
                        } else {
/* 70 */                    list2.add(strCanonicalize$okhttp$default);
                        }
/* 73 */                if (addTrailingSlash) {
/* 79 */                    this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
                        }
                    }

                    private final void removeAllCanonicalQueryParameters(String canonicalName) {
/* 1 */                 List<String> list = this.encodedQueryNamesAndValues;
/* 3 */                 list.getClass();
/* 10 */                int size = list.size() - 2;
/* 14 */                int iM5985v = k50.m5985v(size, 0, -2);
/* 18 */                if (iM5985v > size) {
/* 75 */                    return;
                        }
                        while (true) {
/* 20 */                    int i = size - 2;
/* 22 */                    List<String> list2 = this.encodedQueryNamesAndValues;
/* 24 */                    list2.getClass();
/* 35 */                    if (Intrinsics.m6216a(canonicalName, list2.get(size))) {
/* 37 */                        List<String> list3 = this.encodedQueryNamesAndValues;
/* 39 */                        list3.getClass();
/* 44 */                        list3.remove(size + 1);
/* 47 */                        List<String> list4 = this.encodedQueryNamesAndValues;
/* 49 */                        list4.getClass();
/* 52 */                        list4.remove(size);
/* 55 */                        List<String> list5 = this.encodedQueryNamesAndValues;
/* 57 */                        list5.getClass();
/* 64 */                        if (list5.isEmpty()) {
/* 67 */                            this.encodedQueryNamesAndValues = null;
/* 69 */                            return;
                                }
                            }
/* 70 */                    if (size == iM5985v) {
/* 75 */                        return;
                            } else {
/* 73 */                        size = i;
                            }
                        }
                    }

                    private final void resolvePath(String input, int startPos, int limit) {
/* 1 */                 if (startPos == limit) {
/* 75 */                    return;
                        }
/* 4 */                 char cCharAt = input.charAt(startPos);
/* 13 */                if (cCharAt == '/' || cCharAt == '\\') {
/* 33 */                    this.encodedPathSegments.clear();
/* 38 */                    this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
/* 41 */                    startPos++;
                        } else {
/* 20 */                    List<String> list = this.encodedPathSegments;
/* 27 */                    list.set(list.size() - 1, HttpUrl.FRAGMENT_ENCODE_SET);
                        }
/* 43 */                int i = startPos;
/* 44 */                while (i < limit) {
/* 48 */                    int iDelimiterOffset = Util.delimiterOffset(input, "/\\", i, limit);
/* 57 */                    boolean z = iDelimiterOffset < limit;
/* 59 */                    this = this;
/* 60 */                    input = input;
/* 61 */                    this.push(input, i, iDelimiterOffset, z, true);
/* 73 */                    i = z ? iDelimiterOffset + 1 : iDelimiterOffset;
                        }
                    }

                    public final Builder addEncodedPathSegment(String encodedPathSegment) {
/* 1 */                 encodedPathSegment.getClass();
/* 13 */                push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
/* 11 */                return this;
                    }

                    public final Builder addEncodedPathSegments(String encodedPathSegments) {
/* 1 */                 encodedPathSegments.getClass();
/* 5 */                 return addPathSegments(encodedPathSegments, true);
                    }

                    public final Builder addEncodedQueryParameter(String encodedName, String encodedValue) {
/* 1 */                 encodedName.getClass();
/* 8 */                 if (getEncodedQueryNamesAndValues$okhttp() == null) {
/* 15 */                    setEncodedQueryNamesAndValues$okhttp(new ArrayList());
                        }
/* 18 */                List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
/* 22 */                encodedQueryNamesAndValues$okhttp.getClass();
/* 25 */                Companion companion = HttpUrl.INSTANCE;
/* 44 */                encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
/* 47 */                List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
/* 51 */                encodedQueryNamesAndValues$okhttp2.getClass();
/* 75 */                encodedQueryNamesAndValues$okhttp2.add(encodedValue == null ? null : Companion.canonicalize$okhttp$default(companion, encodedValue, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
/* 78 */                return this;
                    }

                    public final Builder addPathSegment(String pathSegment) {
/* 1 */                 pathSegment.getClass();
/* 13 */                push(pathSegment, 0, pathSegment.length(), false, false);
/* 11 */                return this;
                    }

                    public final Builder addQueryParameter(String name, String value) {
/* 1 */                 name.getClass();
/* 8 */                 if (getEncodedQueryNamesAndValues$okhttp() == null) {
/* 15 */                    setEncodedQueryNamesAndValues$okhttp(new ArrayList());
                        }
/* 18 */                List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
/* 22 */                encodedQueryNamesAndValues$okhttp.getClass();
/* 25 */                Companion companion = HttpUrl.INSTANCE;
/* 44 */                encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
/* 47 */                List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
/* 51 */                encodedQueryNamesAndValues$okhttp2.getClass();
/* 75 */                encodedQueryNamesAndValues$okhttp2.add(value == null ? null : Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
/* 78 */                return this;
                    }

                    public final HttpUrl build() {
                        ArrayList arrayList;
/* 3 */                 String str = this.scheme;
/* 6 */                 if (str == null) {
/* 177 */                   f42.m3656l("scheme == null");
/* 5 */                     return null;
                        }
/* 8 */                 Companion companion = HttpUrl.INSTANCE;
/* 17 */                String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
/* 23 */                String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
/* 27 */                String str2 = this.host;
/* 29 */                if (str2 == null) {
/* 171 */                   f42.m3656l("host == null");
/* 5 */                     return null;
                        }
/* 31 */                int iEffectivePort = effectivePort();
/* 35 */                List<String> list = this.encodedPathSegments;
/* 45 */                ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(list, 10));
/* 48 */                Iterator<T> it = list.iterator();
/* 56 */                while (it.hasNext()) {
/* 78 */                    arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
                        }
/* 82 */                List<String> list2 = this.encodedQueryNamesAndValues;
/* 84 */                if (list2 == null) {
/* 86 */                    arrayList = null;
                        } else {
/* 94 */                    arrayList = new ArrayList(C2122qw.m8020h(list2, 10));
/* 105 */                   for (String str3 : list2) {
/* 131 */                       arrayList.add(str3 == null ? null : Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str3, 0, 0, true, 3, null));
                            }
                        }
/* 135 */               String str4 = this.encodedFragment;
/* 165 */               return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
                    }

                    public final Builder encodedFragment(String encodedFragment) {
/* 24 */                setEncodedFragment$okhttp(encodedFragment == null ? null : Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedFragment, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, true, false, false, true, null, 179, null));
/* 27 */                return this;
                    }

                    public final Builder encodedPassword(String encodedPassword) {
/* 1 */                 encodedPassword.getClass();
/* 23 */                setEncodedPassword$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
/* 26 */                return this;
                    }

                    public final Builder encodedPath(String encodedPath) {
/* 1 */                 encodedPath.getClass();
/* 11 */                if (C1852e.m6263m(encodedPath, "/", false)) {
/* 17 */                    resolvePath(encodedPath, 0, encodedPath.length());
/* 20 */                    return this;
                        }
/* 27 */                ds0.m3200q(Intrinsics.m6219d(encodedPath, "unexpected encodedPath: "));
/* 30 */                return null;
                    }

                    public final Builder encodedQuery(String encodedQuery) {
                        Companion companion;
                        String strCanonicalize$okhttp$default;
/* 1 */                 List<String> queryNamesAndValues$okhttp = null;
/* 2 */                 if (encodedQuery != null && (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.INSTANCE), encodedQuery, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null)) != null) {
/* 27 */                    queryNamesAndValues$okhttp = companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
                        }
/* 31 */                setEncodedQueryNamesAndValues$okhttp(queryNamesAndValues$okhttp);
/* 34 */                return this;
                    }

                    public final Builder encodedUsername(String encodedUsername) {
/* 1 */                 encodedUsername.getClass();
/* 23 */                setEncodedUsername$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
/* 26 */                return this;
                    }

                    public final Builder fragment(String fragment) {
/* 24 */                setEncodedFragment$okhttp(fragment == null ? null : Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, fragment, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, true, null, 187, null));
/* 27 */                return this;
                    }

                    /* JADX INFO: renamed from: getEncodedFragment$okhttp, reason: from getter */
                    public final String getEncodedFragment() {
/* 1 */                 return this.encodedFragment;
                    }

                    /* JADX INFO: renamed from: getEncodedPassword$okhttp, reason: from getter */
                    public final String getEncodedPassword() {
/* 1 */                 return this.encodedPassword;
                    }

                    public final List<String> getEncodedPathSegments$okhttp() {
/* 1 */                 return this.encodedPathSegments;
                    }

                    public final List<String> getEncodedQueryNamesAndValues$okhttp() {
/* 1 */                 return this.encodedQueryNamesAndValues;
                    }

                    /* JADX INFO: renamed from: getEncodedUsername$okhttp, reason: from getter */
                    public final String getEncodedUsername() {
/* 1 */                 return this.encodedUsername;
                    }

                    /* JADX INFO: renamed from: getHost$okhttp, reason: from getter */
                    public final String getHost() {
/* 1 */                 return this.host;
                    }

                    /* JADX INFO: renamed from: getPort$okhttp, reason: from getter */
                    public final int getPort() {
/* 1 */                 return this.port;
                    }

                    /* JADX INFO: renamed from: getScheme$okhttp, reason: from getter */
                    public final String getScheme() {
/* 1 */                 return this.scheme;
                    }

                    public final Builder host(String host) {
/* 1 */                 host.getClass();
/* 16 */                String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, host, 0, 0, false, 7, null));
/* 20 */                if (canonicalHost != null) {
/* 22 */                    setHost$okhttp(canonicalHost);
/* 25 */                    return this;
                        }
/* 32 */                C1951n4.m6859j(Intrinsics.m6219d(host, "unexpected host: "));
/* 35 */                return null;
                    }

                    public final Builder parse$okhttp(HttpUrl base, String input) {
                        int iDelimiterOffset;
                        int i;
                        boolean z;
                        int i2;
                        int i3;
                        int i4;
                        char c;
                        int i5;
/* 3 */                 String str = input;
/* 5 */                 str.getClass();
/* 10 */                Builder builder = null;
/* 11 */                int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str, 0, 0, 3, null);
/* 16 */                int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
/* 20 */                Companion companion = INSTANCE;
/* 1 */                 int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(str, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
/* 26 */                boolean z2 = true;
/* 27 */                int i6 = -1;
/* 28 */                if (iSchemeDelimiterOffset != -1) {
/* 36 */                    if (C1852e.m6262l(iIndexOfFirstNonAsciiWhitespace$default, str, "https:", true)) {
/* 40 */                        this.scheme = "https";
/* 42 */                        iIndexOfFirstNonAsciiWhitespace$default += 6;
                            } else {
/* 51 */                        if (!C1852e.m6262l(iIndexOfFirstNonAsciiWhitespace$default, str, "http:", true)) {
/* 88 */                            throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, iSchemeDelimiterOffset) + '\'');
                                }
/* 55 */                        this.scheme = "http";
/* 57 */                        iIndexOfFirstNonAsciiWhitespace$default += 5;
                            }
                        } else {
/* 89 */                    if (base == null) {
/* 594 */                       C1951n4.m6859j(Intrinsics.m6219d(str.length() > 6 ? Intrinsics.m6219d("...", di2.m3089y(6, str)) : str, "Expected URL scheme 'http' or 'https' but no scheme was found for "));
/* 10 */                        return null;
                            }
/* 95 */                    this.scheme = base.scheme();
                        }
/* 1 */                 int iSlashCount = companion.slashCount(str, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
/* 101 */               int i7 = 63;
/* 103 */               int i8 = 35;
/* 105 */               if (iSlashCount >= 2 || base == null || !Intrinsics.m6216a(base.scheme(), this.scheme)) {
/* 181 */                   int i9 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
/* 182 */                   boolean z3 = false;
/* 184 */                   boolean z4 = false;
                            while (true) {
/* 188 */                       iDelimiterOffset = Util.delimiterOffset(str, "@/\\?#", i9, iIndexOfLastNonAsciiWhitespace$default);
/* 199 */                       int iCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? str.charAt(iDelimiterOffset) : i6;
/* 200 */                       if (iCharAt == i6 || iCharAt == i8 || iCharAt == 47 || iCharAt == 92 || iCharAt == i7) {
                                    break;
                                }
/* 216 */                       if (iCharAt == 64) {
/* 221 */                           if (z3) {
/* 324 */                               z = z2;
/* 327 */                               i2 = i6;
/* 331 */                               StringBuilder sb = new StringBuilder();
/* 336 */                               sb.append(this.encodedPassword);
/* 339 */                               sb.append("%40");
/* 354 */                               str = input;
/* 360 */                               i3 = iDelimiterOffset;
/* 361 */                               sb.append(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str, i9, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
/* 368 */                               this.encodedPassword = sb.toString();
                                    } else {
/* 225 */                               int iDelimiterOffset2 = Util.delimiterOffset(str, ':', i9, iDelimiterOffset);
/* 230 */                               Companion companion2 = HttpUrl.INSTANCE;
/* 258 */                               i2 = i6;
/* 262 */                               z = z2;
/* 268 */                               String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str, i9, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
/* 272 */                               if (z4) {
/* 281 */                                   strCanonicalize$okhttp$default = fm0.m3790p(new StringBuilder(), this.encodedUsername, "%40", strCanonicalize$okhttp$default);
                                        }
/* 285 */                               this.encodedUsername = strCanonicalize$okhttp$default;
/* 287 */                               if (iDelimiterOffset2 != iDelimiterOffset) {
/* 303 */                                   i4 = iDelimiterOffset;
/* 308 */                                   this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, input, iDelimiterOffset2 + 1, i4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
/* 310 */                                   z3 = z;
                                        } else {
/* 313 */                                   i4 = iDelimiterOffset;
                                        }
/* 314 */                               str = input;
/* 316 */                               i3 = i4;
/* 317 */                               z4 = z;
                                    }
/* 370 */                           i9 = i3 + 1;
/* 372 */                           i6 = i2;
/* 373 */                           z2 = z;
/* 375 */                           iIndexOfLastNonAsciiWhitespace$default = iIndexOfLastNonAsciiWhitespace$default;
/* 377 */                           builder = builder;
/* 379 */                           i7 = 63;
/* 381 */                           i8 = 35;
                                }
                            }
/* 386 */                   Builder builder2 = builder;
/* 388 */                   i = iIndexOfLastNonAsciiWhitespace$default;
/* 392 */                   int i10 = i6;
/* 393 */                   Companion companion3 = INSTANCE;
/* 1 */                     int iPortColonOffset = companion3.portColonOffset(str, i9, iDelimiterOffset);
/* 399 */                   int i11 = iPortColonOffset + 1;
/* 401 */                   if (i11 < iDelimiterOffset) {
/* 416 */                       this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str, i9, iPortColonOffset, false, 4, null));
/* 1 */                         int port = companion3.parsePort(str, i11, iDelimiterOffset);
/* 422 */                       this.port = port;
/* 424 */                       if (port == i10) {
/* 433 */                           ds0.m3193j(str.substring(i11, iDelimiterOffset), "Invalid URL port: \"");
/* 436 */                           return builder2;
                                }
                            } else {
/* 437 */                       Companion companion4 = HttpUrl.INSTANCE;
/* 450 */                       this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str, i9, iPortColonOffset, false, 4, null));
/* 452 */                       String str2 = this.scheme;
/* 454 */                       str2.getClass();
/* 461 */                       this.port = companion4.defaultPort(str2);
                            }
/* 465 */                   if (this.host == null) {
/* 563 */                       ds0.m3193j(str.substring(i9, iPortColonOffset), "Invalid URL host: \"");
/* 566 */                       return builder2;
                            }
/* 467 */                   iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
                        } else {
/* 126 */                   this.encodedUsername = base.encodedUsername();
/* 132 */                   this.encodedPassword = base.encodedPassword();
/* 138 */                   this.host = base.host();
/* 144 */                   this.port = base.port();
/* 148 */                   this.encodedPathSegments.clear();
/* 157 */                   this.encodedPathSegments.addAll(base.encodedPathSegments());
/* 160 */                   if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || str.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
/* 172 */                       encodedQuery(base.encodedQuery());
                            }
/* 175 */                   i = iIndexOfLastNonAsciiWhitespace$default;
                        }
/* 470 */               int i12 = i;
/* 472 */               int iDelimiterOffset3 = Util.delimiterOffset(str, "?#", iIndexOfFirstNonAsciiWhitespace$default, i12);
/* 476 */               resolvePath(str, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
/* 479 */               if (iDelimiterOffset3 >= i12 || str.charAt(iDelimiterOffset3) != '?') {
/* 523 */                   c = '#';
/* 525 */                   i5 = iDelimiterOffset3;
                        } else {
/* 489 */                   c = '#';
/* 491 */                   int iDelimiterOffset4 = Util.delimiterOffset(str, '#', iDelimiterOffset3, i12);
/* 496 */                   Companion companion5 = HttpUrl.INSTANCE;
/* 518 */                   this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str, iDelimiterOffset3 + 1, iDelimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
/* 520 */                   i5 = iDelimiterOffset4;
                        }
/* 526 */               if (i5 < i12 && str.charAt(i5) == c) {
/* 554 */                   this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str, i5 + 1, i12, HttpUrl.FRAGMENT_ENCODE_SET, true, false, false, true, null, 176, null);
                        }
/* 1 */                 return this;
                    }

                    public final Builder password(String password) {
/* 1 */                 password.getClass();
/* 23 */                setEncodedPassword$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
/* 26 */                return this;
                    }

                    public final Builder port(int port) {
/* 2 */                 if (1 > port || port >= 65536) {
/* 22 */                    ds0.m3200q(Intrinsics.m6219d(Integer.valueOf(port), "unexpected port: "));
/* 25 */                    return null;
                        }
/* 8 */                 setPort$okhttp(port);
/* 11 */                return this;
                    }

                    public final Builder query(String query) {
                        Companion companion;
                        String strCanonicalize$okhttp$default;
/* 1 */                 List<String> queryNamesAndValues$okhttp = null;
/* 2 */                 if (query != null && (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.INSTANCE), query, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null)) != null) {
/* 27 */                    queryNamesAndValues$okhttp = companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
                        }
/* 31 */                setEncodedQueryNamesAndValues$okhttp(queryNamesAndValues$okhttp);
/* 34 */                return this;
                    }

                    public final Builder reencodeForUri$okhttp() {
/* 3 */                 String host = getHost();
/* 25 */                setHost$okhttp(host == null ? null : new Regex("[\"<>^`{|}]").replace(host, HttpUrl.FRAGMENT_ENCODE_SET));
/* 32 */                int size = getEncodedPathSegments$okhttp().size();
/* 36 */                int i = 0;
/* 38 */                for (int i2 = 0; i2 < size; i2++) {
/* 76 */                    getEncodedPathSegments$okhttp().set(i2, Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, getEncodedPathSegments$okhttp().get(i2), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
                        }
/* 81 */                List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
/* 85 */                if (encodedQueryNamesAndValues$okhttp != null) {
/* 87 */                    int size2 = encodedQueryNamesAndValues$okhttp.size();
/* 91 */                    while (i < size2) {
/* 93 */                        int i3 = i + 1;
/* 95 */                        String str = encodedQueryNamesAndValues$okhttp.get(i);
/* 126 */                       encodedQueryNamesAndValues$okhttp.set(i, str == null ? null : Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null));
/* 129 */                       i = i3;
                            }
                        }
/* 131 */               String encodedFragment = getEncodedFragment();
/* 158 */               setEncodedFragment$okhttp(encodedFragment != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedFragment, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null);
/* 1 */                 return this;
                    }

                    public final Builder removeAllEncodedQueryParameters(String encodedName) {
/* 1 */                 encodedName.getClass();
/* 8 */                 if (getEncodedQueryNamesAndValues$okhttp() == null) {
/* 10 */                    return this;
                        }
/* 30 */                removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
/* 33 */                return this;
                    }

                    public final Builder removeAllQueryParameters(String name) {
/* 1 */                 name.getClass();
/* 8 */                 if (getEncodedQueryNamesAndValues$okhttp() == null) {
/* 10 */                    return this;
                        }
/* 30 */                removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
/* 33 */                return this;
                    }

                    public final Builder removePathSegment(int index) {
/* 5 */                 getEncodedPathSegments$okhttp().remove(index);
/* 16 */                if (getEncodedPathSegments$okhttp().isEmpty()) {
/* 24 */                    getEncodedPathSegments$okhttp().add(HttpUrl.FRAGMENT_ENCODE_SET);
                        }
/* 27 */                return this;
                    }

                    public final Builder scheme(String scheme) {
/* 1 */                 scheme.getClass();
/* 10 */                if (scheme.equalsIgnoreCase("http")) {
/* 12 */                    setScheme$okhttp("http");
/* 15 */                    return this;
                        }
/* 22 */                if (scheme.equalsIgnoreCase("https")) {
/* 24 */                    setScheme$okhttp("https");
/* 27 */                    return this;
                        }
/* 34 */                C1951n4.m6859j(Intrinsics.m6219d(scheme, "unexpected scheme: "));
/* 37 */                return null;
                    }

                    public final void setEncodedFragment$okhttp(String str) {
/* 1 */                 this.encodedFragment = str;
                    }

                    public final void setEncodedPassword$okhttp(String str) {
/* 1 */                 str.getClass();
/* 4 */                 this.encodedPassword = str;
                    }

                    public final Builder setEncodedPathSegment(int index, String encodedPathSegment) {
/* 1 */                 encodedPathSegment.getClass();
/* 19 */                String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
/* 27 */                getEncodedPathSegments$okhttp().set(index, strCanonicalize$okhttp$default);
/* 34 */                if (!isDot(strCanonicalize$okhttp$default) && !isDotDot(strCanonicalize$okhttp$default)) {
/* 42 */                    return this;
                        }
/* 49 */                ds0.m3200q(Intrinsics.m6219d(encodedPathSegment, "unexpected path segment: "));
/* 52 */                return null;
                    }

                    public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
/* 1 */                 this.encodedQueryNamesAndValues = list;
                    }

                    public final Builder setEncodedQueryParameter(String encodedName, String encodedValue) {
/* 1 */                 encodedName.getClass();
/* 4 */                 removeAllEncodedQueryParameters(encodedName);
/* 7 */                 addEncodedQueryParameter(encodedName, encodedValue);
/* 10 */                return this;
                    }

                    public final void setEncodedUsername$okhttp(String str) {
/* 1 */                 str.getClass();
/* 4 */                 this.encodedUsername = str;
                    }

                    public final void setHost$okhttp(String str) {
/* 1 */                 this.host = str;
                    }

                    public final Builder setPathSegment(int index, String pathSegment) {
/* 1 */                 pathSegment.getClass();
/* 19 */                String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
/* 27 */                if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
/* 49 */                    ds0.m3200q(Intrinsics.m6219d(pathSegment, "unexpected path segment: "));
/* 52 */                    return null;
                        }
/* 39 */                getEncodedPathSegments$okhttp().set(index, strCanonicalize$okhttp$default);
/* 42 */                return this;
                    }

                    public final void setPort$okhttp(int i) {
/* 1 */                 this.port = i;
                    }

                    public final Builder setQueryParameter(String name, String value) {
/* 1 */                 name.getClass();
/* 4 */                 removeAllQueryParameters(name);
/* 7 */                 addQueryParameter(name, value);
/* 10 */                return this;
                    }

                    public final void setScheme$okhttp(String str) {
/* 1 */                 this.scheme = str;
                    }

                    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
                    public String toString() {
/* 3 */                 StringBuilder sb = new StringBuilder();
/* 10 */                if (getScheme() != null) {
/* 16 */                    sb.append(getScheme());
/* 21 */                    sb.append("://");
                        } else {
/* 27 */                    sb.append("//");
                        }
/* 40 */                if (getEncodedUsername().length() > 0 || getEncodedPassword().length() > 0) {
/* 57 */                    sb.append(getEncodedUsername());
/* 68 */                    if (getEncodedPassword().length() > 0) {
/* 70 */                        sb.append(':');
/* 77 */                        sb.append(getEncodedPassword());
                            }
/* 82 */                    sb.append('@');
                        }
/* 89 */                if (getHost() != null) {
/* 91 */                    String host = getHost();
/* 95 */                    host.getClass();
/* 102 */                   if (StringsKt.m6225A(host, ':')) {
/* 106 */                       sb.append('[');
/* 113 */                       sb.append(getHost());
/* 118 */                       sb.append(']');
                            } else {
/* 126 */                       sb.append(getHost());
                            }
                        }
/* 134 */               if (getPort() != -1 || getScheme() != null) {
/* 142 */                   int iEffectivePort = effectivePort();
/* 150 */                   if (getScheme() != null) {
/* 152 */                       Companion companion = HttpUrl.INSTANCE;
/* 154 */                       String scheme = getScheme();
/* 158 */                       scheme.getClass();
/* 165 */                       if (iEffectivePort != companion.defaultPort(scheme)) {
/* 167 */                           sb.append(':');
/* 170 */                           sb.append(iEffectivePort);
                                }
                            } else {
/* 167 */                       sb.append(':');
/* 170 */                       sb.append(iEffectivePort);
                            }
                        }
/* 173 */               Companion companion2 = HttpUrl.INSTANCE;
/* 179 */               companion2.toPathString$okhttp(getEncodedPathSegments$okhttp(), sb);
/* 186 */               if (getEncodedQueryNamesAndValues$okhttp() != null) {
/* 190 */                   sb.append('?');
/* 193 */                   List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
/* 197 */                   encodedQueryNamesAndValues$okhttp.getClass();
/* 200 */                   companion2.toQueryString$okhttp(encodedQueryNamesAndValues$okhttp, sb);
                        }
/* 207 */               if (getEncodedFragment() != null) {
/* 211 */                   sb.append('#');
/* 218 */                   sb.append(getEncodedFragment());
                        }
/* 221 */               return sb.toString();
                    }

                    public final Builder username(String username) {
/* 1 */                 username.getClass();
/* 23 */                setEncodedUsername$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
/* 26 */                return this;
                    }

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    @Metadata(m6175d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, m6176d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "INVALID_HOST", HttpUrl.FRAGMENT_ENCODE_SET, "parsePort", HttpUrl.FRAGMENT_ENCODE_SET, "input", "pos", "limit", "portColonOffset", "schemeDelimiterOffset", "slashCount", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */             public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                     this();
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public final int parsePort(String input, int pos, int limit) {
                            try {
/* 21 */                        int i = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, pos, limit, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, false, null, 248, null));
/* 26 */                        if (1 > i || i >= 65536) {
/* 1 */                             return -1;
                                }
/* 32 */                        return i;
                            } catch (NumberFormatException unused) {
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public final int portColonOffset(String input, int pos, int limit) {
/* 1 */                     while (pos < limit) {
/* 3 */                         char cCharAt = input.charAt(pos);
/* 9 */                         if (cCharAt == '[') {
/* 21 */                            do {
/* 11 */                                pos++;
/* 13 */                                if (pos >= limit) {
                                            break;
                                        }
/* 21 */                            } while (input.charAt(pos) != ']');
                                } else if (cCharAt == ':') {
/* 28 */                            return pos;
                                }
/* 29 */                        pos++;
                            }
/* 32 */                    return limit;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public final int schemeDelimiterOffset(String input, int pos, int limit) {
/* 5 */                     if (limit - pos < 2) {
/* 4 */                         return -1;
                            }
/* 8 */                     char cCharAt = input.charAt(pos);
/* 20 */                    if ((Intrinsics.m6217b(cCharAt, 97) >= 0 && Intrinsics.m6217b(cCharAt, 122) <= 0) || (Intrinsics.m6217b(cCharAt, 65) >= 0 && Intrinsics.m6217b(cCharAt, 90) <= 0)) {
/* 45 */                        int i = pos + 1;
/* 47 */                        while (i < limit) {
/* 49 */                            int i2 = i + 1;
/* 51 */                            char cCharAt2 = input.charAt(i);
/* 55 */                            if (('a' <= cCharAt2 && cCharAt2 < '{') || (('A' <= cCharAt2 && cCharAt2 < '[') || (('0' <= cCharAt2 && cCharAt2 < ':') || cCharAt2 == '+' || cCharAt2 == '-' || cCharAt2 == '.'))) {
/* 92 */                                i = i2;
                                    } else if (cCharAt2 == ':') {
/* 96 */                                return i;
                                    }
                                }
                            }
/* 4 */                     return -1;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public final int slashCount(String str, int i, int i2) {
/* 1 */                     int i3 = 0;
/* 2 */                     while (i < i2) {
/* 4 */                         int i4 = i + 1;
/* 6 */                         char cCharAt = str.charAt(i);
/* 12 */                        if (cCharAt != '\\' && cCharAt != '/') {
                                    break;
                                }
/* 18 */                        i3++;
/* 20 */                        i = i4;
                            }
/* 22 */                    return i3;
                        }

/* 4 */                 private Companion() {
                        }
                    }

/* 44 */            public final Builder addPathSegments(String pathSegments) {
                        pathSegments.getClass();
/* 45 */                return addPathSegments(pathSegments, false);
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\b\u0018J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u001cJa\u0010\u001d\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0002\b(J\u001c\u0010)\u001a\u00020\"*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J/\u0010*\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\"H\u0000¢\u0006\u0002\b+J\u0011\u0010,\u001a\u00020\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0017H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u001aH\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u001bJ#\u0010.\u001a\u00020/*\b\u0012\u0004\u0012\u00020\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b4J\u0019\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000406*\u00020\u0004H\u0000¢\u0006\u0002\b7J%\u00108\u001a\u00020/*\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b9JV\u0010:\u001a\u00020/*\u00020;2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J,\u0010=\u001a\u00020/*\u00020;2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006?"}, m6176d2 = {"Lokhttp3/HttpUrl$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "FORM_ENCODE_SET", HttpUrl.FRAGMENT_ENCODE_SET, "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "HEX_DIGITS", HttpUrl.FRAGMENT_ENCODE_SET, "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "defaultPort", HttpUrl.FRAGMENT_ENCODE_SET, "scheme", "get", "Lokhttp3/HttpUrl;", "uri", "Ljava/net/URI;", "-deprecated_get", "url", "Ljava/net/URL;", "parse", "-deprecated_parse", "canonicalize", "pos", "limit", "encodeSet", "alreadyEncoded", HttpUrl.FRAGMENT_ENCODE_SET, "strict", "plusIsSpace", "unicodeAllowed", "charset", "Ljava/nio/charset/Charset;", "canonicalize$okhttp", "isPercentEncoded", "percentDecode", "percentDecode$okhttp", "toHttpUrl", "toHttpUrlOrNull", "toPathString", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "out", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "toPathString$okhttp", "toQueryNamesAndValues", HttpUrl.FRAGMENT_ENCODE_SET, "toQueryNamesAndValues$okhttp", "toQueryString", "toQueryString$okhttp", "writeCanonicalized", "Lokio/Buffer;", "input", "writePercentDecoded", "encoded", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
                        if ((i3 & 1) != 0) {
                            i = 0;
                        }
                        if ((i3 & 2) != 0) {
/* 1 */                     i2 = str.length();
                        }
                        if ((i3 & 8) != 0) {
                            z = false;
                        }
                        if ((i3 & 16) != 0) {
                            z2 = false;
                        }
                        if ((i3 & 32) != 0) {
                            z3 = false;
                        }
                        if ((i3 & 64) != 0) {
                            z4 = false;
                        }
                        if ((i3 & 128) != 0) {
                            charset = null;
                        }
/* 2 */                 return companion.canonicalize$okhttp(str, i, i2, str2, z, z2, z3, z4, charset);
                    }

                    private final boolean isPercentEncoded(String str, int i, int i2) {
/* 1 */                 int i3 = i + 2;
                        return i3 < i2 && str.charAt(i) == '%' && Util.parseHexDigit(str.charAt(i + 1)) != -1 && Util.parseHexDigit(str.charAt(i3)) != -1;
                    }

                    public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
/* 4 */                 if ((i3 & 1) != 0) {
/* 6 */                     i = 0;
                        }
/* 9 */                 if ((i3 & 2) != 0) {
/* 11 */                    i2 = str.length();
                        }
/* 17 */                if ((i3 & 4) != 0) {
/* 19 */                    z = false;
                        }
/* 20 */                return companion.percentDecode$okhttp(str, i, i2, z);
                    }

                    private final void writeCanonicalized(Buffer buffer, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
                        Buffer buffer2 = null;
                        while (i < i2) {
/* 1 */                     int iCodePointAt = str.codePointAt(i);
                            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                                if (iCodePointAt == 43 && z3) {
/* 2 */                             buffer.writeUtf8(z ? "+" : "%2B");
                                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || StringsKt.m6225A(str2, (char) iCodePointAt) || (iCodePointAt == 37 && (!z || (z2 && !isPercentEncoded(str, i, i2)))))) {
                                    if (buffer2 == null) {
/* 6 */                                 buffer2 = new Buffer();
                                    }
/* 8 */                             if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
/* 10 */                                buffer2.writeUtf8CodePoint(iCodePointAt);
                                    } else {
/* 9 */                                 buffer2.writeString(str, i, Character.charCount(iCodePointAt) + i, charset);
                                    }
/* 11 */                            while (!buffer2.exhausted()) {
/* 12 */                                byte b = buffer2.readByte();
/* 13 */                                buffer.writeByte(37);
/* 1 */                                 buffer.writeByte((int) HttpUrl.HEX_DIGITS[((b & 255) >> 4) & 15]);
/* 1 */                                 buffer.writeByte((int) HttpUrl.HEX_DIGITS[b & 15]);
                                    }
                                } else {
/* 5 */                             buffer.writeUtf8CodePoint(iCodePointAt);
                                }
                            }
/* 16 */                    i += Character.charCount(iCodePointAt);
                        }
                    }

                    private final void writePercentDecoded(Buffer buffer, String str, int i, int i2, boolean z) {
                        int i3;
/* 1 */                 while (i < i2) {
/* 3 */                     int iCodePointAt = str.codePointAt(i);
/* 9 */                     if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
/* 21 */                        int hexDigit = Util.parseHexDigit(str.charAt(i + 1));
/* 29 */                        int hexDigit2 = Util.parseHexDigit(str.charAt(i3));
/* 34 */                        if (hexDigit == -1 || hexDigit2 == -1) {
/* 65 */                            buffer.writeUtf8CodePoint(iCodePointAt);
/* 72 */                            i += Character.charCount(iCodePointAt);
                                } else {
/* 41 */                            buffer.writeByte((hexDigit << 4) + hexDigit2);
/* 48 */                            i = Character.charCount(iCodePointAt) + i3;
                                }
                            } else if (iCodePointAt == 43 && z) {
/* 59 */                        buffer.writeByte(32);
/* 62 */                        i++;
                            } else {
/* 65 */                        buffer.writeUtf8CodePoint(iCodePointAt);
/* 72 */                        i += Character.charCount(iCodePointAt);
                            }
                        }
                    }

                    /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
                    public final HttpUrl m10570deprecated_get(String url) {
/* 1 */                 url.getClass();
/* 4 */                 return get(url);
                    }

                    /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
                    public final HttpUrl m10573deprecated_parse(String url) {
/* 1 */                 url.getClass();
/* 4 */                 return parse(url);
                    }

                    public final String canonicalize$okhttp(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) throws EOFException {
/* 1 */                 str.getClass();
/* 4 */                 str2.getClass();
/* 7 */                 int iCharCount = i;
/* 8 */                 while (iCharCount < i2) {
/* 10 */                    int iCodePointAt = str.codePointAt(iCharCount);
/* 16 */                    if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || StringsKt.m6225A(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !isPercentEncoded(str, iCharCount, i2)))) || (iCodePointAt == 43 && z3)))) {
/* 64 */                        Buffer buffer = new Buffer();
/* 67 */                        buffer.writeUtf8(str, i, iCharCount);
/* 84 */                        writeCanonicalized(buffer, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
/* 87 */                        return buffer.readUtf8();
                            }
/* 60 */                    iCharCount += Character.charCount(iCodePointAt);
                        }
/* 92 */                return str.substring(i, i2);
                    }

                    public final int defaultPort(String scheme) {
/* 1 */                 scheme.getClass();
/* 10 */                if (Intrinsics.m6216a(scheme, "http")) {
/* 12 */                    return 80;
                        }
                        return Intrinsics.m6216a(scheme, "https") ? 443 : -1;
                    }

                    public final HttpUrl get(String str) {
/* 1 */                 str.getClass();
/* 14 */                return new Builder().parse$okhttp(null, str).build();
                    }

                    public final HttpUrl parse(String str) {
/* 1 */                 str.getClass();
                        try {
/* 4 */                     return get(str);
                        } catch (IllegalArgumentException unused) {
/* 9 */                     return null;
                        }
                    }

                    public final String percentDecode$okhttp(String str, int i, int i2, boolean z) {
/* 1 */                 str.getClass();
/* 4 */                 int i3 = i;
/* 5 */                 while (i3 < i2) {
/* 7 */                     int i4 = i3 + 1;
/* 9 */                     char cCharAt = str.charAt(i3);
/* 15 */                    if (cCharAt == '%' || (cCharAt == '+' && z)) {
/* 28 */                        Buffer buffer = new Buffer();
/* 31 */                        buffer.writeUtf8(str, i, i3);
/* 38 */                        writePercentDecoded(buffer, str, i3, i2, z);
/* 41 */                        return buffer.readUtf8();
                            }
/* 24 */                    i3 = i4;
                        }
/* 48 */                return str.substring(i, i2);
                    }

                    public final void toPathString$okhttp(List<String> list, StringBuilder sb) {
/* 1 */                 list.getClass();
/* 4 */                 sb.getClass();
/* 7 */                 int size = list.size();
/* 12 */                for (int i = 0; i < size; i++) {
/* 18 */                    sb.append('/');
/* 27 */                    sb.append(list.get(i));
                        }
                    }

                    public final List<String> toQueryNamesAndValues$okhttp(String str) {
/* 1 */                 str.getClass();
/* 6 */                 ArrayList arrayList = new ArrayList();
/* 9 */                 int i = 0;
/* 14 */                while (i <= str.length()) {
/* 19 */                    int iM6226B = StringsKt.m6226B(str, '&', i, 4);
/* 24 */                    if (iM6226B == -1) {
/* 26 */                        iM6226B = str.length();
                            }
/* 32 */                    int iM6226B2 = StringsKt.m6226B(str, '=', i, 4);
/* 36 */                    if (iM6226B2 == -1 || iM6226B2 > iM6226B) {
/* 62 */                        arrayList.add(str.substring(i, iM6226B));
/* 66 */                        arrayList.add(null);
                            } else {
/* 45 */                        arrayList.add(str.substring(i, iM6226B2));
/* 54 */                        arrayList.add(str.substring(iM6226B2 + 1, iM6226B));
                            }
/* 69 */                    i = iM6226B + 1;
                        }
/* 72 */                return arrayList;
                    }

                    public final void toQueryString$okhttp(List<String> list, StringBuilder sb) {
/* 1 */                 list.getClass();
/* 4 */                 sb.getClass();
/* 17 */                C1847a c1847aM8047d = r02.m8047d(r02.m8048e(0, list.size()), 2);
/* 21 */                int i = c1847aM8047d.f12926a;
/* 23 */                int i2 = c1847aM8047d.f12927b;
/* 25 */                int i3 = c1847aM8047d.f12928c;
/* 27 */                if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
/* 76 */                    return;
                        }
                        while (true) {
/* 35 */                    int i4 = i + i3;
/* 37 */                    String str = list.get(i);
/* 45 */                    String str2 = list.get(i + 1);
/* 51 */                    if (i > 0) {
/* 55 */                        sb.append('&');
                            }
/* 58 */                    sb.append(str);
/* 61 */                    if (str2 != null) {
/* 65 */                        sb.append('=');
/* 68 */                        sb.append(str2);
                            }
/* 71 */                    if (i == i2) {
/* 76 */                        return;
                            } else {
/* 74 */                        i = i4;
                            }
                        }
                    }

/* 4 */             private Companion() {
                    }

                    /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
/* 8 */             public final HttpUrl m10572deprecated_get(URL url) {
                        url.getClass();
/* 9 */                 return get(url);
                    }

                    /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
/* 9 */             public final HttpUrl m10571deprecated_get(URI uri) {
                        uri.getClass();
/* 10 */                return get(uri);
                    }

/* 18 */            public final HttpUrl get(URL url) {
                        url.getClass();
/* 19 */                String string = url.toString();
                        string.getClass();
                        return parse(string);
                    }

/* 19 */            public final HttpUrl get(URI uri) {
                        uri.getClass();
/* 20 */                String string = uri.toString();
                        string.getClass();
                        return parse(string);
                    }
                }

/* 7 */         public static final HttpUrl get(URI uri) {
/* 8 */             return INSTANCE.get(uri);
                }

/* 8 */         public static final HttpUrl get(URL url) {
/* 9 */             return INSTANCE.get(url);
                }

/* 81 */        public final Builder newBuilder(String link) {
                    link.getClass();
                    try {
/* 82 */                return new Builder().parse$okhttp(this, link);
                    } catch (IllegalArgumentException unused) {
                        return null;
                    }
                }
            }
