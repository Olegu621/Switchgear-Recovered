            package com.google.android.gms.internal.auth;

            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzga implements zzgh {
                private final zzfw zza;
                private final zzgy zzb;
                private final zzel zzc;

                private zzga(zzgy zzgyVar, zzel zzelVar, zzfw zzfwVar) {
/* 4 */             this.zzb = zzgyVar;
/* 6 */             this.zzc = zzelVar;
/* 8 */             this.zza = zzfwVar;
                }

                public static zzga zzb(zzgy zzgyVar, zzel zzelVar, zzfw zzfwVar) {
/* 3 */             return new zzga(zzgyVar, zzelVar, zzfwVar);
                }

                @Override // com.google.android.gms.internal.auth.zzgh
                public final int zza(Object obj) {
/* 7 */             return this.zzb.zza(obj).hashCode();
                }

                @Override // com.google.android.gms.internal.auth.zzgh
                public final Object zzd() {
/* 13 */            return ((zzes) ((zzeu) this.zza).zzi(5, null, null)).zzg();
                }

                @Override // com.google.android.gms.internal.auth.zzgh
                public final void zze(Object obj) {
/* 3 */             this.zzb.zze(obj);
/* 8 */             this.zzc.zzb(obj);
                }

                @Override // com.google.android.gms.internal.auth.zzgh
                public final void zzf(Object obj, Object obj2) {
/* 3 */             zzgj.zzf(this.zzb, obj, obj2);
                }

                @Override // com.google.android.gms.internal.auth.zzgh
                public final void zzg(Object obj, byte[] bArr, int i, int i2, zzds zzdsVar) throws IOException {
/* 2 */             zzeu zzeuVar = (zzeu) obj;
/* 10 */            if (zzeuVar.zzc == zzgz.zza()) {
/* 17 */                zzeuVar.zzc = zzgz.zzc();
                    }
/* 22 */            throw null;
                }

                @Override // com.google.android.gms.internal.auth.zzgh
                public final boolean zzh(Object obj, Object obj2) {
                    return this.zzb.zza(obj).equals(this.zzb.zza(obj2));
                }

                @Override // com.google.android.gms.internal.auth.zzgh
                public final boolean zzi(Object obj) {
/* 3 */             this.zzc.zza(obj);
/* 7 */             throw null;
                }
            }
