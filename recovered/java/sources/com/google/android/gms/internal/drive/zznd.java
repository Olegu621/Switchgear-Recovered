            package com.google.android.gms.internal.drive;

            import io.sentry.C1697u2;
            import java.lang.reflect.Field;
            import java.nio.Buffer;
            import java.nio.ByteOrder;
            import java.security.AccessController;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import sun.misc.Unsafe;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     final class zznd {
                private static final Logger logger = Logger.getLogger(zznd.class.getName());
                private static final Class<?> zzni;
                private static final boolean zzog;
                private static final Unsafe zzuc;
                private static final boolean zzvy;
                private static final boolean zzvz;
                private static final zzd zzwa;
                private static final boolean zzwb;
                private static final long zzwc;
                private static final long zzwd;
                private static final long zzwe;
                private static final long zzwf;
                private static final long zzwg;
                private static final long zzwh;
                private static final long zzwi;
                private static final long zzwj;
                private static final long zzwk;
                private static final long zzwl;
                private static final long zzwm;
                private static final long zzwn;
                private static final long zzwo;
                private static final long zzwp;
                private static final int zzwq;
                static final boolean zzwr;

                static {
/* 13 */            Unsafe unsafeZzff = zzff();
/* 17 */            zzuc = unsafeZzff;
/* 23 */            zzni = zzix.zzbs();
/* 27 */            boolean zZzk = zzk(Long.TYPE);
/* 31 */            zzvy = zZzk;
/* 35 */            boolean zZzk2 = zzk(Integer.TYPE);
/* 39 */            zzvz = zZzk2;
/* 41 */            zzd zzcVar = null;
/* 42 */            if (unsafeZzff != null) {
/* 49 */                if (!zzix.zzbr()) {
/* 69 */                    zzcVar = new zzc(unsafeZzff);
                        } else if (zZzk) {
/* 55 */                    zzcVar = new zzb(unsafeZzff);
                        } else if (zZzk2) {
/* 63 */                    zzcVar = new zza(unsafeZzff);
                        }
                    }
/* 72 */            zzwa = zzcVar;
/* 78 */            zzwb = zzfh();
/* 84 */            zzog = zzfg();
/* 88 */            long jZzi = zzi(byte[].class);
/* 93 */            zzwc = jZzi;
/* 102 */           zzwd = zzi(boolean[].class);
/* 109 */           zzwe = zzj(boolean[].class);
/* 118 */           zzwf = zzi(int[].class);
/* 125 */           zzwg = zzj(int[].class);
/* 134 */           zzwh = zzi(long[].class);
/* 141 */           zzwi = zzj(long[].class);
/* 150 */           zzwj = zzi(float[].class);
/* 157 */           zzwk = zzj(float[].class);
/* 166 */           zzwl = zzi(double[].class);
/* 173 */           zzwm = zzj(double[].class);
/* 182 */           zzwn = zzi(Object[].class);
/* 189 */           zzwo = zzj(Object[].class);
/* 191 */           Field fieldZzfi = zzfi();
/* 209 */           zzwp = (fieldZzfi == null || zzcVar == null) ? -1L : zzcVar.zzws.objectFieldOffset(fieldZzfi);
/* 215 */           zzwq = (int) (jZzi & 7);
/* 228 */           zzwr = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }

                private zznd() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static void zza(Object obj, long j, byte b) {
/* 3 */             long j2 = (-4) & j;
/* 4 */             int iZzj = zzj(obj, j2);
/* 12 */            int i = ((~((int) j)) & 3) << 3;
/* 24 */            zza(obj, j2, ((255 & b) << i) | (iZzj & (~(255 << i))));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static void zzb(Object obj, long j, byte b) {
/* 3 */             long j2 = (-4) & j;
/* 11 */            int i = (((int) j) & 3) << 3;
/* 23 */            zza(obj, j2, ((255 & b) << i) | (zzj(obj, j2) & (~(255 << i))));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static void zzc(Object obj, long j, boolean z) {
/* 2 */             zzb(obj, j, z ? (byte) 1 : (byte) 0);
                }

                public static boolean zzfd() {
/* 1 */             return zzog;
                }

                public static boolean zzfe() {
/* 1 */             return zzwb;
                }

                public static Unsafe zzff() {
                    try {
/* 10 */                return (Unsafe) AccessController.doPrivileged(new zzne());
                    } catch (Throwable unused) {
/* 13 */                return null;
                    }
                }

                private static boolean zzfg() {
/* 5 */             Unsafe unsafe = zzuc;
/* 8 */             if (unsafe == null) {
/* 7 */                 return false;
                    }
                    try {
/* 11 */                Class<?> cls = unsafe.getClass();
/* 23 */                cls.getMethod("objectFieldOffset", Field.class);
/* 32 */                cls.getMethod("arrayBaseOffset", Class.class);
/* 41 */                cls.getMethod("arrayIndexScale", Class.class);
/* 46 */                Class cls2 = Long.TYPE;
/* 52 */                cls.getMethod("getInt", Object.class, cls2);
/* 63 */                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
/* 72 */                cls.getMethod("getLong", Object.class, cls2);
/* 81 */                cls.getMethod("putLong", Object.class, cls2, cls2);
/* 90 */                cls.getMethod("getObject", Object.class, cls2);
/* 99 */                cls.getMethod("putObject", Object.class, cls2, Object.class);
/* 107 */               if (zzix.zzbr()) {
/* 106 */                   return true;
                        }
/* 116 */               cls.getMethod("getByte", Object.class, cls2);
/* 127 */               cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
/* 136 */               cls.getMethod("getBoolean", Object.class, cls2);
/* 147 */               cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
/* 156 */               cls.getMethod("getFloat", Object.class, cls2);
/* 167 */               cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
/* 176 */               cls.getMethod("getDouble", Object.class, cls2);
/* 187 */               cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
/* 106 */               return true;
                    } catch (Throwable th) {
/* 192 */               Logger logger2 = logger;
/* 194 */               Level level = Level.WARNING;
/* 196 */               String strValueOf = String.valueOf(th);
/* 208 */               StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
/* 213 */               sb.append("platform method missing - proto runtime falling back to safer methods: ");
/* 216 */               sb.append(strValueOf);
/* 227 */               logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
/* 7 */                 return false;
                    }
                }

                private static boolean zzfh() {
/* 7 */             Unsafe unsafe = zzuc;
/* 10 */            if (unsafe == null) {
/* 9 */                 return false;
                    }
                    try {
/* 13 */                Class<?> cls = unsafe.getClass();
/* 25 */                cls.getMethod("objectFieldOffset", Field.class);
/* 28 */                Class cls2 = Long.TYPE;
/* 34 */                cls.getMethod("getLong", Object.class, cls2);
/* 41 */                if (zzfi() == null) {
/* 9 */                     return false;
                        }
/* 49 */                if (zzix.zzbr()) {
/* 48 */                    return true;
                        }
/* 58 */                cls.getMethod("getByte", cls2);
/* 69 */                cls.getMethod("putByte", cls2, Byte.TYPE);
/* 78 */                cls.getMethod("getInt", cls2);
/* 89 */                cls.getMethod("putInt", cls2, Integer.TYPE);
/* 96 */                cls.getMethod("getLong", cls2);
/* 105 */               cls.getMethod("putLong", cls2, cls2);
/* 112 */               cls.getMethod("copyMemory", cls2, cls2, cls2);
/* 119 */               cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
/* 48 */                return true;
                    } catch (Throwable th) {
/* 124 */               Logger logger2 = logger;
/* 126 */               Level level = Level.WARNING;
/* 128 */               String strValueOf = String.valueOf(th);
/* 140 */               StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
/* 145 */               sb.append("platform method missing - proto runtime falling back to safer methods: ");
/* 148 */               sb.append(strValueOf);
/* 159 */               logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
/* 9 */                 return false;
                    }
                }

                private static Field zzfi() {
                    Field fieldZzb;
/* 7 */             if (zzix.zzbr() && (fieldZzb = zzb(Buffer.class, "effectiveDirectAddress")) != null) {
/* 17 */                return fieldZzb;
                    }
/* 20 */            Field fieldZzb2 = zzb(Buffer.class, "address");
/* 24 */            if (fieldZzb2 == null || fieldZzb2.getType() != Long.TYPE) {
/* 35 */                return null;
                    }
/* 34 */            return fieldZzb2;
                }

                public static <T> T zzh(Class<T> cls) {
                    try {
/* 3 */                 return (T) zzuc.allocateInstance(cls);
                    } catch (InstantiationException e) {
/* 9 */                 C1697u2.m5439o(e);
/* 12 */                return null;
                    }
                }

                private static int zzi(Class<?> cls) {
/* 3 */             if (zzog) {
/* 9 */                 return zzwa.zzws.arrayBaseOffset(cls);
                    }
/* 14 */            return -1;
                }

                private static int zzj(Class<?> cls) {
/* 3 */             if (zzog) {
/* 9 */                 return zzwa.zzws.arrayIndexScale(cls);
                    }
/* 14 */            return -1;
                }

                private static boolean zzk(Class<?> cls) {
/* 8 */             if (!zzix.zzbr()) {
/* 7 */                 return false;
                    }
                    try {
/* 11 */                Class<?> cls2 = zzni;
/* 15 */                Class cls3 = Boolean.TYPE;
/* 21 */                cls2.getMethod("peekLong", cls, cls3);
/* 32 */                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
/* 37 */                Class cls4 = Integer.TYPE;
/* 43 */                cls2.getMethod("pokeInt", cls, cls4, cls3);
/* 52 */                cls2.getMethod("peekInt", cls, cls3);
/* 63 */                cls2.getMethod("pokeByte", cls, Byte.TYPE);
/* 72 */                cls2.getMethod("peekByte", cls);
/* 81 */                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
/* 90 */                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
/* 93 */                return true;
                    } catch (Throwable unused) {
/* 7 */                 return false;
                    }
                }

                public static boolean zzl(Object obj, long j) {
/* 3 */             return zzwa.zzl(obj, j);
                }

                public static float zzm(Object obj, long j) {
/* 3 */             return zzwa.zzm(obj, j);
                }

                public static double zzn(Object obj, long j) {
/* 3 */             return zzwa.zzn(obj, j);
                }

                public static Object zzo(Object obj, long j) {
/* 5 */             return zzwa.zzws.getObject(obj, j);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static byte zzp(Object obj, long j) {
/* 16 */            return (byte) (zzj(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static byte zzq(Object obj, long j) {
/* 15 */            return (byte) (zzj(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static boolean zzr(Object obj, long j) {
                    return zzp(obj, j) != 0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static boolean zzs(Object obj, long j) {
                    return zzq(obj, j) != 0;
                }

/* 5 */         public static final class zzc extends zzd {
                    public zzc(Unsafe unsafe) {
/* 1 */                 super(unsafe);
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final void zza(Object obj, long j, boolean z) {
/* 3 */                 this.zzws.putBoolean(obj, j, z);
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final void zze(Object obj, long j, byte b) {
/* 3 */                 this.zzws.putByte(obj, j, b);
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final boolean zzl(Object obj, long j) {
/* 3 */                 return this.zzws.getBoolean(obj, j);
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final float zzm(Object obj, long j) {
/* 3 */                 return this.zzws.getFloat(obj, j);
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final double zzn(Object obj, long j) {
/* 3 */                 return this.zzws.getDouble(obj, j);
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final byte zzx(Object obj, long j) {
/* 3 */                 return this.zzws.getByte(obj, j);
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
/* 6 */             public final void zza(Object obj, long j, float f) {
/* 7 */                 this.zzws.putFloat(obj, j, f);
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
/* 7 */             public final void zza(Object obj, long j, double d) {
/* 8 */                 this.zzws.putDouble(obj, j, d);
                    }
                }

/* 5 */         public static abstract class zzd {
                    Unsafe zzws;

                    public zzd(Unsafe unsafe) {
/* 4 */                 this.zzws = unsafe;
                    }

                    public abstract void zza(Object obj, long j, double d);

                    public abstract void zza(Object obj, long j, float f);

                    public final void zza(Object obj, long j, int i) {
/* 3 */                 this.zzws.putInt(obj, j, i);
                    }

                    public abstract void zza(Object obj, long j, boolean z);

                    public abstract void zze(Object obj, long j, byte b);

                    public final int zzj(Object obj, long j) {
/* 3 */                 return this.zzws.getInt(obj, j);
                    }

                    public final long zzk(Object obj, long j) {
/* 3 */                 return this.zzws.getLong(obj, j);
                    }

                    public abstract boolean zzl(Object obj, long j);

                    public abstract float zzm(Object obj, long j);

                    public abstract double zzn(Object obj, long j);

                    public abstract byte zzx(Object obj, long j);

/* 6 */             public final void zza(Object obj, long j, long j2) {
/* 7 */                 this.zzws.putLong(obj, j, j2);
                    }
                }

/* 11 */        public static final class zza extends zzd {
                    public zza(Unsafe unsafe) {
/* 1 */                 super(unsafe);
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final void zza(Object obj, long j, boolean z) {
/* 3 */                 if (zznd.zzwr) {
/* 5 */                     zznd.zzb(obj, j, z);
                        } else {
/* 1 */                     zznd.zzc(obj, j, z);
                        }
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final void zze(Object obj, long j, byte b) {
/* 3 */                 if (zznd.zzwr) {
/* 6 */                     zznd.zza(obj, j, b);
                        } else {
/* 1 */                     zznd.zzb(obj, j, b);
                        }
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final boolean zzl(Object obj, long j) {
                        return zznd.zzwr ? zznd.zzr(obj, j) : zznd.zzs(obj, j);
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final float zzm(Object obj, long j) {
/* 5 */                 return Float.intBitsToFloat(zzj(obj, j));
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final double zzn(Object obj, long j) {
/* 5 */                 return Double.longBitsToDouble(zzk(obj, j));
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final byte zzx(Object obj, long j) {
                        return zznd.zzwr ? zznd.zzp(obj, j) : zznd.zzq(obj, j);
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
/* 12 */            public final void zza(Object obj, long j, float f) {
/* 13 */                zza(obj, j, Float.floatToIntBits(f));
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
/* 13 */            public final void zza(Object obj, long j, double d) {
/* 14 */                zza(obj, j, Double.doubleToLongBits(d));
                    }
                }

/* 11 */        public static final class zzb extends zzd {
                    public zzb(Unsafe unsafe) {
/* 1 */                 super(unsafe);
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final void zza(Object obj, long j, boolean z) {
/* 3 */                 if (zznd.zzwr) {
/* 5 */                     zznd.zzb(obj, j, z);
                        } else {
/* 1 */                     zznd.zzc(obj, j, z);
                        }
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final void zze(Object obj, long j, byte b) {
/* 3 */                 if (zznd.zzwr) {
/* 6 */                     zznd.zza(obj, j, b);
                        } else {
/* 1 */                     zznd.zzb(obj, j, b);
                        }
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final boolean zzl(Object obj, long j) {
                        return zznd.zzwr ? zznd.zzr(obj, j) : zznd.zzs(obj, j);
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final float zzm(Object obj, long j) {
/* 5 */                 return Float.intBitsToFloat(zzj(obj, j));
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final double zzn(Object obj, long j) {
/* 5 */                 return Double.longBitsToDouble(zzk(obj, j));
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
                    public final byte zzx(Object obj, long j) {
                        return zznd.zzwr ? zznd.zzp(obj, j) : zznd.zzq(obj, j);
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
/* 12 */            public final void zza(Object obj, long j, float f) {
/* 13 */                zza(obj, j, Float.floatToIntBits(f));
                    }

                    @Override // com.google.android.gms.internal.drive.zznd.zzd
/* 13 */            public final void zza(Object obj, long j, double d) {
/* 14 */                zza(obj, j, Double.doubleToLongBits(d));
                    }
                }

/* 15 */        public static int zzj(Object obj, long j) {
/* 16 */            return zzwa.zzj(obj, j);
                }

/* 26 */        private static Field zzb(Class<?> cls, String str) {
                    try {
/* 27 */                return cls.getDeclaredField(str);
                    } catch (Throwable unused) {
                        return null;
                    }
                }

/* 27 */        public static void zza(Object obj, long j, long j2) {
/* 28 */            zzwa.zza(obj, j, j2);
                }

                /* JADX INFO: Access modifiers changed from: private */
/* 27 */        public static void zzb(Object obj, long j, boolean z) {
/* 28 */            zza(obj, j, z ? (byte) 1 : (byte) 0);
                }

/* 28 */        public static void zza(Object obj, long j, boolean z) {
/* 29 */            zzwa.zza(obj, j, z);
                }

/* 29 */        public static void zza(Object obj, long j, float f) {
/* 30 */            zzwa.zza(obj, j, f);
                }

/* 30 */        public static void zza(Object obj, long j, double d) {
/* 31 */            zzwa.zza(obj, j, d);
                }

/* 31 */        public static void zza(Object obj, long j, Object obj2) {
/* 33 */            zzwa.zzws.putObject(obj, j, obj2);
                }

/* 33 */        public static byte zza(byte[] bArr, long j) {
/* 34 */            return zzwa.zzx(bArr, zzwc + j);
                }

/* 34 */        public static void zza(byte[] bArr, long j, byte b) {
/* 35 */            zzwa.zze(bArr, zzwc + j, b);
                }

/* 35 */        public static void zza(Object obj, long j, int i) {
/* 36 */            zzwa.zza(obj, j, i);
                }

/* 95 */        public static long zzk(Object obj, long j) {
/* 96 */            return zzwa.zzk(obj, j);
                }
            }
