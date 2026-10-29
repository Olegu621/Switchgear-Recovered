            package androidx.recyclerview.widget;

            import android.view.View;
            import android.view.ViewGroup;
            import p000.m23;
            
            /* JADX INFO: renamed from: androidx.recyclerview.widget.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0131i implements m23 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AbstractC0133k f1751a;

                public C0131i(AbstractC0133k abstractC0133k) {
/* 4 */             this.f1751a = abstractC0133k;
                }

                @Override // p000.m23
                /* JADX INFO: renamed from: a */
                public final int mo964a(View view) {
/* 13 */            return AbstractC0133k.m971K(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
                }

                @Override // p000.m23
                /* JADX INFO: renamed from: b */
                public final int mo965b() {
/* 3 */             return this.f1751a.getPaddingLeft();
                }

                @Override // p000.m23
                /* JADX INFO: renamed from: c */
                public final int mo966c() {
/* 1 */             AbstractC0133k abstractC0133k = this.f1751a;
/* 9 */             return abstractC0133k.f1757Y - abstractC0133k.getPaddingRight();
                }

                @Override // p000.m23
                /* JADX INFO: renamed from: d */
                public final View mo967d(int i) {
/* 3 */             return this.f1751a.m984F(i);
                }

                @Override // p000.m23
                /* JADX INFO: renamed from: e */
                public final int mo968e(View view) {
/* 13 */            return AbstractC0133k.m972L(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
                }
            }
