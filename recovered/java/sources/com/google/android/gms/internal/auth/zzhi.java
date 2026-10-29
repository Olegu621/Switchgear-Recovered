            package com.google.android.gms.internal.auth;

            import io.sentry.C1697u2;
            import java.lang.reflect.Field;
            import java.nio.Buffer;
            import java.nio.ByteOrder;
            import java.security.AccessController;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzhi {
                static final boolean zza;
                private static final Unsafe zzb;
                private static final Class zzc;
                private static final boolean zzd;
                private static final zzhh zze;
                private static final boolean zzf;
                private static final boolean zzg;

                /* JADX WARN: Code duplicated, block: B:11:0x003d  */
                static {
                    boolean z;
                    boolean z2;
                    zzhh zzhhVar;
/* 3 */             Unsafe unsafeZzg = zzg();
/* 7 */             zzb = unsafeZzg;
/* 13 */            zzc = zzdr.zza();
/* 15 */            Class cls = Long.TYPE;
/* 17 */            boolean zZzs = zzs(cls);
/* 21 */            zzd = zZzs;
/* 23 */            Class cls2 = Integer.TYPE;
/* 25 */            boolean zZzs2 = zzs(cls2);
/* 29 */            zzhh zzhfVar = null;
/* 30 */            if (unsafeZzg != null) {
/* 33 */                if (zZzs) {
/* 37 */                    zzhfVar = new zzhg(unsafeZzg);
                        } else if (zZzs2) {
/* 45 */                    zzhfVar = new zzhf(unsafeZzg);
                        }
                    }
/* 48 */            zze = zzhfVar;
/* 60 */            if (zzhfVar == null) {
/* 62 */                z = false;
                    } else {
                        try {
/* 66 */                    Class<?> cls3 = zzhfVar.zza.getClass();
/* 74 */                    cls3.getMethod("objectFieldOffset", Field.class);
/* 81 */                    cls3.getMethod("getLong", Object.class, cls);
/* 88 */                    if (zzy() == null) {
/* 62 */                        z = false;
                            } else {
/* 91 */                        z = true;
                            }
                        } catch (Throwable th) {
/* 94 */                    zzh(th);
                        }
                    }
/* 98 */            zzf = z;
/* 100 */           zzhh zzhhVar2 = zze;
/* 102 */           if (zzhhVar2 == null) {
/* 104 */               z2 = false;
                    } else {
                        try {
/* 108 */                   Class<?> cls4 = zzhhVar2.zza.getClass();
/* 116 */                   cls4.getMethod("objectFieldOffset", Field.class);
/* 125 */                   cls4.getMethod("arrayBaseOffset", Class.class);
/* 134 */                   cls4.getMethod("arrayIndexScale", Class.class);
/* 143 */                   cls4.getMethod("getInt", Object.class, cls);
/* 152 */                   cls4.getMethod("putInt", Object.class, cls, cls2);
/* 159 */                   cls4.getMethod("getLong", Object.class, cls);
/* 168 */                   cls4.getMethod("putLong", Object.class, cls, cls);
/* 177 */                   cls4.getMethod("getObject", Object.class, cls);
/* 186 */                   cls4.getMethod("putObject", Object.class, cls, Object.class);
/* 189 */                   z2 = true;
                        } catch (Throwable th2) {
/* 192 */                   zzh(th2);
/* 104 */                   z2 = false;
                        }
                    }
/* 196 */           zzg = z2;
/* 200 */           zzw(byte[].class);
/* 205 */           zzw(boolean[].class);
/* 208 */           zzx(boolean[].class);
/* 213 */           zzw(int[].class);
/* 216 */           zzx(int[].class);
/* 221 */           zzw(long[].class);
/* 224 */           zzx(long[].class);
/* 229 */           zzw(float[].class);
/* 232 */           zzx(float[].class);
/* 237 */           zzw(double[].class);
/* 240 */           zzx(double[].class);
/* 245 */           zzw(Object[].class);
/* 248 */           zzx(Object[].class);
/* 251 */           Field fieldZzy = zzy();
/* 255 */           if (fieldZzy != null && (zzhhVar = zze) != null) {
/* 261 */               zzhhVar.zzk(fieldZzy);
                    }
/* 274 */           zza = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }

                private zzhi() {
                }

                public static double zza(Object obj, long j) {
/* 3 */             return zze.zza(obj, j);
                }

                public static float zzb(Object obj, long j) {
/* 3 */             return zze.zzb(obj, j);
                }

                public static int zzc(Object obj, long j) {
/* 3 */             return zze.zzi(obj, j);
                }

                public static long zzd(Object obj, long j) {
/* 3 */             return zze.zzj(obj, j);
                }

                public static Object zze(Class cls) {
                    try {
/* 3 */                 return zzb.allocateInstance(cls);
                    } catch (InstantiationException e) {
/* 9 */                 C1697u2.m5439o(e);
/* 12 */                return null;
                    }
                }

                public static Object zzf(Object obj, long j) {
/* 3 */             return zze.zzl(obj, j);
                }

                public static Unsafe zzg() {
                    try {
/* 10 */                return (Unsafe) AccessController.doPrivileged(new zzhe());
                    } catch (Throwable unused) {
/* 13 */                return null;
                    }
                }

                public static /* bridge */ /* synthetic */ void zzh(Throwable th) {
/* 27 */            Logger.getLogger(zzhi.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                }

                public static /* synthetic */ void zzi(Object obj, long j, boolean z) {
/* 3 */             long j2 = (-4) & j;
/* 4 */             zzhh zzhhVar = zze;
/* 6 */             int iZzi = zzhhVar.zzi(obj, j2);
/* 14 */            int i = ((~((int) j)) & 3) << 3;
/* 24 */            zzhhVar.zzm(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & iZzi));
                }

                public static /* synthetic */ void zzj(Object obj, long j, boolean z) {
/* 3 */             long j2 = (-4) & j;
/* 4 */             zzhh zzhhVar = zze;
/* 13 */            int i = (((int) j) & 3) << 3;
/* 23 */            zzhhVar.zzm(obj, j2, ((z ? 1 : 0) << i) | ((~(255 << i)) & zzhhVar.zzi(obj, j2)));
                }

                public static void zzk(Object obj, long j, boolean z) {
/* 3 */             zze.zzc(obj, j, z);
                }

                public static void zzl(Object obj, long j, double d) {
/* 6 */             zze.zzd(obj, j, d);
                }

                public static void zzm(Object obj, long j, float f) {
/* 3 */             zze.zze(obj, j, f);
                }

                public static void zzn(Object obj, long j, int i) {
/* 3 */             zze.zzm(obj, j, i);
                }

                public static void zzo(Object obj, long j, long j2) {
/* 6 */             zze.zzn(obj, j, j2);
                }

                public static void zzp(Object obj, long j, Object obj2) {
/* 3 */             zze.zzo(obj, j, obj2);
                }

                public static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j) {
                    return ((byte) ((zze.zzi(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
                }

                public static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j) {
                    return ((byte) ((zze.zzi(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
                }

                public static boolean zzs(Class cls) {
/* 3 */             int i = zzdr.zza;
                    try {
/* 5 */                 Class cls2 = zzc;
/* 7 */                 Class cls3 = Boolean.TYPE;
/* 15 */                cls2.getMethod("peekLong", cls, cls3);
/* 26 */                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
/* 29 */                Class cls4 = Integer.TYPE;
/* 37 */                cls2.getMethod("pokeInt", cls, cls4, cls3);
/* 46 */                cls2.getMethod("peekInt", cls, cls3);
/* 57 */                cls2.getMethod("pokeByte", cls, Byte.TYPE);
/* 66 */                cls2.getMethod("peekByte", cls);
/* 75 */                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
/* 84 */                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
/* 87 */                return true;
                    } catch (Throwable unused) {
/* 89 */                return false;
                    }
                }

                public static boolean zzt(Object obj, long j) {
/* 3 */             return zze.zzf(obj, j);
                }

                public static boolean zzu() {
/* 1 */             return zzg;
                }

                public static boolean zzv() {
/* 1 */             return zzf;
                }

                private static int zzw(Class cls) {
/* 3 */             if (zzg) {
/* 7 */                 return zze.zzg(cls);
                    }
/* 12 */            return -1;
                }

                private static int zzx(Class cls) {
/* 3 */             if (zzg) {
/* 7 */                 return zze.zzh(cls);
                    }
/* 12 */            return -1;
                }

                private static Field zzy() {
/* 1 */             int i = zzdr.zza;
/* 7 */             Field fieldZzz = zzz(Buffer.class, "effectiveDirectAddress");
/* 11 */            if (fieldZzz != null) {
/* 31 */                return fieldZzz;
                    }
/* 15 */            Field fieldZzz2 = zzz(Buffer.class, "address");
/* 19 */            if (fieldZzz2 == null || fieldZzz2.getType() != Long.TYPE) {
/* 30 */                return null;
                    }
/* 29 */            return fieldZzz2;
                }

                private static Field zzz(Class cls, String str) {
                    try {
/* 1 */                 return cls.getDeclaredField(str);
                    } catch (Throwable unused) {
/* 6 */                 return null;
                    }
                }
            }
