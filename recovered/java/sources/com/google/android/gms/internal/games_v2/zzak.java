            package com.google.android.gms.internal.games_v2;

            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzak {
                private final AtomicReference zza = new AtomicReference();

                public abstract zzaj zza();

                public final void zzb() {
/* 7 */             zzaj zzajVar = (zzaj) this.zza.get();
/* 9 */             if (zzajVar != null) {
/* 11 */                zzajVar.zzd();
                    }
                }

                public final void zzc(String str, int i) {
/* 7 */             zzaj zzajVar = (zzaj) this.zza.get();
/* 9 */             if (zzajVar == null) {
/* 11 */                zzaj zzajVarZza = zza();
/* 15 */                AtomicReference atomicReference = this.zza;
/* 22 */                while (!atomicReference.compareAndSet(null, zzajVarZza)) {
/* 30 */                    if (atomicReference.get() != null && atomicReference.get() != null) {
/* 45 */                        zzajVar = (zzaj) this.zza.get();
                            }
                        }
/* 24 */                zzajVar = zzajVarZza;
                    }
/* 47 */            zzajVar.zzc(str, i);
                }
            }
