            package p000;

            import android.os.Bundle;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gl3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8703a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AtomicReference f8704b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ sl3 f8705c;

                public gl3(sl3 sl3Var, AtomicReference atomicReference, int i) {
/* 1 */             this.f8703a = i;
                    switch (i) {
                        case 1:
/* 39 */                    this.f8704b = atomicReference;
/* 41 */                    Objects.requireNonNull(sl3Var);
/* 44 */                    this.f8705c = sl3Var;
                            break;
                        case 2:
/* 28 */                    this.f8704b = atomicReference;
/* 30 */                    Objects.requireNonNull(sl3Var);
/* 33 */                    this.f8705c = sl3Var;
                            break;
                        case 3:
/* 20 */                    this.f8705c = sl3Var;
/* 22 */                    this.f8704b = atomicReference;
                            break;
                        default:
/* 9 */                     this.f8704b = atomicReference;
/* 11 */                    Objects.requireNonNull(sl3Var);
/* 14 */                    this.f8705c = sl3Var;
                            break;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f8703a) {
                        case 0:
/* 154 */                   AtomicReference atomicReference = this.f8704b;
                            synchronized (atomicReference) {
                                try {
                                    try {
/* 161 */                               ij3 ij3Var = (ij3) this.f8705c.f16749a;
/* 183 */                               atomicReference.set(Boolean.valueOf(ij3Var.f9651d.m7406J(ij3Var.m4569q().m4534F(), vg3.f18116a0)));
/* 188 */                               this.f8704b.notify();
                                    } catch (Throwable th) {
/* 204 */                               throw th;
                                    }
                                } catch (Throwable th2) {
/* 199 */                           this.f8704b.notify();
/* 202 */                           throw th2;
                                }
                            }
/* 192 */                   return;
                        case 1:
/* 107 */                   AtomicReference atomicReference2 = this.f8704b;
                            synchronized (atomicReference2) {
                                try {
                                    try {
/* 114 */                               ij3 ij3Var2 = (ij3) this.f8705c.f16749a;
/* 132 */                               atomicReference2.set(ij3Var2.f9651d.m7402F(ij3Var2.m4569q().m4534F(), vg3.f18119b0));
/* 137 */                               this.f8704b.notify();
                                    } catch (Throwable th3) {
/* 148 */                               this.f8704b.notify();
/* 151 */                               throw th3;
                                    }
                                } catch (Throwable th4) {
/* 153 */                           throw th4;
                                }
                            }
/* 141 */                   return;
                        case 2:
/* 56 */                    AtomicReference atomicReference3 = this.f8704b;
                            synchronized (atomicReference3) {
                                try {
                                    try {
/* 63 */                                ij3 ij3Var3 = (ij3) this.f8705c.f16749a;
/* 85 */                                atomicReference3.set(Integer.valueOf(ij3Var3.f9651d.m7404H(ij3Var3.m4569q().m4534F(), vg3.f18125d0)));
/* 90 */                                this.f8704b.notify();
                                    } catch (Throwable th5) {
/* 101 */                               this.f8704b.notify();
/* 104 */                               throw th5;
                                    }
                                } catch (Throwable th6) {
/* 106 */                           throw th6;
                                }
                            }
/* 94 */                    return;
                        default:
/* 6 */                     sl3 sl3Var = this.f8705c;
/* 12 */                    ki3 ki3Var = ((ij3) sl3Var.f16749a).f9653e;
/* 14 */                    ij3.m4553j(ki3Var);
/* 19 */                    Bundle bundleM8119x = ki3Var.f12799Y.m8119x();
/* 27 */                    pn3 pn3VarM4567o = ((ij3) sl3Var.f16749a).m4567o();
/* 31 */                    AtomicReference atomicReference4 = this.f8704b;
/* 33 */                    pn3VarM4567o.mo1375y();
/* 36 */                    pn3VarM4567o.m9576A();
/* 52 */                    pn3VarM4567o.m7518N(new RunnableC2265ur(pn3VarM4567o, atomicReference4, pn3VarM4567o.m7520P(false), bundleM8119x, 8, false));
/* 55 */                    return;
                    }
                }
            }
