            package com.google.android.gms.internal.common;

            import java.lang.reflect.InvocationTargetException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzj {
                public static Object zza(Class cls, String str, zzi... zziVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
/* 5 */             return zzc(cls, "isIsolated", null, false, zziVarArr);
                }

                public static Object zzb(String str, String str2, ClassLoader classLoader, zzi... zziVarArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
/* 11 */            return zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, zziVarArr);
                }

                private static Object zzc(Class cls, String str, Object obj, boolean z, zzi... zziVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
/* 1 */             int length = zziVarArr.length;
/* 2 */             Class<?>[] clsArr = new Class[length];
/* 4 */             Object[] objArr = new Object[length];
/* 8 */             for (int i = 0; i < zziVarArr.length; i++) {
/* 10 */                zzi zziVar = zziVarArr[i];
/* 12 */                zziVar.getClass();
/* 19 */                clsArr[i] = zziVar.zzc();
/* 27 */                objArr[i] = zziVarArr[i].zzd();
                    }
/* 37 */            return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
                }
            }
