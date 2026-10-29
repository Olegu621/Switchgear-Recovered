            package com.google.android.gms.internal.auth;

            import android.content.Context;
            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcd extends zzda {
                private final Context zza;
                private final zzdj zzb;

                public zzcd(Context context, zzdj zzdjVar) {
/* 4 */             if (context == null) {
/* 13 */                C1951n4.m6868s("Null context");
/* 17 */                throw null;
                    }
/* 6 */             this.zza = context;
/* 8 */             this.zzb = zzdjVar;
                }

                public final boolean equals(Object obj) {
                    zzdj zzdjVar;
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof zzda) {
/* 10 */                zzda zzdaVar = (zzda) obj;
/* 22 */                if (this.zza.equals(zzdaVar.zza()) && ((zzdjVar = this.zzb) != null ? zzdjVar.equals(zzdaVar.zzb()) : zzdaVar.zzb() == null)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 11 */            int iHashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
/* 12 */            zzdj zzdjVar = this.zzb;
/* 22 */            return (zzdjVar == null ? 0 : zzdjVar.hashCode()) ^ iHashCode;
                }

                public final String toString() {
/* 19 */            return fm0.m3785k("FlagsContext{context=", this.zza.toString(), ", hermeticFileOverrides=", String.valueOf(this.zzb), "}");
                }

                @Override // com.google.android.gms.internal.auth.zzda
                public final Context zza() {
/* 1 */             return this.zza;
                }

                @Override // com.google.android.gms.internal.auth.zzda
                public final zzdj zzb() {
/* 1 */             return this.zzb;
                }
            }
