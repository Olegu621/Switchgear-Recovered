            package p000;

            import android.content.Context;
            import android.os.Trace;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sx1 {

                /* JADX INFO: renamed from: g */
                public static final sx1 f16851g = new sx1();

                /* JADX INFO: renamed from: b */
                public C2466xm f16853b;

                /* JADX INFO: renamed from: d */
                public C2303vq f16855d;

                /* JADX INFO: renamed from: e */
                public Context f16856e;

                /* JADX INFO: renamed from: a */
                public final Object f16852a = new Object();

                /* JADX INFO: renamed from: c */
                public final C0168b5 f16854c = new C0168b5();

                /* JADX INFO: renamed from: f */
                public final HashMap f16857f = new HashMap();

                /* JADX INFO: renamed from: a */
                public static final C1801jp m8651a(sx1 sx1Var, C1802jq c1802jq) {
/* 11 */            for (Object obj : c1802jq.f12421a) {
/* 17 */                obj.getClass();
/* 22 */                C2329wf c2329wf = q61.f15409b;
/* 28 */                if (!Intrinsics.m6216a(c2329wf, c2329wf)) {
                            synchronized (vf0.f18028a) {
                            }
/* 44 */                    sx1Var.f16856e.getClass();
                        }
                    }
/* 51 */            return AbstractC1861kp.f12965a;
                }

                /* JADX INFO: renamed from: b */
                public static final void m8652b(sx1 sx1Var, int i) {
/* 1 */             C2303vq c2303vq = sx1Var.f16855d;
/* 3 */             if (c2303vq == null) {
/* 5 */                 return;
                    }
/* 6 */             C1896ln c1896ln = c2303vq.f18293f;
/* 8 */             if (c1896ln == null) {
/* 94 */                f42.m3656l("CameraX not initialized yet.");
/* 97 */                return;
                    }
/* 10 */            C1837kn c1837kn = c1896ln.f13422b;
/* 15 */            if (i != c1837kn.f12882b) {
/* 29 */                for (C1899lq c1899lq : (ArrayList) c1837kn.f12884d) {
/* 37 */                    int i2 = c1837kn.f12882b;
                            synchronized (c1899lq.f13451b) {
/* 42 */                        boolean z = true;
/* 48 */                        c1899lq.f13452c = i == 2 ? 2 : 1;
/* 57 */                        boolean z2 = i2 != 2 && i == 2;
/* 58 */                        if (i2 != 2 || i == 2) {
/* 63 */                            z = false;
                                }
/* 64 */                        if (z2 || z) {
/* 68 */                            c1899lq.m6520b();
                                }
                            }
                        }
                    }
/* 78 */            if (c1837kn.f12882b == 2 && i != 2) {
/* 86 */                ((ArrayList) c1837kn.f12885e).clear();
                    }
/* 89 */            c1837kn.f12882b = i;
                }

                /* JADX INFO: renamed from: c */
                public final y61 m8653c(g71 g71Var, C1802jq c1802jq, wy2... wy2VarArr) {
                    int i;
/* 1 */             g71Var.getClass();
/* 4 */             c1802jq.getClass();
/* 13 */            Trace.beginSection(j13.m5636A("CX:bindToLifecycle"));
                    try {
/* 16 */                C2303vq c2303vq = this.f16855d;
/* 18 */                if (c2303vq == null) {
/* 20 */                    i = 0;
                        } else {
/* 22 */                    C1896ln c1896ln = c2303vq.f18293f;
/* 24 */                    if (c1896ln == null) {
/* 71 */                        throw new IllegalStateException("CameraX not initialized yet.");
                            }
/* 28 */                    i = c1896ln.f13422b.f12882b;
                        }
/* 31 */                if (i == 2) {
/* 61 */                    throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
                        }
/* 34 */                m8652b(this, 1);
/* 46 */                y61 y61VarM8654d = m8654d(g71Var, c1802jq, nd0.f14189a, (wy2[]) Arrays.copyOf(wy2VarArr, wy2VarArr.length));
/* 50 */                Trace.endSection();
/* 53 */                return y61VarM8654d;
                    } catch (Throwable th) {
/* 72 */                Trace.endSection();
/* 75 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: d */
                public final y61 m8654d(g71 g71Var, C1802jq c1802jq, nd0 nd0Var, wy2... wy2VarArr) {
                    y61 y61VarM1268n;
                    Collection collectionUnmodifiableCollection;
                    boolean zContains;
/* 1 */             g71Var.getClass();
/* 4 */             c1802jq.getClass();
/* 7 */             nd0Var.getClass();
/* 16 */            Trace.beginSection(j13.m5636A("CX:bindToLifecycle-internal"));
                    try {
/* 19 */                pg3.m7423a();
/* 22 */                C2303vq c2303vq = this.f16855d;
/* 24 */                c2303vq.getClass();
/* 33 */                InterfaceC2559zp interfaceC2559zpM5881c = c1802jq.m5881c(c2303vq.f18288a.m1597t());
/* 37 */                interfaceC2559zpM5881c.getClass();
/* 41 */                interfaceC2559zpM5881c.mo9995l(true);
/* 44 */                g42 g42VarM8655e = m8655e(c1802jq);
/* 48 */                C0168b5 c0168b5 = this.f16854c;
/* 51 */                C0989hf c0989hfM7970s = C2116qq.m7970s(g42VarM8655e, null);
                        synchronized (c0168b5.f2211b) {
/* 71 */                    y61VarM1268n = (y61) ((HashMap) c0168b5.f2212c).get(new C0018ag(g71Var, c0989hfM7970s));
                        }
/* 74 */                C0168b5 c0168b6 = this.f16854c;
                        synchronized (c0168b6.f2211b) {
/* 87 */                    collectionUnmodifiableCollection = Collections.unmodifiableCollection(((HashMap) c0168b6.f2212c).values());
                        }
/* 104 */               for (wy2 wy2Var : C2103qd.m7773h(wy2VarArr)) {
/* 120 */                   for (Object obj : collectionUnmodifiableCollection) {
/* 126 */                       obj.getClass();
/* 129 */                       y61 y61Var = (y61) obj;
                                synchronized (y61Var.f19504a) {
/* 142 */                           zContains = ((ArrayList) y61Var.f19506c.m7983v()).contains(wy2Var);
                                }
/* 147 */                       if (zContains && !y61Var.equals(y61VarM1268n)) {
/* 175 */                           throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{wy2Var}, 1)));
                                }
                            }
                        }
/* 180 */               if (y61VarM1268n == null) {
/* 182 */                   C0168b5 c0168b7 = this.f16854c;
/* 186 */                   C2303vq c2303vq2 = this.f16855d;
/* 188 */                   c2303vq2.getClass();
/* 191 */                   C1896ln c1896ln = c2303vq2.f18293f;
/* 193 */                   if (c1896ln == null) {
/* 247 */                       throw new IllegalStateException("CameraX not initialized yet.");
                            }
/* 195 */                   C1837kn c1837kn = c1896ln.f13422b;
/* 197 */                   C2303vq c2303vq3 = this.f16855d;
/* 199 */                   c2303vq3.getClass();
/* 202 */                   C0210cb c0210cb = c2303vq3.f18294g;
/* 204 */                   if (c0210cb == null) {
/* 239 */                       throw new IllegalStateException("CameraX not initialized yet.");
                            }
/* 206 */                   C2303vq c2303vq4 = this.f16855d;
/* 208 */                   c2303vq4.getClass();
/* 211 */                   C1800jo c1800jo = c2303vq4.f18295h;
/* 213 */                   if (c1800jo == null) {
/* 231 */                       throw new IllegalStateException("CameraX not initialized yet.");
                            }
/* 219 */                   y61VarM1268n = c0168b7.m1268n(g71Var, new C2116qq(interfaceC2559zpM5881c, null, g42VarM8655e, null, c1837kn, c0210cb, c1800jo));
                        }
/* 249 */               if (wy2VarArr.length != 0) {
/* 252 */                   C0168b5 c0168b8 = this.f16854c;
/* 259 */                   List listM7566e = C2085pw.m7566e(Arrays.copyOf(wy2VarArr, wy2VarArr.length));
/* 263 */                   C2303vq c2303vq5 = this.f16855d;
/* 265 */                   c2303vq5.getClass();
/* 268 */                   C1896ln c1896ln2 = c2303vq5.f18293f;
/* 270 */                   if (c1896ln2 == null) {
/* 288 */                       throw new IllegalStateException("CameraX not initialized yet.");
                            }
/* 274 */                   c0168b8.m1263h(y61VarM1268n, nd0Var, listM7566e, c1896ln2.f13422b);
                        }
/* 277 */               Trace.endSection();
/* 280 */               return y61VarM1268n;
                    } catch (Throwable th) {
/* 299 */               Trace.endSection();
/* 302 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: e */
                public final g42 m8655e(C1802jq c1802jq) {
                    Object g42Var;
/* 1 */             c1802jq.getClass();
/* 10 */            Trace.beginSection(j13.m5636A("CX:getCameraInfo"));
                    try {
/* 13 */                C2303vq c2303vq = this.f16855d;
/* 15 */                c2303vq.getClass();
/* 28 */                InterfaceC2469xp interfaceC2469xpMo8073m = c1802jq.m5881c(c2303vq.f18288a.m1597t()).mo8073m();
/* 32 */                interfaceC2469xpMo8073m.getClass();
/* 35 */                C1801jp c1801jpM8651a = m8651a(this, c1802jq);
/* 47 */                C0989hf c0989hf = new C0989hf(interfaceC2469xpMo8073m.mo310b(), c1801jpM8651a.f12414a);
                        synchronized (this.f16852a) {
/* 55 */                    g42Var = this.f16857f.get(c0989hf);
/* 59 */                    if (g42Var == null) {
/* 63 */                        g42Var = new g42(interfaceC2469xpMo8073m, c1801jpM8651a);
/* 68 */                        this.f16857f.put(c0989hf, g42Var);
                            }
                        }
/* 75 */                g42 g42Var2 = (g42) g42Var;
/* 77 */                Trace.endSection();
/* 80 */                return g42Var2;
                    } catch (Throwable th) {
/* 84 */                Trace.endSection();
/* 87 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m8656f() {
/* 7 */             Trace.beginSection(j13.m5636A("CX:unbindAll"));
                    try {
/* 10 */                pg3.m7423a();
/* 14 */                m8652b(this, 0);
/* 19 */                this.f16854c.m1255J();
                    } finally {
/* 27 */                Trace.endSection();
                    }
                }
            }
