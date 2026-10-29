            package com.google.android.gms.internal.playcore_age_signals;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzi extends zze {
                final /* synthetic */ zzo zza;

                public zzi(zzo zzoVar) {
/* 1 */             Objects.requireNonNull(zzoVar);
/* 4 */             this.zza = zzoVar;
                }

                @Override // com.google.android.gms.internal.playcore_age_signals.zze
                public final void zzb() {
/* 1 */             zzo zzoVar = this.zza;
                    synchronized (zzoVar.zzg) {
                        try {
/* 17 */                    if (zzoVar.zzl.get() > 0 && zzoVar.zzl.decrementAndGet() > 0) {
/* 37 */                        zzoVar.zzc.zzc("Leaving the connection open for other ongoing calls.", new Object[0]);
/* 41 */                        return;
                            }
/* 48 */                    if (zzoVar.zzn != null) {
/* 58 */                        zzoVar.zzc.zzc("Unbind from service.", new Object[0]);
/* 69 */                        zzoVar.zzb.unbindService(zzoVar.zzm);
/* 2 */                         zzoVar.zzh = false;
/* 1 */                         zzoVar.zzn = null;
/* 2 */                         zzoVar.zzm = null;
                            }
/* 1 */                     zzoVar.zzw();
                        } catch (Throwable th) {
/* 88 */                    throw th;
                        }
                    }
                }
            }
