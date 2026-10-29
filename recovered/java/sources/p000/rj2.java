            package p000;

            import android.util.Range;
            import android.util.Size;
            import android.view.Surface;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rj2 {

                /* JADX INFO: renamed from: a */
                public final Object f16121a = new Object();

                /* JADX INFO: renamed from: b */
                public final Size f16122b;

                /* JADX INFO: renamed from: c */
                public final mb0 f16123c;

                /* JADX INFO: renamed from: d */
                public final boolean f16124d;

                /* JADX INFO: renamed from: e */
                public final C2466xm f16125e;

                /* JADX INFO: renamed from: f */
                public final C2260um f16126f;

                /* JADX INFO: renamed from: g */
                public final C2466xm f16127g;

                /* JADX INFO: renamed from: h */
                public final C2260um f16128h;

                /* JADX INFO: renamed from: i */
                public final C2260um f16129i;

                /* JADX INFO: renamed from: j */
                public final uw0 f16130j;

                /* JADX INFO: renamed from: k */
                public C2292vg f16131k;

                /* JADX INFO: renamed from: l */
                public C2076pn f16132l;

                /* JADX INFO: renamed from: m */
                public nt0 f16133m;

                static {
/* 1 */             Range range = C2069pg.f15101f;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public rj2(Size size, boolean z, mb0 mb0Var, fj2 fj2Var) {
/* 17 */            this.f16122b = size;
/* 19 */            this.f16124d = z;
/* 21 */            this.f16123c = mb0Var;
/* 50 */            String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
/* 57 */            AtomicReference atomicReference = new AtomicReference(null);
/* 62 */            C2260um c2260um = new C2260um();
/* 70 */            c2260um.f17592c = new u32();
/* 74 */            C2466xm c2466xm = new C2466xm(c2260um);
/* 77 */            c2260um.f17591b = c2466xm;
/* 81 */            c2260um.f17590a = AbstractC0886en.class;
                    try {
/* 83 */                atomicReference.set(c2260um);
/* 90 */                c2260um.f17590a = str.concat("-cancellation");
                    } catch (Exception e) {
/* 94 */                c2466xm.m9977b(e);
                    }
/* 101 */           C2260um c2260um2 = (C2260um) atomicReference.get();
/* 103 */           c2260um2.getClass();
/* 106 */           this.f16129i = c2260um2;
/* 110 */           AtomicReference atomicReference2 = new AtomicReference(null);
/* 115 */           C2260um c2260um3 = new C2260um();
/* 123 */           c2260um3.f17592c = new u32();
/* 127 */           C2466xm c2466xm2 = new C2466xm(c2260um3);
/* 130 */           c2260um3.f17591b = c2466xm2;
/* 132 */           c2260um3.f17590a = AbstractC0886en.class;
                    try {
/* 134 */               atomicReference2.set(c2260um3);
/* 141 */               c2260um3.f17590a = str.concat("-status");
                    } catch (Exception e2) {
/* 145 */               c2466xm2.m9977b(e2);
                    }
/* 148 */           this.f16127g = c2466xm2;
/* 153 */           Object[] objArr = 0;
/* 153 */           Object[] objArr2 = 0;
/* 166 */           c2466xm2.mo3676a(new dp0(0 == true ? 1 : 0, c2466xm2, new we2(c2260um2, c2466xm, 5, false)), pg3.m7428g());
/* 173 */           C2260um c2260um4 = (C2260um) atomicReference2.get();
/* 175 */           c2260um4.getClass();
/* 180 */           AtomicReference atomicReference3 = new AtomicReference(null);
/* 185 */           C2260um c2260um5 = new C2260um();
/* 193 */           c2260um5.f17592c = new u32();
/* 197 */           C2466xm c2466xm3 = new C2466xm(c2260um5);
/* 200 */           c2260um5.f17591b = c2466xm3;
/* 202 */           c2260um5.f17590a = AbstractC0886en.class;
                    try {
/* 204 */               atomicReference3.set(c2260um5);
/* 211 */               c2260um5.f17590a = str.concat("-Surface");
                    } catch (Exception e3) {
/* 215 */               c2466xm3.m9977b(e3);
                    }
/* 218 */           this.f16125e = c2466xm3;
/* 224 */           C2260um c2260um6 = (C2260um) atomicReference3.get();
/* 226 */           c2260um6.getClass();
/* 229 */           this.f16126f = c2260um6;
/* 233 */           uw0 uw0Var = new uw0(this, size);
/* 236 */           this.f16130j = uw0Var;
/* 240 */           s81 s81VarM9453w = w11.m9453w(uw0Var.f7030e);
/* 246 */           int i = 16;
/* 260 */           c2466xm3.mo3676a(new dp0(objArr2 == true ? 1 : 0, c2466xm3, new ac1(i, s81VarM9453w, c2260um4, str)), pg3.m7428g());
/* 273 */           s81VarM9453w.mo3676a(new v60(this, 1), pg3.m7428g());
/* 276 */           o80 o80VarM7428g = pg3.m7428g();
/* 282 */           AtomicReference atomicReference4 = new AtomicReference(null);
/* 290 */           C2466xm c2466xmM7599Y = py0.m7599Y(new C2076pn(i, this, atomicReference4));
/* 306 */           c2466xmM7599Y.mo3676a(new dp0(objArr == true ? 1 : 0, c2466xmM7599Y, new er0(fj2Var, 17)), o80VarM7428g);
/* 313 */           C2260um c2260um7 = (C2260um) atomicReference4.get();
/* 315 */           c2260um7.getClass();
/* 318 */           this.f16128h = c2260um7;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public final void m8190a(final Surface surface, Executor executor, final c00 c00Var) {
/* 7 */             final int i = 0;
/* 7 */             Object[] objArr = 0;
/* 7 */             Object[] objArr2 = 0;
/* 8 */             if (!this.f16126f.m9040a(surface)) {
/* 10 */                C2466xm c2466xm = this.f16125e;
/* 16 */                if (!c2466xm.isCancelled()) {
/* 26 */                    de3.m3028j(null, c2466xm.f19248b.isDone());
                            try {
/* 29 */                        c2466xm.get();
/* 37 */                        executor.execute(new Runnable() { // from class: oj2
                                    @Override // java.lang.Runnable
                                    public final void run() {
/* 1 */                                 int i2 = i;
/* 3 */                                 Surface surface2 = surface;
/* 5 */                                 c00 c00Var2 = c00Var;
                                        switch (i2) {
                                            case 0:
/* 26 */                                        c00Var2.accept(new C2254ug(3, surface2));
                                                break;
                                            default:
/* 16 */                                        c00Var2.accept(new C2254ug(4, surface2));
                                                break;
                                        }
                                    }
                                });
/* 40 */                        return;
                            } catch (InterruptedException | ExecutionException unused) {
/* 43 */                        final int i2 = 1;
/* 47 */                        executor.execute(new Runnable() { // from class: oj2
                                    @Override // java.lang.Runnable
                                    public final void run() {
/* 1 */                                 int i3 = i2;
/* 3 */                                 Surface surface2 = surface;
/* 5 */                                 c00 c00Var2 = c00Var;
                                        switch (i3) {
                                            case 0:
/* 26 */                                        c00Var2.accept(new C2254ug(3, surface2));
                                                break;
                                            default:
/* 16 */                                        c00Var2.accept(new C2254ug(4, surface2));
                                                break;
                                        }
                                    }
                                });
/* 50 */                        return;
                            }
                        }
                    }
/* 54 */            we2 we2Var = new we2(c00Var, surface, 6, objArr2 == true ? 1 : 0);
/* 59 */            C2466xm c2466xm2 = this.f16127g;
/* 64 */            c2466xm2.mo3676a(new dp0(objArr == true ? 1 : 0, c2466xm2, we2Var), executor);
                }

                /* JADX INFO: renamed from: b */
                public final void m8191b() {
/* 11 */            this.f16126f.m9041b(new C1898lp("Surface request will not complete.", 1));
                }
            }
