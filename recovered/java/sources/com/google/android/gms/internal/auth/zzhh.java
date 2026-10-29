            package com.google.android.gms.internal.auth;

            import java.lang.reflect.Field;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class zzhh {
                final Unsafe zza;

                public zzhh(Unsafe unsafe) {
/* 4 */             this.zza = unsafe;
                }

                public abstract double zza(Object obj, long j);

                public abstract float zzb(Object obj, long j);

                public abstract void zzc(Object obj, long j, boolean z);

                public abstract void zzd(Object obj, long j, double d);

                public abstract void zze(Object obj, long j, float f);

                public abstract boolean zzf(Object obj, long j);

                public final int zzg(Class cls) {
/* 3 */             return this.zza.arrayBaseOffset(cls);
                }

                public final int zzh(Class cls) {
/* 3 */             return this.zza.arrayIndexScale(cls);
                }

                public final int zzi(Object obj, long j) {
/* 3 */             return this.zza.getInt(obj, j);
                }

                public final long zzj(Object obj, long j) {
/* 3 */             return this.zza.getLong(obj, j);
                }

                public final long zzk(Field field) {
/* 3 */             return this.zza.objectFieldOffset(field);
                }

                public final Object zzl(Object obj, long j) {
/* 3 */             return this.zza.getObject(obj, j);
                }

                public final void zzm(Object obj, long j, int i) {
/* 3 */             this.zza.putInt(obj, j, i);
                }

                public final void zzn(Object obj, long j, long j2) {
/* 3 */             this.zza.putLong(obj, j, j2);
                }

                public final void zzo(Object obj, long j, Object obj2) {
/* 3 */             this.zza.putObject(obj, j, obj2);
                }
            }
