            package p000;

            import android.util.Log;
            import java.util.Locale;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ha1 {

                /* JADX INFO: renamed from: a */
                public final String f8983a;

                /* JADX INFO: renamed from: b */
                public final String f8984b;

                /* JADX INFO: renamed from: c */
                public final int f8985c;

                public ha1(String str, String... strArr) {
                    String string;
/* 4 */             if (strArr.length == 0) {
/* 6 */                 string = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 11 */                StringBuilder sb = new StringBuilder();
/* 16 */                sb.append('[');
/* 20 */                for (String str2 : strArr) {
/* 28 */                    if (sb.length() > 1) {
/* 32 */                        sb.append(",");
                            }
/* 35 */                    sb.append(str2);
                        }
/* 43 */                sb.append("] ");
/* 46 */                string = sb.toString();
                    }
/* 53 */            this.f8984b = string;
/* 55 */            this.f8983a = str;
/* 57 */            int length = str.length();
/* 67 */            Object[] objArr = {str, 23};
/* 74 */            if (!(length <= 23)) {
/* 105 */               throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
                    }
/* 76 */            int i = 2;
/* 78 */            while (i <= 7 && !Log.isLoggable(this.f8983a, i)) {
/* 88 */                i++;
                    }
/* 91 */            this.f8985c = i;
                }

                /* JADX INFO: renamed from: a */
                public final String m4137a(String str, Object... objArr) {
/* 2 */             if (objArr.length > 0) {
/* 6 */                 str = String.format(Locale.US, str, objArr);
                    }
/* 12 */            return this.f8984b.concat(str);
                }
            }
