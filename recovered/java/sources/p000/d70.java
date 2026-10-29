            package p000;

            import android.util.Log;
            import android.util.Size;
            import java.util.concurrent.atomic.AtomicInteger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class d70 {

                /* JADX INFO: renamed from: k */
                public static final Size f7022k = new Size(0, 0);

                /* JADX INFO: renamed from: l */
                public static final boolean f7023l = hu0.m4344o0("DeferrableSurface");

                /* JADX INFO: renamed from: m */
                public static final AtomicInteger f7024m = new AtomicInteger(0);

                /* JADX INFO: renamed from: n */
                public static final AtomicInteger f7025n = new AtomicInteger(0);

                /* JADX INFO: renamed from: a */
                public final Object f7026a = new Object();

                /* JADX INFO: renamed from: b */
                public int f7027b = 0;

                /* JADX INFO: renamed from: c */
                public boolean f7028c = false;

                /* JADX INFO: renamed from: d */
                public C2260um f7029d;

                /* JADX INFO: renamed from: e */
                public final C2466xm f7030e;

                /* JADX INFO: renamed from: f */
                public C2260um f7031f;

                /* JADX INFO: renamed from: g */
                public final C2466xm f7032g;

                /* JADX INFO: renamed from: h */
                public final Size f7033h;

                /* JADX INFO: renamed from: i */
                public final int f7034i;

                /* JADX INFO: renamed from: j */
                public Class f7035j;

                public d70(Size size, int i) {
/* 11 */            final int i2 = 0;
/* 16 */            this.f7033h = size;
/* 18 */            this.f7034i = i;
/* 25 */            C2466xm c2466xmM7599Y = py0.m7599Y(new InterfaceC2299vm(this) { // from class: b70

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ d70 f2281b;

                        {
/* 3 */                     this.f2281b = this;
                        }

                        @Override // p000.InterfaceC2299vm
                        /* JADX INFO: renamed from: w */
                        public final Object mo1148w(C2260um c2260um) {
/* 1 */                     int i3 = i2;
/* 3 */                     d70 d70Var = this.f2281b;
                            switch (i3) {
                                case 0:
                                    synchronized (d70Var.f7026a) {
/* 40 */                                d70Var.f7029d = c2260um;
                                        break;
                                    }
/* 58 */                            return "DeferrableSurface-termination(" + d70Var + ")";
                                default:
                                    synchronized (d70Var.f7026a) {
/* 11 */                                d70Var.f7031f = c2260um;
                                        break;
                                    }
/* 29 */                            return "DeferrableSurface-close(" + d70Var + ")";
                            }
                        }
                    });
/* 29 */            this.f7030e = c2466xmM7599Y;
/* 33 */            final int i3 = 1;
/* 41 */            this.f7032g = py0.m7599Y(new InterfaceC2299vm(this) { // from class: b70

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ d70 f2281b;

                        {
/* 3 */                     this.f2281b = this;
                        }

                        @Override // p000.InterfaceC2299vm
                        /* JADX INFO: renamed from: w */
                        public final Object mo1148w(C2260um c2260um) {
/* 1 */                     int i4 = i3;
/* 3 */                     d70 d70Var = this.f2281b;
                            switch (i4) {
                                case 0:
                                    synchronized (d70Var.f7026a) {
/* 40 */                                d70Var.f7029d = c2260um;
                                        break;
                                    }
/* 58 */                            return "DeferrableSurface-termination(" + d70Var + ")";
                                default:
                                    synchronized (d70Var.f7026a) {
/* 11 */                                d70Var.f7031f = c2260um;
                                        break;
                                    }
/* 29 */                            return "DeferrableSurface-close(" + d70Var + ")";
                            }
                        }
                    });
/* 49 */            if (hu0.m4344o0("DeferrableSurface")) {
/* 53 */                f7025n.incrementAndGet();
/* 58 */                f7024m.get();
/* 61 */                m2955e();
/* 86 */                c2466xmM7599Y.f19248b.mo3676a(new RunnableC1784j8(17, this, Log.getStackTraceString(new Exception())), pg3.m7428g());
                    }
                }

                /* JADX INFO: renamed from: a */
                public void mo2951a() {
                    C2260um c2260um;
                    synchronized (this.f7026a) {
                        try {
/* 7 */                     if (this.f7028c) {
/* 46 */                        c2260um = null;
                            } else {
/* 10 */                        this.f7028c = true;
/* 14 */                        this.f7031f.m9040a(null);
/* 19 */                        if (this.f7027b == 0) {
/* 21 */                            c2260um = this.f7029d;
/* 23 */                            this.f7029d = null;
                                } else {
/* 28 */                            c2260um = null;
                                }
/* 35 */                        if (hu0.m4344o0("DeferrableSurface")) {
/* 39 */                            toString();
/* 42 */                            hu0.m4312F0("DeferrableSurface");
                                }
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 48 */            if (c2260um != null) {
/* 50 */                c2260um.m9040a(null);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m2952b() {
                    C2260um c2260um;
                    synchronized (this.f7026a) {
                        try {
/* 4 */                     int i = this.f7027b;
/* 6 */                     if (i == 0) {
/* 74 */                        throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                            }
/* 8 */                     int i2 = i - 1;
/* 10 */                    this.f7027b = i2;
/* 13 */                    if (i2 == 0 && this.f7028c) {
/* 19 */                        c2260um = this.f7029d;
/* 21 */                        this.f7029d = null;
                            } else {
/* 26 */                        c2260um = null;
                            }
/* 33 */                    if (hu0.m4344o0("DeferrableSurface")) {
/* 37 */                        toString();
/* 40 */                        hu0.m4312F0("DeferrableSurface");
/* 45 */                        if (this.f7027b == 0) {
/* 49 */                            f7025n.get();
/* 54 */                            f7024m.decrementAndGet();
/* 57 */                            m2955e();
                                }
                            }
                        } catch (Throwable th) {
/* 76 */                    throw th;
                        }
                    }
/* 61 */            if (c2260um != null) {
/* 63 */                c2260um.m9040a(null);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final s81 m2953c() {
                    synchronized (this.f7026a) {
                        try {
/* 6 */                     if (this.f7028c) {
/* 18 */                        return new tw0(new c70("DeferrableSurface already closed.", this), 1);
                            }
/* 25 */                    return mo2956f();
                        } catch (Throwable th) {
/* 32 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m2954d() {
                    synchronized (this.f7026a) {
                        try {
/* 4 */                     int i = this.f7027b;
/* 6 */                     if (i == 0 && this.f7028c) {
/* 20 */                        throw new c70("Cannot begin use on a closed surface.", this);
                            }
/* 25 */                    this.f7027b = i + 1;
/* 33 */                    if (hu0.m4344o0("DeferrableSurface")) {
/* 37 */                        if (this.f7027b == 1) {
/* 41 */                            f7025n.get();
/* 46 */                            f7024m.incrementAndGet();
/* 49 */                            m2955e();
                                }
/* 54 */                        toString();
/* 57 */                        hu0.m4312F0("DeferrableSurface");
                            }
                        } catch (Throwable th) {
/* 63 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m2955e() {
/* 5 */             if (!f7023l && hu0.m4344o0("DeferrableSurface")) {
/* 13 */                hu0.m4312F0("DeferrableSurface");
                    }
/* 16 */            toString();
/* 19 */            hu0.m4312F0("DeferrableSurface");
                }

                /* JADX INFO: renamed from: f */
                public abstract s81 mo2956f();
            }
