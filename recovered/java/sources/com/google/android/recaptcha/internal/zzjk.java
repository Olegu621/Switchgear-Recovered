            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjk implements zzjt {
                public static final zzjk zza = new zzjk();

                private zzjk() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 5 */             if (zzztVarArr.length != 2) {
/* 69 */                C1697u2.m5433i(4, 3, null);
/* 72 */                return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 21 */            if (true != (objZza instanceof String)) {
/* 23 */                objZza = null;
                    }
/* 24 */            String str = (String) objZza;
/* 27 */            if (str == null) {
/* 64 */                C1697u2.m5433i(4, 5, null);
/* 67 */                return;
                    }
/* 35 */            Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
/* 41 */            if (true != (objZza2 instanceof String)) {
/* 43 */                objZza2 = null;
                    }
/* 44 */            String str2 = (String) objZza2;
/* 46 */            if (str2 != null) {
/* 56 */                zzizVar.zzc().zze(i, str.concat(str2));
                    } else {
/* 60 */                C1697u2.m5433i(4, 5, null);
                    }
                }
            }
