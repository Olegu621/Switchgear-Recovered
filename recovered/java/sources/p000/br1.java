            package p000;

            import android.view.View;
            import android.view.animation.DecelerateInterpolator;
            import android.widget.Scroller;
            import androidx.recyclerview.widget.AbstractC0133k;
            import androidx.recyclerview.widget.C0127e;
            import androidx.recyclerview.widget.C0128f;
            import androidx.recyclerview.widget.RecyclerView;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class br1 extends q12 {

                /* JADX INFO: renamed from: a */
                public RecyclerView f2578a;

                /* JADX INFO: renamed from: b */
                public final lf2 f2579b = new lf2(this);

                /* JADX INFO: renamed from: c */
                public C0128f f2580c;

                /* JADX INFO: renamed from: d */
                public C0127e f2581d;

                /* JADX INFO: renamed from: c */
                public static int m1413c(View view, pc0 pc0Var) {
/* 23 */            return ((pc0Var.mo942c(view) / 2) + pc0Var.mo944e(view)) - ((pc0Var.mo951l() / 2) + pc0Var.mo950k());
                }

                /* JADX INFO: renamed from: d */
                public static View m1414d(AbstractC0133k abstractC0133k, pc0 pc0Var) {
/* 1 */             int iM986G = abstractC0133k.m986G();
/* 5 */             View view = null;
/* 6 */             if (iM986G == 0) {
/* 5 */                 return null;
                    }
/* 19 */            int iMo951l = (pc0Var.mo951l() / 2) + pc0Var.mo950k();
/* 20 */            int i = AbstractC0208c9.API_PRIORITY_OTHER;
/* 24 */            for (int i2 = 0; i2 < iM986G; i2++) {
/* 26 */                View viewM984F = abstractC0133k.m984F(i2);
/* 42 */                int iAbs = Math.abs(((pc0Var.mo942c(viewM984F) / 2) + pc0Var.mo944e(viewM984F)) - iMo951l);
/* 46 */                if (iAbs < i) {
/* 48 */                    view = viewM984F;
/* 49 */                    i = iAbs;
                        }
                    }
/* 53 */            return view;
                }

                /* JADX INFO: renamed from: a */
                public final void m1415a(RecyclerView recyclerView) {
/* 1 */             RecyclerView recyclerView2 = this.f2578a;
/* 3 */             if (recyclerView2 == recyclerView) {
/* 68 */                return;
                    }
/* 6 */             lf2 lf2Var = this.f2579b;
/* 8 */             if (recyclerView2 != null) {
/* 10 */                ArrayList arrayList = recyclerView2.f1626T0;
/* 12 */                if (arrayList != null) {
/* 14 */                    arrayList.remove(lf2Var);
                        }
/* 20 */                this.f2578a.setOnFlingListener(null);
                    }
/* 23 */            this.f2578a = recyclerView;
/* 25 */            if (recyclerView != null) {
/* 31 */                if (recyclerView.getOnFlingListener() != null) {
/* 65 */                    f42.m3656l("An instance of OnFlingListener already set.");
/* 68 */                    return;
                        }
/* 35 */                this.f2578a.m882h(lf2Var);
/* 40 */                this.f2578a.setOnFlingListener(this);
/* 56 */                new Scroller(this.f2578a.getContext(), new DecelerateInterpolator());
/* 59 */                m1420h();
                    }
                }

                /* JADX INFO: renamed from: b */
                public final int[] m1416b(AbstractC0133k abstractC0133k, View view) {
/* 2 */             int[] iArr = new int[2];
/* 9 */             if (abstractC0133k.mo832o()) {
/* 19 */                iArr[0] = m1413c(view, m1418f(abstractC0133k));
                    } else {
/* 22 */                iArr[0] = 0;
                    }
/* 29 */            if (abstractC0133k.mo835p()) {
/* 39 */                iArr[1] = m1413c(view, m1419g(abstractC0133k));
/* 41 */                return iArr;
                    }
/* 42 */            iArr[1] = 0;
/* 44 */            return iArr;
                }

                /* JADX INFO: renamed from: e */
                public View mo1417e(AbstractC0133k abstractC0133k) {
/* 5 */             if (abstractC0133k.mo835p()) {
/* 11 */                return m1414d(abstractC0133k, m1419g(abstractC0133k));
                    }
/* 20 */            if (abstractC0133k.mo832o()) {
/* 26 */                return m1414d(abstractC0133k, m1418f(abstractC0133k));
                    }
/* 31 */            return null;
                }

                /* JADX INFO: renamed from: f */
                public final pc0 m1418f(AbstractC0133k abstractC0133k) {
/* 1 */             C0127e c0127e = this.f2581d;
/* 3 */             if (c0127e == null || ((AbstractC0133k) c0127e.f15061b) != abstractC0133k) {
/* 16 */                this.f2581d = new C0127e(abstractC0133k);
                    }
/* 18 */            return this.f2581d;
                }

                /* JADX INFO: renamed from: g */
                public final pc0 m1419g(AbstractC0133k abstractC0133k) {
/* 1 */             C0128f c0128f = this.f2580c;
/* 3 */             if (c0128f == null || ((AbstractC0133k) c0128f.f15061b) != abstractC0133k) {
/* 16 */                this.f2580c = new C0128f(abstractC0133k);
                    }
/* 18 */            return this.f2580c;
                }

                /* JADX INFO: renamed from: h */
                public final void m1420h() {
                    AbstractC0133k layoutManager;
                    View viewMo1417e;
/* 1 */             RecyclerView recyclerView = this.f2578a;
/* 3 */             if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo1417e = mo1417e(layoutManager)) == null) {
/* 35 */                return;
                    }
/* 20 */            int[] iArrM1416b = m1416b(layoutManager, viewMo1417e);
/* 25 */            int i = iArrM1416b[0];
/* 28 */            if (i == 0 && iArrM1416b[1] == 0) {
/* 35 */                return;
                    }
/* 40 */            this.f2578a.m876d0(i, iArrM1416b[1], false);
                }
            }
