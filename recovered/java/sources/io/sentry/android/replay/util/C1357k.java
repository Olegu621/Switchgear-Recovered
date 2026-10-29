            package io.sentry.android.replay.util;

            import android.os.Build;
            import okhttp3.HttpUrl;
            import p000.ds0;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.util.k */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1357k {
                /* JADX INFO: renamed from: a */
                public static String m5041a(EnumC1355i enumC1355i) {
                    String str;
/* 1 */             enumC1355i.getClass();
/* 8 */             if (Build.VERSION.SDK_INT < 31) {
/* 42 */                return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 16 */            int i = AbstractC1356j.f10665a[enumC1355i.ordinal()];
/* 19 */            if (i == 1) {
/* 1 */                 str = Build.SOC_MODEL;
                    } else {
/* 22 */                if (i != 2) {
/* 29 */                    ds0.m3187b();
/* 32 */                    return null;
                        }
/* 1 */                 str = Build.SOC_MANUFACTURER;
                    }
/* 38 */            str.getClass();
/* 41 */            return str;
                }
            }
