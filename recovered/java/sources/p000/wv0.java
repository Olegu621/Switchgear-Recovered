            package p000;

            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wv0 extends rv0 {

                /* JADX INFO: renamed from: e0 */
                public final Executor f18831e0;

                /* JADX INFO: renamed from: f0 */
                public final Object f18832f0 = new Object();

                /* JADX INFO: renamed from: g0 */
                public mw0 f18833g0;

                /* JADX INFO: renamed from: h0 */
                public vv0 f18834h0;

                public wv0(Executor executor) {
/* 11 */            this.f18831e0 = executor;
                }

                @Override // p000.rv0
                /* JADX INFO: renamed from: a */
                public final mw0 mo8258a(ow0 ow0Var) {
/* 1 */             return ow0Var.acquireLatestImage();
                }

                @Override // p000.rv0
                /* JADX INFO: renamed from: c */
                public final void mo8260c() {
                    synchronized (this.f18832f0) {
                        try {
/* 4 */                     mw0 mw0Var = this.f18833g0;
/* 6 */                     if (mw0Var != null) {
/* 8 */                         mw0Var.close();
/* 12 */                        this.f18833g0 = null;
                            }
                        } catch (Throwable th) {
/* 20 */                    throw th;
                        }
                    }
                }

                @Override // p000.rv0
                /* JADX INFO: renamed from: e */
                public final void mo8262e(mw0 mw0Var) {
                    synchronized (this.f18832f0) {
                        try {
/* 6 */                     if (!this.f16316d0) {
/* 8 */                         mw0Var.close();
/* 12 */                        return;
                            }
/* 17 */                    if (this.f18834h0 != null) {
/* 41 */                        if (mw0Var.mo1727x0().mo4037b() <= this.f18834h0.f2998b.mo1727x0().mo4037b()) {
/* 43 */                            mw0Var.close();
                                } else {
/* 47 */                            mw0 mw0Var2 = this.f18833g0;
/* 49 */                            if (mw0Var2 != null) {
/* 51 */                                mw0Var2.close();
                                    }
/* 54 */                            this.f18833g0 = mw0Var;
                                }
/* 57 */                        return;
                            }
/* 60 */                    vv0 vv0Var = new vv0(mw0Var, this);
/* 63 */                    this.f18834h0 = vv0Var;
/* 65 */                    s81 s81VarM8259b = m8259b(vv0Var);
/* 72 */                    er0 er0Var = new er0(vv0Var, 3);
/* 85 */                    s81VarM8259b.mo3676a(new dp0(0, s81VarM8259b, er0Var), pg3.m7428g());
                        } catch (Throwable th) {
/* 91 */                    throw th;
                        }
                    }
                }
            }
