            package p000;

            import android.os.Looper;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 38 */    public abstract class a91 {

                /* JADX INFO: renamed from: k */
                public static final Object f121k = new Object();

                /* JADX INFO: renamed from: a */
                public final Object f122a;

                /* JADX INFO: renamed from: b */
                public final e62 f123b;

                /* JADX INFO: renamed from: c */
                public int f124c;

                /* JADX INFO: renamed from: d */
                public boolean f125d;

                /* JADX INFO: renamed from: e */
                public volatile Object f126e;

                /* JADX INFO: renamed from: f */
                public volatile Object f127f;

                /* JADX INFO: renamed from: g */
                public int f128g;

                /* JADX INFO: renamed from: h */
                public boolean f129h;

                /* JADX INFO: renamed from: i */
                public boolean f130i;

                /* JADX INFO: renamed from: j */
                public final RunnableC2495ye f131j;

                public a91() {
/* 9 */             this.f122a = new Object();
/* 16 */            this.f123b = new e62();
/* 19 */            this.f124c = 0;
/* 21 */            Object obj = f121k;
/* 23 */            this.f127f = obj;
/* 32 */            this.f131j = new RunnableC2495ye(this, 15);
/* 34 */            this.f126e = obj;
/* 37 */            this.f128g = -1;
                }

                /* JADX INFO: renamed from: a */
                public static void m115a(String str) {
/* 7 */             C2363xc.m9748y0().f19024k.getClass();
/* 22 */            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
/* 24 */                return;
                    }
/* 33 */            f42.m3656l(fm0.m3784j("Cannot invoke ", str, " on a background thread"));
                }

                /* JADX INFO: renamed from: b */
                public final void m116b(z81 z81Var) {
/* 3 */             if (z81Var.f19979b) {
/* 10 */                if (!z81Var.mo9745d()) {
/* 13 */                    z81Var.m10287a(false);
/* 16 */                    return;
                        }
/* 17 */                int i = z81Var.f19980c;
/* 19 */                int i2 = this.f128g;
/* 21 */                if (i >= i2) {
/* 23 */                    return;
                        }
/* 24 */                z81Var.f19980c = i2;
/* 30 */                z81Var.f19978a.mo3429q(this.f126e);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m117c(z81 z81Var) {
/* 4 */             if (this.f129h) {
/* 6 */                 this.f130i = true;
/* 8 */                 return;
                    }
/* 9 */             this.f129h = true;
/* 65 */            do {
/* 12 */                this.f130i = false;
/* 14 */                if (z81Var != null) {
/* 16 */                    m116b(z81Var);
/* 19 */                    z81Var = null;
                        } else {
/* 21 */                    e62 e62Var = this.f123b;
/* 23 */                    e62Var.getClass();
/* 28 */                    c62 c62Var = new c62(e62Var);
/* 35 */                    e62Var.f7558c.put(c62Var, Boolean.FALSE);
/* 42 */                    while (c62Var.hasNext()) {
/* 56 */                        m116b((z81) ((Map.Entry) c62Var.next()).getValue());
/* 61 */                        if (this.f130i) {
                                    break;
                                }
                            }
                        }
/* 65 */            } while (this.f130i);
/* 67 */            this.f129h = false;
                }

                /* JADX INFO: renamed from: d */
                public Object mo118d() {
/* 1 */             Object obj = this.f126e;
/* 5 */             if (obj != f121k) {
/* 7 */                 return obj;
                    }
/* 8 */             return null;
                }

                /* JADX INFO: renamed from: e */
                public final void m119e(g71 g71Var, fp1 fp1Var) {
                    Object obj;
/* 3 */             m115a("observe");
/* 16 */            if (((i71) g71Var.getLifecycle()).f9483c == u61.f17374a) {
/* 81 */                return;
                    }
/* 21 */            y81 y81Var = new y81(this, g71Var, fp1Var);
/* 24 */            e62 e62Var = this.f123b;
/* 26 */            b62 b62VarMo3333a = e62Var.mo3333a(fp1Var);
/* 30 */            if (b62VarMo3333a != null) {
/* 32 */                obj = b62VarMo3333a.f2240b;
                    } else {
/* 37 */                b62 b62Var = new b62(fp1Var, y81Var);
/* 44 */                e62Var.f7559d++;
/* 46 */                b62 b62Var2 = e62Var.f7557b;
/* 48 */                if (b62Var2 == null) {
/* 50 */                    e62Var.f7556a = b62Var;
/* 52 */                    e62Var.f7557b = b62Var;
                        } else {
/* 55 */                    b62Var2.f2241c = b62Var;
/* 57 */                    b62Var.f2242d = b62Var2;
/* 59 */                    e62Var.f7557b = b62Var;
                        }
/* 61 */                obj = null;
                    }
/* 62 */            z81 z81Var = (z81) obj;
/* 64 */            if (z81Var != null && !z81Var.mo10125c(g71Var)) {
/* 75 */                C1951n4.m6859j("Cannot add the same observer with different lifecycles");
                    } else {
/* 79 */                if (z81Var != null) {
/* 81 */                    return;
                        }
/* 86 */                g71Var.getLifecycle().mo4483a(y81Var);
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m120f(fp1 fp1Var) {
                    Object obj;
/* 3 */             m115a("observeForever");
/* 8 */             x81 x81Var = new x81(this, fp1Var);
/* 11 */            e62 e62Var = this.f123b;
/* 13 */            b62 b62VarMo3333a = e62Var.mo3333a(fp1Var);
/* 18 */            if (b62VarMo3333a != null) {
/* 20 */                obj = b62VarMo3333a.f2240b;
                    } else {
/* 25 */                b62 b62Var = new b62(fp1Var, x81Var);
/* 31 */                e62Var.f7559d++;
/* 33 */                b62 b62Var2 = e62Var.f7557b;
/* 35 */                if (b62Var2 == null) {
/* 37 */                    e62Var.f7556a = b62Var;
/* 39 */                    e62Var.f7557b = b62Var;
                        } else {
/* 42 */                    b62Var2.f2241c = b62Var;
/* 44 */                    b62Var.f2242d = b62Var2;
/* 46 */                    e62Var.f7557b = b62Var;
                        }
/* 48 */                obj = null;
                    }
/* 49 */            z81 z81Var = (z81) obj;
/* 53 */            if (z81Var instanceof y81) {
/* 64 */                C1951n4.m6859j("Cannot add the same observer with different lifecycles");
                    } else {
/* 55 */                if (z81Var != null) {
/* 57 */                    return;
                        }
/* 58 */                x81Var.m10287a(true);
                    }
                }

                /* JADX INFO: renamed from: g */
                public void mo121g() {
                }

                /* JADX INFO: renamed from: h */
                public void mo122h() {
                }

                /* JADX INFO: renamed from: i */
                public void mo123i(fp1 fp1Var) {
/* 3 */             m115a("removeObserver");
/* 12 */            z81 z81Var = (z81) this.f123b.mo3334b(fp1Var);
/* 14 */            if (z81Var == null) {
/* 16 */                return;
                    }
/* 17 */            z81Var.mo10124b();
/* 21 */            z81Var.m10287a(false);
                }

                /* JADX INFO: renamed from: j */
                public abstract void mo124j(Object obj);

/* 39 */        public a91(Object obj) {
/* 41 */            this.f122a = new Object();
/* 42 */            this.f123b = new e62();
/* 43 */            this.f124c = 0;
/* 44 */            this.f127f = f121k;
/* 45 */            this.f131j = new RunnableC2495ye(this, 15);
/* 46 */            this.f126e = obj;
/* 47 */            this.f128g = 0;
                }
            }
