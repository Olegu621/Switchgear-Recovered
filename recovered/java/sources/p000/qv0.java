            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            import android.util.Size;
            import com.supercell.p007id.scid_plugin.MobileScanner;
            import io.flutter.view.TextureRegistry;
            import java.util.concurrent.Executor;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    public final /* synthetic */ class qv0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15770a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f15771b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f15772c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f15773d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f15774e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Object f15775f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ Object f15776i;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ Object f15777v;

                public /* synthetic */ qv0(rv0 rv0Var, mw0 mw0Var, Matrix matrix, mw0 mw0Var2, Rect rect, C2357x6 c2357x6, C2260um c2260um) {
/* 2 */             this.f15770a = 0;
/* 7 */             this.f15771b = rv0Var;
/* 9 */             this.f15772c = mw0Var;
/* 11 */            this.f15774e = matrix;
/* 13 */            this.f15773d = mw0Var2;
/* 15 */            this.f15775f = rect;
/* 17 */            this.f15776i = c2357x6;
/* 19 */            this.f15777v = c2260um;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g42 g42Var;
                    fs0 fs0VarM9350C;
/* 5 */             y61 y61VarM8653c = null;
                    switch (this.f15770a) {
                        case 0:
/* 319 */                   rv0 rv0Var = (rv0) this.f15771b;
/* 323 */                   mw0 mw0Var = (mw0) this.f15772c;
/* 328 */                   Matrix matrix = (Matrix) this.f15774e;
/* 332 */                   mw0 mw0Var2 = (mw0) this.f15773d;
/* 337 */                   Rect rect = (Rect) this.f15775f;
/* 342 */                   lv0 lv0Var = (lv0) this.f15776i;
/* 346 */                   C2260um c2260um = (C2260um) this.f15777v;
/* 350 */                   if (!rv0Var.f16316d0) {
/* 433 */                       c2260um.m9041b(new kq1("ImageAnalysis is detached"));
/* 436 */                       return;
                            }
/* 384 */                   wb2 wb2Var = new wb2(mw0Var2, null, new C2366xf(mw0Var.mo1727x0().mo4036a(), mw0Var.mo1727x0().mo4037b(), rv0Var.f16317e ? 0 : rv0Var.f16311b, matrix));
/* 391 */                   if (!rect.isEmpty()) {
/* 395 */                       Rect rect2 = new Rect(rect);
/* 406 */                       if (!rect2.intersect(0, 0, wb2Var.f18569f, wb2Var.f18570i)) {
/* 408 */                           rect2.setEmpty();
                                }
                                synchronized (wb2Var.f18567d) {
                                    break;
                                }
                            }
/* 419 */                   lv0Var.mo6538a(wb2Var);
/* 422 */                   c2260um.m9040a(null);
/* 436 */                   return;
                        case 1:
/* 51 */                    fj1 fj1Var = (fj1) this.f15771b;
/* 55 */                    RunnableC1901ls runnableC1901ls = (RunnableC1901ls) this.f15772c;
/* 59 */                    ij1 ij1Var = (ij1) this.f15773d;
/* 63 */                    Size size = (Size) this.f15774e;
/* 67 */                    Size size2 = (Size) this.f15775f;
/* 71 */                    ij1 ij1Var2 = (ij1) this.f15776i;
/* 75 */                    Executor executor = (Executor) this.f15777v;
/* 81 */                    sx1 sx1Var = (sx1) runnableC1901ls.get();
/* 83 */                    fj1Var.f8241i = sx1Var;
/* 85 */                    if (sx1Var == null) {
/* 92 */                        ij1Var.invoke(new C2226tp());
/* 316 */                       return;
                            }
/* 97 */                    sx1Var.m8656f();
/* 106 */                   fj1Var.f8227U = fj1Var.f8235b.createSurfaceTexture();
/* 111 */                   C2076pn c2076pn = new C2076pn(6, fj1Var, executor);
/* 120 */                   vw1 vw1VarM7035a = new C1974nr(3).m7035a();
/* 124 */                   vw1VarM7035a.m9351D(c2076pn);
/* 127 */                   fj1Var.f8243w = vw1VarM7035a;
/* 135 */                   uk1 uk1Var = new C1974nr(1).f14413b;
/* 146 */                   uk1Var.m9037p(jw0.f12523u, new Size(768, 768));
/* 155 */                   uk1Var.m9037p(tv0.f17281b, 0);
/* 164 */                   uk1Var.m9037p(tv0.f17284e, 1);
/* 173 */                   tv0 tv0Var = new tv0(nq1.m7021d(uk1Var));
/* 176 */                   jw0.m5922y(tv0Var);
/* 181 */                   pv0 pv0Var = new pv0(tv0Var);
/* 186 */                   pv0Var.m7562D(executor, fj1Var.f8236b0);
                            try {
/* 189 */                       sx1 sx1Var2 = fj1Var.f8241i;
/* 191 */                       if (sx1Var2 != null) {
/* 193 */                           C1802jq c1802jq = C1802jq.f12420c;
/* 195 */                           c1802jq.getClass();
/* 207 */                           y61VarM8653c = sx1Var2.m8653c(fj1Var, c1802jq, fj1Var.f8243w, pv0Var);
                                }
/* 211 */                       fj1Var.f8242v = y61VarM8653c;
/* 213 */                       vw1 vw1Var = fj1Var.f8243w;
/* 232 */                       Size size3 = (vw1Var == null || (fs0VarM9350C = vw1Var.m9350C()) == null) ? new Size(0, 0) : ((C1792jg) fs0VarM9350C.f8339b).f12252a;
/* 235 */                       double width = size3.getWidth();
/* 240 */                       double height = size3.getHeight();
/* 249 */                       fj1Var.f8234a0 = fj1Var.m3769a();
/* 251 */                       y61 y61Var = fj1Var.f8242v;
/* 269 */                       boolean z = ((y61Var == null || (g42Var = y61Var.f19506c.f15695a0) == null) ? 0 : g42Var.mo309a()) % 180 == 0;
/* 272 */                       fj1Var.f8230X = size;
/* 274 */                       fj1Var.f8231Y = size2;
/* 282 */                       double d = z ? width : height;
/* 287 */                       double d2 = z ? height : width;
/* 288 */                       int i = fj1Var.f8234a0;
/* 290 */                       TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = fj1Var.f8227U;
/* 292 */                       surfaceTextureEntry.getClass();
/* 304 */                       ij1Var2.invoke(new mj1(d, d2, i, surfaceTextureEntry.mo4606id()));
/* 316 */                       return;
                            } catch (Exception unused) {
/* 313 */                       ij1Var.invoke(new ln1());
/* 316 */                       return;
                            }
                        default:
/* 1 */                     MobileScanner.start$lambda$5((MobileScanner) this.f15771b, (RunnableC1901ls) this.f15772c, (Function1) this.f15773d, (Size) this.f15774e, (Size) this.f15775f, (Function1) this.f15776i, (Executor) this.f15777v);
/* 48 */                    return;
                    }
                }

/* 21 */        public /* synthetic */ qv0(g71 g71Var, RunnableC1901ls runnableC1901ls, Function1 function1, Size size, Size size2, Function1 function2, Executor executor, int i) {
/* 22 */            this.f15770a = i;
                    this.f15771b = g71Var;
                    this.f15772c = runnableC1901ls;
                    this.f15773d = function1;
                    this.f15774e = size;
                    this.f15775f = size2;
                    this.f15776i = function2;
                    this.f15777v = executor;
                }
            }
