            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.lang.reflect.Array;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzje implements zzjt {
                public static final zzje zza = new zzje();

                private zzje() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 5 */             if (zzztVarArr.length != 3) {
/* 105 */               C1697u2.m5433i(4, 3, null);
/* 108 */               return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 23 */            if (true != Objects.nonNull(objZza)) {
/* 25 */                objZza = null;
                    }
/* 27 */            if (objZza == null) {
/* 101 */               C1697u2.m5433i(4, 5, null);
/* 104 */               return;
                    }
/* 35 */            Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
/* 41 */            if (true != (objZza2 instanceof Integer)) {
/* 43 */                objZza2 = null;
                    }
/* 44 */            Integer num = (Integer) objZza2;
/* 46 */            if (num == null) {
/* 97 */                C1697u2.m5433i(4, 5, null);
/* 100 */               return;
                    }
/* 48 */            int iIntValue = num.intValue();
/* 59 */            Object objZza3 = zzizVar.zzc().zza(zzztVarArr[2]);
/* 67 */            if (true != Objects.nonNull(objZza3)) {
/* 69 */                objZza3 = null;
                    }
/* 70 */            if (objZza3 == null) {
/* 93 */                C1697u2.m5433i(4, 5, null);
/* 96 */                return;
                    }
                    try {
/* 72 */                Array.set(objZza, iIntValue, objZza3);
                    } catch (Exception e) {
/* 79 */                if (e instanceof ArrayIndexOutOfBoundsException) {
/* 83 */                    C1697u2.m5433i(4, 22, e);
                        } else {
/* 89 */                    C1697u2.m5433i(4, 25, e);
                        }
                    }
                }
            }
