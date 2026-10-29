            package p000;

            import android.view.View;
            import androidx.appcompat.view.menu.ActionMenuItemView;
            import androidx.appcompat.widget.ActivityChooserView;
            import androidx.appcompat.widget.C0062b;
            
            /* JADX INFO: renamed from: b2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public final class C0165b2 extends em0 {

                /* JADX INFO: renamed from: U */
                public final /* synthetic */ int f2173U;

                /* JADX INFO: renamed from: V */
                public final /* synthetic */ View f2174V;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0165b2(ActionMenuItemView actionMenuItemView) {
/* 6 */             super(actionMenuItemView);
/* 2 */             this.f2173U = 0;
/* 4 */             this.f2174V = actionMenuItemView;
                }

                @Override // p000.em0
                /* JADX INFO: renamed from: b */
                public final vd2 mo1200b() {
                    C0829d2 c0829d2;
/* 1 */             int i = this.f2173U;
/* 4 */             View view = this.f2174V;
                    switch (i) {
                        case 0:
/* 32 */                    AbstractC0201c2 abstractC0201c2 = ((ActionMenuItemView) view).f369a0;
/* 34 */                    if (abstractC0201c2 == null || (c0829d2 = ((C0865e2) abstractC0201c2).f7482a.f749f0) == null) {
/* 3 */                         return null;
                            }
/* 44 */                    return c0829d2.m10350a();
                        case 1:
/* 20 */                    C0829d2 c0829d3 = ((C0902f2) view).f7972a.f748e0;
/* 22 */                    if (c0829d3 == null) {
/* 3 */                         return null;
                            }
/* 25 */                    return c0829d3.m10350a();
                        default:
/* 11 */                    return ((ActivityChooserView) view).getListPopupWindow();
                    }
                }

                @Override // p000.em0
                /* JADX INFO: renamed from: c */
                public final boolean mo1201c() {
                    vd2 vd2VarMo1200b;
/* 1 */             int i = this.f2173U;
/* 5 */             View view = this.f2174V;
                    switch (i) {
                        case 0:
/* 44 */                    ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
/* 46 */                    ig1 ig1Var = actionMenuItemView.f367V;
                            return ig1Var != null && ig1Var.mo330a(actionMenuItemView.f375v) && (vd2VarMo1200b = mo1200b()) != null && vd2VarMo1200b.mo365a();
                        case 1:
/* 40 */                    ((C0902f2) view).f7972a.m428n();
/* 4 */                     return true;
                        default:
/* 10 */                    ActivityChooserView activityChooserView = (ActivityChooserView) view;
/* 16 */                    if (activityChooserView.m354b() || !activityChooserView.f476V) {
/* 4 */                         return true;
                            }
/* 25 */                    activityChooserView.f477a.getClass();
/* 30 */                    f42.m3656l("No data model. Did you call #setDataModel?");
/* 3 */                     return false;
                    }
                }

                @Override // p000.em0
                /* JADX INFO: renamed from: d */
                public boolean mo1202d() {
/* 1 */             int i = this.f2173U;
/* 4 */             View view = this.f2174V;
                    switch (i) {
                        case 1:
/* 22 */                    C0062b c0062b = ((C0902f2) view).f7972a;
/* 26 */                    if (c0062b.f750g0 != null) {
/* 28 */                        return false;
                            }
/* 30 */                    c0062b.m424j();
/* 3 */                     return true;
                        case 2:
/* 16 */                    ((ActivityChooserView) view).m353a();
/* 3 */                     return true;
                        default:
/* 9 */                     return super.mo1202d();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 9 */         public /* synthetic */ C0165b2(View view, View view2, int i) {
                    super(view2);
/* 10 */            this.f2173U = i;
                    this.f2174V = view;
                }
            }
