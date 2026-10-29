            package androidx.fragment.app;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import p000.bt0;
            import p000.dn0;
            import p000.tm0;
            
            /* JADX INFO: renamed from: androidx.fragment.app.v */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0110v implements tm0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ AbstractC0111w f1475a;

                public C0110v(AbstractC0111w abstractC0111w) {
/* 4 */             this.f1475a = abstractC0111w;
                }

                @Override // p000.tm0
                /* JADX INFO: renamed from: a */
                public final boolean mo635a(ArrayList arrayList, ArrayList arrayList2) {
/* 1 */             AbstractC0111w abstractC0111w = this.f1475a;
/* 3 */             ArrayList<bt0> arrayList3 = abstractC0111w.f1503m;
/* 5 */             ArrayList arrayList4 = abstractC0111w.f1494d;
/* 17 */            C0086a c0086a = (C0086a) arrayList4.get(arrayList4.size() - 1);
/* 19 */            abstractC0111w.f1498h = c0086a;
/* 23 */            Iterator it = c0086a.f1385a.iterator();
/* 31 */            while (it.hasNext()) {
/* 39 */                Fragment fragment = ((dn0) it.next()).f7326b;
/* 41 */                if (fragment != null) {
/* 43 */                    fragment.mTransitioning = true;
                        }
                    }
/* 48 */            boolean zM691S = abstractC0111w.m691S(arrayList, arrayList2, -1, 0);
/* 56 */            if (!arrayList3.isEmpty() && arrayList.size() > 0) {
/* 75 */                ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
/* 80 */                LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
/* 83 */                Iterator it2 = arrayList.iterator();
/* 91 */                while (it2.hasNext()) {
/* 103 */                   linkedHashSet.addAll(AbstractC0111w.m673F((C0086a) it2.next()));
                        }
/* 115 */               for (bt0 bt0Var : arrayList3) {
/* 131 */                   for (Fragment fragment2 : linkedHashSet) {
/* 139 */                       bt0Var.getClass();
                            }
                        }
                    }
/* 143 */           return zM691S;
                }
            }
