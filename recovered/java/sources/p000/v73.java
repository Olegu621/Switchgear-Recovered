            package p000;

            import android.content.Context;
            import java.math.BigInteger;
            import java.util.concurrent.locks.ReentrantLock;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class v73 {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ v73 f17906a = new v73();

                /* JADX INFO: renamed from: b */
                public static final hk2 f17907b;

                /* JADX INFO: renamed from: c */
                public static final xt0 f17908c;

                static {
/* 14 */            j22.m5667a(w73.class).m3242b();
/* 23 */            f17907b = r51.m8065b(C2498yh.f19630k0);
/* 27 */            f17908c = xt0.f19363d;
                }

                /* JADX INFO: renamed from: a */
                public static ts0 m9228a(Context context) {
/* 1 */             context.getClass();
/* 10 */            Object obj = (m73) f17907b.getValue();
/* 12 */            if (obj == null) {
/* 14 */                he2 he2Var = he2.f9029c;
/* 18 */                if (he2.f9029c == null) {
/* 20 */                    ReentrantLock reentrantLock = he2.f9030d;
/* 22 */                    reentrantLock.lock();
                            try {
/* 27 */                        if (he2.f9029c == null) {
/* 29 */                            fe2 fe2Var = null;
                                    try {
/* 30 */                                g23 g23VarM3014b = de2.m3014b();
/* 34 */                                if (g23VarM3014b != null) {
/* 37 */                                    g23 g23Var = g23.f8441f;
/* 39 */                                    g23Var.getClass();
/* 44 */                                    Object value = g23VarM3014b.f8446e.getValue();
/* 48 */                                    value.getClass();
/* 55 */                                    Object value2 = g23Var.f8446e.getValue();
/* 59 */                                    value2.getClass();
/* 68 */                                    if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
/* 72 */                                        fe2 fe2Var2 = new fe2(context);
/* 79 */                                        if (fe2Var2.m3757e()) {
/* 82 */                                            fe2Var = fe2Var2;
                                                }
                                            }
                                        }
                                    } catch (Throwable unused) {
                                    }
/* 88 */                            he2.f9029c = new he2(fe2Var);
                                }
/* 93 */                        reentrantLock.unlock();
                            } catch (Throwable th) {
/* 97 */                        reentrantLock.unlock();
/* 100 */                       throw th;
                            }
                        }
/* 101 */               obj = he2.f9029c;
/* 103 */               obj.getClass();
                    }
/* 108 */           int i = t83.f16997b;
/* 110 */           int i2 = t83.f16997b;
/* 112 */           ts0 ts0Var = new ts0();
/* 115 */           ts0Var.f17248a = obj;
/* 119 */           f17908c.getClass();
/* 122 */           return ts0Var;
                }
            }
