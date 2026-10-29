            package com.google.android.gms.internal.auth;

            import java.io.Serializable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdk implements Serializable, zzdj {
                final zzdj zza;
                volatile transient boolean zzb;
                transient Object zzc;

                public zzdk(zzdj zzdjVar) {
/* 4 */             zzdjVar.getClass();
/* 7 */             this.zza = zzdjVar;
                }

                public final String toString() {
                    Object obj;
/* 5 */             StringBuilder sb = new StringBuilder("Suppliers.memoize(");
/* 10 */            if (this.zzb) {
/* 29 */                obj = "<supplier that returned " + this.zzc + ">";
                    } else {
/* 34 */                obj = this.zza;
                    }
/* 36 */            sb.append(obj);
/* 41 */            sb.append(")");
/* 44 */            return sb.toString();
                }

                @Override // com.google.android.gms.internal.auth.zzdj
                public final Object zza() {
/* 3 */             if (!this.zzb) {
                        synchronized (this) {
                            try {
/* 8 */                         if (!this.zzb) {
/* 12 */                            Object objZza = this.zza.zza();
/* 16 */                            this.zzc = objZza;
/* 19 */                            this.zzb = true;
/* 22 */                            return objZza;
                                }
                            } catch (Throwable th) {
/* 28 */                        throw th;
                            }
                        }
                    }
/* 29 */            return this.zzc;
                }
            }
