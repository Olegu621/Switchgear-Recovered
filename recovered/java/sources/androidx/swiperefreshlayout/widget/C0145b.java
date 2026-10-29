            package androidx.swiperefreshlayout.widget;

            import android.view.animation.Animation;
            import android.view.animation.Transformation;
            import p000.C2231tu;
            
            /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0145b extends Animation {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f1840a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f1841b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ SwipeRefreshLayout f1842c;

                public C0145b(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
/* 1 */             this.f1842c = swipeRefreshLayout;
/* 3 */             this.f1840a = i;
/* 5 */             this.f1841b = i2;
                }

                @Override // android.view.animation.Animation
                public final void applyTransformation(float f, Transformation transformation) {
/* 3 */             C2231tu c2231tu = this.f1842c.mProgress;
/* 5 */             int i = this.f1840a;
/* 15 */            c2231tu.setAlpha((int) (((this.f1841b - i) * f) + i));
                }
            }
