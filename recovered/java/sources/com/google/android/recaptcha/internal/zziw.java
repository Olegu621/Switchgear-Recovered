            package com.google.android.recaptcha.internal;

            import java.lang.reflect.Method;
            import java.util.Arrays;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            import p000.nd0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zziw extends zzit {
                private final zziv zza;
                private final String zzb;

                public zziw(zziv zzivVar, String str, Object obj) {
/* 1 */             super(obj);
/* 4 */             this.zza = zzivVar;
/* 6 */             this.zzb = str;
                }

                @Override // com.google.android.recaptcha.internal.zzit
                public final boolean zza(Object obj, Method method, Object[] objArr) {
                    List listAsList;
/* 11 */            if (!Intrinsics.m6216a(method.getName(), this.zzb)) {
/* 32 */                return false;
                    }
/* 13 */            zziv zzivVar = this.zza;
/* 15 */            if (objArr != null) {
/* 17 */                listAsList = Arrays.asList(objArr);
/* 21 */                listAsList.getClass();
                    } else {
/* 25 */                listAsList = nd0.f14189a;
                    }
/* 27 */            zzivVar.zzb(listAsList);
/* 30 */            return true;
                }
            }
