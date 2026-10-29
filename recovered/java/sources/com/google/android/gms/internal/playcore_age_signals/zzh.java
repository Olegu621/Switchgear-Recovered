            package com.google.android.gms.internal.playcore_age_signals;

            import com.google.android.gms.tasks.TaskCompletionSource;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzh extends zze {
                final /* synthetic */ TaskCompletionSource zza;
                final /* synthetic */ zze zzb;
                final /* synthetic */ zzo zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzh(zzo zzoVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zze zzeVar) {
/* 10 */            super(taskCompletionSource);
/* 1 */             this.zza = taskCompletionSource2;
/* 3 */             this.zzb = zzeVar;
/* 5 */             Objects.requireNonNull(zzoVar);
/* 8 */             this.zzc = zzoVar;
                }

                @Override // com.google.android.gms.internal.playcore_age_signals.zze
                public final void zzb() {
/* 1 */             zzo zzoVar = this.zzc;
                    synchronized (zzoVar.zzg) {
                        try {
/* 10 */                    zzo.zzo(zzoVar, this.zza);
/* 21 */                    if (zzoVar.zzl.getAndIncrement() > 0) {
/* 32 */                        zzoVar.zzc.zzc("Already connected to the service.", new Object[0]);
                            }
/* 40 */                    zzo.zzq(zzoVar, this.zzb);
                        } catch (Throwable th) {
/* 46 */                    throw th;
                        }
                    }
                }
            }
