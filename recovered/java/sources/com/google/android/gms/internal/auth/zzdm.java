            package com.google.android.gms.internal.auth;

            import java.io.Serializable;
            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdm implements Serializable, zzdj {
                final Object zza;

                public zzdm(Object obj) {
/* 4 */             this.zza = obj;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zzdm)) {
/* 3 */                 return false;
                    }
/* 8 */             Object obj2 = this.zza;
/* 10 */            Object obj3 = ((zzdm) obj).zza;
                    return obj2 == obj3 || obj2.equals(obj3);
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.zza});
                }

                public final String toString() {
/* 18 */            return "Suppliers.ofInstance(" + this.zza + ")";
                }

                @Override // com.google.android.gms.internal.auth.zzdj
                public final Object zza() {
/* 1 */             return this.zza;
                }
            }
