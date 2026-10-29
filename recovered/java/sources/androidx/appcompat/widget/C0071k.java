            package androidx.appcompat.widget;

            import android.content.Context;
            import android.os.Parcelable;
            import android.view.KeyEvent;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import java.util.ArrayList;
            import p000.InterfaceC1942mw;
            import p000.eh1;
            import p000.hi2;
            import p000.jg1;
            import p000.sg1;
            
            /* JADX INFO: renamed from: androidx.appcompat.widget.k */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0071k implements eh1 {

                /* JADX INFO: renamed from: a */
                public jg1 f759a;

                /* JADX INFO: renamed from: b */
                public sg1 f760b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Toolbar f761c;

                public C0071k(Toolbar toolbar) {
/* 4 */             this.f761c = toolbar;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: b */
                public final void mo419b(boolean z) {
/* 3 */             if (this.f760b != null) {
/* 5 */                 jg1 jg1Var = this.f759a;
/* 7 */                 if (jg1Var != null) {
/* 11 */                    int size = jg1Var.f12261f.size();
/* 16 */                    for (int i = 0; i < size; i++) {
/* 26 */                        if (this.f759a.getItem(i) == this.f760b) {
/* 37 */                            return;
                                }
                            }
                        }
/* 34 */                mo433f(this.f760b);
                    }
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: c */
                public final boolean mo420c(hi2 hi2Var) {
/* 1 */             return false;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: d */
                public final void mo421d(jg1 jg1Var, boolean z) {
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: e */
                public final boolean mo422e() {
/* 1 */             return false;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: f */
                public final boolean mo433f(sg1 sg1Var) {
/* 1 */             Toolbar toolbar = this.f761c;
/* 3 */             KeyEvent.Callback callback = toolbar.f726w;
/* 7 */             if (callback instanceof InterfaceC1942mw) {
/* 11 */                ((InterfaceC1942mw) callback).onActionViewCollapsed();
                    }
/* 16 */            toolbar.removeView(toolbar.f726w);
/* 21 */            toolbar.removeView(toolbar.f724v);
/* 25 */            toolbar.f726w = null;
/* 27 */            ArrayList arrayList = toolbar.f721s0;
/* 35 */            for (int size = arrayList.size() - 1; size >= 0; size--) {
/* 43 */                toolbar.addView((View) arrayList.get(size));
                    }
/* 49 */            arrayList.clear();
/* 52 */            this.f760b = null;
/* 54 */            toolbar.requestLayout();
/* 58 */            sg1Var.f16582C = false;
/* 62 */            sg1Var.f16596n.mo5808p(false);
/* 65 */            toolbar.m416v();
/* 33 */            return true;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: g */
                public final void mo423g(Parcelable parcelable) {
                }

                @Override // p000.eh1
                public final int getId() {
/* 1 */             return 0;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: i */
                public final boolean mo434i(sg1 sg1Var) {
/* 1 */             Toolbar toolbar = this.f761c;
/* 3 */             toolbar.m401c();
/* 8 */             ViewParent parent = toolbar.f724v.getParent();
/* 12 */            if (parent != toolbar) {
/* 16 */                if (parent instanceof ViewGroup) {
/* 22 */                    ((ViewGroup) parent).removeView(toolbar.f724v);
                        }
/* 27 */                toolbar.addView(toolbar.f724v);
                    }
/* 30 */            View actionView = sg1Var.getActionView();
/* 34 */            toolbar.f726w = actionView;
/* 36 */            this.f760b = sg1Var;
/* 38 */            ViewParent parent2 = actionView.getParent();
/* 43 */            if (parent2 != toolbar) {
/* 47 */                if (parent2 instanceof ViewGroup) {
/* 53 */                    ((ViewGroup) parent2).removeView(toolbar.f726w);
                        }
/* 56 */                Toolbar.LayoutParams layoutParamsM395h = Toolbar.m395h();
/* 68 */                layoutParamsM395h.f359a = (toolbar.f699b0 & 112) | 8388611;
/* 70 */                layoutParamsM395h.f731b = 2;
/* 74 */                toolbar.f726w.setLayoutParams(layoutParamsM395h);
/* 79 */                toolbar.addView(toolbar.f726w);
                    }
/* 88 */            for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
/* 90 */                View childAt = toolbar.getChildAt(childCount);
/* 102 */               if (((Toolbar.LayoutParams) childAt.getLayoutParams()).f731b != 2 && childAt != toolbar.f696a) {
/* 108 */                   toolbar.removeViewAt(childCount);
/* 113 */                   toolbar.f721s0.add(childAt);
                        }
                    }
/* 119 */           toolbar.requestLayout();
/* 122 */           sg1Var.f16582C = true;
/* 127 */           sg1Var.f16596n.mo5808p(false);
/* 130 */           KeyEvent.Callback callback = toolbar.f726w;
/* 134 */           if (callback instanceof InterfaceC1942mw) {
/* 138 */               ((InterfaceC1942mw) callback).onActionViewExpanded();
                    }
/* 141 */           toolbar.m416v();
/* 86 */            return true;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: k */
                public final void mo425k(Context context, jg1 jg1Var) {
                    sg1 sg1Var;
/* 1 */             jg1 jg1Var2 = this.f759a;
/* 3 */             if (jg1Var2 != null && (sg1Var = this.f760b) != null) {
/* 9 */                 jg1Var2.mo4230d(sg1Var);
                    }
/* 12 */            this.f759a = jg1Var;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: l */
                public final Parcelable mo426l() {
/* 1 */             return null;
                }
            }
