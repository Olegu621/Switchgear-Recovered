            package com.google.android.gms.tasks;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzi implements Runnable {
                final /* synthetic */ Task zza;
                final /* synthetic */ zzj zzb;

                public zzi(zzj zzjVar, Task task) {
/* 1 */             this.zzb = zzjVar;
/* 3 */             this.zza = task;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (this.zzb.zzb) {
                        try {
/* 8 */                     zzj zzjVar = this.zzb;
/* 14 */                    if (zzjVar.zzc != null) {
/* 22 */                        zzjVar.zzc.onComplete(this.zza);
                            }
                        } catch (Throwable th) {
/* 31 */                    throw th;
                        }
                    }
                }
            }
