            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ib1 {

                /* JADX INFO: renamed from: a */
                public volatile int f9527a;

                /* JADX INFO: renamed from: b */
                public volatile int f9528b;

                /* JADX INFO: renamed from: a */
                public final void m4510a() throws C1898lp {
                    int i;
/* 4 */             if (this.f9527a == 0) {
/* 6 */                 this.f9528b = 1;
                    }
/* 11 */            this.f9527a++;
/* 13 */            int i2 = this.f9527a;
/* 15 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 32 */            do {
/* 23 */                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
/* 28 */                i = this.f9528b;
/* 30 */                if (jCurrentTimeMillis2 >= 15000) {
/* 36 */                    this.f9528b = i + 1;
/* 43 */                    throw new C1898lp();
                        }
/* 32 */            } while (i2 != i);
                }
            }
