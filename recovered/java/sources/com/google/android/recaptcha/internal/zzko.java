            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzko implements zzjt {
                public static final zzko zza = new zzko();

                private zzko() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 1 */             int length = zzztVarArr.length;
/* 5 */             if (length != 2) {
/* 7 */                 if (length == 0) {
/* 18 */                    zzizVar.zzc().zze(i, new zzcs());
/* 21 */                    return;
                        } else {
/* 23 */                    C1697u2.m5433i(4, 3, null);
/* 26 */                    return;
                        }
                    }
/* 34 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 41 */            if (true != (objZza instanceof String)) {
/* 43 */                objZza = null;
                    }
/* 44 */            String str = (String) objZza;
/* 47 */            if (str == null) {
/* 105 */               C1697u2.m5433i(4, 5, null);
/* 108 */               return;
                    }
/* 55 */            Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
/* 61 */            if (true != (objZza2 instanceof zzcs)) {
/* 63 */                objZza2 = null;
                    }
/* 64 */            zzcs zzcsVar = (zzcs) objZza2;
/* 66 */            if (zzcsVar == null) {
/* 101 */               C1697u2.m5433i(4, 5, null);
/* 104 */               return;
                    }
/* 76 */            byte[] bArrZzd = zzhd.zza(zzizVar.zzb(), zzcsVar).zzd();
/* 97 */            zzizVar.zzi().zzb(str, zzpp.zzh().zzi(bArrZzd, 0, bArrZzd.length));
                }
            }
