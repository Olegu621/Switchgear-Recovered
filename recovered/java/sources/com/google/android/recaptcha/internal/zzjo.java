            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import java.lang.reflect.Proxy;
            import java.util.Objects;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjo implements zzjt {
                public static final zzjo zza = new zzjo();

                private zzjo() {
                }

                @Override // com.google.android.recaptcha.internal.zzjt
                public final void zza(int i, final zziz zzizVar, zzzt... zzztVarArr) throws zzdm {
                    final int iIntValue;
/* 1 */             int length = zzztVarArr.length;
/* 6 */             if (length != 4 && length != 5) {
/* 11 */                C1697u2.m5433i(4, 3, null);
/* 14 */                return;
                    }
/* 22 */            Object objZza = zzizVar.zzc().zza(zzztVarArr[0]);
/* 29 */            if (true != (objZza instanceof String)) {
/* 31 */                objZza = null;
                    }
/* 32 */            final String str = (String) objZza;
/* 34 */            if (str == null) {
/* 188 */               C1697u2.m5433i(4, 5, null);
/* 191 */               return;
                    }
/* 42 */            Object objZza2 = zzizVar.zzc().zza(zzztVarArr[1]);
/* 50 */            if (true != Objects.nonNull(objZza2)) {
/* 52 */                objZza2 = null;
                    }
/* 53 */            if (objZza2 == null) {
/* 184 */               C1697u2.m5433i(4, 5, null);
/* 187 */               return;
                    }
/* 62 */            Object objZza3 = zzizVar.zzc().zza(zzztVarArr[2]);
/* 68 */            if (true != (objZza3 instanceof String)) {
/* 70 */                objZza3 = null;
                    }
/* 71 */            String str2 = (String) objZza3;
/* 73 */            if (str2 == null) {
/* 180 */               C1697u2.m5433i(4, 5, null);
/* 183 */               return;
                    }
/* 79 */            String strZza = zzizVar.zzh().zza(str2);
/* 89 */            Object objZza4 = zzizVar.zzc().zza(zzztVarArr[3]);
/* 93 */            if (length == 5) {
/* 101 */               Object objZza5 = zzizVar.zzc().zza(zzztVarArr[4]);
/* 107 */               if (true != (objZza5 instanceof Integer)) {
/* 109 */                   objZza5 = null;
                        }
/* 110 */               Integer num = (Integer) objZza5;
/* 112 */               if (num == null) {
/* 119 */                   C1697u2.m5433i(4, 5, null);
/* 122 */                   return;
                        }
/* 114 */               iIntValue = num.intValue();
                    } else {
/* 123 */               iIntValue = -1;
                    }
                    try {
/* 126 */               if (objZza2 instanceof String) {
/* 134 */                   objZza2 = zzizVar.zzh().zza((String) objZza2);
                        }
/* 138 */               Class clsZza = zziy.zza(objZza2);
/* 168 */               zzizVar.zzc().zze(i, Proxy.newProxyInstance(clsZza.getClassLoader(), new Class[]{clsZza}, new zziu(new Function2() { // from class: com.google.android.recaptcha.internal.zzjn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
/* 1 */                         zziz zzizVar2 = zzizVar;
/* 3 */                         Object[] objArr = (Object[]) obj;
/* 17 */                        zzizVar2.zzi().zzb(str, (String) obj2);
/* 20 */                        int i2 = iIntValue;
/* 23 */                        if (i2 != -1) {
/* 29 */                            zzizVar2.zzc().zze(i2, objArr);
                                }
/* 32 */                        return Unit.f12910a;
                            }
                        }, strZza, objZza4)));
                    } catch (Exception e) {
/* 176 */               C1697u2.m5433i(6, 20, e);
                    }
                }
            }
