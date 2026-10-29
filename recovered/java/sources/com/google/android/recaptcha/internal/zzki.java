            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzki implements zzjt {
                public static final zzki zza = new zzki();

                private zzki() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 5 */             if (zzztVarArr.length != 1) {
/* 37 */                C1697u2.m5433i(4, 3, null);
/* 40 */                return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 20 */            if (true != (objZza instanceof String)) {
/* 22 */                objZza = null;
                    }
/* 23 */            String str = (String) objZza;
/* 25 */            if (str != null) {
/* 27 */                zzizVar.zzf(str);
                    } else {
/* 32 */                C1697u2.m5433i(4, 5, null);
                    }
                }
            }
