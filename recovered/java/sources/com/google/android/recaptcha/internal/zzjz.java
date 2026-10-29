            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.lang.reflect.Field;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjz implements zzjt {
                public static final zzjz zza = new zzjz();

                private zzjz() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 5 */             if (zzztVarArr.length != 2) {
/* 64 */                C1697u2.m5433i(4, 3, null);
/* 67 */                return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 21 */            if (true != (objZza instanceof Field)) {
/* 23 */                objZza = null;
                    }
/* 24 */            Field field = (Field) objZza;
/* 26 */            if (field == null) {
/* 59 */                C1697u2.m5433i(4, 5, null);
/* 62 */                return;
                    }
                    try {
/* 46 */                zzizVar.zzc().zze(i, field.get(zzizVar.zzc().zza(zzztVarArr[1])));
                    } catch (Exception e) {
/* 54 */                C1697u2.m5433i(6, 16, e);
                    }
                }
            }
