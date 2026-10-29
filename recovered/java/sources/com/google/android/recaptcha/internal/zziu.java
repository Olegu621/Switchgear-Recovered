            package com.google.android.recaptcha.internal;

            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import p000.nd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zziu extends zzit {
                private final Function2 zza;
                private final String zzb;

                public zziu(Function2 function2, String str, Object obj) {
/* 1 */             super(obj);
/* 4 */             this.zza = function2;
/* 6 */             this.zzb = str;
                }

                @Override // com.google.android.recaptcha.internal.zzit
                public final boolean zza(Object obj, Method method, Object[] objArr) {
                    List arrayList;
/* 12 */            if (!Intrinsics.m6216a(method.getName(), this.zzb)) {
/* 11 */                return false;
                    }
/* 14 */            zzyu zzyuVarZzf = zzyx.zzf();
/* 18 */            if (objArr != null) {
/* 23 */                arrayList = new ArrayList(objArr.length);
/* 28 */                for (Object obj2 : objArr) {
/* 32 */                    zzyv zzyvVarZzf = zzyw.zzf();
/* 40 */                    zzyvVarZzf.zzw(obj2.toString());
/* 49 */                    arrayList.add((zzyw) zzyvVarZzf.zzk());
                        }
                    } else {
/* 55 */                arrayList = nd0.f14189a;
                    }
/* 57 */            zzyuVarZzf.zze(arrayList);
/* 64 */            zzyx zzyxVar = (zzyx) zzyuVarZzf.zzk();
/* 66 */            Function2 function2 = this.zza;
/* 68 */            byte[] bArrZzd = zzyxVar.zzd();
/* 81 */            function2.invoke(objArr, zzpp.zzh().zzi(bArrZzd, 0, bArrZzd.length));
/* 84 */            return true;
                }
            }
