            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class pa1 extends ma1 {

                /* JADX INFO: renamed from: a */
                public final long f15040a;

                /* JADX INFO: renamed from: b */
                public final long f15041b;

                /* JADX INFO: renamed from: c */
                public boolean f15042c;

                /* JADX INFO: renamed from: d */
                public long f15043d;

                public pa1(long j, long j2, long j3) {
/* 4 */             this.f15040a = j3;
/* 6 */             this.f15041b = j2;
/* 12 */            boolean z = false;
/* 14 */            if (j3 <= 0 ? j >= j2 : j <= j2) {
/* 20 */                z = true;
                    }
/* 27 */            this.f15042c = z;
/* 33 */            this.f15043d = z ? j : j2;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 1 */             return this.f15042c;
                }

                @Override // p000.ma1
                public final long nextLong() {
/* 1 */             long j = this.f15043d;
/* 7 */             if (j != this.f15041b) {
/* 26 */                this.f15043d = this.f15040a + j;
/* 28 */                return j;
                    }
/* 11 */            if (this.f15042c) {
/* 14 */                this.f15042c = false;
/* 16 */                return j;
                    }
/* 17 */            C1951n4.m6864o();
/* 20 */            return 0L;
                }
            }
