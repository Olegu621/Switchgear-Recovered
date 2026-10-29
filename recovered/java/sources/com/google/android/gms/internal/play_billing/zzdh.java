            package com.google.android.gms.internal.play_billing;

            import java.io.Serializable;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzdh extends zzdi implements Serializable {
                public static final /* synthetic */ int zzc = 0;
                private static final zzdh zzd = new zzdh(zzcd.zzb, zzcb.zzb);
                final zzce zza;
                final zzce zzb;

                private zzdh(zzce zzceVar, zzce zzceVar2) {
/* 4 */             this.zza = zzceVar;
/* 6 */             this.zzb = zzceVar2;
/* 12 */            if (zzceVar.compareTo(zzceVar2) > 0 || zzceVar == zzcb.zzb || zzceVar2 == zzcd.zzb) {
/* 37 */                C1951n4.m6859j("Invalid range: ".concat(zze(zzceVar, zzceVar2)));
/* 41 */                throw null;
                    }
                }

                public static zzdh zza() {
/* 1 */             return zzd;
                }

                private static String zze(zzce zzceVar, zzce zzceVar2) {
/* 5 */             StringBuilder sb = new StringBuilder(16);
/* 8 */             zzceVar.zzc(sb);
/* 13 */            sb.append("..");
/* 16 */            zzceVar2.zzd(sb);
/* 19 */            return sb.toString();
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof zzdh) {
/* 6 */                 zzdh zzdhVar = (zzdh) obj;
/* 16 */                if (this.zza.equals(zzdhVar.zza) && this.zzb.equals(zzdhVar.zzb)) {
/* 28 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 15 */            return (this.zza.hashCode() * 31) + this.zzb.hashCode();
                }

                public final String toString() {
/* 5 */             return zze(this.zza, this.zzb);
                }

                public final zzdh zzb(zzdh zzdhVar) {
/* 5 */             int iCompareTo = this.zza.compareTo(zzdhVar.zza);
/* 13 */            int iCompareTo2 = this.zzb.compareTo(zzdhVar.zzb);
/* 17 */            if (iCompareTo >= 0 && iCompareTo2 <= 0) {
/* 22 */                return this;
                    }
/* 23 */            if (iCompareTo <= 0 && iCompareTo2 >= 0) {
/* 28 */                return zzdhVar;
                    }
/* 34 */            zzce zzceVar = iCompareTo >= 0 ? this.zza : zzdhVar.zza;
/* 41 */            zzce zzceVar2 = iCompareTo2 <= 0 ? this.zzb : zzdhVar.zzb;
/* 54 */            zzbe.zzd(zzceVar.compareTo(zzceVar2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, zzdhVar);
/* 59 */            return new zzdh(zzceVar, zzceVar2);
                }

                public final zzdh zzc(zzdh zzdhVar) {
/* 5 */             int iCompareTo = this.zza.compareTo(zzdhVar.zza);
/* 13 */            int iCompareTo2 = this.zzb.compareTo(zzdhVar.zzb);
/* 17 */            if (iCompareTo <= 0 && iCompareTo2 >= 0) {
/* 22 */                return this;
                    }
/* 23 */            if (iCompareTo >= 0 && iCompareTo2 <= 0) {
/* 28 */                return zzdhVar;
                    }
/* 34 */            zzce zzceVar = iCompareTo <= 0 ? this.zza : zzdhVar.zza;
/* 36 */            if (iCompareTo2 < 0) {
/* 38 */                this = zzdhVar;
                    }
/* 43 */            return new zzdh(zzceVar, this.zzb);
                }

                public final boolean zzd() {
/* 5 */             return this.zza.equals(this.zzb);
                }
            }
