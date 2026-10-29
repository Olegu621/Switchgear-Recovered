            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzji implements zzjt {
                public static final zzji zza = new zzji();

                private zzji() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 4 */             boolean z = true;
/* 5 */             if (zzztVarArr.length != 1) {
/* 100 */               C1697u2.m5433i(4, 3, null);
/* 103 */               return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 22 */            if (true != Objects.nonNull(objZza)) {
/* 24 */                objZza = null;
                    }
/* 25 */            if (objZza == null) {
/* 95 */                C1697u2.m5433i(4, 5, null);
/* 98 */                return;
                    }
                    try {
                        try {
/* 32 */                    if (objZza instanceof String) {
/* 40 */                        objZza = zzizVar.zzh().zza((String) objZza);
                            }
/* 47 */                    zzja zzjaVarZzc = zzizVar.zzc();
                            try {
/* 51 */                        zziy.zza(objZza);
                            } catch (zzdm e) {
/* 60 */                        if (e.zzb() == 8 || e.zzb() == 6) {
/* 68 */                            z = false;
                                } else if (e.zzb() != 47) {
/* 79 */                            throw e;
                                }
                            }
/* 84 */                    zzjaVarZzc.zze(i, Boolean.valueOf(z));
                        } catch (zzdm e2) {
/* 93 */                    throw e2;
                        }
                    } catch (Exception e3) {
/* 88 */                C1697u2.m5433i(6, 8, e3);
                    }
                }
            }
