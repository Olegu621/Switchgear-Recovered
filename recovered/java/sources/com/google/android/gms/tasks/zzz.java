            package com.google.android.gms.tasks;

            import java.util.concurrent.Callable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzz implements Runnable {
                final /* synthetic */ zzw zza;
                final /* synthetic */ Callable zzb;

                public zzz(zzw zzwVar, Callable callable) {
/* 1 */             this.zza = zzwVar;
/* 3 */             this.zzb = callable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
/* 9 */                 this.zza.zzb(this.zzb.call());
                    } catch (Exception e) {
/* 30 */                this.zza.zza(e);
                    } catch (Throwable th) {
/* 24 */                this.zza.zza(new RuntimeException(th));
                    }
                }
            }
