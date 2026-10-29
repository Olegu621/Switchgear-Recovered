            package com.google.android.gms.internal.games_v2;

            import android.app.Application;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzau {
                private static final AtomicReference zza = new AtomicReference();
                private final zzat zzb;
                private final zzav zzc;

                public zzau(Application application, zzav zzavVar) {
/* 10 */            this.zzb = new zzat(this, application, null);
/* 12 */            this.zzc = zzavVar;
                }

                public static zzau zza(Application application) {
/* 1 */             AtomicReference atomicReference = zza;
/* 7 */             zzau zzauVar = (zzau) atomicReference.get();
/* 9 */             if (zzauVar != null) {
/* 11 */                return zzauVar;
                    }
/* 18 */            zzau zzauVar2 = new zzau(application, zzax.zza(application));
/* 26 */            while (!atomicReference.compareAndSet(null, zzauVar2) && (atomicReference.get() == null || atomicReference.get() == null)) {
                    }
/* 47 */            zzau zzauVar3 = (zzau) zza.get();
/* 49 */            kb1.m6061n(zzauVar3);
/* 52 */            return zzauVar3;
                }

                public final void zzc() {
/* 5 */             zzez.zza("AutomaticGamesAuthenticator", "startWatching()");
/* 10 */            zzat.zza(this.zzb);
                }
            }
