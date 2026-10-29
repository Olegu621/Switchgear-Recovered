            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.util.Arrays;
            import java.util.Objects;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C2103qd;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjy implements zzjt {
                public static final zzjy zza = new zzjy();

                private zzjy() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 1 */             int length = zzztVarArr.length;
/* 5 */             if (length < 2) {
/* 133 */               C1697u2.m5433i(4, 3, null);
/* 136 */               return;
                    }
/* 14 */            Class<?> clsZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 23 */            if (true != Objects.nonNull(clsZza)) {
/* 25 */                clsZza = null;
                    }
/* 27 */            if (clsZza == null) {
/* 128 */               C1697u2.m5433i(4, 5, null);
/* 131 */               return;
                    }
/* 36 */            Class<?> cls = clsZza instanceof Class ? clsZza : clsZza.getClass();
/* 46 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[1]);
/* 52 */            if (true != (objZza instanceof String)) {
/* 54 */                objZza = null;
                    }
/* 55 */            String str = (String) objZza;
/* 57 */            if (str == null) {
/* 124 */               C1697u2.m5433i(4, 5, null);
/* 127 */               return;
                    }
/* 63 */            String strZza = zzizVar.zzh().zza(str);
/* 74 */            if (Intrinsics.m6216a(strZza, "forName")) {
/* 120 */               C1697u2.m5433i(6, 48, null);
/* 123 */               return;
                    }
/* 88 */            Class[] clsArrZzf = zzizVar.zzc().zzf(C2103qd.m7779n(zzztVarArr).subList(2, length));
                    try {
/* 107 */               zzizVar.zzc().zze(i, cls.getMethod(strZza, (Class[]) Arrays.copyOf(clsArrZzf, clsArrZzf.length)));
                    } catch (Exception e) {
/* 114 */               C1697u2.m5433i(6, 13, e);
                    }
                }
            }
