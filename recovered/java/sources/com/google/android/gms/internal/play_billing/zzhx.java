            package com.google.android.gms.internal.play_billing;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzhx {
                protected volatile zzim zza;
                private volatile zzgk zzb;

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzhx)) {
/* 9 */                 return false;
                    }
/* 11 */            zzhx zzhxVar = (zzhx) obj;
/* 13 */            zzim zzimVar = this.zza;
/* 15 */            zzim zzimVar2 = zzhxVar.zza;
/* 17 */            if (zzimVar == null && zzimVar2 == null) {
/* 30 */                return zzb().equals(zzhxVar.zzb());
                    }
/* 35 */            if (zzimVar != null && zzimVar2 != null) {
/* 40 */                return zzimVar.equals(zzimVar2);
                    }
/* 45 */            if (zzimVar != null) {
/* 51 */                zzhxVar.zzd(zzimVar.zzi());
/* 56 */                return zzimVar.equals(zzhxVar.zza);
                    }
/* 65 */            zzd(zzimVar2.zzi());
/* 70 */            return this.zza.equals(zzimVar2);
                }

                public int hashCode() {
/* 1 */             return 1;
                }

                public final int zza() {
/* 3 */             if (this.zzb != null) {
/* 11 */                return ((zzgi) this.zzb).zza.length;
                    }
/* 15 */            if (this.zza != null) {
/* 19 */                return this.zza.zzk();
                    }
/* 24 */            return 0;
                }

                public final zzgk zzb() {
/* 3 */             if (this.zzb != null) {
/* 5 */                 return this.zzb;
                    }
                    synchronized (this) {
                        try {
/* 11 */                    if (this.zzb != null) {
/* 13 */                        return this.zzb;
                            }
/* 21 */                    if (this.zza == null) {
/* 25 */                        this.zzb = zzgk.zzb;
                            } else {
/* 34 */                        this.zzb = this.zza.zzf();
                            }
/* 36 */                    return this.zzb;
                        } catch (Throwable th) {
/* 41 */                    throw th;
                        }
                    }
                }

                public final zzim zzc(zzim zzimVar) {
/* 1 */             zzim zzimVar2 = this.zza;
/* 4 */             this.zzb = null;
/* 6 */             this.zza = zzimVar;
/* 8 */             return zzimVar2;
                }

                public final void zzd(zzim zzimVar) {
/* 3 */             if (this.zza != null) {
/* 29 */                return;
                    }
                    synchronized (this) {
/* 9 */                 if (this.zza != null) {
/* 12 */                    return;
                        }
                        try {
/* 15 */                    this.zza = zzimVar;
/* 19 */                    this.zzb = zzgk.zzb;
                        } catch (zzhr unused) {
/* 22 */                    this.zza = zzimVar;
/* 26 */                    this.zzb = zzgk.zzb;
                        }
                    }
                }
            }
