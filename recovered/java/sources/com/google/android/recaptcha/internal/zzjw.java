            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.util.Arrays;
            import p000.C2103qd;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjw implements zzjt {
                public static final zzjw zza = new zzjw();

                private zzjw() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 1 */             int length = zzztVarArr.length;
/* 4 */             if (length == 0) {
/* 76 */                C1697u2.m5433i(4, 3, null);
/* 79 */                return;
                    }
/* 13 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 20 */            if (true != (objZza instanceof Class)) {
/* 22 */                objZza = null;
                    }
/* 23 */            Class cls = (Class) objZza;
/* 25 */            if (cls == null) {
/* 71 */                C1697u2.m5433i(4, 5, null);
/* 74 */                return;
                    }
/* 39 */            Class[] clsArrZzf = zzizVar.zzc().zzf(C2103qd.m7779n(zzztVarArr).subList(1, length));
                    try {
/* 58 */                zzizVar.zzc().zze(i, cls.getConstructor((Class[]) Arrays.copyOf(clsArrZzf, clsArrZzf.length)));
                    } catch (Exception e) {
/* 66 */                C1697u2.m5433i(6, 9, e);
                    }
                }
            }
