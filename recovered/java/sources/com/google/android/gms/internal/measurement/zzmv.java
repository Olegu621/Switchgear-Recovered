            package com.google.android.gms.internal.measurement;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzmv {
                protected volatile zznl zza;
                private volatile zzlg zzb;
                private volatile boolean zzc;

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zzmv)) {
/* 9 */                 return false;
                    }
/* 11 */            zzmv zzmvVar = (zzmv) obj;
/* 13 */            zznl zznlVar = this.zza;
/* 15 */            zznl zznlVar2 = zzmvVar.zza;
/* 17 */            if (zznlVar == null && zznlVar2 == null) {
/* 30 */                return zzc().equals(zzmvVar.zzc());
                    }
/* 35 */            if (zznlVar != null && zznlVar2 != null) {
/* 40 */                return zznlVar.equals(zznlVar2);
                    }
/* 45 */            if (zznlVar != null) {
/* 51 */                zzmvVar.zzd(zznlVar.zzcE());
/* 56 */                return zznlVar.equals(zzmvVar.zza);
                    }
/* 65 */            zzd(zznlVar2.zzcE());
/* 70 */            return this.zza.equals(zznlVar2);
                }

                public int hashCode() {
/* 1 */             return 1;
                }

                public final zznl zza(zznl zznlVar) {
/* 1 */             zznl zznlVar2 = this.zza;
/* 4 */             this.zzb = null;
/* 6 */             this.zza = zznlVar;
/* 8 */             return zznlVar2;
                }

                public final int zzb() {
/* 3 */             if (this.zzb != null) {
/* 11 */                return ((zzlf) this.zzb).zza.length;
                    }
/* 15 */            if (this.zza != null) {
/* 19 */                return this.zza.zzcn();
                    }
/* 24 */            return 0;
                }

                public final zzlg zzc() {
/* 3 */             if (this.zzb != null) {
/* 5 */                 return this.zzb;
                    }
                    synchronized (this) {
                        try {
/* 11 */                    if (this.zzb != null) {
/* 13 */                        return this.zzb;
                            }
/* 21 */                    if (this.zza == null) {
/* 25 */                        this.zzb = zzlg.zzb;
                            } else {
/* 34 */                        this.zzb = this.zza.zzcb();
                            }
/* 36 */                    return this.zzb;
                        } catch (Throwable th) {
/* 41 */                    throw th;
                        }
                    }
                }

                public final void zzd(zznl zznlVar) {
/* 3 */             if (this.zza != null) {
/* 32 */                return;
                    }
                    synchronized (this) {
/* 9 */                 if (this.zza != null) {
/* 12 */                    return;
                        }
                        try {
/* 15 */                    this.zza = zznlVar;
/* 19 */                    this.zzb = zzlg.zzb;
                        } catch (zzmq unused) {
/* 23 */                    this.zzc = true;
/* 25 */                    this.zza = zznlVar;
/* 29 */                    this.zzb = zzlg.zzb;
                        }
                    }
                }
            }
