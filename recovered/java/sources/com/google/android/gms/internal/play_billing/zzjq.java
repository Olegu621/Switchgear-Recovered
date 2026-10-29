            package com.google.android.gms.internal.play_billing;

            import io.sentry.C1697u2;
            import java.lang.reflect.Field;
            import java.nio.Buffer;
            import java.nio.ByteOrder;
            import java.security.AccessController;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import libcore.io.Memory;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzjq {
                static final long zza;
                static final boolean zzb;
                private static final Unsafe zzc;
                private static final Class zzd;
                private static final boolean zze;
                private static final zzjp zzf;
                private static final boolean zzg;
                private static final boolean zzh;

                /* JADX WARN: Code duplicated, block: B:11:0x003d  */
                static {
                    boolean z;
                    boolean z2;
                    zzjp zzjpVar;
/* 3 */             Unsafe unsafeZzg = zzg();
/* 7 */             zzc = unsafeZzg;
/* 9 */             int i = zzfy.zza;
/* 13 */            zzd = Memory.class;
/* 15 */            Class cls = Long.TYPE;
/* 17 */            boolean zZzv = zzv(cls);
/* 21 */            zze = zZzv;
/* 23 */            Class cls2 = Integer.TYPE;
/* 25 */            boolean zZzv2 = zzv(cls2);
/* 29 */            zzjp zzjnVar = null;
/* 30 */            if (unsafeZzg != null) {
/* 33 */                if (zZzv) {
/* 37 */                    zzjnVar = new zzjo(unsafeZzg);
                        } else if (zZzv2) {
/* 45 */                    zzjnVar = new zzjn(unsafeZzg);
                        }
                    }
/* 48 */            zzf = zzjnVar;
/* 60 */            if (zzjnVar == null) {
/* 62 */                z = false;
                    } else {
                        try {
/* 66 */                    Class<?> cls3 = zzjnVar.zza.getClass();
/* 74 */                    cls3.getMethod("objectFieldOffset", Field.class);
/* 81 */                    cls3.getMethod("getLong", Object.class, cls);
/* 88 */                    if (zzB() == null) {
/* 62 */                        z = false;
                            } else {
/* 91 */                        z = true;
                            }
                        } catch (Throwable th) {
/* 94 */                    zzh(th);
                        }
                    }
/* 98 */            zzg = z;
/* 100 */           zzjp zzjpVar2 = zzf;
/* 102 */           if (zzjpVar2 == null) {
/* 104 */               z2 = false;
                    } else {
                        try {
/* 108 */                   Class<?> cls4 = zzjpVar2.zza.getClass();
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
/* 196 */           zzh = z2;
/* 205 */           zza = zzz(byte[].class);
/* 209 */           zzz(boolean[].class);
/* 212 */           zzA(boolean[].class);
/* 217 */           zzz(int[].class);
/* 220 */           zzA(int[].class);
/* 225 */           zzz(long[].class);
/* 228 */           zzA(long[].class);
/* 233 */           zzz(float[].class);
/* 236 */           zzA(float[].class);
/* 241 */           zzz(double[].class);
/* 244 */           zzA(double[].class);
/* 249 */           zzz(Object[].class);
/* 252 */           zzA(Object[].class);
/* 255 */           Field fieldZzB = zzB();
/* 259 */           if (fieldZzB != null && (zzjpVar = zzf) != null) {
/* 267 */               zzjpVar.zza.objectFieldOffset(fieldZzB);
                    }
/* 280 */           zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }

                private zzjq() {
                }

                private static int zzA(Class cls) {
/* 3 */             if (zzh) {
/* 9 */                 return zzf.zza.arrayIndexScale(cls);
                    }
/* 14 */            return -1;
                }

                private static Field zzB() {
/* 1 */             int i = zzfy.zza;
/* 7 */             Field fieldZzC = zzC(Buffer.class, "effectiveDirectAddress");
/* 11 */            if (fieldZzC != null) {
/* 31 */                return fieldZzC;
                    }
/* 15 */            Field fieldZzC2 = zzC(Buffer.class, "address");
/* 19 */            if (fieldZzC2 == null || fieldZzC2.getType() != Long.TYPE) {
/* 30 */                return null;
                    }
/* 29 */            return fieldZzC2;
                }

                private static Field zzC(Class cls, String str) {
                    try {
/* 1 */                 return cls.getDeclaredField(str);
                    } catch (Throwable unused) {
/* 6 */                 return null;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static void zzD(Object obj, long j, byte b) {
/* 1 */             zzjp zzjpVar = zzf;
/* 7 */             long j2 = (-4) & j;
/* 8 */             int i = zzjpVar.zza.getInt(obj, j2);
/* 16 */            int i2 = ((~((int) j)) & 3) << 3;
/* 30 */            zzjpVar.zza.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static void zzE(Object obj, long j, byte b) {
/* 1 */             zzjp zzjpVar = zzf;
/* 7 */             long j2 = (-4) & j;
/* 15 */            int i = (((int) j) & 3) << 3;
/* 29 */            zzjpVar.zza.putInt(obj, j2, ((255 & b) << i) | (zzjpVar.zza.getInt(obj, j2) & (~(255 << i))));
                }

                public static double zza(Object obj, long j) {
/* 3 */             return zzf.zza(obj, j);
                }

                public static float zzb(Object obj, long j) {
/* 3 */             return zzf.zzb(obj, j);
                }

                public static int zzc(Object obj, long j) {
/* 5 */             return zzf.zza.getInt(obj, j);
                }

                public static long zzd(Object obj, long j) {
/* 5 */             return zzf.zza.getLong(obj, j);
                }

                public static Object zze(Class cls) {
                    try {
/* 3 */                 return zzc.allocateInstance(cls);
                    } catch (InstantiationException e) {
/* 9 */                 C1697u2.m5439o(e);
/* 12 */                return null;
                    }
                }

                public static Object zzf(Object obj, long j) {
/* 5 */             return zzf.zza.getObject(obj, j);
                }

                public static Unsafe zzg() {
                    try {
/* 10 */                return (Unsafe) AccessController.doPrivileged(new zzjm());
                    } catch (Throwable unused) {
/* 13 */                return null;
                    }
                }

                public static /* bridge */ /* synthetic */ void zzh(Throwable th) {
/* 27 */            Logger.getLogger(zzjq.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                }

                public static void zzm(Object obj, long j, boolean z) {
/* 3 */             zzf.zzc(obj, j, z);
                }

                public static void zzn(byte[] bArr, long j, byte b) {
/* 6 */             zzf.zzd(bArr, zza + j, b);
                }

                public static void zzo(Object obj, long j, double d) {
/* 6 */             zzf.zze(obj, j, d);
                }

                public static void zzp(Object obj, long j, float f) {
/* 3 */             zzf.zzf(obj, j, f);
                }

                public static void zzq(Object obj, long j, int i) {
/* 5 */             zzf.zza.putInt(obj, j, i);
                }

                public static void zzr(Object obj, long j, long j2) {
/* 8 */             zzf.zza.putLong(obj, j, j2);
                }

                public static void zzs(Object obj, long j, Object obj2) {
/* 5 */             zzf.zza.putObject(obj, j, obj2);
                }

                public static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j) {
                    return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
                }

                public static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j) {
                    return ((byte) ((zzf.zza.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
                }

                public static boolean zzv(Class cls) {
/* 3 */             int i = zzfy.zza;
                    try {
/* 5 */                 Class cls2 = zzd;
/* 9 */                 Class cls3 = Boolean.TYPE;
/* 15 */                cls2.getMethod("peekLong", cls, cls3);
/* 26 */                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
/* 31 */                Class cls4 = Integer.TYPE;
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

                public static boolean zzw(Object obj, long j) {
/* 3 */             return zzf.zzg(obj, j);
                }

                public static boolean zzx() {
/* 1 */             return zzh;
                }

                public static boolean zzy() {
/* 1 */             return zzg;
                }

                private static int zzz(Class cls) {
/* 3 */             if (zzh) {
/* 9 */                 return zzf.zza.arrayBaseOffset(cls);
                    }
/* 14 */            return -1;
                }
            }
