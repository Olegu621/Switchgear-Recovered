            package androidx.fragment.app;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Objects;
            import kotlin.collections.CollectionsKt;
            import p000.C0917fh;
            import p000.C2270uw;
            import p000.bt0;
            import p000.dn0;
            import p000.kp1;
            import p000.wf2;
            
            /* JADX INFO: renamed from: androidx.fragment.app.u */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0109u extends kp1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AbstractC0111w f1474a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0109u(AbstractC0111w abstractC0111w) {
/* 4 */             super(false);
/* 1 */             this.f1474a = abstractC0111w;
                }

                @Override // p000.kp1
                public final void handleOnBackCancelled() {
/* 2 */             boolean zM674K = AbstractC0111w.m674K(3);
/* 6 */             AbstractC0111w abstractC0111w = this.f1474a;
/* 8 */             if (zM674K) {
/* 10 */                Objects.toString(abstractC0111w);
                    }
/* 13 */            C0086a c0086a = abstractC0111w.f1498h;
/* 15 */            if (c0086a != null) {
/* 18 */                c0086a.f1402r = false;
/* 20 */                c0086a.m638d(false);
/* 24 */                abstractC0111w.m728z(true);
/* 27 */                abstractC0111w.m681E();
/* 32 */                Iterator it = abstractC0111w.f1503m.iterator();
/* 40 */                while (it.hasNext()) {
/* 48 */                    ((bt0) it.next()).getClass();
                        }
                    }
/* 53 */            abstractC0111w.f1498h = null;
                }

                @Override // p000.kp1
                public final void handleOnBackPressed() {
/* 2 */             boolean zM674K = AbstractC0111w.m674K(3);
/* 6 */             AbstractC0111w abstractC0111w = this.f1474a;
/* 8 */             if (zM674K) {
/* 10 */                Objects.toString(abstractC0111w);
                    }
/* 13 */            C0109u c0109u = abstractC0111w.f1499i;
/* 15 */            ArrayList<bt0> arrayList = abstractC0111w.f1503m;
/* 18 */            abstractC0111w.m728z(true);
/* 23 */            if (abstractC0111w.f1498h == null) {
/* 169 */               if (c0109u.isEnabled()) {
/* 171 */                   abstractC0111w.m689Q();
/* 174 */                   return;
                        } else {
/* 177 */                   abstractC0111w.f1497g.m8602b();
/* 180 */                   return;
                        }
                    }
/* 29 */            if (!arrayList.isEmpty()) {
/* 39 */                LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet(AbstractC0111w.m673F(abstractC0111w.f1498h));
/* 50 */                for (bt0 bt0Var : arrayList) {
/* 66 */                    for (Fragment fragment : linkedHashSet) {
/* 74 */                        bt0Var.getClass();
                            }
                        }
                    }
/* 82 */            Iterator it = abstractC0111w.f1498h.f1385a.iterator();
/* 91 */            while (it.hasNext()) {
/* 99 */                Fragment fragment2 = ((dn0) it.next()).f7326b;
/* 101 */               if (fragment2 != null) {
/* 103 */                   fragment2.mTransitioning = false;
                        }
                    }
/* 129 */           for (C0096h c0096h : abstractC0111w.m708f(new ArrayList(Collections.singletonList(abstractC0111w.f1498h)), 0, 1)) {
/* 137 */               ArrayList arrayList2 = c0096h.f1442c;
/* 139 */               c0096h.m664l(arrayList2);
/* 142 */               c0096h.m657c(arrayList2);
                    }
/* 147 */           abstractC0111w.f1498h = null;
/* 149 */           abstractC0111w.m706d0();
/* 156 */           if (AbstractC0111w.m674K(3)) {
/* 158 */               c0109u.isEnabled();
/* 161 */               abstractC0111w.toString();
                    }
                }

                @Override // p000.kp1
                public final void handleOnBackProgressed(C0917fh c0917fh) {
/* 2 */             boolean zM674K = AbstractC0111w.m674K(2);
/* 6 */             AbstractC0111w abstractC0111w = this.f1474a;
/* 8 */             if (zM674K) {
/* 10 */                Objects.toString(abstractC0111w);
                    }
/* 15 */            if (abstractC0111w.f1498h != null) {
/* 42 */                for (C0096h c0096h : abstractC0111w.m708f(new ArrayList(Collections.singletonList(abstractC0111w.f1498h)), 0, 1)) {
/* 50 */                    c0096h.getClass();
/* 53 */                    c0917fh.getClass();
/* 56 */                    ArrayList arrayList = c0096h.f1442c;
/* 60 */                    ArrayList arrayList2 = new ArrayList();
/* 63 */                    Iterator it = arrayList.iterator();
/* 71 */                    while (it.hasNext()) {
/* 81 */                        C2270uw.m9140k(arrayList2, ((C0091c0) it.next()).f1418k);
                            }
/* 89 */                    List listM6192K = CollectionsKt.m6192K(CollectionsKt.m6195N(arrayList2));
/* 93 */                    int size = listM6192K.size();
/* 98 */                    for (int i = 0; i < size; i++) {
/* 108 */                       ((wf2) listM6192K.get(i)).mo648d(c0917fh, c0096h.f1440a);
                            }
                        }
/* 116 */               Iterator it2 = abstractC0111w.f1503m.iterator();
/* 124 */               while (it2.hasNext()) {
/* 132 */                   ((bt0) it2.next()).getClass();
                        }
                    }
                }

                @Override // p000.kp1
                public final void handleOnBackStarted(C0917fh c0917fh) {
/* 2 */             boolean zM674K = AbstractC0111w.m674K(3);
/* 6 */             AbstractC0111w abstractC0111w = this.f1474a;
/* 8 */             if (zM674K) {
/* 10 */                Objects.toString(abstractC0111w);
                    }
/* 13 */            abstractC0111w.m725w();
/* 22 */            abstractC0111w.m726x(new C0110v(abstractC0111w), false);
                }
            }
