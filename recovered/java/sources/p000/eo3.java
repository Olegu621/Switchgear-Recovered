            package p000;

            import java.io.IOException;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class eo3 extends tm3 {
                public static final /* synthetic */ int zzd = 0;
                private static final Map zze = new ConcurrentHashMap();
                private int zza;
                protected mq3 zzc;

                public eo3() {
/* 5 */             this.zzb = 0;
/* 8 */             this.zza = -1;
/* 12 */            this.zzc = mq3.f13977f;
                }

                /* JADX INFO: renamed from: e */
                public static eo3 m3535e(Class cls) {
/* 1 */             Map map = zze;
/* 7 */             eo3 eo3Var = (eo3) map.get(cls);
/* 9 */             if (eo3Var == null) {
                        try {
/* 20 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 27 */                    eo3Var = (eo3) map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 38 */                    throw new IllegalStateException("Class initialization cannot fail.", e);
                        }
                    }
/* 39 */            if (eo3Var != null) {
/* 65 */                return eo3Var;
                    }
/* 53 */            eo3 eo3Var2 = (eo3) ((eo3) tq3.m8867e(cls)).mo317l(6, null);
/* 55 */            if (eo3Var2 != null) {
/* 57 */                map.put(cls, eo3Var2);
/* 60 */                return eo3Var2;
                    }
/* 61 */            f42.m3664t();
/* 48 */            return null;
                }

                /* JADX INFO: renamed from: f */
                public static void m3536f(Class cls, eo3 eo3Var) {
/* 1 */             eo3Var.m3546n();
/* 6 */             zze.put(cls, eo3Var);
                }

                /* JADX INFO: renamed from: g */
                public static Object m3537g(Method method, eo3 eo3Var, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(eo3Var, objArr);
                    } catch (IllegalAccessException e) {
/* 35 */                ds0.m3198o("Couldn't use Java reflection to implement protocol message reflection.", e);
/* 1 */                 return null;
                    } catch (InvocationTargetException e2) {
/* 8 */                 Throwable cause = e2.getCause();
/* 14 */                if (cause instanceof RuntimeException) {
/* 31 */                    throw ((RuntimeException) cause);
                        }
/* 18 */                if (cause instanceof Error) {
/* 28 */                    throw ((Error) cause);
                        }
/* 22 */                ds0.m3198o("Unexpected exception thrown by generated accessor method.", cause);
/* 1 */                 return null;
                    }
                }

                /* JADX INFO: renamed from: h */
                public static final boolean m3538h(eo3 eo3Var, boolean z) {
/* 9 */             byte bByteValue = ((Byte) eo3Var.mo317l(1, null)).byteValue();
/* 13 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 16 */            if (bByteValue == 0) {
/* 18 */                return false;
                    }
/* 30 */            boolean zZzk = yp3.f19747c.m10168a(eo3Var.getClass()).zzk(eo3Var);
/* 34 */            if (z) {
/* 41 */                eo3Var.mo317l(2, true == zZzk ? eo3Var : null);
                    }
/* 44 */            return zZzk;
                }

                /* JADX INFO: renamed from: i */
                public static eo3 m3539i(eo3 eo3Var, byte[] bArr, on3 on3Var) throws uo3 {
/* 1 */             int length = bArr.length;
/* 9 */             eo3 eo3Var2 = (eo3) eo3Var.mo317l(4, null);
                    try {
/* 17 */                bq3 bq3VarM10168a = yp3.f19747c.m10168a(eo3Var2.getClass());
/* 28 */                bq3VarM10168a.mo1407b(eo3Var2, bArr, 0, length, new ym3(on3Var));
/* 31 */                bq3VarM10168a.zzj(eo3Var2);
/* 39 */                if (m3538h(eo3Var2, true)) {
/* 41 */                    return eo3Var2;
                        }
/* 56 */                throw new uo3(new lq3().getMessage());
                    } catch (uo3 e) {
/* 103 */               throw e;
                    } catch (IOException e2) {
/* 70 */                if (e2.getCause() instanceof uo3) {
/* 78 */                    throw ((uo3) e2.getCause());
                        }
/* 88 */                throw new uo3(e2.getMessage(), e2);
                    } catch (IndexOutOfBoundsException unused) {
/* 61 */                throw uo3.m9056a();
                    } catch (lq3 e3) {
/* 100 */               throw new uo3(e3.getMessage());
                    }
                }

                @Override // p000.tm3
                /* JADX INFO: renamed from: b */
                public final int mo3540b(bq3 bq3Var) {
/* 8 */             if (m3545m()) {
/* 10 */                int iMo1409d = bq3Var.mo1409d(this);
/* 14 */                if (iMo1409d >= 0) {
/* 16 */                    return iMo1409d;
                        }
/* 36 */                f42.m3656l(fm0.m3788n(new StringBuilder(String.valueOf(iMo1409d).length() + 42), "serialized size must be non-negative, was ", iMo1409d));
/* 5 */                 return 0;
                    }
/* 45 */            int i = this.zza & AbstractC0208c9.API_PRIORITY_OTHER;
/* 46 */            if (i != Integer.MAX_VALUE) {
/* 48 */                return i;
                    }
/* 49 */            int iMo1409d2 = bq3Var.mo1409d(this);
/* 53 */            if (iMo1409d2 >= 0) {
/* 61 */                this.zza = (this.zza & Integer.MIN_VALUE) | iMo1409d2;
/* 63 */                return iMo1409d2;
                    }
/* 83 */            f42.m3656l(fm0.m3788n(new StringBuilder(String.valueOf(iMo1409d2).length() + 42), "serialized size must be non-negative, was ", iMo1409d2));
/* 5 */             return 0;
                }

                /* JADX INFO: renamed from: c */
                public final void m3541c() {
/* 10 */            this.zza = (this.zza & Integer.MIN_VALUE) | AbstractC0208c9.API_PRIORITY_OTHER;
                }

                /* JADX INFO: renamed from: d */
                public final int m3542d() {
/* 8 */             if (m3545m()) {
/* 10 */                int iM3544k = m3544k(null);
/* 14 */                if (iM3544k >= 0) {
/* 16 */                    return iM3544k;
                        }
/* 36 */                f42.m3656l(fm0.m3788n(new StringBuilder(String.valueOf(iM3544k).length() + 42), "serialized size must be non-negative, was ", iM3544k));
/* 39 */                return 0;
                    }
/* 46 */            int i = this.zza & AbstractC0208c9.API_PRIORITY_OTHER;
/* 47 */            if (i != Integer.MAX_VALUE) {
/* 49 */                return i;
                    }
/* 50 */            int iM3544k2 = m3544k(null);
/* 54 */            if (iM3544k2 >= 0) {
/* 62 */                this.zza = (this.zza & Integer.MIN_VALUE) | iM3544k2;
/* 64 */                return iM3544k2;
                    }
/* 84 */            f42.m3656l(fm0.m3788n(new StringBuilder(String.valueOf(iM3544k2).length() + 42), "serialized size must be non-negative, was ", iM3544k2));
/* 39 */            return 0;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 18 */                return false;
                    }
