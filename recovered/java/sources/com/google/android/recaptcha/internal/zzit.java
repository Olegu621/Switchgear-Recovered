            package com.google.android.recaptcha.internal;

            import java.lang.reflect.InvocationHandler;
            import java.lang.reflect.Method;
            import kotlin.Unit;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzit implements InvocationHandler {
                private final Object zza;

                public zzit(Object obj) {
/* 4 */             this.zza = obj;
                }

                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
/* 11 */            if (Intrinsics.m6216a(method.getName(), "toString") && method.getParameterTypes().length == 0) {
/* 34 */                return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
                    }
/* 49 */            if (Intrinsics.m6216a(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
/* 62 */                return Integer.valueOf(System.identityHashCode(obj));
                    }
/* 77 */            if (Intrinsics.m6216a(method.getName(), "equals") && method.getParameterTypes().length != 0) {
/* 87 */                boolean z = false;
/* 88 */                if (objArr != null && objArr.length != 0) {
/* 94 */                    Object obj2 = objArr[0];
/* 108 */                   if ((obj2 != null ? obj2.hashCode() : 0) == obj.hashCode()) {
/* 110 */                       z = true;
                            }
                        }
/* 111 */               return Boolean.valueOf(z);
                    }
/* 120 */           if (!zza(obj, method, objArr)) {
/* 122 */               return Unit.f12910a;
                    }
/* 125 */           Object obj3 = this.zza;
/* 127 */           if ((obj3 == null && Intrinsics.m6216a(method.getReturnType(), Void.TYPE)) || (obj3 != null && Intrinsics.m6216a(zzpu.zza(obj3.getClass()), zzpu.zza(method.getReturnType())))) {
                        return obj3 == null ? Unit.f12910a : obj3;
                    }
/* 200 */           throw new IllegalArgumentException(obj3 + " cannot be returned from method with return type " + method.getReturnType());
                }

                public abstract boolean zza(Object obj, Method method, Object[] objArr);
            }
