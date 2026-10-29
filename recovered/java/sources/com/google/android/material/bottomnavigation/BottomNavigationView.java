            package com.google.android.material.bottomnavigation;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.View;
            import com.google.android.material.R$attr;
            import com.google.android.material.R$style;
            import com.google.android.material.R$styleable;
            import com.google.android.material.navigation.AbstractC0368d;
            import p000.C2073pk;
            import p000.InterfaceC2110qk;
            import p000.InterfaceC2147rk;
            import p000.ac1;
            import p000.kb1;
            import p000.rn2;
            import p000.tl1;
            import p000.xt0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 64 */    public class BottomNavigationView extends AbstractC0368d {
                /* JADX WARN: Illegal instructions before constructor call */
                public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
/* 1 */             int i2 = R$style.Widget_Design_BottomNavigationView;
/* 3 */             super(context, attributeSet, i, i2);
/* 17 */            ac1 ac1VarM8214e = rn2.m8214e(getContext(), attributeSet, R$styleable.BottomNavigationView, i, i2, new int[0]);
/* 21 */            int i3 = R$styleable.BottomNavigationView_itemHorizontalTranslationEnabled;
/* 25 */            TypedArray typedArray = (TypedArray) ac1VarM8214e.f178c;
/* 32 */            setItemHorizontalTranslationEnabled(typedArray.getBoolean(i3, true));
/* 41 */            if (typedArray.hasValue(R$styleable.BottomNavigationView_android_minHeight)) {
/* 49 */                setMinimumHeight(typedArray.getDimensionPixelSize(R$styleable.BottomNavigationView_android_minHeight, 0));
                    }
/* 52 */            ac1VarM8214e.m168J();
/* 62 */            kb1.m6073z(this, new xt0(20));
                }

                @Override // com.google.android.material.navigation.AbstractC0368d
                /* JADX INFO: renamed from: a */
                public final tl1 mo2251a(Context context) {
/* 3 */             return new C2073pk(context);
                }

                @Override // com.google.android.material.navigation.AbstractC0368d
                public int getMaxItemCount() {
/* 1 */             return 5;
                }

                @Override // android.widget.FrameLayout, android.view.View
                public final void onMeasure(int i, int i2) {
/* 1 */             int suggestedMinimumHeight = getSuggestedMinimumHeight();
/* 11 */            if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
/* 33 */                i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
                    }
/* 37 */            super.onMeasure(i, i2);
                }

                public void setItemHorizontalTranslationEnabled(boolean z) {
/* 5 */             C2073pk c2073pk = (C2073pk) getMenuView();
/* 9 */             if (c2073pk.f15153w0 != z) {
/* 11 */                c2073pk.setItemHorizontalTranslationEnabled(z);
/* 19 */                getPresenter().mo419b(false);
                    }
                }

                @Deprecated
                public void setOnNavigationItemReselectedListener(InterfaceC2110qk interfaceC2110qk) {
/* 1 */             setOnItemReselectedListener(interfaceC2110qk);
                }

                @Deprecated
                public void setOnNavigationItemSelectedListener(InterfaceC2147rk interfaceC2147rk) {
/* 1 */             setOnItemSelectedListener(interfaceC2147rk);
                }

/* 65 */        public BottomNavigationView(Context context, AttributeSet attributeSet) {
/* 66 */            this(context, attributeSet, R$attr.bottomNavigationStyle);
                }
            }
