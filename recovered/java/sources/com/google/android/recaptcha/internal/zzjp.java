            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.lang.reflect.Proxy;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjp implements zzjt {
                public static final zzjp zza = new zzjp();

                private zzjp() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
/* 1 */             int length = zzztVarArr.length;
/* 6 */             if (length != 4 && length != 5) {
/* 11 */                C1697u2.m5433i(4, 3, null);
/* 14 */                return;
                    }
/* 22 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 29 */            if (true != (objZza instanceof Integer)) {
/* 31 */                objZza = null;
                    }
/* 32 */            Integer num = (Integer) objZza;
/* 34 */            if (num == null) {
/* 191 */               C1697u2.m5433i(4, 5, null);
/* 194 */               return;
                    }
/* 36 */            int iIntValue = num.intValue();
/* 46 */            Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
/* 52 */            if (true != (objZza2 instanceof Integer)) {
/* 54 */                objZza2 = null;
                    }
/* 55 */            Integer num2 = (Integer) objZza2;
/* 57 */            if (num2 == null) {
/* 187 */               C1697u2.m5433i(4, 5, null);
/* 190 */               return;
                    }
/* 59 */            int iIntValue2 = num2.intValue();
/* 70 */            Object objZza3 = zzizVar.zzc().zza(zzztVarArr[2]);
/* 76 */            if (true != (objZza3 instanceof String)) {
/* 78 */                objZza3 = null;
                    }
/* 79 */            String str = (String) objZza3;
/* 81 */            if (str == null) {
/* 183 */               C1697u2.m5433i(4, 5, null);
/* 186 */               return;
                    }
/* 87 */            String strZza = zzizVar.zzh().zza(str);
/* 97 */            Object objZza4 = zzizVar.zzc().zza(zzztVarArr[3]);
/* 103 */           if (true != (objZza4 instanceof String)) {
/* 105 */               objZza4 = null;
                    }
/* 106 */           String str2 = (String) objZza4;
/* 108 */           if (str2 == null) {
/* 179 */               C1697u2.m5433i(4, 5, null);
/* 182 */               return;
                    }
/* 114 */           String strZza2 = zzizVar.zzh().zza(str2);
/* 126 */           Object objZza5 = length == 5 ? zzizVar.zzc().zza(zzztVarArr[4]) : null;
/* 132 */           zziv zzivVar = new zziv(iIntValue2);
                    try {
/* 135 */               Class clsZza = zziy.zza(strZza);
/* 160 */               zzizVar.zzc().zze(iIntValue, Proxy.newProxyInstance(clsZza.getClassLoader(), new Class[]{clsZza}, new zziw(zzivVar, strZza2, objZza5)));
/* 167 */               zzizVar.zzc().zze(i, zzivVar);
                    } catch (Exception e) {
/* 175 */               C1697u2.m5433i(6, 20, e);
                    }
                }
            }
