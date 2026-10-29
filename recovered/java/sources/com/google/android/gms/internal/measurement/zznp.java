            package com.google.android.gms.internal.measurement;

            import java.io.IOException;
            import java.util.Iterator;
            import java.util.Map;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zznp implements zznw {
                private final zznl zza;
                private final zzoh zzb;
                private final boolean zzc;
                private final zzlr zzd;

                private zznp(zzoh zzohVar, zzlr zzlrVar, zznl zznlVar) {
/* 4 */             this.zzb = zzohVar;
/* 8 */             this.zzc = zznlVar instanceof zzmb;
/* 10 */            this.zzd = zzlrVar;
/* 12 */            this.zza = zznlVar;
                }

                public static zznp zzg(zzoh zzohVar, zzlr zzlrVar, zznl zznlVar) {
/* 3 */             return new zznp(zzohVar, zzlrVar, zznlVar);
                }

                @Override // com.google.android.gms.internal.measurement.zznw
                public final Object zza() {
/* 1 */             zznl zznlVar = this.zza;
                    return zznlVar instanceof zzme ? ((zzme) zznlVar).zzch() : zznlVar.zzcC().zzbf();
                }

                @Override // com.google.android.gms.internal.measurement.zznw
                public final boolean zzb(Object obj, Object obj2) {
/* 15 */            if (!((zzme) obj).zzc.equals(((zzme) obj2).zzc)) {
/* 17 */                return false;
                    }
/* 21 */            if (this.zzc) {
/* 31 */                return ((zzmb) obj).zzb.equals(((zzmb) obj2).zzb);
                    }
/* 36 */            return true;
                }

                @Override // com.google.android.gms.internal.measurement.zznw
                public final int zzc(Object obj) {
/* 6 */             int iHashCode = ((zzme) obj).zzc.hashCode();
                    return this.zzc ? (iHashCode * 53) + ((zzmb) obj).zzb.zza.hashCode() : iHashCode;
                }

                @Override // com.google.android.gms.internal.measurement.zznw
                public final void zzd(Object obj, Object obj2) {
/* 3 */             zzny.zzD(this.zzb, obj, obj2);
/* 8 */             if (this.zzc) {
/* 12 */                zzny.zzC(this.zzd, obj, obj2);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zznw
                public final int zze(Object obj) {
/* 6 */             int iZzh = ((zzme) obj).zzc.zzh();
                    return this.zzc ? iZzh + ((zzmb) obj).zzb.zzg() : iZzh;
                }

                @Override // com.google.android.gms.internal.measurement.zznw
                public final void zzf(Object obj, zzou zzouVar) throws IOException {
/* 6 */             Iterator itZzc = ((zzmb) obj).zzb.zzc();
/* 14 */            while (itZzc.hasNext()) {
/* 20 */                Map.Entry entry = (Map.Entry) itZzc.next();
/* 26 */                zzlu zzluVar = (zzlu) entry.getKey();
/* 34 */                if (zzluVar.zzc() != zzot.MESSAGE || zzluVar.zzd() || zzluVar.zze()) {
/* 84 */                    f42.m3656l("Found invalid MessageSet item.");
/* 87 */                    return;
                        } else if (entry instanceof zzms) {
/* 66 */                    zzouVar.zzv(zzluVar.zza(), ((zzms) entry).zza().zzc());
                        } else {
/* 78 */                    zzouVar.zzv(zzluVar.zza(), entry.getValue());
                        }
                    }
/* 92 */            ((zzme) obj).zzc.zzf(zzouVar);
                }

                @Override // com.google.android.gms.internal.measurement.zznw
                public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkv zzkvVar) throws IOException {
/* 2 */             zzme zzmeVar = (zzme) obj;
/* 10 */            if (zzmeVar.zzc == zzoi.zza()) {
/* 17 */                zzmeVar.zzc = zzoi.zzb();
                    }
/* 22 */            throw null;
                }

                @Override // com.google.android.gms.internal.measurement.zznw
                public final void zzj(Object obj) {
/* 3 */             this.zzb.zzb(obj);
/* 8 */             this.zzd.zza(obj);
                }

                @Override // com.google.android.gms.internal.measurement.zznw
                public final boolean zzk(Object obj) {
/* 5 */             return ((zzmb) obj).zzb.zze();
                }
            }
