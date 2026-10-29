            package p000;

            import java.util.Iterator;
            import java.util.ListIterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public final class yw0 extends zw0 {

                /* JADX INFO: renamed from: c */
                public final transient int f19839c;

                /* JADX INFO: renamed from: d */
                public final transient int f19840d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ zw0 f19841e;

                public yw0(zw0 zw0Var, int i, int i2) {
/* 1 */             this.f19841e = zw0Var;
/* 6 */             this.f19839c = i;
/* 8 */             this.f19840d = i2;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: b */
                public final Object[] mo8678b() {
/* 3 */             return this.f19841e.mo8678b();
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: c */
                public final int mo8679c() {
/* 12 */            return this.f19841e.mo8680d() + this.f19839c + this.f19840d;
                }

                @Override // p000.vw0
                /* JADX INFO: renamed from: d */
                public final int mo8680d() {
/* 9 */             return this.f19841e.mo8680d() + this.f19839c;
                }

                @Override // java.util.List
                public final Object get(int i) {
/* 3 */             yy1.m10214i(i, this.f19840d);
/* 11 */            return this.f19841e.get(i + this.f19839c);
                }

                @Override // p000.zw0, java.util.List
                /* JADX INFO: renamed from: h */
                public final zw0 subList(int i, int i2) {
/* 3 */             yy1.m10216k(i, i2, this.f19840d);
/* 6 */             int i3 = this.f19839c;
/* 12 */            return this.f19841e.subList(i + i3, i2 + i3);
                }

                @Override // p000.zw0, p000.vw0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public final Iterator iterator() {
/* 2 */             return listIterator(0);
                }

                @Override // p000.zw0, java.util.List
                public final ListIterator listIterator() {
/* 2 */             return listIterator(0);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
/* 1 */             return this.f19840d;
                }

                @Override // p000.zw0, java.util.List
/* 6 */         public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
/* 7 */             return listIterator(i);
                }
            }
