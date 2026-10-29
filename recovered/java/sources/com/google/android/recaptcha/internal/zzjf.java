            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjf implements zzjt {
                public static final zzjf zza = new zzjf();

                private zzjf() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 5 */             if (zzztVarArr.length != 3) {
/* 106 */               C1697u2.m5433i(4, 3, null);
/* 109 */               return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 21 */            if (true != (objZza instanceof Integer)) {
/* 23 */                objZza = null;
                    }
/* 24 */            Integer num = (Integer) objZza;
/* 27 */            if (num == null) {
/* 102 */               C1697u2.m5433i(4, 5, null);
/* 105 */               return;
                    }
/* 29 */            int iIntValue = num.intValue();
/* 33 */            if (iIntValue == 0) {
/* 98 */                C1697u2.m5433i(4, 6, null);
/* 101 */               return;
                    }
/* 41 */            Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
/* 49 */            if (true != Objects.nonNull(objZza2)) {
/* 51 */                objZza2 = null;
                    }
/* 52 */            if (objZza2 == null) {
/* 93 */                C1697u2.m5433i(4, 5, null);
/* 96 */                return;
                    }
/* 61 */            Object objZza3 = zzizVar.zzc().zza(zzztVarArr[2]);
/* 69 */            if (true != Objects.nonNull(objZza3)) {
/* 71 */                objZza3 = null;
                    }
/* 72 */            if (objZza3 == null) {
/* 89 */                C1697u2.m5433i(4, 5, null);
                    } else if (objZza2.equals(objZza3)) {
/* 85 */                zzizVar.zzg(zzizVar.zza() + iIntValue);
                    }
                }
            }
