            package p000;

            import android.view.View;
            import android.view.ViewParent;
            import com.google.android.material.behavior.SwipeDismissBehavior;
            import com.supercell.titan.RunnableC0804k;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class uj2 extends hu0 {

                /* JADX INFO: renamed from: e */
                public int f17560e;

                /* JADX INFO: renamed from: f */
                public int f17561f = -1;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ SwipeDismissBehavior f17562g;

                public uj2(SwipeDismissBehavior swipeDismissBehavior) {
/* 4 */             this.f17562g = swipeDismissBehavior;
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: G0 */
                public final boolean mo621G0(int i, View view) {
/* 1 */             int i2 = this.f17561f;
                    return (i2 == -1 || i2 == i) && this.f17562g.mo2237s(view);
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: M */
                public final int mo622M(int i, View view) {
                    int width;
                    int width2;
/* 1 */             WeakHashMap weakHashMap = e33.f7494a;
/* 12 */            boolean z = view.getLayoutDirection() == 1;
/* 15 */            int i2 = this.f17562g.f4444d;
/* 17 */            if (i2 == 0) {
/* 19 */                width = this.f17560e;
/* 21 */                if (z) {
/* 27 */                    width -= view.getWidth();
/* 28 */                    width2 = this.f17560e;
                        } else {
/* 35 */                    width2 = view.getWidth() + width;
                        }
                    } else {
/* 37 */                int i3 = this.f17560e;
/* 39 */                if (i2 != 1) {
/* 63 */                    width = i3 - view.getWidth();
/* 71 */                    width2 = this.f17560e + view.getWidth();
                        } else if (z) {
/* 47 */                    width2 = view.getWidth() + i3;
/* 48 */                    width = i3;
                        } else {
/* 54 */                    width = i3 - view.getWidth();
/* 56 */                    width2 = this.f17560e;
                        }
                    }
/* 76 */            return Math.min(Math.max(width, i), width2);
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: N */
                public final int mo623N(int i, View view) {
/* 1 */             return view.getTop();
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: i0 */
                public final int mo624i0(View view) {
/* 1 */             return view.getWidth();
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: u0 */
                public final void mo627u0(int i, View view) {
/* 1 */             this.f17561f = i;
/* 7 */             this.f17560e = view.getLeft();
/* 9 */             ViewParent parent = view.getParent();
/* 13 */            if (parent != null) {
/* 16 */                parent.requestDisallowInterceptTouchEvent(true);
                    }
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: v0 */
                public final void mo628v0(int i) {
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: w0 */
                public final void mo629w0(View view, int i, int i2) {
/* 1 */             float f = this.f17560e;
/* 4 */             float width = view.getWidth();
/* 9 */             SwipeDismissBehavior swipeDismissBehavior = this.f17562g;
/* 14 */            float f2 = (width * swipeDismissBehavior.f4446f) + f;
/* 26 */            float width2 = (view.getWidth() * swipeDismissBehavior.f4447g) + this.f17560e;
                    float f3 = i;
/* 32 */            if (f3 <= f2) {
/* 34 */                view.setAlpha(1.0f);
                    } else if (f3 >= width2) {
/* 43 */                view.setAlpha(0.0f);
                    } else {
/* 60 */                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f3 - f2) / (width2 - f2))), 1.0f));
                    }
                }

                /* JADX WARN: Code duplicated, block: B:27:0x0052  */
                /* JADX WARN: Code duplicated, block: B:29:0x005a  */
                /* JADX WARN: Code duplicated, block: B:30:0x005c  */
                /* JADX WARN: Code duplicated, block: B:32:0x005f  */
                @Override // p000.hu0
                /* JADX INFO: renamed from: x0 */
                public final void mo630x0(View view, float f, float f2) {
                    int left;
                    int i;
                    int i2;
                    fs0 fs0Var;
/* 2 */             this.f17561f = -1;
/* 4 */             int width = view.getWidth();
/* 11 */            boolean z = false;
/* 12 */            SwipeDismissBehavior swipeDismissBehavior = this.f17562g;
/* 15 */            if (f != 0.0f) {
/* 17 */                WeakHashMap weakHashMap = e33.f7494a;
/* 27 */                boolean z2 = view.getLayoutDirection() == 1;
/* 28 */                int i3 = swipeDismissBehavior.f4444d;
/* 31 */                if (i3 != 2 && (i3 != 0 ? i3 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
/* 96 */                    i2 = this.f17560e;
                        } else {
/* 83 */                    left = view.getLeft();
/* 87 */                    i = this.f17560e;
/* 89 */                    if (left < i) {
/* 91 */                        i2 = i - width;
                            } else {
/* 93 */                        i2 = i + width;
                            }
/* 94 */                    z = true;
                        }
                    } else {
/* 81 */                if (Math.abs(view.getLeft() - this.f17560e) >= Math.round(view.getWidth() * swipeDismissBehavior.f4445e)) {
/* 83 */                    left = view.getLeft();
/* 87 */                    i = this.f17560e;
/* 89 */                    if (left < i) {
/* 91 */                        i2 = i - width;
                            } else {
/* 93 */                        i2 = i + width;
                            }
/* 94 */                    z = true;
                        } else {
/* 96 */                    i2 = this.f17560e;
                        }
                    }
/* 108 */           if (swipeDismissBehavior.f4441a.m5687s(i2, view.getTop())) {
/* 112 */               RunnableC2300vn runnableC2300vn = new RunnableC2300vn(swipeDismissBehavior, view, z);
/* 115 */               WeakHashMap weakHashMap2 = e33.f7494a;
/* 117 */               view.postOnAnimation(runnableC2300vn);
                    } else {
/* 121 */               if (!z || (fs0Var = swipeDismissBehavior.f4442b) == null) {
/* 136 */                   return;
                        }
/* 133 */               ((RunnableC0804k) fs0Var.f8339b).f6011b.dismiss();
                    }
                }
            }
