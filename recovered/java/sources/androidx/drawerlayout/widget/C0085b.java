            package androidx.drawerlayout.widget;

            import android.view.View;
            import java.util.ArrayList;
            import p000.RunnableC2495ye;
            import p000.hu0;
            import p000.j33;
            import p000.pm2;
            
            /* JADX INFO: renamed from: androidx.drawerlayout.widget.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0085b extends hu0 {

                /* JADX INFO: renamed from: e */
                public final int f1332e;

                /* JADX INFO: renamed from: f */
                public j33 f1333f;

                /* JADX INFO: renamed from: g */
                public final RunnableC2495ye f1334g = new RunnableC2495ye(this, 5);

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ DrawerLayout f1335h;

                public C0085b(DrawerLayout drawerLayout, int i) {
/* 4 */             this.f1335h = drawerLayout;
/* 14 */            this.f1332e = i;
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: G0 */
                public final boolean mo621G0(int i, View view) {
/* 5 */             if (!DrawerLayout.m608j(view)) {
/* 25 */                return false;
                    }
/* 7 */             int i2 = this.f1332e;
/* 9 */             DrawerLayout drawerLayout = this.f1335h;
                    return drawerLayout.m609a(i2, view) && drawerLayout.m614f(view) == 0;
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: M */
                public final int mo622M(int i, View view) {
/* 2 */             DrawerLayout drawerLayout = this.f1335h;
/* 8 */             if (drawerLayout.m609a(3, view)) {
/* 20 */                return Math.max(-view.getWidth(), Math.min(i, 0));
                    }
/* 25 */            int width = drawerLayout.getWidth();
/* 39 */            return Math.max(width - view.getWidth(), Math.min(i, width));
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: N */
                public final int mo623N(int i, View view) {
/* 1 */             return view.getTop();
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: i0 */
                public final int mo624i0(View view) {
/* 5 */             if (DrawerLayout.m608j(view)) {
/* 7 */                 return view.getWidth();
                    }
/* 12 */            return 0;
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: s0 */
                public final void mo625s0(int i, int i2) {
/* 2 */             int i3 = i & 1;
/* 3 */             DrawerLayout drawerLayout = this.f1335h;
/* 14 */            View viewM612d = i3 == 1 ? drawerLayout.m612d(3) : drawerLayout.m612d(5);
/* 18 */            if (viewM612d == null || drawerLayout.m614f(viewM612d) != 0) {
/* 31 */                return;
                    }
/* 28 */            this.f1333f.m5672c(i2, viewM612d);
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: t0 */
                public final void mo626t0(int i) {
/* 7 */             this.f1335h.postDelayed(this.f1334g, 160L);
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: u0 */
                public final void mo627u0(int i, View view) {
/* 8 */             ((DrawerLayout.LayoutParams) view.getLayoutParams()).f1325c = false;
/* 13 */            int i2 = this.f1332e == 3 ? 5 : 3;
/* 16 */            DrawerLayout drawerLayout = this.f1335h;
/* 18 */            View viewM612d = drawerLayout.m612d(i2);
/* 22 */            if (viewM612d != null) {
/* 24 */                drawerLayout.m610b(viewM612d);
                    }
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: v0 */
                public final void mo628v0(int i) {
                    int i2;
                    int size;
                    int size2;
                    View rootView;
                    int size3;
/* 3 */             View view = this.f1333f.f12059t;
/* 5 */             DrawerLayout drawerLayout = this.f1335h;
/* 9 */             int i3 = drawerLayout.f1309f.f12040a;
/* 13 */            int i4 = drawerLayout.f1313i.f12040a;
/* 17 */            if (i3 == 1 || i4 == 1) {
/* 30 */                i2 = 1;
                    } else {
/* 22 */                i2 = 2;
/* 23 */                if (i3 != 2 && i4 != 2) {
/* 28 */                    i2 = 0;
                        }
                    }
/* 31 */            if (view != null && i == 0) {
/* 41 */                float f = ((DrawerLayout.LayoutParams) view.getLayoutParams()).f1324b;
/* 48 */                if (f == 0.0f) {
/* 54 */                    DrawerLayout.LayoutParams layoutParams = (DrawerLayout.LayoutParams) view.getLayoutParams();
/* 59 */                    if ((layoutParams.f1326d & 1) == 1) {
/* 61 */                        layoutParams.f1326d = 0;
/* 63 */                        ArrayList arrayList = drawerLayout.f1310f0;
/* 65 */                        if (arrayList != null && (size3 = arrayList.size() - 1) >= 0) {
/* 81 */                            throw pm2.m7486i(size3, drawerLayout.f1310f0);
                                }
/* 82 */                        drawerLayout.m620o(view, false);
/* 85 */                        drawerLayout.m619n(view);
/* 92 */                        if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
/* 100 */                           rootView.sendAccessibilityEvent(32);
                                }
                            }
                        } else if (f == 1.0f) {
/* 114 */                   DrawerLayout.LayoutParams layoutParams2 = (DrawerLayout.LayoutParams) view.getLayoutParams();
/* 119 */                   if ((layoutParams2.f1326d & 1) == 0) {
/* 121 */                       layoutParams2.f1326d = 1;
/* 123 */                       ArrayList arrayList2 = drawerLayout.f1310f0;
/* 125 */                       if (arrayList2 != null && (size2 = arrayList2.size() - 1) >= 0) {
/* 141 */                           throw pm2.m7486i(size2, drawerLayout.f1310f0);
                                }
/* 142 */                       drawerLayout.m620o(view, true);
/* 145 */                       drawerLayout.m619n(view);
/* 152 */                       if (drawerLayout.hasWindowFocus()) {
/* 154 */                           drawerLayout.sendAccessibilityEvent(32);
                                }
                            }
                        }
                    }
/* 159 */           if (i2 != drawerLayout.f1296U) {
/* 161 */               drawerLayout.f1296U = i2;
/* 163 */               ArrayList arrayList3 = drawerLayout.f1310f0;
/* 165 */               if (arrayList3 != null && (size = arrayList3.size() - 1) >= 0) {
/* 181 */                   throw pm2.m7486i(size, drawerLayout.f1310f0);
                        }
                    }
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: w0 */
                public final void mo629w0(View view, int i, int i2) {
/* 1 */             int width = view.getWidth();
/* 6 */             DrawerLayout drawerLayout = this.f1335h;
/* 17 */            float width2 = (drawerLayout.m609a(3, view) ? i + width : drawerLayout.getWidth() - i) / width;
/* 26 */            drawerLayout.m618m(view, width2);
/* 37 */            view.setVisibility(width2 == 0.0f ? 4 : 0);
/* 40 */            drawerLayout.invalidate();
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: x0 */
                public final void mo630x0(View view, float f, float f2) {
                    int i;
/* 1 */             int[] iArr = DrawerLayout.f1293p0;
/* 9 */             float f3 = ((DrawerLayout.LayoutParams) view.getLayoutParams()).f1324b;
/* 11 */            int width = view.getWidth();
/* 16 */            DrawerLayout drawerLayout = this.f1335h;
/* 25 */            if (drawerLayout.m609a(3, view)) {
/* 40 */                i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
                    } else {
/* 42 */                int width2 = drawerLayout.getWidth();
/* 48 */                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
/* 61 */                    width2 -= width;
                        }
/* 59 */                i = width2;
                    }
/* 69 */            this.f1333f.m5687s(i, view.getTop());
/* 72 */            drawerLayout.invalidate();
                }
            }
