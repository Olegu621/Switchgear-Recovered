            package com.google.android.gms.internal.auth;

            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzhg extends zzhh {
                public zzhg(Unsafe unsafe) {
/* 1 */             super(unsafe);
                }

                @Override // com.google.android.gms.internal.auth.zzhh
                public final double zza(Object obj, long j) {
/* 5 */             return Double.longBitsToDouble(zzj(obj, j));
                }

                @Override // com.google.android.gms.internal.auth.zzhh
                public final float zzb(Object obj, long j) {
/* 5 */             return Float.intBitsToFloat(zzi(obj, j));
                }

                @Override // com.google.android.gms.internal.auth.zzhh
                public final void zzc(Object obj, long j, boolean z) {
/* 3 */             if (zzhi.zza) {
/* 5 */                 zzhi.zzi(obj, j, z);
                    } else {
/* 9 */                 zzhi.zzj(obj, j, z);
                    }
                }

                @Override // com.google.android.gms.internal.auth.zzhh
                public final void zzd(Object obj, long j, double d) {
/* 5 */             zzn(obj, j, Double.doubleToLongBits(d));
                }

                @Override // com.google.android.gms.internal.auth.zzhh
                public final void zze(Object obj, long j, float f) {
/* 5 */             zzm(obj, j, Float.floatToIntBits(f));
                }

                @Override // com.google.android.gms.internal.auth.zzhh
                public final boolean zzf(Object obj, long j) {
                    return zzhi.zza ? zzhi.zzq(obj, j) : zzhi.zzr(obj, j);
                }
            }
