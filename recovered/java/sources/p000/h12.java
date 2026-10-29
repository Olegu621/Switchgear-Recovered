            package p000;

            import android.view.View;
            import androidx.recyclerview.widget.AbstractC0137o;
            import androidx.recyclerview.widget.RecyclerView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class h12 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ RecyclerView f8866a;

                public /* synthetic */ h12(RecyclerView recyclerView) {
/* 1 */             this.f8866a = recyclerView;
                }

                /* JADX WARN: Code duplicated, block: B:9:0x001d  */
                /* JADX INFO: renamed from: a */
                public void m4079a(AbstractC0137o abstractC0137o, m12 m12Var, m12 m12Var2) {
                    boolean zM5717g;
/* 2 */             abstractC0137o.m1030n(false);
/* 5 */             RecyclerView recyclerView = this.f8866a;
/* 10 */            j60 j60Var = (j60) recyclerView.f1680z0;
/* 12 */            if (m12Var != null) {
/* 14 */                j60Var.getClass();
/* 17 */                int i = m12Var.f13545a;
/* 19 */                int i2 = m12Var2.f13545a;
/* 21 */                if (i == i2 && m12Var.f13546b == m12Var2.f13546b) {
/* 42 */                    j60Var.m5721l(abstractC0137o);
/* 48 */                    abstractC0137o.f1778a.setAlpha(0.0f);
/* 53 */                    j60Var.f12085i.add(abstractC0137o);
/* 56 */                    zM5717g = true;
                        } else {
/* 37 */                    zM5717g = j60Var.m5717g(abstractC0137o, i, m12Var.f13546b, i2, m12Var2.f13546b);
                        }
                    } else {
/* 42 */                j60Var.m5721l(abstractC0137o);
/* 48 */                abstractC0137o.f1778a.setAlpha(0.0f);
/* 53 */                j60Var.f12085i.add(abstractC0137o);
/* 56 */                zM5717g = true;
                    }
/* 57 */            if (zM5717g) {
/* 59 */                recyclerView.m867U();
                    }
                }

                /* JADX INFO: renamed from: b */
                public void m4080b(AbstractC0137o abstractC0137o, m12 m12Var, m12 m12Var2) {
                    boolean zM5717g;
/* 1 */             RecyclerView recyclerView = this.f8866a;
/* 5 */             recyclerView.f1639b.m1013j(abstractC0137o);
/* 8 */             recyclerView.m878f(abstractC0137o);
/* 12 */            abstractC0137o.m1030n(false);
/* 18 */            j60 j60Var = (j60) recyclerView.f1680z0;
/* 20 */            j60Var.getClass();
/* 23 */            int i = m12Var.f13545a;
/* 25 */            int i2 = m12Var.f13546b;
/* 27 */            View view = abstractC0137o.f1778a;
/* 37 */            int left = m12Var2 == null ? view.getLeft() : m12Var2.f13545a;
/* 48 */            int top = m12Var2 == null ? view.getTop() : m12Var2.f13546b;
/* 55 */            if (abstractC0137o.m1024h() || (i == left && i2 == top)) {
/* 83 */                j60Var.m5721l(abstractC0137o);
/* 88 */                j60Var.f12084h.add(abstractC0137o);
/* 91 */                zM5717g = true;
                    } else {
/* 74 */                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
/* 78 */                zM5717g = j60Var.m5717g(abstractC0137o, i, i2, left, top);
                    }
/* 92 */            if (zM5717g) {
/* 94 */                recyclerView.m867U();
                    }
                }
            }
