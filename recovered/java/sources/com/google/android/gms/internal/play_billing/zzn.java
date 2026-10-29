            package com.google.android.gms.internal.play_billing;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzn extends zzf {
                public zzn() {
/* 2 */             super(null);
                }

                @Override // com.google.android.gms.internal.play_billing.zzf
                public final void zza(zzo zzoVar, zzo zzoVar2) {
/* 1 */             zzoVar.zzc = zzoVar2;
                }

                @Override // com.google.android.gms.internal.play_billing.zzf
                public final void zzb(zzo zzoVar, Thread thread) {
/* 1 */             zzoVar.zzb = thread;
                }

                @Override // com.google.android.gms.internal.play_billing.zzf
                public final boolean zzc(zzq zzqVar, zzj zzjVar, zzj zzjVar2) {
                    synchronized (zzqVar) {
                        try {
/* 4 */                     if (zzqVar.zzd != zzjVar) {
/* 14 */                        return false;
                            }
/* 6 */                     zzqVar.zzd = zzjVar2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 17 */                    throw th;
                        }
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzf
                public final boolean zzd(zzq zzqVar, Object obj, Object obj2) {
                    synchronized (zzqVar) {
                        try {
/* 4 */                     if (zzqVar.zzc != obj) {
/* 14 */                        return false;
                            }
/* 6 */                     zzqVar.zzc = obj2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 17 */                    throw th;
                        }
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzf
                public final boolean zze(zzq zzqVar, zzo zzoVar, zzo zzoVar2) {
                    synchronized (zzqVar) {
                        try {
/* 4 */                     if (zzqVar.zze != zzoVar) {
/* 14 */                        return false;
                            }
/* 6 */                     zzqVar.zze = zzoVar2;
/* 9 */                     return true;
                        } catch (Throwable th) {
/* 17 */                    throw th;
                        }
                    }
                }
            }
