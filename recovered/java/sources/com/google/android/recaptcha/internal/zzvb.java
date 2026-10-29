            package com.google.android.recaptcha.internal;

            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class zzvb {
                final Unsafe zza;

                public zzvb(Unsafe unsafe) {
/* 4 */             this.zza = unsafe;
                }

                public abstract double zza(Object obj, long j);

                public abstract float zzb(Object obj, long j);

                public abstract void zzc(Object obj, long j, boolean z);

                public abstract void zzd(Object obj, long j, byte b);

                public abstract void zze(Object obj, long j, double d);

                public abstract void zzf(Object obj, long j, float f);

                public abstract boolean zzg(Object obj, long j);
            }
