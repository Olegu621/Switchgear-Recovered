            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yz0 extends wx2 {

                /* JADX INFO: renamed from: b */
                public boolean f19870b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f19871c;

                public yz0(Object obj) {
/* 2 */             super(0);
/* 5 */             this.f19871c = obj;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 3 */             return !this.f19870b;
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 3 */             if (this.f19870b) {
/* 11 */                C1951n4.m6864o();
/* 14 */                return null;
                    }
/* 6 */             this.f19870b = true;
/* 8 */             return this.f19871c;
                }
            }
