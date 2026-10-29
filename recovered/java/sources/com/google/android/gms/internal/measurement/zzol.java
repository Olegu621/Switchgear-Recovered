            package com.google.android.gms.internal.measurement;

            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzol extends zzon {
                public zzol(Unsafe unsafe) {
/* 1 */             super(unsafe);
                }

                @Override // com.google.android.gms.internal.measurement.zzon
                public final void zza(Object obj, long j, byte b) {
/* 3 */             if (zzoo.zzb) {
/* 1 */                 zzoo.zzD(obj, j, b);
                    } else {
/* 1 */                 zzoo.zzE(obj, j, b);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzon
                public final boolean zzb(Object obj, long j) {
                    return zzoo.zzb ? zzoo.zzu(obj, j) : zzoo.zzv(obj, j);
                }

                /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzoo.zzw(java.lang.Object, long, boolean):void */
                /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.zzoo.zzx(java.lang.Object, long, boolean):void */
                /* JADX WARN: Unknown register number '(r4v0 'z' boolean)' in method call: com.google.android.gms.internal.measurement.zzoo.zzw(java.lang.Object, long, boolean):void */
                /* JADX WARN: Unknown register number '(r4v0 'z' boolean)' in method call: com.google.android.gms.internal.measurement.zzoo.zzx(java.lang.Object, long, boolean):void */
                @Override // com.google.android.gms.internal.measurement.zzon
                public final void zzc(Object obj, long j, boolean z) {
/* 3 */             if (zzoo.zzb) {
/* 5 */                 zzoo.zzw(obj, j, z);
                    } else {
/* 9 */                 zzoo.zzx(obj, j, z);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzon
                public final float zzd(Object obj, long j) {
/* 7 */             return Float.intBitsToFloat(this.zza.getInt(obj, j));
                }

                @Override // com.google.android.gms.internal.measurement.zzon
                public final void zze(Object obj, long j, float f) {
/* 7 */             this.zza.putInt(obj, j, Float.floatToIntBits(f));
                }

                @Override // com.google.android.gms.internal.measurement.zzon
                public final double zzf(Object obj, long j) {
/* 7 */             return Double.longBitsToDouble(this.zza.getLong(obj, j));
                }

                @Override // com.google.android.gms.internal.measurement.zzon
                public final void zzg(Object obj, long j, double d) {
/* 7 */             this.zza.putLong(obj, j, Double.doubleToLongBits(d));
                }
            }
