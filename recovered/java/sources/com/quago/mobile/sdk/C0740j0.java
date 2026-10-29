            package com.quago.mobile.sdk;

            import android.util.Log;
            import com.quago.mobile.sdk.utils.IQuagoLog;
            import java.util.Locale;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.j0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 43 */    public final class C0740j0 {

                /* JADX INFO: renamed from: a */
                public final String f5495a;

                public C0740j0(String str) {
/* 4 */             this.f5495a = str;
                }

                /* JADX INFO: renamed from: a */
                public final void m2610a(int i, String str, String str2, Throwable th, Object... objArr) {
                    String str3;
/* 2 */             if (i != 5) {
/* 10 */                str3 = i != 6 ? "%s.%s() → %s" : "%s.%s() → [!] Error : %s";
                    } else {
/* 13 */                str3 = "%s.%s() → [!] Warning : %s";
                    }
/* 15 */            Locale locale = AbstractC0743k0.f5509a;
/* 27 */            String str4 = String.format(locale, str3, this.f5495a, str, String.format(locale, str2, objArr));
/* 31 */            IQuagoLog iQuagoLog = AbstractC0743k0.f5511c;
/* 35 */            if (iQuagoLog != null) {
/* 37 */                iQuagoLog.onLog(i, "QUAGO-SDK", str4, th);
                    } else {
/* 41 */                Log.println(i, "QUAGO-SDK", str4);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m2613b(String str, String str2, Object... objArr) {
/* 6 */             if (AbstractC0743k0.m2621a(6)) {
/* 15 */                m2610a(6, str, str2, null, objArr);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m2614c(String str, String str2, Object... objArr) {
/* 6 */             if (AbstractC0743k0.m2621a(4)) {
/* 15 */                m2610a(4, str, str2, null, objArr);
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m2615d(String str, String str2, Object... objArr) {
/* 6 */             if (AbstractC0743k0.m2621a(2)) {
/* 15 */                m2610a(2, str, str2, null, objArr);
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m2616e(String str, String str2, Object... objArr) {
/* 6 */             if (AbstractC0743k0.m2621a(5)) {
/* 15 */                m2610a(5, str, str2, null, objArr);
                    }
                }

                /* JADX INFO: renamed from: a */
/* 44 */        public final void m2612a(String str, Throwable th) {
/* 45 */            if (AbstractC0743k0.m2621a(6)) {
/* 46 */                m2610a(6, str, HttpUrl.FRAGMENT_ENCODE_SET, th, new Object[0]);
                    }
                }

                /* JADX INFO: renamed from: a */
/* 46 */        public final void m2611a(String str, String str2, Object... objArr) {
/* 47 */            if (AbstractC0743k0.m2621a(3)) {
/* 48 */                m2610a(3, str, str2, null, objArr);
                    }
                }
            }
