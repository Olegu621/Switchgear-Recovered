            package com.google.android.gms.tasks;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzg implements Runnable {
                final /* synthetic */ zzh zza;

                public zzg(zzh zzhVar) {
/* 1 */             this.zza = zzhVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this.zza.zzb) {
                        try {
/* 8 */                     zzh zzhVar = this.zza;
/* 14 */                    if (zzhVar.zzc != null) {
/* 20 */                        zzhVar.zzc.onCanceled();
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
                }
            }
