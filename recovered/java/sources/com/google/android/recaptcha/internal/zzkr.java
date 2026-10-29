            package com.google.android.recaptcha.internal;

            import java.math.BigInteger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzkr {
                private static final zzkq zza;
                private final zzkq zzb;
                private long zzc;

                static {
/* 11 */            long jPow = (long) Math.pow(2.0d, 32.0d);
/* 30 */            zza = new zzkq(11L, 20919936621L ^ jPow, (long) Math.pow(2.0d, 48.0d));
                }

                public zzkr(long j, long j2, zzkq zzkqVar) {
/* 4 */             this.zzb = zzkqVar;
/* 10 */            this.zzc = Math.abs(j);
                }

                public final long zza() {
/* 1 */             zzkq zzkqVar = this.zzb;
/* 44 */            long jLongValue = (BigInteger.valueOf(zzkqVar.zzb()).multiply(BigInteger.valueOf(this.zzc)).mod(BigInteger.valueOf(zzkqVar.zza())).longValue() + 11) % zzkqVar.zza();
/* 45 */            this.zzc = jLongValue;
/* 49 */            return jLongValue % 255;
                }
            }
