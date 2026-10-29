            package com.google.android.gms.internal.play_billing;

            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzjo extends zzjp {
                public zzjo(Unsafe unsafe) {
/* 1 */             super(unsafe);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjp
                public final double zza(Object obj, long j) {
/* 7 */             return Double.longBitsToDouble(this.zza.getLong(obj, j));
                }

                @Override // com.google.android.gms.internal.play_billing.zzjp
                public final float zzb(Object obj, long j) {
/* 7 */             return Float.intBitsToFloat(this.zza.getInt(obj, j));
                }

                @Override // com.google.android.gms.internal.play_billing.zzjp
                public final void zzc(Object obj, long j, boolean z) {
/* 3 */             if (zzjq.zzb) {
/* 1 */                 zzjq.zzD(obj, j, z ? (byte) 1 : (byte) 0);
                    } else {
/* 1 */                 zzjq.zzE(obj, j, z ? (byte) 1 : (byte) 0);
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjp
                public final void zzd(Object obj, long j, byte b) {
/* 3 */             if (zzjq.zzb) {
/* 1 */                 zzjq.zzD(obj, j, b);
                    } else {
/* 1 */                 zzjq.zzE(obj, j, b);
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjp
                public final void zze(Object obj, long j, double d) {
/* 7 */             this.zza.putLong(obj, j, Double.doubleToLongBits(d));
                }

                @Override // com.google.android.gms.internal.play_billing.zzjp
                public final void zzf(Object obj, long j, float f) {
/* 7 */             this.zza.putInt(obj, j, Float.floatToIntBits(f));
                }

                @Override // com.google.android.gms.internal.play_billing.zzjp
                public final boolean zzg(Object obj, long j) {
                    return zzjq.zzb ? zzjq.zzt(obj, j) : zzjq.zzu(obj, j);
                }
            }
