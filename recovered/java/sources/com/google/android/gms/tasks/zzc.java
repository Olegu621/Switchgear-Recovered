            package com.google.android.gms.tasks;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzc implements Runnable {
                final /* synthetic */ Task zza;
                final /* synthetic */ zzd zzb;

                public zzc(zzd zzdVar, Task task) {
/* 1 */             this.zzb = zzdVar;
/* 3 */             this.zza = task;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 3 */             boolean zIsCanceled = this.zza.isCanceled();
/* 7 */             zzd zzdVar = this.zzb;
/* 9 */             if (zIsCanceled) {
/* 15 */                zzdVar.zzc.zzc();
/* 18 */                return;
                    }
                    try {
/* 35 */                this.zzb.zzc.zzb(zzdVar.zzb.then(this.zza));
                    } catch (RuntimeExecutionException e) {
/* 57 */                boolean z = e.getCause() instanceof Exception;
/* 59 */                zzd zzdVar2 = this.zzb;
/* 61 */                if (z) {
/* 73 */                    zzdVar2.zzc.zza((Exception) e.getCause());
                        } else {
/* 81 */                    zzdVar2.zzc.zza(e);
                        }
                    } catch (Exception e2) {
/* 49 */                this.zzb.zzc.zza(e2);
                    }
                }
            }
