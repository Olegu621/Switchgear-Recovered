            package androidx.recyclerview.widget;

            import android.view.View;
            import java.util.List;
            import p000.AbstractC0208c9;
            
            /* JADX INFO: renamed from: androidx.recyclerview.widget.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0124b {

                /* JADX INFO: renamed from: a */
                public boolean f1728a;

                /* JADX INFO: renamed from: b */
                public int f1729b;

                /* JADX INFO: renamed from: c */
                public int f1730c;

                /* JADX INFO: renamed from: d */
                public int f1731d;

                /* JADX INFO: renamed from: e */
                public int f1732e;

                /* JADX INFO: renamed from: f */
                public int f1733f;

                /* JADX INFO: renamed from: g */
                public int f1734g;

                /* JADX INFO: renamed from: h */
                public int f1735h;

                /* JADX INFO: renamed from: i */
                public int f1736i;

                /* JADX INFO: renamed from: j */
                public int f1737j;

                /* JADX INFO: renamed from: k */
                public List f1738k;

                /* JADX INFO: renamed from: l */
                public boolean f1739l;

                /* JADX INFO: renamed from: a */
                public final void m935a(View view) {
                    int iM1018b;
/* 3 */             int size = this.f1738k.size();
/* 7 */             View view2 = null;
/* 8 */             int i = AbstractC0208c9.API_PRIORITY_OTHER;
/* 12 */            for (int i2 = 0; i2 < size; i2++) {
/* 22 */                View view3 = ((AbstractC0137o) this.f1738k.get(i2)).f1778a;
/* 28 */                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
/* 30 */                if (view3 != view && !layoutParams.f1681a.m1024h() && (iM1018b = (layoutParams.f1681a.m1018b() - this.f1731d) * this.f1732e) >= 0 && iM1018b < i) {
/* 58 */                    view2 = view3;
/* 59 */                    if (iM1018b == 0) {
                                break;
                            } else {
/* 62 */                        i = iM1018b;
                            }
                        }
                    }
/* 66 */            if (view2 == null) {
/* 69 */                this.f1731d = -1;
                    } else {
/* 84 */                this.f1731d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).f1681a.m1018b();
                    }
                }

                /* JADX INFO: renamed from: b */
                public final View m936b(C0134l c0134l) {
/* 1 */             List list = this.f1738k;
/* 3 */             if (list == null) {
/* 67 */                View view = c0134l.m1012i(this.f1731d, Long.MAX_VALUE).f1778a;
/* 74 */                this.f1731d += this.f1732e;
/* 76 */                return view;
                    }
/* 5 */             int size = list.size();
/* 10 */            for (int i = 0; i < size; i++) {
/* 20 */                View view2 = ((AbstractC0137o) this.f1738k.get(i)).f1778a;
/* 26 */                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view2.getLayoutParams();
/* 34 */                if (!layoutParams.f1681a.m1024h() && this.f1731d == layoutParams.f1681a.m1018b()) {
/* 47 */                    m935a(view2);
/* 50 */                    return view2;
                        }
                    }
/* 54 */            return null;
                }
            }
