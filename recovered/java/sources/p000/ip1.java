            package p000;

            import android.net.Uri;
            import android.os.Build;
            import java.util.Arrays;
            import java.util.Map;
            import java.util.concurrent.TimeUnit;
            import javax.net.ssl.X509TrustManager;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.CookieJar;
            import okhttp3.MediaType;
            import okhttp3.OkHttpClient;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ip1 implements um1 {

                /* JADX INFO: renamed from: i */
                public static final String f11882i = String.format("snowplow/%s android/%s", Arrays.copyOf(new Object[]{"andr-6.0.6", Build.VERSION.RELEASE}, 2));

                /* JADX INFO: renamed from: a */
                public final String f11883a = ip1.class.getSimpleName();

                /* JADX INFO: renamed from: b */
                public final MediaType f11884b = MediaType.INSTANCE.parse("application/json; charset=utf-8");

                /* JADX INFO: renamed from: c */
                public final int f11885c;

                /* JADX INFO: renamed from: d */
                public final int f11886d;

                /* JADX INFO: renamed from: e */
                public boolean f11887e;

                /* JADX INFO: renamed from: f */
                public final Map f11888f;

                /* JADX INFO: renamed from: g */
                public final OkHttpClient f11889g;

                /* JADX INFO: renamed from: h */
                public final Uri.Builder f11890h;

                public ip1(hp1 hp1Var) {
                    String scheme;
                    int iHashCode;
/* 22 */            String strM3507k = hp1Var.f9173a;
/* 24 */            Uri uri = Uri.parse(strM3507k);
/* 34 */            if (uri.getScheme() == null || (scheme = uri.getScheme()) == null || ((iHashCode = scheme.hashCode()) == 3213448 ? !scheme.equals("http") : !(iHashCode == 99617003 && scheme.equals("https")))) {
/* 36 */                strM3507k = AbstractC0886en.m3507k("https://", strM3507k);
                    }
/* 80 */            int i = hp1Var.f9175c;
/* 82 */            this.f11885c = i;
/* 86 */            this.f11886d = hp1Var.f9177e;
/* 88 */            String str = hp1Var.f9180h;
/* 92 */            this.f11887e = hp1Var.f9181i;
/* 96 */            this.f11888f = hp1Var.f9182j;
/* 102 */           ac1 ac1Var = new ac1(hp1Var.f9176d);
/* 109 */           Uri.Builder builderBuildUpon = Uri.parse(strM3507k).buildUpon();
/* 113 */           builderBuildUpon.getClass();
/* 116 */           this.f11890h = builderBuildUpon;
/* 119 */           if (i == 1) {
/* 123 */               builderBuildUpon.appendPath("i");
                    } else if (str == null) {
/* 131 */               builderBuildUpon.appendEncodedPath("com.snowplowanalytics.snowplow/tp2");
                    } else {
/* 135 */               builderBuildUpon.appendEncodedPath(str);
                    }
/* 138 */           OkHttpClient okHttpClientBuild = hp1Var.f9178f;
/* 140 */           if (okHttpClientBuild == null) {
/* 144 */               OkHttpClient.Builder builder = new OkHttpClient.Builder();
/* 149 */               am2 am2Var = (am2) ac1Var.f179d;
/* 152 */               if (am2Var == null) {
/* 206 */                   Intrinsics.m6220e("sslSocketFactory");
/* 209 */                   throw null;
                        }
/* 156 */               X509TrustManager x509TrustManager = (X509TrustManager) ac1Var.f178c;
/* 158 */               if (x509TrustManager == null) {
/* 200 */                   Intrinsics.m6220e("trustManager");
/* 203 */                   throw null;
                        }
/* 160 */               OkHttpClient.Builder builderSslSocketFactory = builder.sslSocketFactory(am2Var, x509TrustManager);
/* 166 */               TimeUnit timeUnit = TimeUnit.SECONDS;
/* 172 */               OkHttpClient.Builder timeout = builderSslSocketFactory.connectTimeout(15L, timeUnit).readTimeout(15L, timeUnit);
/* 176 */               CookieJar cookieJar = hp1Var.f9179g;
/* 193 */               okHttpClientBuild = timeout.cookieJar(cookieJar == null ? new C0210cb(hp1Var.f9174b, 25) : cookieJar).build();
                    }
/* 210 */           this.f11889g = okHttpClientBuild;
                }
            }
