            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class y61 implements f71, InterfaceC1838ko {

                /* JADX INFO: renamed from: b */
                public final g71 f19505b;

                /* JADX INFO: renamed from: c */
                public final C2116qq f19506c;

                /* JADX INFO: renamed from: a */
                public final Object f19504a = new Object();

                /* JADX INFO: renamed from: d */
                public boolean f19507d = false;

                public y61(g71 g71Var, C2116qq c2116qq) {
/* 14 */            this.f19505b = g71Var;
/* 16 */            this.f19506c = c2116qq;
/* 32 */            if (((i71) g71Var.getLifecycle()).f9483c.compareTo(u61.f17377d) >= 0) {
/* 34 */                c2116qq.m7977d();
                    } else {
/* 38 */                c2116qq.m7981r();
                    }
/* 45 */            g71Var.getLifecycle().mo4483a(this);
                }

                @Override // p000.InterfaceC1838ko
                /* JADX INFO: renamed from: a */
                public final InterfaceC2469xp mo6170a() {
/* 3 */             return this.f19506c.f15695a0;
                }

                /* JADX INFO: renamed from: b */
                public final List m10110b() {
                    List listUnmodifiableList;
                    synchronized (this.f19504a) {
/* 10 */                listUnmodifiableList = Collections.unmodifiableList(this.f19506c.m7983v());
                    }
/* 15 */            return listUnmodifiableList;
                }

                /* JADX INFO: renamed from: d */
                public final void m10111d() {
                    synchronized (this.f19504a) {
                        try {
/* 6 */                     if (this.f19507d) {
/* 9 */                         return;
                            }
/* 14 */                    onStop(this.f19505b);
/* 18 */                    this.f19507d = true;
                        } catch (Throwable th) {
/* 23 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m10112g() {
                    synchronized (this.f19504a) {
                        try {
/* 6 */                     if (this.f19507d) {
/* 13 */                        this.f19507d = false;
/* 34 */                        if (((i71) this.f19505b.getLifecycle()).f9483c.compareTo(u61.f17377d) >= 0) {
/* 38 */                            onStart(this.f19505b);
                                }
                            }
                        } catch (Throwable th) {
/* 44 */                    throw th;
                        }
                    }
                }

                @zp1(t61.ON_DESTROY)
                public void onDestroy(g71 g71Var) {
                    synchronized (this.f19504a) {
/* 4 */                 C2116qq c2116qq = this.f19506c;
/* 12 */                c2116qq.m7985y((ArrayList) c2116qq.m7983v());
                    }
                }

                @zp1(t61.ON_PAUSE)
                public void onPause(g71 g71Var) {
/* 6 */             this.f19506c.f15694a.mo9994h(false);
                }

                @zp1(t61.ON_RESUME)
                public void onResume(g71 g71Var) {
/* 6 */             this.f19506c.f15694a.mo9994h(true);
                }

                @zp1(t61.ON_START)
                public void onStart(g71 g71Var) {
                    synchronized (this.f19504a) {
                        try {
/* 6 */                     if (!this.f19507d) {
/* 10 */                        this.f19506c.m7977d();
                            }
                        } catch (Throwable th) {
/* 19 */                    throw th;
                        }
                    }
                }

                @zp1(t61.ON_STOP)
                public void onStop(g71 g71Var) {
                    synchronized (this.f19504a) {
                        try {
/* 6 */                     if (!this.f19507d) {
/* 10 */                        this.f19506c.m7981r();
                            }
                        } catch (Throwable th) {
/* 19 */                    throw th;
                        }
                    }
                }
            }
