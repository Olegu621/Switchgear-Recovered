            package com.google.android.material.timepicker;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.os.Handler;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.constraintlayout.widget.C0077d;
            import androidx.constraintlayout.widget.ConstraintLayout;
            import com.google.android.material.R$id;
            import com.google.android.material.R$layout;
            import com.google.android.material.R$styleable;
            import java.util.WeakHashMap;
            import p000.C2274uz;
            import p000.a32;
            import p000.e33;
            import p000.fd1;
            import p000.sc2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 91 */    class RadialViewGroup extends ConstraintLayout {

                /* JADX INFO: renamed from: g0 */
                public final RunnableC0382d f5117g0;

                /* JADX INFO: renamed from: h0 */
                public int f5118h0;

                /* JADX INFO: renamed from: i0 */
                public final fd1 f5119i0;

                public RadialViewGroup(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 10 */            LayoutInflater.from(context).inflate(R$layout.material_radial_view_group, this);
/* 15 */            fd1 fd1Var = new fd1();
/* 18 */            this.f5119i0 = fd1Var;
/* 24 */            a32 a32Var = new a32(0.5f);
/* 31 */            sc2 sc2VarM8779f = fd1Var.f8151a.f7635a.m8779f();
/* 35 */            sc2VarM8779f.f16527e = a32Var;
/* 37 */            sc2VarM8779f.f16528f = a32Var;
/* 39 */            sc2VarM8779f.f16529g = a32Var;
/* 41 */            sc2VarM8779f.f16530h = a32Var;
/* 47 */            fd1Var.setShapeAppearanceModel(sc2VarM8779f.m8478a());
/* 57 */            this.f5119i0.m3742n(ColorStateList.valueOf(-1));
/* 60 */            fd1 fd1Var2 = this.f5119i0;
/* 62 */            WeakHashMap weakHashMap = e33.f7494a;
/* 64 */            setBackground(fd1Var2);
/* 70 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RadialViewGroup, i, 0);
/* 80 */            this.f5118h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RadialViewGroup_materialCircleRadius, 0);
/* 87 */            this.f5117g0 = new RunnableC0382d(this);
/* 89 */            typedArrayObtainStyledAttributes.recycle();
                }

                @Override // android.view.ViewGroup
                public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
/* 1 */             super.addView(view, i, layoutParams);
/* 9 */             if (view.getId() == -1) {
/* 11 */                WeakHashMap weakHashMap = e33.f7494a;
/* 17 */                view.setId(View.generateViewId());
                    }
/* 20 */            Handler handler = getHandler();
/* 24 */            if (handler != null) {
/* 26 */                RunnableC0382d runnableC0382d = this.f5117g0;
/* 28 */                handler.removeCallbacks(runnableC0382d);
/* 31 */                handler.post(runnableC0382d);
                    }
                }

                /* JADX INFO: renamed from: j */
                public final void m2428j() {
/* 1 */             int childCount = getChildCount();
/* 5 */             int i = 1;
/* 10 */            for (int i2 = 0; i2 < childCount; i2++) {
/* 24 */                if ("skip".equals(getChildAt(i2).getTag())) {
/* 26 */                    i++;
                        }
                    }
/* 33 */            C0077d c0077d = new C0077d();
/* 36 */            c0077d.m539e(this);
/* 39 */            float f = 0.0f;
/* 40 */            for (int i3 = 0; i3 < childCount; i3++) {
/* 42 */                View childAt = getChildAt(i3);
/* 52 */                if (childAt.getId() != R$id.circle_center && !"skip".equals(childAt.getTag())) {
/* 65 */                    int id = childAt.getId();
/* 69 */                    int i4 = R$id.circle_center;
/* 71 */                    int i5 = this.f5118h0;
/* 77 */                    C2274uz c2274uz = c0077d.m540h(id).f1180e;
/* 79 */                    c2274uz.f17745A = i4;
/* 81 */                    c2274uz.f17746B = i5;
/* 83 */                    c2274uz.f17747C = f;
/* 91 */                    f = (360.0f / (childCount - i)) + f;
                        }
                    }
/* 96 */            c0077d.m537b(this);
                }

                @Override // android.view.View
                public final void onFinishInflate() {
/* 1 */             super.onFinishInflate();
/* 4 */             m2428j();
                }

                @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
                public final void onViewRemoved(View view) {
/* 1 */             super.onViewRemoved(view);
/* 4 */             Handler handler = getHandler();
/* 8 */             if (handler != null) {
/* 10 */                RunnableC0382d runnableC0382d = this.f5117g0;
/* 12 */                handler.removeCallbacks(runnableC0382d);
/* 15 */                handler.post(runnableC0382d);
                    }
                }

                @Override // android.view.View
                public final void setBackgroundColor(int i) {
/* 7 */             this.f5119i0.m3742n(ColorStateList.valueOf(i));
                }

/* 92 */        public RadialViewGroup(Context context, AttributeSet attributeSet) {
/* 93 */            this(context, attributeSet, 0);
                }
            }
