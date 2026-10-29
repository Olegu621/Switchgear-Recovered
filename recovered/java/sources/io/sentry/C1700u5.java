            package io.sentry;
            
            /* JADX INFO: renamed from: io.sentry.u5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class C1700u5 extends AbstractC1672t4 {

                /* JADX INFO: renamed from: a */
                public final long f11720a;

                /* JADX INFO: renamed from: b */
                public final long f11721b;

                public C1700u5() {
/* 9 */             this(System.currentTimeMillis(), System.nanoTime());
                }

                @Override // io.sentry.AbstractC1672t4, java.lang.Comparable
                /* JADX INFO: renamed from: a */
                public final int compareTo(AbstractC1672t4 abstractC1672t4) {
/* 3 */             if (!(abstractC1672t4 instanceof C1700u5)) {
/* 29 */                return super.compareTo(abstractC1672t4);
                    }
/* 5 */             C1700u5 c1700u5 = (C1700u5) abstractC1672t4;
/* 7 */             long j = c1700u5.f11720a;
/* 9 */             long j2 = this.f11720a;
                    return j2 == j ? Long.compare(this.f11721b, c1700u5.f11721b) : Long.compare(j2, j);
                }

                @Override // io.sentry.AbstractC1672t4
                /* JADX INFO: renamed from: b */
                public final long mo5412b(AbstractC1672t4 abstractC1672t4) {
                    return abstractC1672t4 instanceof C1700u5 ? this.f11721b - ((C1700u5) abstractC1672t4).f11721b : super.mo5412b(abstractC1672t4);
                }

                @Override // io.sentry.AbstractC1672t4
                /* JADX INFO: renamed from: c */
                public final long mo5413c(AbstractC1672t4 abstractC1672t4) {
/* 3 */             if (!(abstractC1672t4 instanceof C1700u5)) {
/* 32 */                return super.mo5413c(abstractC1672t4);
                    }
/* 6 */             C1700u5 c1700u5 = (C1700u5) abstractC1672t4;
/* 8 */             long j = c1700u5.f11721b;
/* 10 */            int iCompareTo = compareTo(abstractC1672t4);
/* 14 */            long j2 = this.f11721b;
/* 16 */            if (iCompareTo < 0) {
/* 23 */                return mo5278d() + (j - j2);
                    }
/* 30 */            return c1700u5.mo5278d() + (j2 - j);
                }

                @Override // io.sentry.AbstractC1672t4
                /* JADX INFO: renamed from: d */
                public final long mo5278d() {
/* 6 */             return this.f11720a * 1000000;
                }

/* 12 */        public C1700u5(long j, long j2) {
/* 14 */            this.f11720a = j;
/* 15 */            this.f11721b = j2;
                }
            }
