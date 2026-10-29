            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.lang.reflect.Array;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjq implements zzjt {
                public static final zzjq zza = new zzjq();

                private zzjq() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 5 */             if (zzztVarArr.length != 2) {
/* 99 */                C1697u2.m5433i(4, 3, null);
/* 102 */               return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 23 */            if (true != Objects.nonNull(objZza)) {
/* 25 */                objZza = null;
                    }
/* 27 */            if (objZza == null) {
/* 94 */                C1697u2.m5433i(4, 5, null);
/* 97 */                return;
                    }
/* 35 */            Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
/* 41 */            if (true != (objZza2 instanceof Integer)) {
/* 43 */                objZza2 = null;
                    }
/* 44 */            Integer num = (Integer) objZza2;
/* 46 */            if (num == null) {
/* 90 */                C1697u2.m5433i(4, 5, null);
/* 93 */                return;
                    }
/* 48 */            int iIntValue = num.intValue();
                    try {
/* 54 */                if (objZza instanceof String) {
/* 62 */                    objZza = zzizVar.zzh().zza((String) objZza);
                        }
/* 78 */                zzizVar.zzc().zze(i, Array.newInstance((Class<?>) zziy.zza(objZza), iIntValue));
                    } catch (Exception e) {
/* 86 */                C1697u2.m5433i(6, 21, e);
                    }
                }
            }
