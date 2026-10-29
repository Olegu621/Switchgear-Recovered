            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: pt */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C2082pt extends AbstractC1902lt {

                /* JADX INFO: renamed from: a */
                public final int f15276a;

                /* JADX INFO: renamed from: b */
                public final int f15277b;

                /* JADX INFO: renamed from: c */
                public boolean f15278c;

                /* JADX INFO: renamed from: d */
                public int f15279d;

                public C2082pt(char c, char c2, int i) {
/* 4 */             this.f15276a = i;
/* 6 */             this.f15277b = c2;
/* 8 */             boolean z = false;
/* 10 */            if (i <= 0 ? Intrinsics.m6217b(c, c2) >= 0 : Intrinsics.m6217b(c, c2) <= 0) {
/* 18 */                z = true;
                    }
/* 27 */            this.f15278c = z;
/* 33 */            this.f15279d = z ? c : c2;
                }

                @Override // p000.AbstractC1902lt
                /* JADX INFO: renamed from: a */
                public final char mo6536a() {
/* 1 */             int i = this.f15279d;
/* 5 */             if (i != this.f15277b) {
/* 23 */                this.f15279d = this.f15276a + i;
                    } else {
/* 9 */                 if (!this.f15278c) {
/* 15 */                    C1951n4.m6864o();
/* 18 */                    return (char) 0;
                        }
/* 12 */                this.f15278c = false;
                    }
/* 25 */            return (char) i;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 1 */             return this.f15278c;
                }
            }
