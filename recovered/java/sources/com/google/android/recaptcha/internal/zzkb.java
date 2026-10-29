            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.lang.reflect.Method;
            import java.util.Arrays;
            import p000.C2103qd;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzkb implements zzjt {
                public static final zzkb zza = new zzkb();

                private zzkb() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 1 */             int length = zzztVarArr.length;
/* 5 */             if (length < 2) {
/* 85 */                C1697u2.m5433i(4, 3, null);
/* 88 */                return;
                    }
/* 14 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 21 */            if (true != (objZza instanceof Method)) {
/* 23 */                objZza = null;
                    }
/* 24 */            Method method = (Method) objZza;
/* 26 */            if (method == null) {
/* 80 */                C1697u2.m5433i(4, 5, null);
/* 83 */                return;
                    }
/* 34 */            Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
/* 50 */            Object[] objArrZzg = zzizVar.zzc().zzg(C2103qd.m7779n(zzztVarArr).subList(2, length));
                    try {
/* 67 */                zzizVar.zzc().zze(i, method.invoke(objZza2, Arrays.copyOf(objArrZzg, objArrZzg.length)));
                    } catch (Exception e) {
/* 75 */                C1697u2.m5433i(6, 15, e);
                    }
                }
            }
