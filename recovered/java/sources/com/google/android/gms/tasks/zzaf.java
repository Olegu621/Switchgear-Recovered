            package com.google.android.gms.tasks;

            import java.util.concurrent.ExecutionException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzaf<T> implements zzae<T> {
                private final Object zza = new Object();
                private final int zzb;
                private final zzw zzc;
                private int zzd;
                private int zze;
                private int zzf;
                private Exception zzg;
                private boolean zzh;

                public zzaf(int i, zzw zzwVar) {
/* 11 */            this.zzb = i;
/* 13 */            this.zzc = zzwVar;
                }

                private final void zza() {
/* 1 */             int i = this.zzd;
/* 3 */             int i2 = this.zze;
/* 8 */             int i3 = i + i2 + this.zzf;
/* 9 */             int i4 = this.zzb;
/* 11 */            if (i3 == i4) {
/* 15 */                if (this.zzg == null) {
/* 55 */                    boolean z = this.zzh;
/* 57 */                    zzw zzwVar = this.zzc;
/* 59 */                    if (z) {
/* 61 */                        zzwVar.zzc();
/* 64 */                        return;
                            } else {
/* 66 */                        zzwVar.zzb(null);
/* 69 */                        return;
                            }
                        }
/* 51 */                this.zzc.zza(new ExecutionException(i2 + " out of " + i4 + " underlying tasks failed", this.zzg));
                    }
                }

                @Override // com.google.android.gms.tasks.OnCanceledListener
                public final void onCanceled() {
                    synchronized (this.zza) {
/* 8 */                 this.zzf++;
/* 10 */                this.zzh = true;
/* 12 */                zza();
                    }
                }

                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    synchronized (this.zza) {
/* 8 */                 this.zze++;
/* 10 */                this.zzg = exc;
/* 12 */                zza();
                    }
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(T t) {
                    synchronized (this.zza) {
/* 8 */                 this.zzd++;
/* 10 */                zza();
                    }
                }
            }
