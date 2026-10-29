            package com.google.android.recaptcha.internal;

            import android.app.Application;
            import com.google.android.gms.tasks.Task;
            import com.google.android.recaptcha.RecaptchaException;
            import p000.C1020i9;
            import p000.c10;
            import p000.i13;
            import p000.lo2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzdz {
                private static zzeh zza;

                public static final zzeh zza(Application application) {
/* 1 */             zzeh zzehVar = zza;
/* 3 */             if (zzehVar == null) {
/* 7 */                 zzehVar = new zzeh(application);
                    }
/* 12 */            if (zza == null) {
/* 14 */                zza = zzehVar;
                    }
/* 16 */            return zzehVar;
                }

                public static final Object zzb(Application application, String str, long j, c10 c10Var) throws C1020i9, RecaptchaException, lo2 {
/* 13 */            return zzeh.zzd(zza(application), str, j, null, null, c10Var, 12, null);
                }

                public static final Task zzc(Application application, String str, long j) throws C1020i9, RecaptchaException, lo2 {
/* 28 */            return zzbv.zza(i13.m4427d(zza(application).zza().zza(), null, new zzdx(application, str, j, null), 3));
                }

                public static final Object zzd(Application application, String str, c10 c10Var) throws C1020i9, RecaptchaException {
/* 14 */            return zzeh.zzd(zza(application), str, 0L, null, zzdq.zzb, c10Var, 2, null);
                }

                public static final Task zze(Application application, String str) throws C1020i9, RecaptchaException {
/* 24 */            return zzbv.zza(i13.m4427d(zza(application).zza().zza(), null, new zzdy(application, str, null), 3));
                }
            }
