            package com.google.android.gms.internal.measurement;

            import android.content.Context;
            import android.content.SharedPreferences;
            import okhttp3.HttpUrl;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcf {
                private static final ThreadLocal zza = new zzce();

                public static SharedPreferences zza(Context context, String str, int i, zzca zzcaVar) {
/* 1 */             zzbv.zza();
/* 19 */            zzcd zzcdVar = str.equals(HttpUrl.FRAGMENT_ENCODE_SET) ? new zzcd() : null;
/* 20 */            if (zzcdVar != null) {
/* 22 */                return zzcdVar;
                    }
/* 23 */            ThreadLocal threadLocal = zza;
/* 35 */            if (!((Boolean) threadLocal.get()).booleanValue()) {
/* 62 */                f42.m3649e();
/* 10 */                return null;
                    }
/* 39 */            threadLocal.set(Boolean.FALSE);
                    try {
/* 43 */                return context.getSharedPreferences(str, 0);
                    } finally {
/* 58 */                zza.set(Boolean.TRUE);
                    }
                }
            }
