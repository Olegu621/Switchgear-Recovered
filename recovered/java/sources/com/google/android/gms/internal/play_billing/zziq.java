            package com.google.android.gms.internal.play_billing;

            import java.io.IOException;
            import java.util.Iterator;
            import java.util.Map;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zziq implements zzix {
                private final zzim zza;
                private final zzjj zzb;
                private final boolean zzc;
                private final zzgx zzd;

                private zziq(zzjj zzjjVar, zzgx zzgxVar, zzim zzimVar) {
/* 4 */             this.zzb = zzjjVar;
/* 8 */             this.zzc = zzimVar instanceof zzhh;
/* 10 */            this.zzd = zzgxVar;
/* 12 */            this.zza = zzimVar;
                }

                public static zziq zzc(zzjj zzjjVar, zzgx zzgxVar, zzim zzimVar) {
/* 3 */             return new zziq(zzjjVar, zzgxVar, zzimVar);
                }

                @Override // com.google.android.gms.internal.play_billing.zzix
                public final int zza(Object obj) {
/* 6 */             int iZzb = ((zzhk) obj).zzc.zzb();
                    return this.zzc ? iZzb + ((zzhh) obj).zzb.zzc() : iZzb;
                }

                @Override // com.google.android.gms.internal.play_billing.zzix
                public final int zzb(Object obj) {
/* 6 */             int iHashCode = ((zzhk) obj).zzc.hashCode();
                    return this.zzc ? (iHashCode * 53) + ((zzhh) obj).zzb.zza.hashCode() : iHashCode;
                }

                @Override // com.google.android.gms.internal.play_billing.zzix
                public final Object zze() {
/* 1 */             zzim zzimVar = this.zza;
                    return zzimVar instanceof zzhk ? ((zzhk) zzimVar).zzp() : zzimVar.zzI().zzh();
                }

                @Override // com.google.android.gms.internal.play_billing.zzix
                public final void zzf(Object obj) {
/* 3 */             this.zzb.zza(obj);
/* 8 */             this.zzd.zza(obj);
                }

                @Override // com.google.android.gms.internal.play_billing.zzix
                public final void zzg(Object obj, Object obj2) {
/* 3 */             zziz.zzp(this.zzb, obj, obj2);
/* 8 */             if (this.zzc) {
/* 12 */                zziz.zzo(this.zzd, obj, obj2);
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzix
                public final void zzh(Object obj, byte[] bArr, int i, int i2, zzfz zzfzVar) throws IOException {
/* 2 */             zzhk zzhkVar = (zzhk) obj;
/* 10 */            if (zzhkVar.zzc == zzjk.zzc()) {
/* 17 */                zzhkVar.zzc = zzjk.zzf();
                    }
/* 22 */            throw null;
                }

                @Override // com.google.android.gms.internal.play_billing.zzix
                public final void zzi(Object obj, zzjw zzjwVar) throws IOException {
/* 6 */             Iterator itZze = ((zzhh) obj).zzb.zze();
/* 14 */            while (itZze.hasNext()) {
/* 20 */                Map.Entry entry = (Map.Entry) itZze.next();
/* 26 */                zzha zzhaVar = (zzha) entry.getKey();
/* 34 */                if (zzhaVar.zzc() != zzjv.MESSAGE || zzhaVar.zze() || zzhaVar.zzd()) {
/* 84 */                    f42.m3656l("Found invalid MessageSet item.");
/* 87 */                    return;
                        } else if (entry instanceof zzht) {
/* 66 */                    zzjwVar.zzw(zzhaVar.zza(), ((zzht) entry).zza().zzb());
                        } else {
/* 78 */                    zzjwVar.zzw(zzhaVar.zza(), entry.getValue());
                        }
                    }
/* 92 */            ((zzhk) obj).zzc.zzk(zzjwVar);
                }

                @Override // com.google.android.gms.internal.play_billing.zzix
                public final boolean zzj(Object obj, Object obj2) {
/* 15 */            if (!((zzhk) obj).zzc.equals(((zzhk) obj2).zzc)) {
/* 17 */                return false;
                    }
/* 21 */            if (this.zzc) {
/* 31 */                return ((zzhh) obj).zzb.equals(((zzhh) obj2).zzb);
                    }
/* 36 */            return true;
                }

                @Override // com.google.android.gms.internal.play_billing.zzix
                public final boolean zzk(Object obj) {
/* 5 */             return ((zzhh) obj).zzb.zzh();
                }
            }
