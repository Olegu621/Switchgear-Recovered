            package p000;

            import android.R;
            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.Rect;
            import android.os.Parcelable;
            import android.view.Gravity;
            import android.view.KeyEvent;
            import android.view.LayoutInflater;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewTreeObserver;
            import android.widget.FrameLayout;
            import android.widget.PopupWindow;
            import android.widget.TextView;
            import androidx.appcompat.R$dimen;
            import androidx.appcompat.R$layout;
            import androidx.appcompat.widget.C0064d;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jg2 extends xg1 implements PopupWindow.OnDismissListener, View.OnKeyListener {

                /* JADX INFO: renamed from: f0 */
                public static final int f12281f0 = R$layout.abc_popup_menu_item_layout;

                /* JADX INFO: renamed from: V */
                public PopupWindow.OnDismissListener f12283V;

                /* JADX INFO: renamed from: W */
                public View f12284W;

                /* JADX INFO: renamed from: X */
                public View f12285X;

                /* JADX INFO: renamed from: Y */
                public dh1 f12286Y;

                /* JADX INFO: renamed from: Z */
                public ViewTreeObserver f12287Z;

                /* JADX INFO: renamed from: a0 */
                public boolean f12288a0;

                /* JADX INFO: renamed from: b */
                public final Context f12289b;

                /* JADX INFO: renamed from: b0 */
                public boolean f12290b0;

                /* JADX INFO: renamed from: c */
                public final jg1 f12291c;

                /* JADX INFO: renamed from: c0 */
                public int f12292c0;

                /* JADX INFO: renamed from: d */
                public final gg1 f12293d;

                /* JADX INFO: renamed from: e */
                public final boolean f12295e;

                /* JADX INFO: renamed from: e0 */
                public boolean f12296e0;

                /* JADX INFO: renamed from: f */
                public final int f12297f;

                /* JADX INFO: renamed from: i */
                public final int f12298i;

                /* JADX INFO: renamed from: v */
                public final C0064d f12299v;

                /* JADX INFO: renamed from: w */
                public final ViewTreeObserverOnGlobalLayoutListenerC1986o2 f12300w = new ViewTreeObserverOnGlobalLayoutListenerC1986o2(this, 6);

                /* JADX INFO: renamed from: U */
                public final ViewOnAttachStateChangeListenerC2228tr f12282U = new ViewOnAttachStateChangeListenerC2228tr(this, 3);

                /* JADX INFO: renamed from: d0 */
                public int f12294d0 = 0;

                public jg2(Context context, jg1 jg1Var, View view, int i, boolean z) {
/* 23 */            this.f12289b = context;
/* 25 */            this.f12291c = jg1Var;
/* 27 */            this.f12295e = z;
/* 40 */            this.f12293d = new gg1(jg1Var, LayoutInflater.from(context), z, f12281f0);
/* 42 */            this.f12298i = i;
/* 44 */            Resources resources = context.getResources();
/* 66 */            this.f12297f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
/* 68 */            this.f12284W = view;
/* 76 */            this.f12299v = new C0064d(context, null, i, 0);
/* 78 */            jg1Var.m5802b(this, context);
                }

                @Override // p000.vd2
                /* JADX INFO: renamed from: a */
                public final boolean mo365a() {
                    return !this.f12288a0 && this.f12299v.f591j0.isShowing();
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: b */
                public final void mo419b(boolean z) {
/* 2 */             this.f12290b0 = false;
/* 4 */             gg1 gg1Var = this.f12293d;
/* 6 */             if (gg1Var != null) {
/* 8 */                 gg1Var.notifyDataSetChanged();
                    }
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: c */
                public final boolean mo420c(hi2 hi2Var) {
                    boolean z;
/* 6 */             if (hi2Var.hasVisibleItems()) {
/* 20 */                zg1 zg1Var = new zg1(this.f12289b, hi2Var, this.f12285X, this.f12295e, this.f12298i, 0);
/* 23 */                dh1 dh1Var = this.f12286Y;
/* 25 */                zg1Var.f20143h = dh1Var;
/* 27 */                xg1 xg1Var = zg1Var.f20144i;
/* 29 */                if (xg1Var != null) {
/* 31 */                    xg1Var.mo3431h(dh1Var);
                        }
/* 36 */                int size = hi2Var.f12261f.size();
/* 40 */                int i = 0;
                        while (true) {
/* 42 */                    if (i >= size) {
/* 65 */                        z = false;
                                break;
                            }
/* 44 */                    MenuItem item = hi2Var.getItem(i);
/* 52 */                    if (item.isVisible() && item.getIcon() != null) {
/* 60 */                        z = true;
                                break;
                            }
/* 62 */                    i++;
                        }
/* 66 */                zg1Var.f20142g = z;
/* 68 */                xg1 xg1Var2 = zg1Var.f20144i;
/* 70 */                if (xg1Var2 != null) {
/* 72 */                    xg1Var2.mo5820p(z);
                        }
/* 77 */                zg1Var.f20145j = this.f12283V;
/* 80 */                this.f12283V = null;
/* 84 */                this.f12291c.m5803c(false);
/* 87 */                C0064d c0064d = this.f12299v;
/* 89 */                int width = c0064d.f585f;
/* 91 */                int iM372n = c0064d.m372n();
/* 110 */               if ((Gravity.getAbsoluteGravity(this.f12294d0, this.f12284W.getLayoutDirection()) & 7) == 5) {
/* 118 */                   width += this.f12284W.getWidth();
                        }
/* 123 */               if (!zg1Var.m10351b()) {
/* 128 */                   if (zg1Var.f20140e != null) {
/* 131 */                       zg1Var.m10352d(width, iM372n, true, true);
                            }
                        }
/* 134 */               dh1 dh1Var2 = this.f12286Y;
/* 136 */               if (dh1Var2 != null) {
/* 138 */                   dh1Var2.mo2942z(hi2Var);
                        }
/* 41 */                return true;
                    }
/* 5 */             return false;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: d */
                public final void mo421d(jg1 jg1Var, boolean z) {
/* 3 */             if (jg1Var != this.f12291c) {
/* 16 */                return;
                    }
/* 6 */             dismiss();
/* 9 */             dh1 dh1Var = this.f12286Y;
/* 11 */            if (dh1Var != null) {
/* 13 */                dh1Var.mo2938d(jg1Var, z);
                    }
                }

                @Override // p000.vd2
                public final void dismiss() {
/* 5 */             if (mo365a()) {
/* 9 */                 this.f12299v.dismiss();
                    }
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: e */
                public final boolean mo422e() {
/* 1 */             return false;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: g */
                public final void mo423g(Parcelable parcelable) {
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: h */
                public final void mo3431h(dh1 dh1Var) {
/* 1 */             this.f12286Y = dh1Var;
                }

                @Override // p000.vd2
                /* JADX INFO: renamed from: j */
                public final ra0 mo370j() {
/* 3 */             return this.f12299v.f579c;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: l */
                public final Parcelable mo426l() {
/* 1 */             return null;
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: m */
                public final void mo5818m(jg1 jg1Var) {
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: o */
                public final void mo5819o(View view) {
/* 1 */             this.f12284W = view;
                }

                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
/* 2 */             this.f12288a0 = true;
/* 6 */             this.f12291c.m5803c(true);
/* 9 */             ViewTreeObserver viewTreeObserver = this.f12287Z;
/* 11 */            if (viewTreeObserver != null) {
/* 17 */                if (!viewTreeObserver.isAlive()) {
/* 25 */                    this.f12287Z = this.f12285X.getViewTreeObserver();
                        }
/* 31 */                this.f12287Z.removeGlobalOnLayoutListener(this.f12300w);
/* 35 */                this.f12287Z = null;
                    }
/* 41 */            this.f12285X.removeOnAttachStateChangeListener(this.f12282U);
/* 44 */            PopupWindow.OnDismissListener onDismissListener = this.f12283V;
/* 46 */            if (onDismissListener != null) {
/* 48 */                onDismissListener.onDismiss();
                    }
                }

                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
/* 6 */             if (keyEvent.getAction() != 1 || i != 82) {
/* 16 */                return false;
                    }
/* 12 */            dismiss();
/* 5 */             return true;
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: p */
                public final void mo5820p(boolean z) {
/* 3 */             this.f12293d.f8597c = z;
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: q */
                public final void mo5821q(int i) {
/* 1 */             this.f12294d0 = i;
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: r */
                public final void mo5822r(int i) {
/* 3 */             this.f12299v.f585f = i;
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: s */
                public final void mo5823s(PopupWindow.OnDismissListener onDismissListener) {
/* 1 */             this.f12283V = onDismissListener;
                }

                @Override // p000.vd2
                public final void show() {
                    View view;
/* 5 */             if (mo365a()) {
/* 7 */                 return;
                    }
/* 10 */            if (this.f12288a0 || (view = this.f12284W) == null) {
/* 171 */               f42.m3656l("StandardMenuPopup cannot be used without an anchor");
/* 174 */               return;
                    }
/* 16 */            this.f12285X = view;
/* 18 */            C0064d c0064d = this.f12299v;
/* 20 */            PopupWindow popupWindow = c0064d.f591j0;
/* 22 */            PopupWindow popupWindow2 = c0064d.f591j0;
/* 24 */            popupWindow.setOnDismissListener(this);
/* 27 */            c0064d.f576a0 = this;
/* 30 */            c0064d.f590i0 = true;
/* 32 */            popupWindow2.setFocusable(true);
/* 35 */            View view2 = this.f12285X;
/* 44 */            boolean z = this.f12287Z == null;
/* 45 */            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
/* 49 */            this.f12287Z = viewTreeObserver;
/* 51 */            if (z) {
/* 55 */                viewTreeObserver.addOnGlobalLayoutListener(this.f12300w);
                    }
/* 60 */            view2.addOnAttachStateChangeListener(this.f12282U);
/* 63 */            c0064d.f574Z = view2;
/* 67 */            c0064d.f571W = this.f12294d0;
/* 69 */            boolean z2 = this.f12290b0;
/* 71 */            Context context = this.f12289b;
/* 73 */            gg1 gg1Var = this.f12293d;
/* 75 */            if (!z2) {
/* 83 */                this.f12292c0 = xg1.m9791n(gg1Var, context, this.f12297f);
/* 85 */                this.f12290b0 = true;
                    }
/* 89 */            c0064d.m375q(this.f12292c0);
/* 93 */            popupWindow2.setInputMethodMode(2);
/* 96 */            Rect rect = this.f19082a;
/* 108 */           c0064d.f588h0 = rect != null ? new Rect(rect) : null;
/* 110 */           c0064d.show();
/* 113 */           ra0 ra0Var = c0064d.f579c;
/* 115 */           ra0Var.setOnKeyListener(this);
/* 120 */           if (this.f12296e0) {
/* 122 */               jg1 jg1Var = this.f12291c;
/* 126 */               if (jg1Var.f12268m != null) {
/* 138 */                   FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R$layout.abc_popup_menu_header_item_layout, (ViewGroup) ra0Var, false);
/* 147 */                   TextView textView = (TextView) frameLayout.findViewById(R.id.title);
/* 149 */                   if (textView != null) {
/* 153 */                       textView.setText(jg1Var.f12268m);
                            }
/* 156 */                   frameLayout.setEnabled(false);
/* 159 */                   ra0Var.addHeaderView(frameLayout, null, false);
                        }
                    }
/* 162 */           c0064d.mo373o(gg1Var);
/* 165 */           c0064d.show();
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: t */
                public final void mo5824t(boolean z) {
/* 1 */             this.f12296e0 = z;
                }

                @Override // p000.xg1
                /* JADX INFO: renamed from: u */
                public final void mo5825u(int i) {
/* 3 */             this.f12299v.m371k(i);
                }
            }
