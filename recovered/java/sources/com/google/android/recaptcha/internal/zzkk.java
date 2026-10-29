            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.lang.reflect.Field;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzkk implements zzjt {
                public static final zzkk zza = new zzkk();

                private zzkk() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 5 */             if (zzztVarArr.length != 2) {
/* 56 */                C1697u2.m5433i(4, 3, null);
/* 59 */                return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 21 */            if (true != (objZza instanceof Field)) {
/* 23 */                objZza = null;
                    }
/* 24 */            Field field = (Field) objZza;
/* 26 */            if (field == null) {
/* 51 */                C1697u2.m5433i(4, 5, null);
/* 54 */                return;
                    }
                    try {
/* 38 */                field.set(null, zzizVar.zzc().zza(zzztVarArr[1]));
                    } catch (Exception e) {
/* 46 */                C1697u2.m5433i(6, 11, e);
                    }
                }
            }
