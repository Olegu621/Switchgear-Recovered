            package p000;

            import java.security.GeneralSecurityException;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.logging.Logger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class r22 {

                /* JADX INFO: renamed from: a */
                public static final AtomicReference f15833a;

                /* JADX INFO: renamed from: b */
                public static final ConcurrentHashMap f15834b;

                /* JADX INFO: renamed from: c */
                public static final ConcurrentHashMap f15835c;

                /* JADX INFO: renamed from: d */
                public static final ConcurrentHashMap f15836d;

                static {
/* 7 */             Logger.getLogger(r22.class.getName());
/* 20 */            f15833a = new AtomicReference(new o31());
/* 27 */            f15834b = new ConcurrentHashMap();
/* 34 */            f15835c = new ConcurrentHashMap();
/* 38 */            new ConcurrentHashMap();
/* 46 */            f15836d = new ConcurrentHashMap();
                }

                /* JADX INFO: renamed from: a */
                public static synchronized void m8052a(String str, Map map, boolean z) {
/* 6 */             if (z) {
                        try {
/* 8 */                     ConcurrentHashMap concurrentHashMap = f15835c;
/* 14 */                    if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
/* 46 */                        throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                            }
                        } catch (Throwable th) {
/* 201 */                   throw th;
                        }
                    }
/* 50 */            if (z) {
/* 66 */                if (((o31) f15833a.get()).f14604a.containsKey(str)) {
/* 80 */                    for (Map.Entry entry : map.entrySet()) {
/* 98 */                        if (!f15836d.containsKey(entry.getKey())) {
/* 137 */                           throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                                }
                            }
                        } else {
/* 150 */                   for (Map.Entry entry2 : map.entrySet()) {
/* 168 */                       if (f15836d.containsKey(entry2.getKey())) {
/* 199 */                           throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                                }
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public static Object m8053b(de3 de3Var, Class cls) {
/* 9 */             jx1 jx1Var = (jx1) wk1.f18670b.f18671a.get();
/* 11 */            jx1Var.getClass();
/* 20 */            ix1 ix1Var = new ix1(de3Var.getClass(), cls);
/* 23 */            HashMap map = jx1Var.f12533a;
/* 29 */            if (map.containsKey(ix1Var)) {
/* 39 */                return ((ex1) map.get(ix1Var)).f7914b.mo3208a(de3Var);
                    }
/* 48 */            ds0.m3205v(ix1Var, "No PrimitiveConstructor for ", " available");
/* 51 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public static Object m8054c(String str, AbstractC2298vl abstractC2298vl, Class cls) {
/* 7 */             o31 o31Var = (o31) f15833a.get();
/* 9 */             o31Var.getClass();
/* 12 */            n31 n31VarM7094a = o31Var.m7094a(str);
/* 22 */            Set setKeySet = ((Map) n31VarM7094a.f14110a.f13034b).keySet();
/* 26 */            kx0 kx0Var = n31VarM7094a.f14110a;
/* 32 */            if (!setKeySet.contains(cls)) {
/* 181 */               StringBuilder sb = new StringBuilder("Primitive type ");
/* 188 */               sb.append(cls.getName());
/* 193 */               sb.append(" not supported by key manager of type ");
/* 200 */               sb.append(kx0Var.getClass());
/* 205 */               sb.append(", supported primitives: ");
/* 212 */               Set<Class> setKeySet2 = ((Map) kx0Var.f13034b).keySet();
/* 218 */               StringBuilder sb2 = new StringBuilder();
/* 225 */               boolean z = true;
/* 230 */               for (Class cls2 : setKeySet2) {
/* 238 */                   if (!z) {
/* 242 */                       sb2.append(", ");
                            }
/* 249 */                   sb2.append(cls2.getCanonicalName());
/* 252 */                   z = false;
                        }
/* 258 */               sb.append(sb2.toString());
/* 268 */               throw new GeneralSecurityException(sb.toString());
                    }
                    try {
/* 48 */                if (!((Map) kx0Var.f13034b).keySet().contains(cls) && !Void.class.equals(cls)) {
/* 92 */                    throw new IllegalArgumentException("Given internalKeyMananger " + kx0Var.toString() + " does not support primitive class " + cls.getName());
                        }
                        try {
/* 95 */                    AbstractC2313w abstractC2313wMo6298q = kx0Var.mo6298q(abstractC2298vl);
/* 103 */                   if (Void.class.equals(cls)) {
/* 145 */                       throw new GeneralSecurityException("Cannot create a primitive for Void");
                            }
/* 105 */                   kx0Var.mo6304x(abstractC2313wMo6298q);
/* 116 */                   C1988o4 c1988o4 = (C1988o4) ((Map) kx0Var.f13034b).get(cls);
/* 118 */                   if (c1988o4 != null) {
/* 120 */                       return c1988o4.m7098a(abstractC2313wMo6298q);
                            }
/* 133 */                   f42.m3662r(cls.getCanonicalName(), "Requested primitive class ", " not supported.");
/* 136 */                   return null;
                        } catch (pz0 e) {
/* 166 */                   throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) kx0Var.f13033a).getName()), e);
                        }
                    } catch (IllegalArgumentException e2) {
/* 174 */               throw new GeneralSecurityException("Primitive type not supported", e2);
                    }
                }

                /* JADX INFO: renamed from: d */
                public static Object m8055d(String str, byte[] bArr) {
/* 1 */             C2222tl c2222tl = AbstractC2298vl.f18234b;
/* 11 */            return m8054c(str, AbstractC2298vl.m9303c(bArr, 0, bArr.length), InterfaceC0203c4.class);
                }

                /* JADX INFO: renamed from: e */
                public static synchronized i31 m8056e(w31 w31Var) {
                    er0 er0Var;
/* 24 */            kx0 kx0Var = ((o31) f15833a.get()).m7094a(w31Var.m9464B()).f14110a;
/* 30 */            er0Var = new er0(kx0Var, (Class) kx0Var.f13035c);
/* 49 */            if (!((Boolean) f15835c.get(w31Var.m9464B())).booleanValue()) {
/* 84 */                throw new GeneralSecurityException("newKey-operation not permitted for key type " + w31Var.m9464B());
                    }
/* 55 */            return er0Var.m3591t(w31Var.m9465C());
                }

                /* JADX INFO: renamed from: f */
                public static synchronized void m8057f(kx0 kx0Var, boolean z) {
                    try {
/* 6 */                 AtomicReference atomicReference = f15833a;
/* 14 */                o31 o31Var = new o31((o31) atomicReference.get());
/* 17 */                o31Var.m7095b(kx0Var);
/* 20 */                String strMo6294m = kx0Var.mo6294m();
/* 39 */                m8052a(strMo6294m, z ? kx0Var.mo6296o().mo7326j() : Collections.EMPTY_MAP, z);
/* 54 */                if (!((o31) atomicReference.get()).f14604a.containsKey(strMo6294m)) {
/* 65 */                    f15834b.put(strMo6294m, new zb0(29));
/* 68 */                    if (z) {
/* 78 */                        m8058g(strMo6294m, kx0Var.mo6296o().mo7326j());
                            }
                        }
/* 87 */                f15835c.put(strMo6294m, Boolean.valueOf(z));
/* 90 */                atomicReference.set(o31Var);
                    } catch (Throwable th) {
/* 96 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: g */
                public static void m8058g(String str, Map map) {
                    wq1 wq1Var;
/* 13 */            for (Map.Entry entry : map.entrySet()) {
/* 25 */                String str2 = (String) entry.getKey();
/* 37 */                byte[] bArrM9359e = ((AbstractC2313w) ((b41) entry.getValue()).f2206a).m9359e();
/* 47 */                int i = ((b41) entry.getValue()).f2207b;
/* 51 */                v31 v31VarM9458D = w31.m9458D();
/* 55 */                v31VarM9458D.m7234e();
/* 62 */                w31.m9459w((w31) v31VarM9458D.f14864b, str);
/* 67 */                C2222tl c2222tlM9303c = AbstractC2298vl.m9303c(bArrM9359e, 0, bArrM9359e.length);
/* 71 */                v31VarM9458D.m7234e();
/* 78 */                w31.m9460x((w31) v31VarM9458D.f14864b, c2222tlM9303c);
/* 81 */                int iM3520y = AbstractC0886en.m3520y(i);
/* 85 */                if (iM3520y == 0) {
/* 111 */                   wq1Var = wq1.TINK;
                        } else if (iM3520y == 1) {
/* 108 */                   wq1Var = wq1.LEGACY;
                        } else if (iM3520y == 2) {
/* 105 */                   wq1Var = wq1.RAW;
                        } else {
/* 94 */                    if (iM3520y != 3) {
/* 101 */                       C1951n4.m6859j("Unknown output prefix type");
/* 104 */                       return;
                            }
/* 96 */                    wq1Var = wq1.CRUNCHY;
                        }
/* 113 */               v31VarM9458D.m7234e();
/* 120 */               w31.m9461y((w31) v31VarM9458D.f14864b, wq1Var);
/* 134 */               f15836d.put(str2, new x31((w31) v31VarM9458D.m7231b()));
                    }
                }

                /* JADX INFO: renamed from: h */
                public static synchronized void m8059h(nx1 nx1Var) {
/* 4 */             wk1 wk1Var = wk1.f18670b;
                    synchronized (wk1Var) {
/* 17 */                wc0 wc0Var = new wc0((jx1) wk1Var.f18671a.get());
/* 22 */                HashMap map = (HashMap) wc0Var.f18578c;
/* 24 */                if (nx1Var != null) {
/* 26 */                    Class clsMo148c = nx1Var.mo148c();
/* 34 */                    if (map.containsKey(clsMo148c)) {
/* 40 */                        nx1 nx1Var2 = (nx1) map.get(clsMo148c);
/* 46 */                        if (!nx1Var2.equals(nx1Var) || !nx1Var.equals(nx1Var2)) {
/* 57 */                            ds0.m3207x(clsMo148c, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type");
                                }
                            } else {
/* 61 */                        map.put(clsMo148c, nx1Var);
                            }
                        } else {
/* 67 */                    C1951n4.m6868s("wrapper must be non-null");
                        }
/* 77 */                wk1Var.f18671a.set(new jx1(wc0Var));
                    }
                }
            }
