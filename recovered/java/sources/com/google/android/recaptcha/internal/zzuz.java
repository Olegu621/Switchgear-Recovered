            package com.google.android.recaptcha.internal;

            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzuz extends zzvb {
                public zzuz(Unsafe unsafe) {
/* 1 */             super(unsafe);
                }

                @Override // com.google.android.recaptcha.internal.zzvb
                public final double zza(Object obj, long j) {
/* 7 */             return Double.longBitsToDouble(this.zza.getLong(obj, j));
                }

                @Override // com.google.android.recaptcha.internal.zzvb
                public final float zzb(Object obj, long j) {
/* 7 */             return Float.intBitsToFloat(this.zza.getInt(obj, j));
                }

                /* JADX WARN: Failed to inline method: com.google.android.recaptcha.internal.zzvc.zzi(java.lang.Object, long, boolean):void */
                /* JADX WARN: Failed to replace arg (r3v0 'z' boolean A[IMMUTABLE_TYPE, METHOD_ARGUMENT]) for method inline: com.google.android.recaptcha.internal.zzvc.zzi(java.lang.Object, long, boolean):void */
                @Override // com.google.android.recaptcha.internal.zzvb
                public final void zzc(Object obj, long j, boolean z) {
/* 3 */             if (zzvc.zzb) {
/* 5 */                 zzvc.zzi(obj, j, z);
                    } else {
/* 1 */                 zzvc.zzE(obj, j, z ? (byte) 1 : (byte) 0);
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvb
                public final void zzd(Object obj, long j, byte b) {
/* 3 */             if (zzvc.zzb) {
/* 1 */                 zzvc.zzD(obj, j, b);
                    } else {
/* 1 */                 zzvc.zzE(obj, j, b);
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvb
                public final void zze(Object obj, long j, double d) {
/* 7 */             this.zza.putLong(obj, j, Double.doubleToLongBits(d));
                }

                @Override // com.google.android.recaptcha.internal.zzvb
                public final void zzf(Object obj, long j, float f) {
/* 7 */             this.zza.putInt(obj, j, Float.floatToIntBits(f));
                }

                @Override // com.google.android.recaptcha.internal.zzvb
                public final boolean zzg(Object obj, long j) {
                    return zzvc.zzb ? zzvc.zzt(obj, j) : zzvc.zzu(obj, j);
                }
            }
