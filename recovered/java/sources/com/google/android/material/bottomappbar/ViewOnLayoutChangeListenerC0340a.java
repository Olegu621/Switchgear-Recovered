            package com.google.android.material.bottomappbar;

            import android.graphics.Rect;
            import android.graphics.RectF;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.coordinatorlayout.widget.C0080c;
            import com.google.android.material.R$dimen;
            import com.google.android.material.floatingactionbutton.FloatingActionButton;
            import p000.kb1;
            
            /* JADX INFO: renamed from: com.google.android.material.bottomappbar.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewOnLayoutChangeListenerC0340a implements View.OnLayoutChangeListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ BottomAppBar.Behavior f4475a;

                public ViewOnLayoutChangeListenerC0340a(BottomAppBar.Behavior behavior) {
/* 4 */             this.f4475a = behavior;
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
/* 1 */             BottomAppBar.Behavior behavior = this.f4475a;
/* 3 */             Rect rect = behavior.f4469e;
/* 11 */            BottomAppBar bottomAppBar = (BottomAppBar) behavior.f4470f.get();
/* 13 */            if (bottomAppBar != null) {
/* 15 */                int i9 = bottomAppBar.f4451J0;
/* 19 */                if (view instanceof FloatingActionButton) {
/* 23 */                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
/* 34 */                    rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
/* 37 */                    floatingActionButton.m2336j(rect);
/* 40 */                    int iHeight = rect.height();
/* 44 */                    bottomAppBar.m2249H(iHeight);
/* 62 */                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f17036e.mo47a(new RectF(rect)));
/* 69 */                    C0080c c0080c = (C0080c) view.getLayoutParams();
/* 73 */                    if (behavior.f4471g == 0) {
/* 98 */                        ((ViewGroup.MarginLayoutParams) c0080c).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R$dimen.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - iHeight) / 2));
/* 104 */                       ((ViewGroup.MarginLayoutParams) c0080c).leftMargin = bottomAppBar.getLeftInset();
/* 110 */                       ((ViewGroup.MarginLayoutParams) c0080c).rightMargin = bottomAppBar.getRightInset();
/* 116 */                       if (kb1.m6036J(floatingActionButton)) {
/* 121 */                           ((ViewGroup.MarginLayoutParams) c0080c).leftMargin += i9;
/* 123 */                           return;
                                } else {
/* 127 */                           ((ViewGroup.MarginLayoutParams) c0080c).rightMargin += i9;
/* 129 */                           return;
                                }
                            }
/* 129 */                   return;
                        }
                    }
/* 130 */           view.removeOnLayoutChangeListener(this);
                }
            }
