            package com.google.android.gms.internal.measurement;

            import android.os.Binder;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            interface zzju {
                static Object zzg(zzjt zzjtVar) {
                    try {
/* 1 */                 return zzjtVar.zza();
                    } catch (SecurityException unused) {
/* 6 */                 long jClearCallingIdentity = Binder.clearCallingIdentity();
                        try {
/* 10 */                    return zzjtVar.zza();
                        } finally {
/* 19 */                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    }
                }

                Object zze(String str);
            }
