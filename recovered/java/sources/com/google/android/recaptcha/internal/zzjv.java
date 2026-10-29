            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjv implements zzjt {
                public static final zzjv zza = new zzjv();

                private zzjv() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 5 */             if (zzztVarArr.length != 1) {
/* 69 */                C1697u2.m5433i(4, 3, null);
/* 72 */                return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 22 */            if (true != Objects.nonNull(objZza)) {
/* 24 */                objZza = null;
                    }
/* 25 */            if (objZza == null) {
/* 64 */                C1697u2.m5433i(4, 5, null);
/* 67 */                return;
                    }
                    try {
/* 29 */                if (objZza instanceof String) {
/* 37 */                    objZza = zzizVar.zzh().zza((String) objZza);
                        }
/* 49 */                zzizVar.zzc().zze(i, zziy.zza(objZza));
                    } catch (zzdm e) {
/* 62 */                throw e;
                    } catch (Exception e2) {
/* 57 */                C1697u2.m5433i(6, 8, e2);
                    }
                }
            }
