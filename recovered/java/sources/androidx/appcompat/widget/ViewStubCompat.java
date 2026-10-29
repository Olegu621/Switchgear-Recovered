            package androidx.appcompat.widget;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import androidx.appcompat.R$styleable;
            import java.lang.ref.WeakReference;
            import p000.C1951n4;
            import p000.f42;
            import p000.x43;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 50 */    public final class ViewStubCompat extends View {

                /* JADX INFO: renamed from: a */
                public int f734a;

                /* JADX INFO: renamed from: b */
                public int f735b;

                /* JADX INFO: renamed from: c */
                public WeakReference f736c;

                /* JADX INFO: renamed from: d */
                public LayoutInflater f737d;

                public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
/* 1 */             super(context, attributeSet, i);
/* 5 */             this.f734a = 0;
/* 9 */             TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ViewStubCompat, i, 0);
/* 20 */            this.f735b = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ViewStubCompat_android_inflatedId, -1);
/* 28 */            this.f734a = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ViewStubCompat_android_layout, 0);
/* 36 */            setId(typedArrayObtainStyledAttributes.getResourceId(R$styleable.ViewStubCompat_android_id, -1));
/* 39 */            typedArrayObtainStyledAttributes.recycle();
/* 44 */            setVisibility(8);
/* 48 */            setWillNotDraw(true);
                }

                /* JADX INFO: renamed from: a */
                public final View m417a() {
/* 1 */             ViewParent parent = getParent();
/* 8 */             if (!(parent instanceof ViewGroup)) {
/* 80 */                f42.m3656l("ViewStub must have a non-null ViewGroup viewParent");
/* 7 */                 return null;
                    }
/* 12 */            if (this.f734a == 0) {
/* 74 */                C1951n4.m6859j("ViewStub must have a valid layoutResource");
/* 7 */                 return null;
                    }
/* 14 */            ViewGroup viewGroup = (ViewGroup) parent;
/* 16 */            LayoutInflater layoutInflaterFrom = this.f737d;
/* 18 */            if (layoutInflaterFrom == null) {
/* 25 */                layoutInflaterFrom = LayoutInflater.from(getContext());
                    }
/* 32 */            View viewInflate = layoutInflaterFrom.inflate(this.f734a, viewGroup, false);
/* 36 */            int i = this.f735b;
/* 39 */            if (i != -1) {
/* 41 */                viewInflate.setId(i);
                    }
/* 44 */            int iIndexOfChild = viewGroup.indexOfChild(this);
/* 48 */            viewGroup.removeViewInLayout(this);
/* 51 */            ViewGroup.LayoutParams layoutParams = getLayoutParams();
/* 55 */            if (layoutParams != null) {
/* 57 */                viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
                    } else {
/* 61 */                viewGroup.addView(viewInflate, iIndexOfChild);
                    }
/* 69 */            this.f736c = new WeakReference(viewInflate);
/* 71 */            return viewInflate;
                }

                @Override // android.view.View
                public final void dispatchDraw(Canvas canvas) {
                }

                @Override // android.view.View
                public final void draw(Canvas canvas) {
                }

                public int getInflatedId() {
/* 1 */             return this.f735b;
                }

                public LayoutInflater getLayoutInflater() {
/* 1 */             return this.f737d;
                }

                public int getLayoutResource() {
/* 1 */             return this.f734a;
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
/* 2 */             setMeasuredDimension(0, 0);
                }

                public void setInflatedId(int i) {
/* 1 */             this.f735b = i;
                }

                public void setLayoutInflater(LayoutInflater layoutInflater) {
/* 1 */             this.f737d = layoutInflater;
                }

                public void setLayoutResource(int i) {
/* 1 */             this.f734a = i;
                }

                public void setOnInflateListener(x43 x43Var) {
                }

                @Override // android.view.View
                public void setVisibility(int i) {
/* 1 */             WeakReference weakReference = this.f736c;
/* 3 */             if (weakReference != null) {
/* 9 */                 View view = (View) weakReference.get();
/* 11 */                if (view != null) {
/* 13 */                    view.setVisibility(i);
/* 16 */                    return;
                        } else {
/* 19 */                    f42.m3656l("setVisibility called on un-referenced view");
/* 22 */                    return;
                        }
                    }
/* 23 */            super.setVisibility(i);
/* 26 */            if (i == 0 || i == 4) {
/* 33 */                m417a();
                    }
                }

/* 51 */        public ViewStubCompat(Context context, AttributeSet attributeSet) {
/* 52 */            this(context, attributeSet, 0);
                }
            }
