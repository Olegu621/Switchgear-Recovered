            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mg3 extends ig3 {

                /* JADX INFO: renamed from: d */
                public final transient Object f13766d;

                public mg3(Object obj) {
/* 4 */             this.f13766d = obj;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
/* 3 */             return this.f13766d.equals(obj);
                }

                @Override // p000.yf3
                /* JADX INFO: renamed from: d */
                public final int mo1352d(Object[] objArr) {
/* 4 */             objArr[0] = this.f13766d;
/* 6 */             return 1;
                }

                @Override // p000.ig3
                /* JADX INFO: renamed from: e */
                public final wx2 mo4530e() {
/* 5 */             return new jg3(this.f13766d);
                }

                @Override // p000.ig3, java.util.Collection, java.util.Set
                public final int hashCode() {
/* 3 */             return this.f13766d.hashCode();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final /* synthetic */ Iterator iterator() {
/* 5 */             return new jg3(this.f13766d);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
/* 1 */             return 1;
                }

                @Override // java.util.AbstractCollection
                public final String toString() {
/* 3 */             String string = this.f13766d.toString();
/* 26 */            return fm0.m3790p(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
                }
            }
