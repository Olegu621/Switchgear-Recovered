            package p000;

            import android.util.Log;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mr0 {

                /* JADX INFO: renamed from: a */
                public final String f13983a;

                /* JADX INFO: renamed from: b */
                public final String f13984b;

                public mr0(String str, String str2) {
/* 14 */            Object[] objArr = {str, 23};
/* 23 */            if (!(str.length() <= 23)) {
/* 51 */                throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
                    }
/* 25 */            this.f13983a = str;
/* 37 */            this.f13984b = (str2 == null || str2.length() <= 0) ? null : str2;
                }

                /* JADX INFO: renamed from: a */
                public final void m6794a(String str, String str2) {
/* 8 */             if (Log.isLoggable(this.f13983a, 6)) {
/* 14 */                AbstractC1245n0.m4876d(str, m6796c(str2));
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m6795b(String str, Object... objArr) {
/* 1 */             String str2 = this.f13983a;
/* 8 */             if (Log.isLoggable(str2, 5)) {
/* 10 */                String strConcat = String.format(str, objArr);
/* 14 */                String str3 = this.f13984b;
/* 16 */                if (str3 != null) {
/* 19 */                    strConcat = str3.concat(strConcat);
                        }
/* 23 */                AbstractC1245n0.m4889q(str2, strConcat);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final String m6796c(String str) {
/* 1 */             String str2 = this.f13984b;
                    return str2 == null ? str : str2.concat(str);
                }
            }
