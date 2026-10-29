            package com.google.android.gms.internal.games_v2;

            import android.app.Application;
            import com.google.android.gms.games.internal.p006v2.resolution.C0329a;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.bh3;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzax {
                private static final AtomicReference zza = new AtomicReference();

                public static zzav zza(Application application) {
/* 1 */             AtomicReference atomicReference = zza;
/* 7 */             zzav zzavVar = (zzav) atomicReference.get();
/* 9 */             if (zzavVar != null) {
/* 11 */                return zzavVar;
                    }
/* 12 */            zzo zzoVarZza = zzq.zza();
/* 18 */            zzoVarZza.zza(9);
/* 25 */            zzoVarZza.zzb(application.getPackageName());
/* 28 */            zzq zzqVarZzc = zzoVarZza.zzc();
/* 32 */            bh3 bh3VarM1359b = bh3.m1359b(application);
/* 56 */            zzbl zzblVar = new zzbl(application, bh3VarM1359b, new C0329a(), new zzbp(application, bh3VarM1359b, new zzaw(application, zzqVarZzc), null), null);
/* 63 */            while (!atomicReference.compareAndSet(null, zzblVar) && (atomicReference.get() == null || atomicReference.get() == null)) {
                    }
/* 84 */            zzav zzavVar2 = (zzav) zza.get();
/* 86 */            kb1.m6061n(zzavVar2);
/* 89 */            return zzavVar2;
                }
            }
