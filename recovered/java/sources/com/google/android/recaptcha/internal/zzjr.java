            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjr implements zzjt {
                public static final zzjr zza = new zzjr();

                private zzjr() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
                    Object array;
/* 5 */             if (zzztVarArr.length != 2) {
/* 132 */               C1697u2.m5433i(4, 3, null);
/* 135 */               return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 23 */            if (true != Objects.nonNull(objZza)) {
/* 25 */                objZza = null;
                    }
/* 27 */            if (objZza == null) {
/* 127 */               C1697u2.m5433i(4, 5, null);
/* 130 */               return;
                    }
/* 35 */            Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
/* 41 */            if (true != (objZza2 instanceof Integer)) {
/* 43 */                objZza2 = null;
                    }
/* 44 */            Integer num = (Integer) objZza2;
/* 46 */            if (num == null) {
/* 123 */               C1697u2.m5433i(4, 5, null);
/* 126 */               return;
                    }
/* 48 */            int iIntValue = num.intValue();
                    try {
/* 54 */                if (objZza instanceof Integer) {
/* 63 */                    array = Integer.valueOf(((Number) objZza).intValue() / iIntValue);
                        } else {
/* 72 */                    if (!(objZza instanceof int[])) {
/* 117 */                       throw new zzdm(4, 5, null);
                            }
/* 74 */                    int[] iArr = (int[]) objZza;
/* 79 */                    ArrayList arrayList = new ArrayList(iArr.length);
/* 83 */                    for (int i2 : iArr) {
/* 92 */                        arrayList.add(Integer.valueOf(i2 / iIntValue));
                            }
/* 100 */                   array = arrayList.toArray(new Integer[0]);
                        }
/* 108 */               zzizVar.zzc().zze(i, array);
                    } catch (ArithmeticException e) {
/* 119 */               C1697u2.m5433i(4, 6, e);
                    }
                }
            }
