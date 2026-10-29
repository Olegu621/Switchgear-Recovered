            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjx implements zzjt {
                public static final zzjx zza = new zzjx();

                private zzjx() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 5 */             if (zzztVarArr.length != 2) {
/* 96 */                C1697u2.m5433i(4, 3, null);
/* 99 */                return;
                    }
/* 14 */            Class<?> clsZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 23 */            if (true != Objects.nonNull(clsZza)) {
/* 25 */                clsZza = null;
                    }
/* 27 */            if (clsZza == null) {
/* 91 */                C1697u2.m5433i(4, 5, null);
/* 94 */                return;
                    }
/* 36 */            Class<?> cls = clsZza instanceof Class ? clsZza : clsZza.getClass();
/* 46 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[1]);
/* 52 */            if (true != (objZza instanceof String)) {
/* 54 */                objZza = null;
                    }
/* 55 */            String str = (String) objZza;
/* 57 */            if (str == null) {
/* 87 */                C1697u2.m5433i(4, 5, null);
/* 90 */                return;
                    }
                    try {
/* 75 */                zzizVar.zzc().zze(i, cls.getField(zzizVar.zzh().zza(str)));
                    } catch (Exception e) {
/* 83 */                C1697u2.m5433i(6, 10, e);
                    }
                }
            }
