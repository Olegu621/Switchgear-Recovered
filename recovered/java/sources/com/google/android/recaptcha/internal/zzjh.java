            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjh implements zzjt {
                public static final zzjh zza = new zzjh();

                private zzjh() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 5 */             if (zzztVarArr.length != 2) {
/* 110 */               C1697u2.m5433i(4, 3, null);
/* 113 */               return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 21 */            if (true != (objZza instanceof String)) {
/* 23 */                objZza = null;
                    }
/* 24 */            String str = (String) objZza;
/* 26 */            if (str == null) {
/* 105 */               C1697u2.m5433i(4, 5, null);
/* 108 */               return;
                    }
/* 34 */            Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
/* 38 */            if (objZza2 == null) {
/* 103 */               throw new zzdm(4, 4, null);
                    }
/* 42 */            if (!(objZza2 instanceof Integer) && !(objZza2 instanceof Short) && !(objZza2 instanceof Byte) && !(objZza2 instanceof Long) && !(objZza2 instanceof Double) && !(objZza2 instanceof Float) && !(objZza2 instanceof Boolean) && !(objZza2 instanceof Character) && !(objZza2 instanceof String)) {
/* 78 */                C1697u2.m5433i(4, 7, null);
                    } else {
/* 94 */                zzizVar.zzi().zzb(str, objZza2.toString());
                    }
                }
            }
