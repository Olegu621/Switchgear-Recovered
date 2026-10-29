            package p000;

            import android.content.Context;
            import android.graphics.drawable.ColorDrawable;
            import android.view.KeyCharacterMap;
            import android.view.KeyEvent;
            import android.view.Menu;
            import android.view.Window;
            import androidx.appcompat.widget.ActionMenuView;
            import androidx.appcompat.widget.C0062b;
            import androidx.appcompat.widget.C0071k;
            import androidx.appcompat.widget.C0073m;
            import androidx.appcompat.widget.Toolbar;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xp2 extends AbstractC2165s1 {

                /* JADX INFO: renamed from: a */
                public final C0073m f19302a;

                /* JADX INFO: renamed from: b */
                public final Window.Callback f19303b;

                /* JADX INFO: renamed from: c */
                public final er0 f19304c;

                /* JADX INFO: renamed from: d */
                public boolean f19305d;

                /* JADX INFO: renamed from: e */
                public boolean f19306e;

                /* JADX INFO: renamed from: f */
                public boolean f19307f;

                /* JADX INFO: renamed from: g */
                public final ArrayList f19308g = new ArrayList();

                /* JADX INFO: renamed from: h */
                public final RunnableC2495ye f19309h = new RunnableC2495ye(this, 25);

                public xp2(Toolbar toolbar, CharSequence charSequence, WindowCallbackC2100qa windowCallbackC2100qa) {
/* 24 */            fs0 fs0Var = new fs0(this, 17);
/* 30 */            C0073m c0073m = new C0073m(toolbar, false);
/* 33 */            this.f19302a = c0073m;
/* 35 */            windowCallbackC2100qa.getClass();
/* 38 */            this.f19303b = windowCallbackC2100qa;
/* 40 */            c0073m.f772k = windowCallbackC2100qa;
/* 42 */            toolbar.setOnMenuItemClickListener(fs0Var);
/* 47 */            if (!c0073m.f768g) {
/* 49 */                c0073m.f769h = charSequence;
/* 55 */                if ((c0073m.f763b & 8) != 0) {
/* 57 */                    toolbar.setTitle(charSequence);
/* 62 */                    if (c0073m.f768g) {
/* 68 */                        e33.m3319o(toolbar.getRootView(), charSequence);
                            }
                        }
                    }
/* 78 */            this.f19304c = new er0(this, 20);
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: a */
                public final boolean mo8341a() {
                    C0062b c0062b;
/* 5 */             ActionMenuView actionMenuView = this.f19302a.f762a.f696a;
                    return (actionMenuView == null || (c0062b = actionMenuView.f461h0) == null || !c0062b.m424j()) ? false : true;
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: b */
                public final boolean mo8342b() {
                    sg1 sg1Var;
/* 5 */             C0071k c0071k = this.f19302a.f762a.f685A0;
/* 7 */             if (c0071k == null || (sg1Var = c0071k.f760b) == null) {
/* 23 */                return false;
                    }
/* 13 */            if (c0071k == null) {
/* 15 */                sg1Var = null;
                    }
/* 16 */            if (sg1Var == null) {
/* 21 */                return true;
                    }
/* 18 */            sg1Var.collapseActionView();
/* 21 */            return true;
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: c */
                public final void mo8343c(boolean z) {
/* 3 */             if (z == this.f19307f) {
/* 16 */                return;
                    }
/* 6 */             this.f19307f = z;
/* 8 */             ArrayList arrayList = this.f19308g;
/* 14 */            if (arrayList.size() > 0) {
/* 22 */                throw pm2.m7486i(0, arrayList);
                    }
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: d */
                public final int mo8344d() {
/* 3 */             return this.f19302a.f763b;
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: e */
                public final Context mo8345e() {
/* 5 */             return this.f19302a.f762a.getContext();
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: f */
                public final void mo8346f() {
/* 7 */             this.f19302a.f762a.setVisibility(8);
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: g */
                public final boolean mo8347g() {
/* 1 */             C0073m c0073m = this.f19302a;
/* 3 */             Toolbar toolbar = c0073m.f762a;
/* 5 */             RunnableC2495ye runnableC2495ye = this.f19309h;
/* 7 */             toolbar.removeCallbacks(runnableC2495ye);
/* 10 */            Toolbar toolbar2 = c0073m.f762a;
/* 12 */            WeakHashMap weakHashMap = e33.f7494a;
/* 14 */            toolbar2.postOnAnimation(runnableC2495ye);
/* 17 */            return true;
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: h */
                public final boolean mo8348h() {
                    return this.f19302a.f762a.getVisibility() == 0;
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: i */
                public final void mo8349i() {
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: j */
                public final void mo8350j() {
/* 7 */             this.f19302a.f762a.removeCallbacks(this.f19309h);
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: k */
                public final boolean mo8351k(int i, KeyEvent keyEvent) {
/* 1 */             Menu menuM10013v = m10013v();
/* 6 */             if (menuM10013v == null) {
/* 5 */                 return false;
                    }
/* 25 */            menuM10013v.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
/* 28 */            return menuM10013v.performShortcut(i, keyEvent, 0);
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: l */
                public final boolean mo8352l(KeyEvent keyEvent) {
/* 6 */             if (keyEvent.getAction() == 1) {
/* 8 */                 mo8353m();
                    }
/* 5 */             return true;
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: m */
                public final boolean mo8353m() {
/* 5 */             return this.f19302a.f762a.m415u();
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: n */
                public final void mo8354n(ColorDrawable colorDrawable) {
/* 5 */             this.f19302a.f762a.setBackground(colorDrawable);
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: o */
                public final void mo8355o(boolean z) {
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: p */
                public final void mo8356p(boolean z) {
/* 7 */             int i = z ? 8 : 0;
/* 8 */             C0073m c0073m = this.f19302a;
/* 16 */            c0073m.m435a((i & 8) | (c0073m.f763b & (-9)));
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: q */
                public final void mo8357q(boolean z) {
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: r */
                public final void mo8358r(CharSequence charSequence) {
/* 2 */             C0073m c0073m = this.f19302a;
/* 4 */             c0073m.f768g = true;
/* 6 */             Toolbar toolbar = c0073m.f762a;
/* 8 */             c0073m.f769h = charSequence;
/* 14 */            if ((c0073m.f763b & 8) != 0) {
/* 16 */                toolbar.setTitle(charSequence);
/* 21 */                if (c0073m.f768g) {
/* 27 */                    e33.m3319o(toolbar.getRootView(), charSequence);
                        }
                    }
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: s */
                public final void mo8359s(CharSequence charSequence) {
/* 1 */             C0073m c0073m = this.f19302a;
/* 5 */             if (c0073m.f768g) {
/* 31 */                return;
                    }
/* 7 */             Toolbar toolbar = c0073m.f762a;
/* 9 */             c0073m.f769h = charSequence;
/* 15 */            if ((c0073m.f763b & 8) != 0) {
/* 17 */                toolbar.setTitle(charSequence);
/* 22 */                if (c0073m.f768g) {
/* 28 */                    e33.m3319o(toolbar.getRootView(), charSequence);
                        }
                    }
                }

                @Override // p000.AbstractC2165s1
                /* JADX INFO: renamed from: t */
                public final void mo8360t() {
/* 6 */             this.f19302a.f762a.setVisibility(0);
                }

                /* JADX INFO: renamed from: v */
                public final Menu m10013v() {
/* 1 */             boolean z = this.f19306e;
/* 3 */             C0073m c0073m = this.f19302a;
/* 5 */             if (!z) {
/* 11 */                zr3 zr3Var = new zr3(this, 10);
/* 16 */                ts0 ts0Var = new ts0(this);
/* 19 */                Toolbar toolbar = c0073m.f762a;
/* 21 */                toolbar.f686B0 = zr3Var;
/* 23 */                toolbar.f687C0 = ts0Var;
/* 25 */                ActionMenuView actionMenuView = toolbar.f696a;
/* 27 */                if (actionMenuView != null) {
/* 29 */                    actionMenuView.f462i0 = zr3Var;
/* 31 */                    actionMenuView.f463j0 = ts0Var;
                        }
/* 34 */                this.f19306e = true;
                    }
/* 38 */            return c0073m.f762a.getMenu();
                }
            }
