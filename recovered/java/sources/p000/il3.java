            package p000;

            import com.google.android.gms.measurement.internal.zzon;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class il3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9707a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AtomicReference f9708b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ sl3 f9709c;

                public il3(sl3 sl3Var, AtomicReference atomicReference, int i) {
/* 1 */             this.f9707a = i;
                    switch (i) {
                        case 1:
/* 28 */                    this.f9708b = atomicReference;
/* 30 */                    Objects.requireNonNull(sl3Var);
/* 33 */                    this.f9709c = sl3Var;
                            break;
                        case 2:
/* 20 */                    this.f9709c = sl3Var;
/* 22 */                    this.f9708b = atomicReference;
                            break;
                        default:
/* 9 */                     this.f9708b = atomicReference;
/* 11 */                    Objects.requireNonNull(sl3Var);
/* 14 */                    this.f9709c = sl3Var;
                            break;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f9707a) {
                        case 0:
/* 102 */                   AtomicReference atomicReference = this.f9708b;
                            synchronized (atomicReference) {
                                try {
                                    try {
/* 109 */                               ij3 ij3Var = (ij3) this.f9709c.f16749a;
/* 131 */                               atomicReference.set(Long.valueOf(ij3Var.f9651d.m7403G(ij3Var.m4569q().m4534F(), vg3.f18122c0)));
/* 136 */                               this.f9708b.notify();
                                    } catch (Throwable th) {
/* 152 */                               throw th;
                                    }
                                } catch (Throwable th2) {
/* 147 */                           this.f9708b.notify();
/* 150 */                           throw th2;
                                }
                            }
/* 140 */                   return;
                        case 1:
/* 51 */                    AtomicReference atomicReference2 = this.f9708b;
                            synchronized (atomicReference2) {
                                try {
                                    try {
/* 58 */                                ij3 ij3Var2 = (ij3) this.f9709c.f16749a;
/* 80 */                                atomicReference2.set(Double.valueOf(ij3Var2.f9651d.m7405I(ij3Var2.m4569q().m4534F(), vg3.f18128e0)));
/* 85 */                                this.f9708b.notify();
                                    } catch (Throwable th3) {
/* 101 */                               throw th3;
                                    }
                                } catch (Throwable th4) {
/* 96 */                            this.f9708b.notify();
/* 99 */                            throw th4;
                                }
                            }
/* 89 */                    return;
                        default:
/* 12 */                    pn3 pn3VarM4567o = ((ij3) this.f9709c.f16749a).m4567o();
/* 22 */                    zzon zzonVarM2196D1 = zzon.m2196D1(zl3.SGTM_CLIENT);
/* 26 */                    AtomicReference atomicReference3 = this.f9708b;
/* 28 */                    pn3VarM4567o.mo1375y();
/* 31 */                    pn3VarM4567o.m9576A();
/* 47 */                    pn3VarM4567o.m7518N(new RunnableC2265ur(pn3VarM4567o, atomicReference3, pn3VarM4567o.m7520P(false), zzonVarM2196D1, 9, false));
/* 50 */                    return;
                    }
                }
            }
