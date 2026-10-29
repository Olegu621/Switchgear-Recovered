            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.lang.reflect.Array;
            import java.util.List;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjd implements zzjt {
                public static final zzjd zza = new zzjd();

                private zzjd() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
                    Object objValueOf;
/* 5 */             if (zzztVarArr.length != 2) {
/* 117 */               C1697u2.m5433i(4, 3, null);
/* 120 */               return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 23 */            if (true != Objects.nonNull(objZza)) {
/* 25 */                objZza = null;
                    }
/* 27 */            if (objZza == null) {
/* 112 */               C1697u2.m5433i(4, 5, null);
/* 115 */               return;
                    }
/* 35 */            Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
/* 41 */            if (true != (objZza2 instanceof Integer)) {
/* 43 */                objZza2 = null;
                    }
/* 44 */            Integer num = (Integer) objZza2;
/* 46 */            if (num == null) {
/* 108 */               C1697u2.m5433i(4, 5, null);
/* 111 */               return;
                    }
/* 48 */            int iIntValue = num.intValue();
                    try {
/* 54 */                if (objZza instanceof String) {
/* 62 */                    objValueOf = String.valueOf(((String) objZza).charAt(iIntValue));
                        } else {
/* 80 */                    objValueOf = objZza instanceof List ? ((List) objZza).get(iIntValue) : Array.get(objZza, iIntValue);
                        }
/* 88 */                zzizVar.zzc().zze(i, objValueOf);
                    } catch (Exception e) {
/* 94 */                if (e instanceof ArrayIndexOutOfBoundsException) {
/* 98 */                    C1697u2.m5433i(4, 22, e);
                        } else {
/* 104 */                   C1697u2.m5433i(4, 23, e);
                        }
                    }
                }
            }
