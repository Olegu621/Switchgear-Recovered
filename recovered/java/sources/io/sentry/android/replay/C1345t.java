            package io.sentry.android.replay;

            import android.view.View;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.t */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 34 */    public final class C1345t extends ArrayList {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1346u f10639a;

                public C1345t(C1346u c1346u) {
/* 1 */             this.f10639a = c1346u;
                }

                @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean add(Object obj) {
/* 1 */             View view = (View) obj;
/* 3 */             view.getClass();
/* 10 */            Iterator it = this.f10639a.f10642c.iterator();
/* 18 */            while (it.hasNext()) {
/* 27 */                ((InterfaceC1317f) it.next()).mo5002c(view, true);
                    }
/* 31 */            return super.add(view);
                }

                @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final boolean addAll(Collection collection) {
/* 1 */             collection.getClass();
/* 16 */            for (InterfaceC1317f interfaceC1317f : this.f10639a.f10642c) {
/* 24 */                Iterator it = collection.iterator();
/* 32 */                while (it.hasNext()) {
/* 41 */                    interfaceC1317f.mo5002c((View) it.next(), true);
                        }
                    }
/* 45 */            return super.addAll(collection);
                }

                @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ boolean contains(Object obj) {
/* 3 */             if (obj instanceof View) {
/* 9 */                 return super.contains((View) obj);
                    }
/* 5 */             return false;
                }

                @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
                public final /* bridge */ int indexOf(Object obj) {
/* 3 */             if (obj instanceof View) {
/* 9 */                 return super.indexOf((View) obj);
                    }
/* 5 */             return -1;
                }

                @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
                public final /* bridge */ int lastIndexOf(Object obj) {
/* 3 */             if (obj instanceof View) {
/* 9 */                 return super.lastIndexOf((View) obj);
                    }
/* 5 */             return -1;
                }

                @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
                public final Object remove(int i) {
/* 1 */             Object objRemove = super.remove(i);
/* 5 */             objRemove.getClass();
/* 8 */             View view = (View) objRemove;
/* 14 */            Iterator it = this.f10639a.f10642c.iterator();
/* 22 */            while (it.hasNext()) {
/* 31 */                ((InterfaceC1317f) it.next()).mo5002c(view, false);
                    }
/* 35 */            return view;
                }

                @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
/* 35 */        public final /* bridge */ boolean remove(Object obj) {
/* 36 */            if (obj instanceof View) {
/* 37 */                return super.remove((View) obj);
                    }
                    return false;
                }
            }
