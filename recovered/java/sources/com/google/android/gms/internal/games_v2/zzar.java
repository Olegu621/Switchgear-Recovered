            package com.google.android.gms.internal.games_v2;

            import android.app.Application;
            import com.google.android.gms.tasks.Task;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzar {
                private final zzav zza;

                private zzar(zzav zzavVar) {
/* 4 */             this.zza = zzavVar;
                }

                public static zzar zza(Application application) {
/* 7 */             return new zzar(zzax.zza(application));
                }

                public final Task zzb(zzaq zzaqVar) {
/* 1 */             zzav zzavVar = this.zza;
/* 3 */             zzaqVar.getClass();
/* 11 */            return zzavVar.zzd(new zzap(zzaqVar));
                }
            }
