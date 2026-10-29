            package com.google.android.gms.internal.measurement;

            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class zzon {
                final Unsafe zza;

                public zzon(Unsafe unsafe) {
/* 4 */             this.zza = unsafe;
                }

                public abstract void zza(Object obj, long j, byte b);

                public abstract boolean zzb(Object obj, long j);

                public abstract void zzc(Object obj, long j, boolean z);

                public abstract float zzd(Object obj, long j);

                public abstract void zze(Object obj, long j, float f);

                public abstract double zzf(Object obj, long j);

                public abstract void zzg(Object obj, long j, double d);
            }
