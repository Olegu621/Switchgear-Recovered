            package com.google.android.gms.tasks;

            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzn implements zzq {
                private final Executor zza;
                private final Object zzb = new Object();
                private OnSuccessListener zzc;

                public zzn(Executor executor, OnSuccessListener onSuccessListener) {
/* 11 */            this.zza = executor;
/* 13 */            this.zzc = onSuccessListener;
                }

                @Override // com.google.android.gms.tasks.zzq
                public final void zzc() {
                    synchronized (this.zzb) {
/* 5 */                 this.zzc = null;
                    }
                }

                @Override // com.google.android.gms.tasks.zzq
                public final void zzd(Task task) {
/* 5 */             if (task.isSuccessful()) {
                        synchronized (this.zzb) {
                            try {
/* 12 */                        if (this.zzc == null) {
/* 15 */                            return;
                                }
/* 26 */                        this.zza.execute(new zzm(this, task));
                            } catch (Throwable th) {
/* 31 */                        throw th;
                            }
                        }
                    }
                }
            }
