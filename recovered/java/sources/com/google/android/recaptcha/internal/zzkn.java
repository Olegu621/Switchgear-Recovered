            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzkn implements zzjt {
                public static final zzkn zza = new zzkn();

                private zzkn() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 5 */             if (zzztVarArr.length != 2) {
/* 97 */                C1697u2.m5433i(4, 3, null);
/* 100 */               return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 21 */            if (true != (objZza instanceof int[])) {
/* 23 */                objZza = null;
                    }
/* 24 */            int[] iArr = (int[]) objZza;
/* 27 */            if (iArr == null) {
/* 92 */                C1697u2.m5433i(4, 5, null);
/* 95 */                return;
                    }
/* 35 */            Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
/* 41 */            if (true != (objZza2 instanceof String)) {
/* 43 */                objZza2 = null;
                    }
/* 44 */            String str = (String) objZza2;
/* 46 */            if (str == null) {
/* 88 */                C1697u2.m5433i(4, 5, null);
/* 91 */                return;
                    }
/* 48 */            zzja zzjaVarZzc = zzizVar.zzc();
/* 54 */            StringBuilder sb = new StringBuilder();
                    try {
/* 58 */                for (int i2 : iArr) {
/* 66 */                    sb.append(str.charAt(i2));
                        }
/* 78 */                zzjaVarZzc.zze(i, sb.toString());
                    } catch (Exception e) {
/* 84 */                C1697u2.m5433i(4, 22, e);
                    }
                }
            }
