            package p000;

            import android.graphics.Rect;
            import android.view.View;
            import androidx.recyclerview.widget.AbstractC0133k;
            import androidx.recyclerview.widget.C0127e;
            import androidx.recyclerview.widget.C0128f;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 16 */    public abstract class pc0 {

                /* JADX INFO: renamed from: a */
                public int f15060a;

                /* JADX INFO: renamed from: b */
                public final Object f15061b;

                /* JADX INFO: renamed from: c */
                public final Object f15062c;

                public pc0(AbstractC0133k abstractC0133k) {
/* 6 */             this.f15060a = Integer.MIN_VALUE;
/* 13 */            this.f15062c = new Rect();
/* 15 */            this.f15061b = abstractC0133k;
                }

                /* JADX INFO: renamed from: a */
                public static pc0 m7383a(AbstractC0133k abstractC0133k, int i) {
/* 1 */             if (i == 0) {
/* 21 */                return new C0127e(abstractC0133k);
                    }
/* 4 */             if (i == 1) {
/* 8 */                 return new C0128f(abstractC0133k);
                    }
/* 14 */            C1951n4.m6859j("invalid orientation");
/* 17 */            return null;
                }

                /* JADX INFO: renamed from: b */
                public abstract int mo941b(View view);

                /* JADX INFO: renamed from: c */
                public abstract int mo942c(View view);

                /* JADX INFO: renamed from: d */
                public abstract int mo943d(View view);

                /* JADX INFO: renamed from: e */
                public abstract int mo944e(View view);

                /* JADX INFO: renamed from: f */
                public abstract int mo945f();

                /* JADX INFO: renamed from: g */
                public abstract int mo946g();

                /* JADX INFO: renamed from: h */
                public abstract int mo947h();

                /* JADX INFO: renamed from: i */
                public abstract int mo948i();

                /* JADX INFO: renamed from: j */
                public abstract int mo949j();

                /* JADX INFO: renamed from: k */
                public abstract int mo950k();

                /* JADX INFO: renamed from: l */
                public abstract int mo951l();

                /* JADX INFO: renamed from: m */
                public int m7384m() {
/* 5 */             if (Integer.MIN_VALUE == this.f15060a) {
/* 7 */                 return 0;
                    }
/* 15 */            return mo951l() - this.f15060a;
                }

                /* JADX INFO: renamed from: n */
                public abstract int mo952n(View view);

                /* JADX INFO: renamed from: o */
                public abstract int mo953o(View view);

                /* JADX INFO: renamed from: p */
                public abstract void mo954p(int i);

/* 17 */        public pc0(rc0 rc0Var) {
/* 19 */            this.f15060a = 0;
/* 20 */            this.f15062c = new y50();
/* 21 */            this.f15061b = rc0Var;
                }
            }
