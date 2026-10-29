            package p000;

            import android.content.Context;
            import android.graphics.drawable.Drawable;
            import android.view.MenuItem;
            import android.view.SubMenu;
            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public class hi2 extends jg1 implements SubMenu {

                /* JADX INFO: renamed from: A */
                public final jg1 f9088A;

                /* JADX INFO: renamed from: B */
                public final sg1 f9089B;

                public hi2(Context context, jg1 jg1Var, sg1 sg1Var) {
/* 1 */             super(context);
/* 4 */             this.f9088A = jg1Var;
/* 6 */             this.f9089B = sg1Var;
                }

                @Override // p000.jg1
                /* JADX INFO: renamed from: d */
                public final boolean mo4230d(sg1 sg1Var) {
/* 3 */             return this.f9088A.mo4230d(sg1Var);
                }

                @Override // p000.jg1
                /* JADX INFO: renamed from: e */
                public final boolean mo4231e(jg1 jg1Var, MenuItem menuItem) {
                    return super.mo4231e(jg1Var, menuItem) || this.f9088A.mo4231e(jg1Var, menuItem);
                }

                @Override // p000.jg1
                /* JADX INFO: renamed from: f */
                public final boolean mo4232f(sg1 sg1Var) {
/* 3 */             return this.f9088A.mo4232f(sg1Var);
                }

                @Override // android.view.SubMenu
                public final MenuItem getItem() {
/* 1 */             return this.f9089B;
                }

                @Override // p000.jg1
                /* JADX INFO: renamed from: j */
                public final String mo4233j() {
/* 1 */             sg1 sg1Var = this.f9089B;
/* 8 */             int i = sg1Var != null ? sg1Var.f16583a : 0;
/* 9 */             if (i == 0) {
/* 11 */                return null;
                    }
/* 15 */            return fm0.m3781g(i, "android:menu:actionviewstates:");
                }

                @Override // p000.jg1
                /* JADX INFO: renamed from: k */
                public final jg1 mo4234k() {
/* 3 */             return this.f9088A.mo4234k();
                }

                @Override // p000.jg1
                /* JADX INFO: renamed from: m */
                public final boolean mo4235m() {
/* 3 */             return this.f9088A.mo4235m();
                }

                @Override // p000.jg1
                /* JADX INFO: renamed from: n */
                public final boolean mo4236n() {
/* 3 */             return this.f9088A.mo4236n();
                }

                @Override // p000.jg1
                /* JADX INFO: renamed from: o */
                public final boolean mo4237o() {
/* 3 */             return this.f9088A.mo4237o();
                }

                @Override // p000.jg1, android.view.Menu
                public final void setGroupDividerEnabled(boolean z) {
/* 3 */             this.f9088A.setGroupDividerEnabled(z);
                }

                @Override // android.view.SubMenu
                public final SubMenu setHeaderIcon(Drawable drawable) {
/* 7 */             m5815w(0, null, 0, drawable, null);
/* 5 */             return this;
                }

                @Override // android.view.SubMenu
                public final SubMenu setHeaderTitle(CharSequence charSequence) {
/* 7 */             m5815w(0, charSequence, 0, null, null);
/* 5 */             return this;
                }

                @Override // android.view.SubMenu
                public final SubMenu setHeaderView(View view) {
/* 7 */             m5815w(0, null, 0, null, view);
/* 5 */             return this;
                }

                @Override // android.view.SubMenu
                public final SubMenu setIcon(Drawable drawable) {
/* 3 */             this.f9089B.setIcon(drawable);
/* 6 */             return this;
                }

                @Override // p000.jg1, android.view.Menu
                public final void setQwertyMode(boolean z) {
/* 3 */             this.f9088A.setQwertyMode(z);
                }

                @Override // android.view.SubMenu
/* 6 */         public final SubMenu setIcon(int i) {
/* 7 */             this.f9089B.setIcon(i);
                    return this;
                }

                @Override // android.view.SubMenu
/* 10 */        public final SubMenu setHeaderIcon(int i) {
/* 11 */            m5815w(0, null, i, null, null);
                    return this;
                }

                @Override // android.view.SubMenu
/* 10 */        public final SubMenu setHeaderTitle(int i) {
/* 11 */            m5815w(i, null, 0, null, null);
                    return this;
                }
            }
