            package com.google.android.material.appbar;

            import android.content.Context;
            import android.graphics.Rect;
            import android.util.AttributeSet;
            import android.view.Gravity;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.coordinatorlayout.widget.C0080c;
            import androidx.coordinatorlayout.widget.CoordinatorLayout;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            import p000.e33;
            import p000.m83;
            import p000.qj3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 20 */    abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

                /* JADX INFO: renamed from: c */
                public final Rect f4391c;

                /* JADX INFO: renamed from: d */
                public final Rect f4392d;

                /* JADX INFO: renamed from: e */
                public int f4393e;

                /* JADX INFO: renamed from: f */
                public int f4394f;

                public HeaderScrollingViewBehavior() {
/* 9 */             this.f4391c = new Rect();
/* 16 */            this.f4392d = new Rect();
/* 19 */            this.f4393e = 0;
                }

                @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
                /* JADX INFO: renamed from: i */
                public boolean mo571i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
                    AppBarLayout appBarLayoutMo2222w;
                    m83 lastWindowInsets;
/* 5 */             int i4 = view.getLayoutParams().height;
/* 8 */             if ((i4 != -1 && i4 != -2) || (appBarLayoutMo2222w = mo2222w(coordinatorLayout.m552i(view))) == null) {
/* 84 */                return false;
                    }
/* 23 */            int size = View.MeasureSpec.getSize(i3);
/* 27 */            if (size > 0) {
/* 29 */                WeakHashMap weakHashMap = e33.f7494a;
/* 35 */                if (appBarLayoutMo2222w.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
/* 52 */                    size += lastWindowInsets.m6621a() + lastWindowInsets.m6624d();
                        }
                    } else {
/* 54 */                size = coordinatorLayout.getHeight();
                    }
/* 79 */            coordinatorLayout.m558q(i, i2, View.MeasureSpec.makeMeasureSpec((size + mo2224y(appBarLayoutMo2222w)) - appBarLayoutMo2222w.getMeasuredHeight(), i4 == -1 ? 1073741824 : Integer.MIN_VALUE), view);
/* 82 */            return true;
                }

                @Override // com.google.android.material.appbar.ViewOffsetBehavior
                /* JADX INFO: renamed from: u */
                public final void mo2232u(CoordinatorLayout coordinatorLayout, View view, int i) {
/* 9 */             AppBarLayout appBarLayoutMo2222w = mo2222w(coordinatorLayout.m552i(view));
/* 13 */            int iM7892c = 0;
/* 14 */            if (appBarLayoutMo2222w == null) {
/* 176 */               coordinatorLayout.m557p(i, view);
/* 179 */               this.f4393e = 0;
/* 181 */               return;
                    }
/* 20 */            C0080c c0080c = (C0080c) view.getLayoutParams();
/* 28 */            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0080c).leftMargin;
/* 35 */            int bottom = appBarLayoutMo2222w.getBottom() + ((ViewGroup.MarginLayoutParams) c0080c).topMargin;
/* 47 */            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0080c).rightMargin;
/* 64 */            int bottom2 = ((appBarLayoutMo2222w.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0080c).bottomMargin;
/* 65 */            Rect rect = this.f4391c;
/* 67 */            rect.set(paddingLeft, bottom, width, bottom2);
/* 70 */            m83 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
/* 74 */            if (lastWindowInsets != null) {
/* 76 */                WeakHashMap weakHashMap = e33.f7494a;
/* 82 */                if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
/* 97 */                    rect.left = lastWindowInsets.m6622b() + rect.left;
/* 106 */                   rect.right -= lastWindowInsets.m6623c();
                        }
                    }
/* 108 */           int i2 = c0080c.f1220c;
/* 110 */           if (i2 == 0) {
/* 112 */               i2 = 8388659;
                    }
/* 116 */           int measuredWidth = view.getMeasuredWidth();
/* 120 */           int measuredHeight = view.getMeasuredHeight();
/* 124 */           Rect rect2 = this.f4392d;
/* 128 */           Gravity.apply(i2, measuredWidth, measuredHeight, rect, rect2, i);
/* 133 */           if (this.f4394f != 0) {
/* 136 */               float fMo2223x = mo2223x(appBarLayoutMo2222w);
/* 140 */               int i3 = this.f4394f;
/* 145 */               iM7892c = qj3.m7892c((int) (fMo2223x * i3), 0, i3);
                    }
/* 159 */           view.layout(rect2.left, rect2.top - iM7892c, rect2.right, rect2.bottom - iM7892c);
/* 169 */           this.f4393e = rect2.top - appBarLayoutMo2222w.getBottom();
                }

                /* JADX INFO: renamed from: w */
                public abstract AppBarLayout mo2222w(ArrayList arrayList);

                /* JADX INFO: renamed from: x */
                public float mo2223x(View view) {
/* 1 */             return 1.0f;
                }

                /* JADX INFO: renamed from: y */
                public int mo2224y(View view) {
/* 1 */             return view.getMeasuredHeight();
                }

/* 21 */        public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
/* 22 */            super(context, attributeSet);
/* 23 */            this.f4391c = new Rect();
/* 24 */            this.f4392d = new Rect();
/* 25 */            this.f4393e = 0;
                }
            }
