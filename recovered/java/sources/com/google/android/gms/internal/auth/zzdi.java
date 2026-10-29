            package com.google.android.gms.internal.auth;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdi extends zzdh {
                private final Object zza;

                public zzdi(Object obj) {
/* 4 */             this.zza = obj;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof zzdi) {
/* 11 */                return this.zza.equals(((zzdi) obj).zza);
                    }
/* 16 */            return false;
                }

                public final int hashCode() {
/* 10 */            return this.zza.hashCode() + 1502476572;
                }

                public final String toString() {
/* 18 */            return "Optional.of(" + this.zza + ")";
                }

                @Override // com.google.android.gms.internal.auth.zzdh
                public final Object zza() {
/* 1 */             return this.zza;
                }

                @Override // com.google.android.gms.internal.auth.zzdh
                public final boolean zzb() {
/* 1 */             return true;
                }
            }
