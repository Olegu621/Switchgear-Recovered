            package com.google.android.gms.internal.play_billing;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzl extends zzf {
                final AtomicReferenceFieldUpdater zza;
                final AtomicReferenceFieldUpdater zzb;
                final AtomicReferenceFieldUpdater zzc;
                final AtomicReferenceFieldUpdater zzd;
                final AtomicReferenceFieldUpdater zze;

                public zzl(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
/* 2 */             super(null);
/* 5 */             this.zza = atomicReferenceFieldUpdater;
/* 7 */             this.zzb = atomicReferenceFieldUpdater2;
/* 9 */             this.zzc = atomicReferenceFieldUpdater3;
/* 11 */            this.zzd = atomicReferenceFieldUpdater4;
/* 13 */            this.zze = atomicReferenceFieldUpdater5;
                }

                @Override // com.google.android.gms.internal.play_billing.zzf
                public final void zza(zzo zzoVar, zzo zzoVar2) {
/* 3 */             this.zzb.lazySet(zzoVar, zzoVar2);
                }

                @Override // com.google.android.gms.internal.play_billing.zzf
                public final void zzb(zzo zzoVar, Thread thread) {
/* 3 */             this.zza.lazySet(zzoVar, thread);
                }

                @Override // com.google.android.gms.internal.play_billing.zzf
                public final boolean zzc(zzq zzqVar, zzj zzjVar, zzj zzjVar2) {
/* 3 */             return zzk.zza(this.zzd, zzqVar, zzjVar, zzjVar2);
                }

                @Override // com.google.android.gms.internal.play_billing.zzf
                public final boolean zzd(zzq zzqVar, Object obj, Object obj2) {
/* 3 */             return zzk.zza(this.zze, zzqVar, obj, obj2);
                }

                @Override // com.google.android.gms.internal.play_billing.zzf
                public final boolean zze(zzq zzqVar, zzo zzoVar, zzo zzoVar2) {
/* 3 */             return zzk.zza(this.zzc, zzqVar, zzoVar, zzoVar2);
                }
            }
