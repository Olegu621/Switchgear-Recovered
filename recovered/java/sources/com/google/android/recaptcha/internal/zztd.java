            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zztd {
                protected volatile zzts zza;
                private volatile zzqm zzb;
                private volatile boolean zzc;

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof zztd)) {
/* 9 */                 return false;
                    }
/* 11 */            zztd zztdVar = (zztd) obj;
/* 13 */            zzts zztsVar = this.zza;
/* 15 */            zzts zztsVar2 = zztdVar.zza;
/* 17 */            if (zztsVar == null && zztsVar2 == null) {
/* 30 */                return zzb().equals(zztdVar.zzb());
                    }
/* 35 */            if (zztsVar != null && zztsVar2 != null) {
/* 40 */                return zztsVar.equals(zztsVar2);
                    }
/* 45 */            if (zztsVar != null) {
/* 51 */                zztdVar.zzd(zztsVar.zzm());
/* 56 */                return zztsVar.equals(zztdVar.zza);
                    }
/* 65 */            zzd(zztsVar2.zzm());
/* 70 */            return this.zza.equals(zztsVar2);
                }

                public int hashCode() {
/* 1 */             return 1;
                }

                public final int zza() {
/* 3 */             if (this.zzb != null) {
/* 11 */                return ((zzqk) this.zzb).zza.length;
                    }
/* 15 */            if (this.zza != null) {
/* 19 */                return this.zza.zzo();
                    }
/* 24 */            return 0;
                }

                public final zzqm zzb() {
/* 3 */             if (this.zzb != null) {
/* 5 */                 return this.zzb;
                    }
                    synchronized (this) {
                        try {
/* 11 */                    if (this.zzb != null) {
/* 13 */                        return this.zzb;
                            }
/* 21 */                    if (this.zza == null) {
/* 25 */                        this.zzb = zzqm.zzb;
                            } else {
/* 34 */                        this.zzb = this.zza.zzb();
                            }
/* 36 */                    return this.zzb;
                        } catch (Throwable th) {
/* 41 */                    throw th;
                        }
                    }
                }

                public final zzts zzc(zzts zztsVar) {
/* 1 */             zzts zztsVar2 = this.zza;
/* 4 */             this.zzb = null;
/* 6 */             this.zza = zztsVar;
/* 8 */             return zztsVar2;
                }

                public final void zzd(zzts zztsVar) {
/* 3 */             if (this.zza != null) {
/* 32 */                return;
                    }
                    synchronized (this) {
/* 9 */                 if (this.zza != null) {
/* 12 */                    return;
                        }
                        try {
/* 15 */                    this.zza = zztsVar;
/* 19 */                    this.zzb = zzqm.zzb;
                        } catch (zzsx unused) {
/* 23 */                    this.zzc = true;
/* 25 */                    this.zza = zztsVar;
/* 29 */                    this.zzb = zzqm.zzb;
                        }
                    }
                }
            }