/* 32 */            return yp3.f19747c.m10168a(getClass()).mo1408c(this, (eo3) obj);
                }

                public final int hashCode() {
/* 5 */             if (m3545m()) {
/* 38 */                return yp3.f19747c.m10168a(getClass()).mo1406a(this);
                    }
/* 7 */             int i = this.zzb;
/* 9 */             if (i != 0) {
/* 27 */                return i;
                    }
/* 21 */            int iMo1406a = yp3.f19747c.m10168a(getClass()).mo1406a(this);
/* 25 */            this.zzb = iMo1406a;
/* 27 */            return iMo1406a;
                }

                /* JADX INFO: renamed from: j */
                public final void m3543j(kn3 kn3Var) {
/* 7 */             bq3 bq3VarM10168a = yp3.f19747c.m10168a(getClass());
/* 11 */            pi3 pi3Var = kn3Var.f12897a;
/* 13 */            if (pi3Var == null) {
/* 18 */                pi3Var = new pi3(kn3Var);
                    }
/* 21 */            bq3VarM10168a.mo1410e(this, pi3Var);
                }

                /* JADX INFO: renamed from: k */
                public final int m3544k(bq3 bq3Var) {
/* 1 */             if (bq3Var != null) {
/* 18 */                return bq3Var.mo1409d(this);
                    }
/* 13 */            return yp3.f19747c.m10168a(getClass()).mo1409d(this);
                }

                /* JADX INFO: renamed from: l */
                public abstract Object mo317l(int i, eo3 eo3Var);

                /* JADX INFO: renamed from: m */
                public final boolean m3545m() {
                    return (this.zza & Integer.MIN_VALUE) != 0;
                }

                /* JADX INFO: renamed from: n */
                public final void m3546n() {
/* 7 */             this.zza &= AbstractC0208c9.API_PRIORITY_OTHER;
                }

                public final String toString() {
/* 1 */             String string = super.toString();
/* 5 */             char[] cArr = sp3.f16745a;
/* 9 */             StringBuilder sb = new StringBuilder();
/* 14 */            sb.append("# ");
/* 17 */            sb.append(string);
/* 21 */            sp3.m8606b(this, sb, 0);
/* 24 */            return sb.toString();
                }
            }
