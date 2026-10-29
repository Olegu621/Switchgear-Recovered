            package androidx.recyclerview.widget;

            import android.graphics.Rect;
            import android.view.View;
            import android.view.ViewGroup;
            import p000.pc0;
            
            /* JADX INFO: renamed from: androidx.recyclerview.widget.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0127e extends pc0 {
                @Override // p000.pc0
                /* JADX INFO: renamed from: b */
                public final int mo941b(View view) {
/* 5 */             RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
/* 11 */            ((AbstractC0133k) this.f15061b).getClass();
/* 20 */            return AbstractC0133k.m972L(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                }

                @Override // p000.pc0
                /* JADX INFO: renamed from: c */
                public final int mo942c(View view) {
/* 5 */             RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
/* 11 */            ((AbstractC0133k) this.f15061b).getClass();
/* 20 */            Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b;
/* 37 */            return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                }

                @Override // p000.pc0
                /* JADX INFO: renamed from: d */
                public final int mo943d(View view) {
/* 5 */             RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
/* 11 */            ((AbstractC0133k) this.f15061b).getClass();
/* 20 */            Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).f1682b;
/* 37 */            return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                }

                @Override // p000.pc0
                /* JADX INFO: renamed from: e */
                public final int mo944e(View view) {
/* 5 */             RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
/* 11 */            ((AbstractC0133k) this.f15061b).getClass();
/* 20 */            return AbstractC0133k.m971K(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                }

                @Override // p000.pc0
                /* JADX INFO: renamed from: f */
                public final int mo945f() {
/* 5 */             return ((AbstractC0133k) this.f15061b).f1757Y;
                }

                @Override // p000.pc0
                /* JADX INFO: renamed from: g */
                public final int mo946g() {
/* 3 */             AbstractC0133k abstractC0133k = (AbstractC0133k) this.f15061b;
/* 11 */            return abstractC0133k.f1757Y - abstractC0133k.getPaddingRight();
                }

                @Override // p000.pc0
                /* JADX INFO: renamed from: h */
                public final int mo947h() {
/* 5 */             return ((AbstractC0133k) this.f15061b).getPaddingRight();
                }

                @Override // p000.pc0
                /* JADX INFO: renamed from: i */
                public final int mo948i() {
/* 5 */             return ((AbstractC0133k) this.f15061b).f1755W;
                }

                @Override // p000.pc0
                /* JADX INFO: renamed from: j */
                public final int mo949j() {
/* 5 */             return ((AbstractC0133k) this.f15061b).f1756X;
                }

                @Override // p000.pc0
                /* JADX INFO: renamed from: k */
                public final int mo950k() {
/* 5 */             return ((AbstractC0133k) this.f15061b).getPaddingLeft();
                }

                @Override // p000.pc0
                /* JADX INFO: renamed from: l */
                public final int mo951l() {
/* 3 */             AbstractC0133k abstractC0133k = (AbstractC0133k) this.f15061b;
/* 16 */            return (abstractC0133k.f1757Y - abstractC0133k.getPaddingLeft()) - abstractC0133k.getPaddingRight();
                }

                @Override // p000.pc0
                /* JADX INFO: renamed from: n */
                public final int mo952n(View view) {
/* 3 */             AbstractC0133k abstractC0133k = (AbstractC0133k) this.f15061b;
/* 7 */             Rect rect = (Rect) this.f15062c;
/* 9 */             abstractC0133k.m990R(rect, view);
/* 12 */            return rect.right;
                }

                @Override // p000.pc0
                /* JADX INFO: renamed from: o */
                public final int mo953o(View view) {
/* 3 */             AbstractC0133k abstractC0133k = (AbstractC0133k) this.f15061b;
/* 7 */             Rect rect = (Rect) this.f15062c;
/* 9 */             abstractC0133k.m990R(rect, view);
/* 12 */            return rect.left;
                }

                @Override // p000.pc0
                /* JADX INFO: renamed from: p */
                public final void mo954p(int i) {
/* 5 */             ((AbstractC0133k) this.f15061b).mo912V(i);
                }
            }
