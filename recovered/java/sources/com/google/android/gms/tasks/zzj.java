            package com.google.android.gms.tasks;

            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzj implements zzq {
                private final Executor zza;
                private final Object zzb = new Object();
                private OnCompleteListener zzc;

                public zzj(Executor executor, OnCompleteListener onCompleteListener) {
/* 11 */            this.zza = executor;
/* 13 */            this.zzc = onCompleteListener;
                }

                @Override // com.google.android.gms.tasks.zzq
                public final void zzc() {
                    synchronized (this.zzb) {
/* 5 */                 this.zzc = null;
                    }
                }

                @Override // com.google.android.gms.tasks.zzq
                public final void zzd(Task task) {
                    synchronized (this.zzb) {
                        try {
/* 6 */                     if (this.zzc == null) {
/* 9 */                         return;
                            }
/* 20 */                    this.zza.execute(new zzi(this, task));
                        } catch (Throwable th) {
/* 25 */                    throw th;
                        }
                    }
                }
            }
