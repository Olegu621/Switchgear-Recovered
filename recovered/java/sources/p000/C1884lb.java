            package p000;

            import android.content.Context;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.util.AttributeSet;
            import android.view.ViewTreeObserver;
            import android.widget.ListAdapter;
            import android.widget.PopupWindow;
            import androidx.appcompat.widget.AppCompatSpinner;
            import androidx.appcompat.widget.ListPopupWindow;
            
            /* JADX INFO: renamed from: lb */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1884lb extends ListPopupWindow implements InterfaceC1921mb {

                /* JADX INFO: renamed from: m0 */
                public CharSequence f13164m0;

                /* JADX INFO: renamed from: n0 */
                public C1022ib f13165n0;

                /* JADX INFO: renamed from: o0 */
                public final Rect f13166o0;

                /* JADX INFO: renamed from: p0 */
                public int f13167p0;

                /* JADX INFO: renamed from: q0 */
                public final /* synthetic */ AppCompatSpinner f13168q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1884lb(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
/* 3 */             super(context, attributeSet, i);
/* 1 */             this.f13168q0 = appCompatSpinner;
/* 11 */            this.f13166o0 = new Rect();
/* 13 */            this.f574Z = appCompatSpinner;
/* 16 */            this.f590i0 = true;
/* 20 */            this.f591j0.setFocusable(true);
/* 29 */            this.f576a0 = new C1787jb(this, 0);
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: e */
                public final CharSequence mo4141e() {
/* 1 */             return this.f13164m0;
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: g */
                public final void mo4143g(CharSequence charSequence) {
/* 1 */             this.f13164m0 = charSequence;
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: l */
                public final void mo4146l(int i) {
/* 1 */             this.f13167p0 = i;
                }

                @Override // p000.InterfaceC1921mb
                /* JADX INFO: renamed from: m */
                public final void mo4147m(int i, int i2) {
                    ViewTreeObserver viewTreeObserver;
/* 1 */             PopupWindow popupWindow = this.f591j0;
/* 3 */             boolean zIsShowing = popupWindow.isShowing();
/* 7 */             m6413r();
/* 10 */            int i3 = 2;
/* 11 */            popupWindow.setInputMethodMode(2);
/* 14 */            show();
/* 17 */            ra0 ra0Var = this.f579c;
/* 20 */            ra0Var.setChoiceMode(1);
/* 23 */            ra0Var.setTextDirection(i);
/* 26 */            ra0Var.setTextAlignment(i2);
/* 29 */            AppCompatSpinner appCompatSpinner = this.f13168q0;
/* 31 */            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
/* 35 */            ra0 ra0Var2 = this.f579c;
/* 41 */            if (popupWindow.isShowing() && ra0Var2 != null) {
/* 46 */                ra0Var2.setListSelectionHidden(false);
/* 49 */                ra0Var2.setSelection(selectedItemPosition);
/* 56 */                if (ra0Var2.getChoiceMode() != 0) {
/* 58 */                    ra0Var2.setItemChecked(selectedItemPosition, true);
                        }
                    }
/* 61 */            if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
/* 86 */                return;
                    }
/* 72 */            ViewTreeObserverOnGlobalLayoutListenerC1986o2 viewTreeObserverOnGlobalLayoutListenerC1986o2 = new ViewTreeObserverOnGlobalLayoutListenerC1986o2(this, i3);
/* 75 */            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1986o2);
/* 83 */            popupWindow.setOnDismissListener(new C1825kb(this, viewTreeObserverOnGlobalLayoutListenerC1986o2));
                }

                @Override // androidx.appcompat.widget.ListPopupWindow, p000.InterfaceC1921mb
                /* JADX INFO: renamed from: o */
                public final void mo373o(ListAdapter listAdapter) {
/* 1 */             super.mo373o(listAdapter);
/* 6 */             this.f13165n0 = (C1022ib) listAdapter;
                }

                /* JADX INFO: renamed from: r */
                public final void m6413r() {
                    int i;
/* 1 */             PopupWindow popupWindow = this.f591j0;
/* 3 */             Drawable background = popupWindow.getBackground();
/* 7 */             AppCompatSpinner appCompatSpinner = this.f13168q0;
/* 9 */             Rect rect = appCompatSpinner.f529v;
/* 12 */            if (background != null) {
/* 14 */                background.getPadding(rect);
/* 17 */                boolean z = m53.f13568a;
/* 30 */                i = appCompatSpinner.getLayoutDirection() == 1 ? rect.right : -rect.left;
                    } else {
/* 32 */                i = 0;
/* 33 */                rect.right = 0;
/* 35 */                rect.left = 0;
                    }
/* 37 */            int paddingLeft = appCompatSpinner.getPaddingLeft();
/* 41 */            int paddingRight = appCompatSpinner.getPaddingRight();
/* 45 */            int width = appCompatSpinner.getWidth();
/* 49 */            int i2 = appCompatSpinner.f528i;
/* 52 */            if (i2 == -2) {
/* 60 */                int iM358a = appCompatSpinner.m358a(this.f13165n0, popupWindow.getBackground());
/* 83 */                int i3 = (appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
/* 84 */                if (iM358a > i3) {
/* 86 */                    iM358a = i3;
                        }
/* 94 */                m375q(Math.max(iM358a, (width - paddingLeft) - paddingRight));
                    } else if (i2 == -1) {
/* 104 */               m375q((width - paddingLeft) - paddingRight);
                    } else {
/* 108 */               m375q(i2);
                    }
/* 111 */           boolean z2 = m53.f13568a;
/* 133 */           this.f585f = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f583e) - this.f13167p0) + i : paddingLeft + this.f13167p0 + i;
                }
            }
