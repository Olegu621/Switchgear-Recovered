            package p000;

            import android.view.View;
            import com.google.android.material.bottomsheet.BottomSheetBehavior;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: renamed from: tk */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2221tk extends hu0 {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ BottomSheetBehavior f17131e;

                public C2221tk(BottomSheetBehavior bottomSheetBehavior) {
/* 4 */             this.f17131e = bottomSheetBehavior;
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: G0 */
                public final boolean mo621G0(int i, View view) {
/* 1 */             BottomSheetBehavior bottomSheetBehavior = this.f17131e;
/* 3 */             int i2 = bottomSheetBehavior.f4486J;
/* 6 */             if (i2 == 1 || bottomSheetBehavior.f4500X) {
/* 57 */                return false;
                    }
/* 15 */            if (i2 == 3 && bottomSheetBehavior.f4498V == i) {
/* 21 */                WeakReference weakReference = bottomSheetBehavior.f4495S;
/* 32 */                View view2 = weakReference != null ? (View) weakReference.get() : null;
/* 33 */                if (view2 != null && view2.canScrollVertically(-1)) {
/* 57 */                    return false;
                        }
                    }
/* 43 */            System.currentTimeMillis();
/* 46 */            WeakReference weakReference2 = bottomSheetBehavior.f4494R;
                    return weakReference2 != null && weakReference2.get() == view;
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: M */
                public final int mo622M(int i, View view) {
/* 1 */             return view.getLeft();
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: N */
                public final int mo623N(int i, View view) {
/* 1 */             BottomSheetBehavior bottomSheetBehavior = this.f17131e;
/* 16 */            return qj3.m7892c(i, bottomSheetBehavior.m2265x(), bottomSheetBehavior.f4483G ? bottomSheetBehavior.f4493Q : bottomSheetBehavior.f4481E);
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: j0 */
                public final int mo4365j0() {
/* 1 */             BottomSheetBehavior bottomSheetBehavior = this.f17131e;
                    return bottomSheetBehavior.f4483G ? bottomSheetBehavior.f4493Q : bottomSheetBehavior.f4481E;
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: v0 */
                public final void mo628v0(int i) {
/* 2 */             if (i == 1) {
/* 4 */                 BottomSheetBehavior bottomSheetBehavior = this.f17131e;
/* 8 */                 if (bottomSheetBehavior.f4485I) {
/* 10 */                    bottomSheetBehavior.m2255B(1);
                        }
                    }
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: w0 */
                public final void mo629w0(View view, int i, int i2) {
/* 3 */             this.f17131e.m2264u(i2);
                }

                /* JADX WARN: Code duplicated, block: B:20:0x0048  */
                /* JADX WARN: Code duplicated, block: B:34:0x0081  */
                /* JADX WARN: Code duplicated, block: B:6:0x000d  */
                @Override // p000.hu0
                /* JADX INFO: renamed from: x0 */
                public final void mo630x0(View view, float f, float f2) {
/* 4 */             int i = 6;
/* 6 */             BottomSheetBehavior bottomSheetBehavior = this.f17131e;
/* 8 */             if (f2 < 0.0f) {
/* 12 */                if (bottomSheetBehavior.f4505b) {
/* 14 */                    i = 3;
                        } else {
/* 17 */                    int top = view.getTop();
/* 21 */                    System.currentTimeMillis();
/* 26 */                    if (top <= bottomSheetBehavior.f4479C) {
/* 14 */                        i = 3;
                            }
                        }
                    } else if (bottomSheetBehavior.f4483G && bottomSheetBehavior.m2256C(view, f2)) {
/* 50 */                if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
/* 71 */                    if (view.getTop() > (bottomSheetBehavior.m2265x() + bottomSheetBehavior.f4493Q) / 2) {
/* 73 */                        i = 5;
                            } else if (bottomSheetBehavior.f4505b || Math.abs(view.getTop() - bottomSheetBehavior.m2265x()) < Math.abs(view.getTop() - bottomSheetBehavior.f4479C)) {
/* 14 */                        i = 3;
                            }
                        } else {
/* 73 */                    i = 5;
                        }
                    } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
/* 154 */               int top2 = view.getTop();
/* 160 */               if (!bottomSheetBehavior.f4505b) {
/* 181 */                   int i2 = bottomSheetBehavior.f4479C;
/* 183 */                   if (top2 < i2) {
/* 193 */                       if (top2 < Math.abs(top2 - bottomSheetBehavior.f4481E)) {
/* 14 */                            i = 3;
                                }
                            } else if (Math.abs(top2 - i2) >= Math.abs(top2 - bottomSheetBehavior.f4481E)) {
/* 130 */                       i = 4;
                            }
                        } else if (Math.abs(top2 - bottomSheetBehavior.f4478B) < Math.abs(top2 - bottomSheetBehavior.f4481E)) {
/* 14 */                    i = 3;
                        } else {
/* 130 */                   i = 4;
                        }
                    } else if (bottomSheetBehavior.f4505b) {
/* 130 */               i = 4;
                    } else {
/* 132 */               int top3 = view.getTop();
/* 151 */               if (Math.abs(top3 - bottomSheetBehavior.f4479C) >= Math.abs(top3 - bottomSheetBehavior.f4481E)) {
/* 130 */                   i = 4;
                        }
                    }
/* 213 */           bottomSheetBehavior.m2257D(i, view, true);
                }
            }
