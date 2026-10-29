            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class k70 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12626a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ m70 f12627b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Runnable f12628c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ gr0 f12629d;

                public /* synthetic */ k70(m70 m70Var, Runnable runnable, gr0 gr0Var, int i) {
/* 1 */             this.f12626a = i;
/* 3 */             this.f12627b = m70Var;
/* 5 */             this.f12628c = runnable;
/* 7 */             this.f12629d = gr0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f12626a;
/* 3 */             final gr0 gr0Var = this.f12629d;
/* 5 */             final Runnable runnable = this.f12628c;
/* 7 */             m70 m70Var = this.f12627b;
                    switch (i) {
                        case 0:
/* 40 */                    final int i2 = 0;
/* 44 */                    m70Var.f13639a.execute(new Runnable() { // from class: i70
                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
/* 1 */                             int i3 = i2;
/* 3 */                             gr0 gr0Var2 = gr0Var;
/* 5 */                             Runnable runnable2 = runnable;
                                    switch (i3) {
                                        case 0:
                                            try {
/* 40 */                                        runnable2.run();
/* 43 */                                        return;
                                            } catch (Exception e) {
/* 49 */                                        ((o70) gr0Var2.f8789a).mo6328k(e);
/* 52 */                                        throw e;
                                            }
                                        case 1:
                                            try {
/* 27 */                                        runnable2.run();
/* 39 */                                        return;
                                            } catch (Exception e2) {
/* 36 */                                        ((o70) gr0Var2.f8789a).mo6328k(e2);
/* 39 */                                        return;
                                            }
                                        default:
/* 12 */                                    o70 o70Var = (o70) gr0Var2.f8789a;
                                            try {
/* 14 */                                        runnable2.run();
/* 18 */                                        o70Var.m6327j(null);
/* 26 */                                        return;
                                            } catch (Exception e3) {
/* 23 */                                        o70Var.mo6328k(e3);
/* 26 */                                        return;
                                            }
                                    }
                                }
                            });
                            break;
                        case 1:
/* 28 */                    final int i3 = 2;
/* 32 */                    m70Var.f13639a.execute(new Runnable() { // from class: i70
                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
/* 1 */                             int i4 = i3;
/* 3 */                             gr0 gr0Var2 = gr0Var;
/* 5 */                             Runnable runnable2 = runnable;
                                    switch (i4) {
                                        case 0:
                                            try {
/* 40 */                                        runnable2.run();
/* 43 */                                        return;
                                            } catch (Exception e) {
/* 49 */                                        ((o70) gr0Var2.f8789a).mo6328k(e);
/* 52 */                                        throw e;
                                            }
                                        case 1:
                                            try {
/* 27 */                                        runnable2.run();
/* 39 */                                        return;
                                            } catch (Exception e2) {
/* 36 */                                        ((o70) gr0Var2.f8789a).mo6328k(e2);
/* 39 */                                        return;
                                            }
                                        default:
/* 12 */                                    o70 o70Var = (o70) gr0Var2.f8789a;
                                            try {
/* 14 */                                        runnable2.run();
/* 18 */                                        o70Var.m6327j(null);
/* 26 */                                        return;
                                            } catch (Exception e3) {
/* 23 */                                        o70Var.mo6328k(e3);
/* 26 */                                        return;
                                            }
                                    }
                                }
                            });
                            break;
                        default:
/* 16 */                    final int i4 = 1;
/* 20 */                    m70Var.f13639a.execute(new Runnable() { // from class: i70
                                @Override // java.lang.Runnable
                                public final void run() throws Exception {
/* 1 */                             int i5 = i4;
/* 3 */                             gr0 gr0Var2 = gr0Var;
/* 5 */                             Runnable runnable2 = runnable;
                                    switch (i5) {
                                        case 0:
                                            try {
/* 40 */                                        runnable2.run();
/* 43 */                                        return;
                                            } catch (Exception e) {
/* 49 */                                        ((o70) gr0Var2.f8789a).mo6328k(e);
/* 52 */                                        throw e;
                                            }
                                        case 1:
                                            try {
/* 27 */                                        runnable2.run();
/* 39 */                                        return;
                                            } catch (Exception e2) {
/* 36 */                                        ((o70) gr0Var2.f8789a).mo6328k(e2);
/* 39 */                                        return;
                                            }
                                        default:
/* 12 */                                    o70 o70Var = (o70) gr0Var2.f8789a;
                                            try {
/* 14 */                                        runnable2.run();
/* 18 */                                        o70Var.m6327j(null);
/* 26 */                                        return;
                                            } catch (Exception e3) {
/* 23 */                                        o70Var.mo6328k(e3);
/* 26 */                                        return;
                                            }
                                    }
                                }
                            });
                            break;
                    }
                }
            }
