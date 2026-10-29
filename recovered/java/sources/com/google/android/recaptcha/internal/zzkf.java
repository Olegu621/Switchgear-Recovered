            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.lang.reflect.Constructor;
            import java.util.Arrays;
            import java.util.Objects;
            import p000.C2103qd;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzkf implements zzjt {
                public static final zzkf zza = new zzkf();

                private zzkf() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 1 */             int length = zzztVarArr.length;
/* 4 */             if (length == 0) {
/* 89 */                C1697u2.m5433i(4, 3, null);
/* 92 */                return;
                    }
/* 13 */            Constructor<?> constructorZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 22 */            if (true != Objects.nonNull(constructorZza)) {
/* 24 */                constructorZza = null;
                    }
/* 25 */            if (constructorZza == null) {
/* 84 */                C1697u2.m5433i(4, 5, null);
/* 87 */                return;
                    }
/* 38 */            Constructor<?> constructor = constructorZza instanceof Constructor ? constructorZza : constructorZza.getClass().getConstructor(null);
/* 54 */            Object[] objArrZzg = zzizVar.zzc().zzg(C2103qd.m7779n(zzztVarArr).subList(1, length));
                    try {
/* 71 */                zzizVar.zzc().zze(i, constructor.newInstance(Arrays.copyOf(objArrZzg, objArrZzg.length)));
                    } catch (Exception e) {
/* 79 */                C1697u2.m5433i(6, 14, e);
                    }
                }
            }
