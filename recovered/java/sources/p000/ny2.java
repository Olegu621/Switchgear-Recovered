            package p000;

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
            public abstract class ny2 {

                /* JADX INFO: renamed from: a */
                public static final Unsafe f14566a;

                /* JADX INFO: renamed from: b */
                public static final Class f14567b;

                /* JADX INFO: renamed from: c */
                public static final ly2 f14568c;

                /* JADX INFO: renamed from: d */
                public static final boolean f14569d;

                /* JADX INFO: renamed from: e */
                public static final boolean f14570e;

                /* JADX INFO: renamed from: f */
                public static final long f14571f;

                /* JADX INFO: renamed from: g */
                public static final boolean f14572g;

                static {
/* 1 */             Unsafe unsafeM7077i = m7077i();
/* 5 */             f14566a = unsafeM7077i;
/* 9 */             f14567b = AbstractC2488y7.f19513a;
/* 13 */            boolean zM7076h = m7076h(Long.TYPE);
/* 19 */            boolean zM7076h2 = m7076h(Integer.TYPE);
/* 23 */            char c = 1;
/* 24 */            int i = 0;
/* 25 */            ly2 jy2Var = null;
/* 26 */            if (unsafeM7077i != null) {
/* 33 */                if (!AbstractC2488y7.m10123a()) {
/* 53 */                    jy2Var = new jy2(unsafeM7077i);
                        } else if (zM7076h) {
/* 39 */                    jy2Var = new hy2(unsafeM7077i, c == true ? 1 : 0);
                        } else if (zM7076h2) {
/* 47 */                    jy2Var = new hy2(unsafeM7077i, i);
                        }
                    }
/* 56 */            f14568c = jy2Var;
/* 66 */            f14569d = jy2Var == null ? false : jy2Var.mo4401r();
/* 76 */            f14570e = jy2Var == null ? false : jy2Var.mo5928q();
/* 85 */            f14571f = m7073e(byte[].class);
/* 89 */            m7073e(boolean[].class);
/* 92 */            m7074f(boolean[].class);
/* 97 */            m7073e(int[].class);
/* 100 */           m7074f(int[].class);
/* 105 */           m7073e(long[].class);
/* 108 */           m7074f(long[].class);
/* 113 */           m7073e(float[].class);
/* 116 */           m7074f(float[].class);
/* 121 */           m7073e(double[].class);
/* 124 */           m7074f(double[].class);
/* 129 */           m7073e(Object[].class);
/* 132 */           m7074f(Object[].class);
/* 135 */           Field fieldM7075g = m7075g();
/* 139 */           if (fieldM7075g != null && jy2Var != null) {
/* 144 */               jy2Var.m6581i(fieldM7075g);
                    }
/* 157 */           f14572g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }

                /* JADX INFO: renamed from: a */
                public static void m7069a(Throwable th) {
/* 27 */            Logger.getLogger(ny2.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                }

                /* JADX INFO: renamed from: b */
                public static boolean m7070b(Object obj, long j) {
                    return ((byte) ((f14568c.m6578f(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
                }

                /* JADX INFO: renamed from: c */
                public static boolean m7071c(Object obj, long j) {
                    return ((byte) ((f14568c.m6578f(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
                }

                /* JADX INFO: renamed from: d */
                public static Object m7072d(Class cls) {
                    try {
/* 3 */                 return f14566a.allocateInstance(cls);
                    } catch (InstantiationException e) {
/* 9 */                 C1697u2.m5439o(e);
/* 12 */                return null;
                    }
                }

                /* JADX INFO: renamed from: e */
                public static int m7073e(Class cls) {
/* 3 */             if (f14570e) {
/* 7 */                 return f14568c.m6576a(cls);
                    }
/* 12 */            return -1;
                }

                /* JADX INFO: renamed from: f */
                public static void m7074f(Class cls) {
/* 3 */             if (f14570e) {
/* 7 */                 f14568c.m6577b(cls);
                    }
                }

                /* JADX INFO: renamed from: g */
                public static Field m7075g() {
                    Field declaredField;
                    Field declaredField2;
/* 8 */             if (AbstractC2488y7.m10123a()) {
                        try {
/* 12 */                    declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
                        } catch (Throwable unused) {
/* 17 */                    declaredField2 = null;
                        }
/* 18 */                if (declaredField2 != null) {
/* 20 */                    return declaredField2;
                        }
                    }
                    try {
/* 23 */                declaredField = Buffer.class.getDeclaredField("address");
                    } catch (Throwable unused2) {
/* 28 */                declaredField = null;
                    }
/* 29 */            if (declaredField == null || declaredField.getType() != Long.TYPE) {
/* 7 */                 return null;
                    }
/* 39 */            return declaredField;
                }

                /* JADX INFO: renamed from: h */
                public static boolean m7076h(Class cls) {
/* 8 */             if (!AbstractC2488y7.m10123a()) {
/* 7 */                 return false;
                    }
                    try {
/* 11 */                Class cls2 = f14567b;
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

                /* JADX INFO: renamed from: i */
                public static Unsafe m7077i() {
                    try {
/* 10 */                return (Unsafe) AccessController.doPrivileged(new fy2());
                    } catch (Throwable unused) {
/* 13 */                return null;
                    }
                }

                /* JADX INFO: renamed from: j */
                public static void m7078j(byte[] bArr, long j, byte b) {
/* 6 */             f14568c.mo4398k(bArr, f14571f + j, b);
                }

                /* JADX INFO: renamed from: k */
                public static void m7079k(Object obj, long j, byte b) {
/* 3 */             long j2 = (-4) & j;
/* 6 */             int iM6578f = f14568c.m6578f(obj, j2);
/* 14 */            int i = ((~((int) j)) & 3) << 3;
/* 26 */            m7081m(obj, ((255 & b) << i) | (iM6578f & (~(255 << i))), j2);
                }

                /* JADX INFO: renamed from: l */
                public static void m7080l(Object obj, long j, byte b) {
/* 3 */             long j2 = (-4) & j;
/* 13 */            int i = (((int) j) & 3) << 3;
/* 25 */            m7081m(obj, ((255 & b) << i) | (f14568c.m6578f(obj, j2) & (~(255 << i))), j2);
                }

                /* JADX INFO: renamed from: m */
                public static void m7081m(Object obj, int i, long j) {
/* 3 */             f14568c.m6582n(obj, i, j);
                }

                /* JADX INFO: renamed from: n */
                public static void m7082n(Object obj, long j, long j2) {
/* 6 */             f14568c.m6583o(obj, j, j2);
                }

                /* JADX INFO: renamed from: o */
                public static void m7083o(Object obj, long j, Object obj2) {
/* 3 */             f14568c.m6584p(obj, j, obj2);
                }
            }
