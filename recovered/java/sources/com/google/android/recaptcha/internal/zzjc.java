            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjc implements zzjt {
                public static final zzjc zza = new zzjc();

                private zzjc() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
                    Object array;
/* 5 */             if (zzztVarArr.length != 2) {
/* 123 */               C1697u2.m5433i(4, 3, null);
/* 126 */               return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 23 */            if (true != Objects.nonNull(objZza)) {
/* 25 */                objZza = null;
                    }
/* 27 */            if (objZza == null) {
/* 118 */               C1697u2.m5433i(4, 5, null);
/* 121 */               return;
                    }
/* 35 */            Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
/* 41 */            if (true != (objZza2 instanceof Integer)) {
/* 43 */                objZza2 = null;
                    }
/* 44 */            Integer num = (Integer) objZza2;
/* 46 */            if (num == null) {
/* 114 */               C1697u2.m5433i(4, 5, null);
/* 117 */               return;
                    }
/* 48 */            int iIntValue = num.intValue();
/* 54 */            if (objZza instanceof Integer) {
/* 63 */                array = Integer.valueOf(((Number) objZza).intValue() + iIntValue);
                    } else {
/* 70 */                if (!(objZza instanceof int[])) {
/* 110 */                   C1697u2.m5433i(4, 5, null);
/* 113 */                   return;
                        }
/* 72 */                int[] iArr = (int[]) objZza;
/* 77 */                ArrayList arrayList = new ArrayList(iArr.length);
/* 81 */                for (int i2 : iArr) {
/* 90 */                    arrayList.add(Integer.valueOf(i2 + iIntValue));
                        }
/* 98 */                array = arrayList.toArray(new Integer[0]);
                    }
/* 106 */           zzizVar.zzc().zze(i, array);
                }
            }
