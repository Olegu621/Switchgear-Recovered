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
            public abstract class my2 {

                /* JADX INFO: renamed from: a */
                public static final Unsafe f14062a;

                /* JADX INFO: renamed from: b */
                public static final Class f14063b;

                /* JADX INFO: renamed from: c */
                public static final ky2 f14064c;

                /* JADX INFO: renamed from: d */
                public static final boolean f14065d;

                /* JADX INFO: renamed from: e */
                public static final boolean f14066e;

                /* JADX INFO: renamed from: f */
                public static final long f14067f;

                /* JADX INFO: renamed from: g */
                public static final boolean f14068g;

                static {
/* 1 */             Unsafe unsafeM6824j = m6824j();
/* 5 */             f14062a = unsafeM6824j;
/* 9 */             f14063b = AbstractC2358x7.f18979a;
/* 13 */            boolean zM6820f = m6820f(Long.TYPE);
/* 19 */            boolean zM6820f2 = m6820f(Integer.TYPE);
/* 23 */            char c = 1;
/* 24 */            int i = 0;
/* 25 */            ky2 iy2Var = null;
/* 26 */            if (unsafeM6824j != null) {
/* 33 */                if (!AbstractC2358x7.m9726a()) {
/* 53 */                    iy2Var = new iy2(unsafeM6824j);
                        } else if (zM6820f) {
/* 39 */                    iy2Var = new gy2(unsafeM6824j, c == true ? 1 : 0);
                        } else if (zM6820f2) {
/* 47 */                    iy2Var = new gy2(unsafeM6824j, i);
                        }
                    }
/* 56 */            f14064c = iy2Var;
/* 66 */            f14065d = iy2Var == null ? false : iy2Var.mo4051s();
/* 76 */            f14066e = iy2Var == null ? false : iy2Var.mo5627r();
/* 85 */            f14067f = m6817c(byte[].class);
/* 89 */            m6817c(boolean[].class);
/* 92 */            m6818d(boolean[].class);
/* 97 */            m6817c(int[].class);
/* 100 */           m6818d(int[].class);
/* 105 */           m6817c(long[].class);
/* 108 */           m6818d(long[].class);
/* 113 */           m6817c(float[].class);
/* 116 */           m6818d(float[].class);
/* 121 */           m6817c(double[].class);
/* 124 */           m6818d(double[].class);
/* 129 */           m6817c(Object[].class);
/* 132 */           m6818d(Object[].class);
/* 135 */           Field fieldM6819e = m6819e();
/* 139 */           if (fieldM6819e != null && iy2Var != null) {
/* 144 */               iy2Var.m6314j(fieldM6819e);
                    }
/* 157 */           f14068g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
                }

                /* JADX INFO: renamed from: a */
                public static void m6815a(Throwable th) {
/* 27 */            Logger.getLogger(my2.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                }

                /* JADX INFO: renamed from: b */
                public static Object m6816b(Class cls) {
                    try {
/* 3 */                 return f14062a.allocateInstance(cls);
                    } catch (InstantiationException e) {
/* 9 */                 C1697u2.m5439o(e);
/* 12 */                return null;
                    }
                }

                /* JADX INFO: renamed from: c */
                public static int m6817c(Class cls) {
/* 3 */             if (f14066e) {
/* 7 */                 return f14064c.m6309a(cls);
                    }
/* 12 */            return -1;
                }

                /* JADX INFO: renamed from: d */
                public static void m6818d(Class cls) {
/* 3 */             if (f14066e) {
/* 7 */                 f14064c.m6310b(cls);
                    }
                }

                /* JADX INFO: renamed from: e */
                public static Field m6819e() {
                    Field declaredField;
                    Field declaredField2;
/* 8 */             if (AbstractC2358x7.m9726a()) {
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

                /* JADX INFO: renamed from: f */
                public static boolean m6820f(Class cls) {
/* 8 */             if (!AbstractC2358x7.m9726a()) {
/* 7 */                 return false;
                    }
                    try {
/* 11 */                Class cls2 = f14063b;
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

                /* JADX INFO: renamed from: g */
                public static byte m6821g(byte[] bArr, long j) {
/* 6 */             return f14064c.mo4044d(bArr, f14067f + j);
                }

                /* JADX INFO: renamed from: h */
                public static byte m6822h(Object obj, long j) {
/* 20 */            return (byte) ((f14064c.m6311g(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
                }

                /* JADX INFO: renamed from: i */
                public static byte m6823i(Object obj, long j) {
/* 19 */            return (byte) ((f14064c.m6311g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
                }

                /* JADX INFO: renamed from: j */
                public static Unsafe m6824j() {
                    try {
/* 10 */                return (Unsafe) AccessController.doPrivileged(new ey2());
                    } catch (Throwable unused) {
/* 13 */                return null;
                    }
                }

                /* JADX INFO: renamed from: k */
                public static void m6825k(byte[] bArr, long j, byte b) {
/* 6 */             f14064c.mo4048l(bArr, f14067f + j, b);
                }

                /* JADX INFO: renamed from: l */
                public static void m6826l(Object obj, long j, byte b) {
/* 3 */             long j2 = (-4) & j;
/* 6 */             int iM6311g = f14064c.m6311g(obj, j2);
/* 14 */            int i = ((~((int) j)) & 3) << 3;
/* 26 */            m6828n(obj, ((255 & b) << i) | (iM6311g & (~(255 << i))), j2);
                }

                /* JADX INFO: renamed from: m */
                public static void m6827m(Object obj, long j, byte b) {
/* 3 */             long j2 = (-4) & j;
/* 13 */            int i = (((int) j) & 3) << 3;
/* 25 */            m6828n(obj, ((255 & b) << i) | (f14064c.m6311g(obj, j2) & (~(255 << i))), j2);
                }

                /* JADX INFO: renamed from: n */
                public static void m6828n(Object obj, int i, long j) {
/* 3 */             f14064c.m6315o(obj, i, j);
                }

                /* JADX INFO: renamed from: o */
                public static void m6829o(Object obj, long j, long j2) {
/* 6 */             f14064c.m6316p(obj, j, j2);
                }

                /* JADX INFO: renamed from: p */
                public static void m6830p(Object obj, long j, Object obj2) {
/* 3 */             f14064c.m6317q(obj, j, obj2);
                }
            }
