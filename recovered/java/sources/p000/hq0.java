            package p000;

            import android.os.Trace;
            import androidx.recyclerview.widget.AbstractC0129g;
            import androidx.recyclerview.widget.AbstractC0133k;
            import androidx.recyclerview.widget.AbstractC0137o;
            import androidx.recyclerview.widget.C0134l;
            import androidx.recyclerview.widget.RecyclerView;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.concurrent.TimeUnit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hq0 implements Runnable {

                /* JADX INFO: renamed from: e */
                public static final ThreadLocal f9191e = new ThreadLocal();

                /* JADX INFO: renamed from: f */
                public static final wa3 f9192f = new wa3(6);

                /* JADX INFO: renamed from: a */
                public ArrayList f9193a;

                /* JADX INFO: renamed from: b */
                public long f9194b;

                /* JADX INFO: renamed from: c */
                public long f9195c;

                /* JADX INFO: renamed from: d */
                public ArrayList f9196d;

                /* JADX INFO: renamed from: c */
                public static AbstractC0137o m4262c(RecyclerView recyclerView, int i, long j) {
/* 3 */             int iM3363A = recyclerView.f1648e.m3363A();
/* 9 */             for (int i2 = 0; i2 < iM3363A; i2++) {
/* 17 */                AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(recyclerView.f1648e.m3399z(i2));
/* 23 */                if (abstractC0137oM843J.f1780c == i && !abstractC0137oM843J.m1022f()) {
/* 31 */                    return null;
                        }
                    }
/* 36 */            C0134l c0134l = recyclerView.f1639b;
                    try {
/* 38 */                recyclerView.m864R();
/* 41 */                AbstractC0137o abstractC0137oM1012i = c0134l.m1012i(i, j);
/* 45 */                if (abstractC0137oM1012i != null) {
/* 51 */                    if (!abstractC0137oM1012i.m1021e() || abstractC0137oM1012i.m1022f()) {
/* 67 */                        c0134l.m1004a(abstractC0137oM1012i, false);
                            } else {
/* 61 */                        c0134l.m1009f(abstractC0137oM1012i.f1778a);
                            }
                        }
/* 73 */                return abstractC0137oM1012i;
                    } finally {
/* 74 */                recyclerView.m865S(false);
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m4263a(RecyclerView recyclerView, int i, int i2) {
/* 3 */             if (recyclerView.f1652f0 && this.f9194b == 0) {
/* 17 */                this.f9194b = recyclerView.getNanoTime();
/* 19 */                recyclerView.post(this);
                    }
/* 22 */            C1771iw c1771iw = recyclerView.f1623Q0;
/* 24 */            c1771iw.f11945b = i;
/* 26 */            c1771iw.f11946c = i2;
                }

                /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
                /* JADX INFO: renamed from: b */
                public final void m4264b(long j) {
                    gq0 gq0Var;
                    RecyclerView recyclerView;
                    RecyclerView recyclerView2;
                    gq0 gq0Var2;
/* 1 */             ArrayList arrayList = this.f9196d;
/* 3 */             ArrayList arrayList2 = this.f9193a;
/* 5 */             int size = arrayList2.size();
/* 11 */            int i = 0;
/* 12 */            for (int i2 = 0; i2 < size; i2++) {
/* 18 */                RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
/* 20 */                int windowVisibility = recyclerView3.getWindowVisibility();
/* 24 */                C1771iw c1771iw = recyclerView3.f1623Q0;
/* 26 */                if (windowVisibility == 0) {
/* 28 */                    c1771iw.m5584b(recyclerView3, false);
/* 33 */                    i += c1771iw.f11947d;
                        }
                    }
/* 37 */            arrayList.ensureCapacity(i);
/* 41 */            int i3 = 0;
/* 43 */            for (int i4 = 0; i4 < size; i4++) {
/* 49 */                RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
/* 55 */                if (recyclerView4.getWindowVisibility() == 0) {
/* 58 */                    C1771iw c1771iw2 = recyclerView4.f1623Q0;
/* 72 */                    int iAbs = Math.abs(c1771iw2.f11946c) + Math.abs(c1771iw2.f11945b);
/* 78 */                    for (int i5 = 0; i5 < c1771iw2.f11947d * 2; i5 += 2) {
/* 84 */                        if (i3 >= arrayList.size()) {
/* 88 */                            gq0Var2 = new gq0();
/* 91 */                            arrayList.add(gq0Var2);
                                } else {
/* 99 */                            gq0Var2 = (gq0) arrayList.get(i3);
                                }
/* 103 */                       int[] iArr = (int[]) c1771iw2.f11948e;
/* 107 */                       int i6 = iArr[i5 + 1];
/* 114 */                       gq0Var2.f8777a = i6 <= iAbs;
/* 116 */                       gq0Var2.f8778b = iAbs;
/* 118 */                       gq0Var2.f8779c = i6;
/* 120 */                       gq0Var2.f8780d = recyclerView4;
/* 124 */                       gq0Var2.f8781e = iArr[i5];
/* 126 */                       i3++;
                            }
                        }
                    }
/* 136 */           Collections.sort(arrayList, f9192f);
/* 144 */           for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (gq0Var = (gq0) arrayList.get(i7)).f8780d) != null; i7++) {
/* 171 */               AbstractC0137o abstractC0137oM4262c = m4262c(recyclerView, gq0Var.f8781e, gq0Var.f8777a ? Long.MAX_VALUE : j);
/* 175 */               if (abstractC0137oM4262c != null && abstractC0137oM4262c.f1779b != null && abstractC0137oM4262c.m1021e() && !abstractC0137oM4262c.m1022f() && (recyclerView2 = (RecyclerView) abstractC0137oM4262c.f1779b.get()) != null) {
/* 208 */                   if (recyclerView2.f1669q0 && recyclerView2.f1648e.m3363A() != 0) {
/* 218 */                       C0134l c0134l = recyclerView2.f1639b;
/* 220 */                       n12 n12Var = recyclerView2.f1680z0;
/* 222 */                       if (n12Var != null) {
/* 224 */                           n12Var.mo5715e();
                                }
/* 227 */                       AbstractC0133k abstractC0133k = recyclerView2.f1637a0;
/* 229 */                       if (abstractC0133k != null) {
/* 231 */                           abstractC0133k.m999s0(c0134l);
/* 236 */                           recyclerView2.f1637a0.m1000t0(c0134l);
                                }
/* 241 */                       c0134l.f1768a.clear();
/* 244 */                       c0134l.m1007d();
                            }
/* 247 */                   C1771iw c1771iw3 = recyclerView2.f1623Q0;
/* 249 */                   c1771iw3.m5584b(recyclerView2, true);
/* 254 */                   if (c1771iw3.f11947d != 0) {
                                try {
/* 258 */                           int i8 = oq2.f14866a;
/* 260 */                           Trace.beginSection("RV Nested Prefetch");
/* 263 */                           y12 y12Var = recyclerView2.f1624R0;
/* 265 */                           AbstractC0129g abstractC0129g = recyclerView2.f1631W;
/* 267 */                           y12Var.f19440d = 1;
/* 273 */                           y12Var.f19441e = abstractC0129g.mo955a();
/* 275 */                           y12Var.f19443g = false;
/* 277 */                           y12Var.f19444h = false;
/* 279 */                           y12Var.f19445i = false;
/* 286 */                           for (int i9 = 0; i9 < c1771iw3.f11947d * 2; i9 += 2) {
/* 295 */                               m4262c(recyclerView2, ((int[]) c1771iw3.f11948e)[i9], j);
                                    }
/* 302 */                           Trace.endSection();
                                } catch (Throwable th) {
/* 308 */                           int i10 = oq2.f14866a;
/* 310 */                           Trace.endSection();
/* 313 */                           throw th;
                                }
                            }
                        }
/* 314 */               gq0Var.f8777a = false;
/* 316 */               gq0Var.f8778b = 0;
/* 318 */               gq0Var.f8779c = 0;
/* 321 */               gq0Var.f8780d = null;
/* 323 */               gq0Var.f8781e = 0;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             ArrayList arrayList = this.f9193a;
                    try {
/* 7 */                 int i = oq2.f14866a;
/* 9 */                 Trace.beginSection("RV Prefetch");
/* 16 */                if (!arrayList.isEmpty()) {
/* 24 */                    int size = arrayList.size();
/* 29 */                    long jMax = 0;
/* 30 */                    for (int i2 = 0; i2 < size; i2++) {
/* 36 */                        RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
/* 42 */                        if (recyclerView.getWindowVisibility() == 0) {
/* 48 */                            jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                                }
                            }
/* 60 */                    if (jMax != 0) {
/* 72 */                        m4264b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f9195c);
                            }
                        }
/* 18 */                this.f9194b = 0L;
                    } finally {
/* 76 */                this.f9194b = 0L;
/* 78 */                int i3 = oq2.f14866a;
/* 80 */                Trace.endSection();
                    }
                }
            }
