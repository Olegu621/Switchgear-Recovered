            package com.google.android.gms.internal.drive;

            import java.io.IOException;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    final class zzmz extends zzmx<zzmy, zzmy> {
                @Override // com.google.android.gms.internal.drive.zzmx
                public final /* synthetic */ void zza(zzmy zzmyVar, int i, long j) {
/* 9 */             zzmyVar.zzb(i << 3, Long.valueOf(j));
                }

                @Override // com.google.android.gms.internal.drive.zzmx
                public final /* synthetic */ void zzc(zzmy zzmyVar, zzns zznsVar) throws IOException {
/* 3 */             zzmyVar.zza(zznsVar);
                }

                @Override // com.google.android.gms.internal.drive.zzmx
                public final void zzd(Object obj) {
/* 5 */             ((zzkk) obj).zzrq.zzbp();
                }

                @Override // com.google.android.gms.internal.drive.zzmx
                public final /* synthetic */ void zze(Object obj, zzmy zzmyVar) {
/* 3 */             zza(obj, zzmyVar);
                }

                @Override // com.google.android.gms.internal.drive.zzmx
                public final /* synthetic */ zzmy zzez() {
/* 1 */             return zzmy.zzfb();
                }

                @Override // com.google.android.gms.internal.drive.zzmx
                public final /* synthetic */ void zzf(Object obj, zzmy zzmyVar) {
/* 3 */             zza(obj, zzmyVar);
                }

                @Override // com.google.android.gms.internal.drive.zzmx
                public final /* synthetic */ zzmy zzg(zzmy zzmyVar, zzmy zzmyVar2) {
/* 1 */             zzmy zzmyVar3 = zzmyVar;
/* 3 */             zzmy zzmyVar4 = zzmyVar2;
                    return zzmyVar4.equals(zzmy.zzfa()) ? zzmyVar3 : zzmy.zza(zzmyVar3, zzmyVar4);
                }

                @Override // com.google.android.gms.internal.drive.zzmx
                public final /* synthetic */ int zzn(zzmy zzmyVar) {
/* 3 */             return zzmyVar.zzcx();
                }

                @Override // com.google.android.gms.internal.drive.zzmx
                public final /* synthetic */ zzmy zzr(Object obj) {
/* 3 */             return ((zzkk) obj).zzrq;
                }

                @Override // com.google.android.gms.internal.drive.zzmx
                public final /* synthetic */ int zzs(zzmy zzmyVar) {
/* 3 */             return zzmyVar.zzfc();
                }

                @Override // com.google.android.gms.internal.drive.zzmx
/* 12 */        public final /* synthetic */ void zza(zzmy zzmyVar, zzns zznsVar) throws IOException {
/* 14 */            zzmyVar.zzb(zznsVar);
                }

                @Override // com.google.android.gms.internal.drive.zzmx
/* 14 */        public final /* synthetic */ void zza(zzmy zzmyVar, int i, zzjc zzjcVar) {
/* 16 */            zzmyVar.zzb((i << 3) | 2, zzjcVar);
                }

/* 16 */        private static void zza(Object obj, zzmy zzmyVar) {
/* 17 */            ((zzkk) obj).zzrq = zzmyVar;
                }
            }
