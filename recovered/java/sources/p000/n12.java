            package p000;

            import android.view.View;
            import androidx.recyclerview.widget.AbstractC0137o;
            import androidx.recyclerview.widget.C0134l;
            import androidx.recyclerview.widget.RecyclerView;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class n12 {

                /* JADX INFO: renamed from: a */
                public h12 f14094a;

                /* JADX INFO: renamed from: b */
                public ArrayList f14095b;

                /* JADX INFO: renamed from: c */
                public long f14096c;

                /* JADX INFO: renamed from: d */
                public long f14097d;

                /* JADX INFO: renamed from: e */
                public long f14098e;

                /* JADX INFO: renamed from: f */
                public long f14099f;

                /* JADX INFO: renamed from: b */
                public static void m6850b(AbstractC0137o abstractC0137o) {
                    RecyclerView recyclerView;
/* 1 */             int i = abstractC0137o.f1787j;
/* 7 */             if (abstractC0137o.m1022f() || (i & 4) != 0 || (recyclerView = abstractC0137o.f1795r) == null) {
/* 22 */                return;
                    }
/* 19 */            recyclerView.m855G(abstractC0137o);
                }

                /* JADX INFO: renamed from: a */
                public abstract boolean mo5713a(AbstractC0137o abstractC0137o, AbstractC0137o abstractC0137o2, m12 m12Var, m12 m12Var2);

                /* JADX INFO: renamed from: c */
                public final void m6851c(AbstractC0137o abstractC0137o) {
/* 1 */             h12 h12Var = this.f14094a;
/* 3 */             if (h12Var != null) {
/* 5 */                 RecyclerView recyclerView = h12Var.f8866a;
/* 7 */                 boolean z = true;
/* 8 */                 abstractC0137o.m1030n(true);
/* 11 */                View view = abstractC0137o.f1778a;
/* 16 */                if (abstractC0137o.f1785h != null && abstractC0137o.f1786i == null) {
/* 22 */                    abstractC0137o.f1785h = null;
                        }
/* 24 */                abstractC0137o.f1786i = null;
/* 30 */                if ((abstractC0137o.f1787j & 16) != 0) {
/* 109 */                   return;
                        }
/* 33 */                C0134l c0134l = recyclerView.f1639b;
/* 35 */                recyclerView.m879f0();
/* 38 */                C0875ec c0875ec = recyclerView.f1648e;
/* 42 */                C0193bu c0193bu = (C0193bu) c0875ec.f7614c;
/* 46 */                ts0 ts0Var = (ts0) c0875ec.f7613b;
/* 52 */                int iIndexOfChild = ((RecyclerView) ts0Var.f17248a).indexOfChild(view);
/* 58 */                if (iIndexOfChild == -1) {
/* 60 */                    c0875ec.m3376O(view);
                        } else if (c0193bu.m1436d(iIndexOfChild)) {
/* 70 */                    c0193bu.m1438f(iIndexOfChild);
/* 73 */                    c0875ec.m3376O(view);
/* 76 */                    ts0Var.m8890D(iIndexOfChild);
                        } else {
/* 80 */                    z = false;
                        }
/* 81 */                if (z) {
/* 83 */                    AbstractC0137o abstractC0137oM843J = RecyclerView.m843J(view);
/* 87 */                    c0134l.m1013j(abstractC0137oM843J);
/* 90 */                    c0134l.m1010g(abstractC0137oM843J);
                        }
/* 95 */                recyclerView.m881g0(!z);
/* 98 */                if (z || !abstractC0137o.m1026j()) {
/* 109 */                   return;
                        }
/* 106 */               recyclerView.removeDetachedView(view, false);
                    }
                }

                /* JADX INFO: renamed from: d */
                public abstract void mo5714d(AbstractC0137o abstractC0137o);

                /* JADX INFO: renamed from: e */
                public abstract void mo5715e();

                /* JADX INFO: renamed from: f */
                public abstract boolean mo5716f();
            }
