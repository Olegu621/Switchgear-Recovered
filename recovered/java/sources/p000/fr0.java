            package p000;

            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.transition.R$id;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fr0 extends ViewGroup implements cr0 {

                /* JADX INFO: renamed from: i */
                public static final /* synthetic */ int f8328i = 0;

                /* JADX INFO: renamed from: a */
                public ViewGroup f8329a;

                /* JADX INFO: renamed from: b */
                public View f8330b;

                /* JADX INFO: renamed from: c */
                public final View f8331c;

                /* JADX INFO: renamed from: d */
                public int f8332d;

                /* JADX INFO: renamed from: e */
                public Matrix f8333e;

                /* JADX INFO: renamed from: f */
                public final l10 f8334f;

                public fr0(View view) {
/* 5 */             super(view.getContext());
/* 14 */            this.f8334f = new l10(this, 1);
/* 16 */            this.f8331c = view;
/* 19 */            setWillNotDraw(false);
/* 22 */            setClipChildren(false);
/* 27 */            setLayerType(2, null);
                }

                @Override // p000.cr0
                /* JADX INFO: renamed from: a */
                public final void mo2870a(ViewGroup viewGroup, View view) {
/* 1 */             this.f8329a = viewGroup;
/* 3 */             this.f8330b = view;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onAttachedToWindow() {
/* 1 */             super.onAttachedToWindow();
/* 4 */             int i = R$id.ghost_view;
/* 6 */             View view = this.f8331c;
/* 8 */             view.setTag(i, this);
/* 17 */            view.getViewTreeObserver().addOnPreDrawListener(this.f8334f);
/* 21 */            l53.m6344c(4, view);
/* 28 */            if (view.getParent() != null) {
/* 36 */                ((View) view.getParent()).invalidate();
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onDetachedFromWindow() {
/* 1 */             View view = this.f8331c;
/* 9 */             view.getViewTreeObserver().removeOnPreDrawListener(this.f8334f);
/* 13 */            l53.m6344c(0, view);
/* 19 */            view.setTag(R$id.ghost_view, null);
/* 26 */            if (view.getParent() != null) {
/* 34 */                ((View) view.getParent()).invalidate();
                    }
/* 37 */            super.onDetachedFromWindow();
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
/* 2 */             i13.m4436n(canvas, true);
/* 7 */             canvas.setMatrix(this.f8333e);
/* 11 */            View view = this.f8331c;
/* 13 */            l53.m6344c(0, view);
/* 16 */            view.invalidate();
/* 20 */            l53.m6344c(4, view);
/* 27 */            drawChild(canvas, view, getDrawingTime());
/* 30 */            i13.m4436n(canvas, false);
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                }

                @Override // android.view.View, p000.cr0
                public final void setVisibility(int i) {
/* 1 */             super.setVisibility(i);
/* 4 */             int i2 = R$id.ghost_view;
/* 6 */             View view = this.f8331c;
/* 14 */            if (((fr0) view.getTag(i2)) == this) {
/* 21 */                l53.m6344c(i == 0 ? 4 : 0, view);
                    }
                }
            }
