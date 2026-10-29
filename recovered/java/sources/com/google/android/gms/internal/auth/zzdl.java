            package com.google.android.gms.internal.auth;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdl implements zzdj {
                volatile zzdj zza;
                volatile boolean zzb;
                Object zzc;

                public zzdl(zzdj zzdjVar) {
/* 4 */             zzdjVar.getClass();
/* 7 */             this.zza = zzdjVar;
                }

                public final String toString() {
/* 1 */             Object obj = this.zza;
/* 7 */             StringBuilder sb = new StringBuilder("Suppliers.memoize(");
/* 10 */            if (obj == null) {
/* 29 */                obj = "<supplier that returned " + this.zzc + ">";
                    }
/* 33 */            sb.append(obj);
/* 38 */            sb.append(")");
/* 41 */            return sb.toString();
                }

                @Override // com.google.android.gms.internal.auth.zzdj
                public final Object zza() {
/* 3 */             if (!this.zzb) {
                        synchronized (this) {
                            try {
/* 8 */                         if (!this.zzb) {
/* 10 */                            zzdj zzdjVar = this.zza;
/* 12 */                            zzdjVar.getClass();
/* 15 */                            Object objZza = zzdjVar.zza();
/* 19 */                            this.zzc = objZza;
/* 22 */                            this.zzb = true;
/* 25 */                            this.zza = null;
/* 28 */                            return objZza;
                                }
                            } catch (Throwable th) {
/* 34 */                        throw th;
                            }
                        }
                    }
/* 35 */            return this.zzc;
                }
            }
