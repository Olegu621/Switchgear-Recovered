            package p000;

            import java.io.FileNotFoundException;
            import java.io.InputStream;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.net.URLConnection;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import kotlin.Pair;
            import kotlin.collections.CollectionsKt;
            import kotlin.text.Charsets;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: g8 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0945g8 {

                /* JADX INFO: renamed from: a */
                public final long f8510a;

                /* JADX INFO: renamed from: b */
                public final x80 f8511b;

                /* JADX INFO: renamed from: c */
                public final Charset f8512c;

                /* JADX INFO: renamed from: d */
                public final String f8513d;

                public C0945g8(long j, x80 x80Var) {
/* 4 */             this.f8510a = j;
/* 6 */             this.f8511b = x80Var;
/* 8 */             Charset charset = Charsets.UTF_8;
/* 10 */            this.f8512c = charset;
/* 22 */            this.f8513d = AbstractC0886en.m3507k("application/json; charset=", charset.name());
                }

                /* JADX INFO: renamed from: b */
                public static InputStream m3883b(HttpURLConnection httpURLConnection) {
/* 17 */            InputStream inputStream = httpURLConnection.getResponseCode() < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
/* 13 */            inputStream.getClass();
/* 16 */            return inputStream;
                }

                /* JADX INFO: renamed from: c */
                public static Map m3884c(Map map) {
                    String lowerCase;
/* 7 */             ArrayList arrayList = new ArrayList(map.size());
/* 22 */            for (Map.Entry entry : map.entrySet()) {
/* 34 */                String str = (String) entry.getKey();
/* 36 */                String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 38 */                if (str != null) {
/* 42 */                    lowerCase = str.toLowerCase(Locale.ROOT);
/* 46 */                    lowerCase.getClass();
                        } else {
/* 50 */                    lowerCase = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 61 */                String str3 = (String) CollectionsKt.firstOrNull((List) entry.getValue());
/* 63 */                if (str3 != null) {
/* 66 */                    str2 = str3;
                        }
/* 72 */                arrayList.add(new Pair(lowerCase, str2));
                    }
/* 76 */            return oc1.m7133g(arrayList);
                }

                /* JADX INFO: renamed from: d */
                public static zu0 m3885d(HttpURLConnection httpURLConnection) {
                    zu0 zu0Var;
                    try {
/* 1 */                 httpURLConnection.connect();
/* 4 */                 Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
/* 8 */                 headerFields.getClass();
/* 36 */                zu0Var = new zu0(httpURLConnection.getResponseCode(), new String(b40.m1210A(m3883b(httpURLConnection)), Charsets.UTF_8), m3884c(headerFields));
                        try {
/* 39 */                    m42 m42Var = o42.f14612b;
/* 45 */                    m3883b(httpURLConnection).close();
                        } catch (Throwable unused) {
                        }
                    } catch (FileNotFoundException unused2) {
/* 62 */                od0 od0Var = od0.f14715a;
/* 64 */                od0Var.getClass();
/* 71 */                zu0Var = new zu0(403, HttpUrl.FRAGMENT_ENCODE_SET, od0Var);
                        try {
/* 74 */                    m42 m42Var2 = o42.f14612b;
/* 80 */                    m3883b(httpURLConnection).close();
                        } catch (Throwable unused3) {
                        }
                    } finally {
                        try {
/* 88 */                    m42 m42Var3 = o42.f14612b;
/* 94 */                    m3883b(httpURLConnection).close();
                        } catch (Throwable unused4) {
/* 98 */                    m42 m42Var4 = o42.f14612b;
                        }
                        try {
/* 100 */                   httpURLConnection.disconnect();
                        } catch (Throwable unused5) {
/* 104 */                   m42 m42Var5 = o42.f14612b;
                        }
                    }
                    try {
/* 51 */                httpURLConnection.disconnect();
                    } catch (Throwable unused6) {
/* 55 */                m42 m42Var6 = o42.f14612b;
                    }
/* 87 */            return zu0Var;
                }

                /* JADX INFO: renamed from: a */
                public final HttpURLConnection m3886a(String str, LinkedHashMap linkedHashMap) {
/* 6 */             URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
/* 10 */            uRLConnectionOpenConnection.getClass();
/* 13 */            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
/* 17 */            int i = (int) this.f8510a;
/* 18 */            httpURLConnection.setConnectTimeout(i);
/* 21 */            httpURLConnection.setReadTimeout(i);
/* 36 */            for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 56 */                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
/* 64 */            httpURLConnection.setRequestProperty("Accept", this.f8513d);
/* 67 */            return httpURLConnection;
                }
            }
