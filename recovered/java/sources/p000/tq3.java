            package p000;

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
            public abstract class tq3 {

                /* JADX INFO: renamed from: a */
                public static final Unsafe f17230a;

                /* JADX INFO: renamed from: b */
                public static final Class f17231b;

                /* JADX INFO: renamed from: c */
                public static final sq3 f17232c;

                /* JADX INFO: renamed from: d */
                public static final boolean f17233d;

                /* JADX INFO: renamed from: e */
                public static final boolean f17234e;

                /* JADX INFO: renamed from: f */
                public static final long f17235f;

                /* JADX INFO: renamed from: g */
                public static final boolean f17236g;

                /* JADX WARN: Code duplicated, block: B:11:0x0043  */
                static {
                    boolean z;
                    boolean z2;
                    sq3 sq3Var;
/* 3 */             Unsafe unsafeM8874l = m8874l();
/* 7 */             f17230a = unsafeM8874l;
/* 9 */             int i = wm3.f18690a;
/* 13 */            f17231b = Memory.class;
/* 15 */            Class cls = Long.TYPE;
/* 17 */            boolean zM8875m = m8875m(cls);
/* 21 */            Class cls2 = Integer.TYPE;
/* 23 */            boolean zM8875m2 = m8875m(cls2);
/* 27 */            sq3 qq3Var = null;
/* 28 */            if (unsafeM8874l != null) {
/* 31 */                if (zM8875m) {
/* 35 */                    qq3Var = new rq3(unsafeM8874l);
                        } else if (zM8875m2) {
/* 43 */                    qq3Var = new qq3(unsafeM8874l);
                        }
                    }
/* 46 */            f17232c = qq3Var;
/* 66 */            if (qq3Var == null) {
/* 68 */                z = false;
                    } else {
                        try {
/* 74 */                    Class<?> cls3 = ((Unsafe) qq3Var.f16749a).getClass();
/* 82 */                    cls3.getMethod("objectFieldOffset", Field.class);
/* 89 */                    cls3.getMethod("getLong", Object.class, cls);
/* 96 */                    if (m8864b() == null) {
/* 68 */                        z = false;
                            } else {
/* 99 */                        z = true;
                            }
                        } catch (Throwable th) {
/* 120 */                   Logger.getLogger(tq3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
                        }
                    }
/* 124 */           f17233d = z;
/* 126 */           sq3 sq3Var2 = f17232c;
/* 128 */           if (sq3Var2 == null) {
/* 130 */               z2 = false;
                    } else {
                        try {
/* 136 */                   Class<?> cls4 = ((Unsafe) sq3Var2.f16749a).getClass();
/* 144 */                   cls4.getMethod("objectFieldOffset", Field.class);
/* 153 */                   cls4.getMethod("arrayBaseOffset", Class.class);
/* 162 */                   cls4.getMethod("arrayIndexScale", Class.class);
/* 171 */                   cls4.getMethod("getInt", Object.class, cls);
/* 180 */                   cls4.getMethod("putInt", Object.class, cls, cls2);
/* 187 */                   cls4.getMethod("getLong", Object.class, cls);
/* 196 */                   cls4.getMethod("putLong", Object.class, cls, cls);
/* 205 */                   cls4.getMethod("getObject", Object.class, cls);
/* 214 */                   cls4.getMethod("putObject", Object.class, cls, Object.class);
/* 217 */                   z2 = true;
                        } catch (Throwable th2) {
/* 238 */                   Logger.getLogger(tq3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
/* 130 */                   z2 = false;
                        }
                    }
/* 242 */           f17234e = z2;
/* 251 */           f17235f = m8878p(byte[].class);
/* 255 */           m8878p(boolean[].class);
/* 258 */           m8863a(boolean[].class);
/* 263 */           m8878p(int[].class);
/* 266 */           m8863a(int[].class);
/* 271 */           m8878p(long[].class);
/* 274 */           m8863a(long[].class);
/* 279 */           m8878p(float[].class);
/* 282 */           m8863a(float[].class);
/* 287 */           m8878p(double[].class);
/* 290 */           m8863a(double[].class);
/* 295 */           m8878p(Object[].class);
/* 298 */           m8863a(Object[].class);
/* 301 */           Field fieldM8864b = m8864b();
/* 305 */           if (fieldM8864b != null && (sq3Var = f17232c) != null) {
/* 315 */               ((Unsafe) sq3Var.f16749a).objectFieldOffset(fieldM8864b);
                    }
/* 328 */           f17236g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }

                /* JADX INFO: renamed from: a */
                public static void m8863a(Class cls) {
/* 3 */             if (f17234e) {
/* 11 */                ((Unsafe) f17232c.f16749a).arrayIndexScale(cls);
                    }
                }

                /* JADX INFO: renamed from: b */
                public static Field m8864b() {
                    Field declaredField;
                    Field declaredField2;
/* 1 */             int i = wm3.f18690a;
                    try {
/* 8 */                 declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
                    } catch (Throwable unused) {
/* 13 */                declaredField = null;
                    }
/* 14 */            if (declaredField != null) {
/* 36 */                return declaredField;
                    }
                    try {
/* 18 */                declaredField2 = Buffer.class.getDeclaredField("address");
                    } catch (Throwable unused2) {
/* 23 */                declaredField2 = null;
                    }
/* 24 */            if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
/* 7 */                 return null;
                    }
/* 34 */            return declaredField2;
                }

                /* JADX INFO: renamed from: c */
                public static void m8865c(Object obj, long j, byte b) {
/* 1 */             sq3 sq3Var = f17232c;
/* 9 */             long j2 = (-4) & j;
/* 10 */            int i = ((Unsafe) sq3Var.f16749a).getInt(obj, j2);
/* 18 */            int i2 = ((~((int) j)) & 3) << 3;
/* 34 */            ((Unsafe) sq3Var.f16749a).putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
                }

                /* JADX INFO: renamed from: d */
                public static void m8866d(Object obj, long j, byte b) {
/* 1 */             sq3 sq3Var = f17232c;
/* 9 */             long j2 = (-4) & j;
/* 17 */            int i = (((int) j) & 3) << 3;
/* 33 */            ((Unsafe) sq3Var.f16749a).putInt(obj, j2, ((255 & b) << i) | (((Unsafe) sq3Var.f16749a).getInt(obj, j2) & (~(255 << i))));
                }

                /* JADX INFO: renamed from: e */
                public static Object m8867e(Class cls) {
                    try {
/* 3 */                 return f17230a.allocateInstance(cls);
                    } catch (InstantiationException e) {
/* 9 */                 C1697u2.m5439o(e);
/* 12 */                return null;
                    }
                }

                /* JADX INFO: renamed from: f */
                public static int m8868f(Object obj, long j) {
/* 7 */             return ((Unsafe) f17232c.f16749a).getInt(obj, j);
                }

                /* JADX INFO: renamed from: g */
                public static void m8869g(Object obj, long j, int i) {
/* 7 */             ((Unsafe) f17232c.f16749a).putInt(obj, j, i);
                }

                /* JADX INFO: renamed from: h */
                public static long m8870h(Object obj, long j) {
/* 7 */             return ((Unsafe) f17232c.f16749a).getLong(obj, j);
                }

                /* JADX INFO: renamed from: i */
                public static void m8871i(Object obj, long j, long j2) {
/* 11 */            ((Unsafe) f17232c.f16749a).putLong(obj, j, j2);
                }

                /* JADX INFO: renamed from: j */
                public static Object m8872j(Object obj, long j) {
/* 7 */             return ((Unsafe) f17232c.f16749a).getObject(obj, j);
                }

                /* JADX INFO: renamed from: k */
                public static void m8873k(Object obj, long j, Object obj2) {
/* 7 */             ((Unsafe) f17232c.f16749a).putObject(obj, j, obj2);
                }

                /* JADX INFO: renamed from: l */
                public static Unsafe m8874l() {
                    try {
/* 10 */                return (Unsafe) AccessController.doPrivileged(new pq3());
                    } catch (Throwable unused) {
/* 13 */                return null;
                    }
                }

                /* JADX INFO: renamed from: m */
                public static boolean m8875m(Class cls) {
/* 3 */             int i = wm3.f18690a;
                    try {
/* 5 */                 Class cls2 = f17231b;
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

                /* JADX INFO: renamed from: n */
                public static /* synthetic */ boolean m8876n(Object obj, long j) {
                    return ((byte) ((((Unsafe) f17232c.f16749a).getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
                }

                /* JADX INFO: renamed from: o */
                public static /* synthetic */ boolean m8877o(Object obj, long j) {
                    return ((byte) ((((Unsafe) f17232c.f16749a).getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
                }

                /* JADX INFO: renamed from: p */
                public static int m8878p(Class cls) {
/* 3 */             if (f17234e) {
/* 11 */                return ((Unsafe) f17232c.f16749a).arrayBaseOffset(cls);
                    }
/* 16 */            return -1;
                }
            }
