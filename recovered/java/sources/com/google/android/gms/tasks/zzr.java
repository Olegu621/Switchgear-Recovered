            package com.google.android.gms.tasks;

            import java.util.ArrayDeque;
            import java.util.Queue;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzr {
                private final Object zza = new Object();
                private Queue zzb;
                private boolean zzc;

                public final void zza(zzq zzqVar) {
                    synchronized (this.zza) {
                        try {
/* 6 */                     if (this.zzb == null) {
/* 13 */                        this.zzb = new ArrayDeque();
                            }
/* 20 */                    this.zzb.add(zzqVar);
                        } catch (Throwable th) {
/* 26 */                    throw th;
                        }
                    }
                }

                public final void zzb(Task task) {
                    zzq zzqVar;
                    synchronized (this.zza) {
/* 6 */                 if (this.zzb != null && !this.zzc) {
/* 14 */                    this.zzc = true;
                            while (true) {
                                synchronized (this.zza) {
                                    try {
/* 26 */                                zzqVar = (zzq) this.zzb.poll();
/* 28 */                                if (zzqVar == null) {
/* 31 */                                    this.zzc = false;
/* 34 */                                    return;
                                        }
                                    } catch (Throwable th) {
/* 43 */                                throw th;
                                    }
                                }
/* 38 */                        zzqVar.zzd(task);
                            }
                        }
                    }
                }
            }
