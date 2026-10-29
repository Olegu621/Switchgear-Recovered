            package com.quago.mobile.sdk;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.p */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class C0753p extends AbstractC0739j {

                /* JADX INFO: renamed from: b */
                public float f5606b;

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: a */
                public final void mo2578a(AbstractC0739j abstractC0739j) {
/* 3 */             if (abstractC0739j instanceof C0753p) {
/* 6 */                 C0753p c0753p = (C0753p) abstractC0739j;
/* 10 */                c0753p.f5606b = this.f5606b;
/* 14 */                c0753p.f5494a = this.f5494a;
                    }
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: b */
                public final Double[] mo2580b() {
/* 29 */            return new Double[]{Double.valueOf(Long.valueOf(this.f5494a).doubleValue()), Double.valueOf(Float.valueOf(this.f5606b).doubleValue())};
                }

                public final Object clone() {
/* 3 */             C0753p c0753p = new C0753p();
/* 6 */             mo2578a(c0753p);
/* 9 */             return c0753p;
                }

                public final String toString() {
/* 28 */            return "[" + this.f5494a + ", " + this.f5606b + "]";
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: a */
/* 16 */        public final AbstractC0739j mo2577a() {
/* 17 */            C0753p c0753p = new C0753p();
/* 18 */            mo2578a(c0753p);
                    return c0753p;
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: b */
/* 33 */        public final boolean mo2579b(AbstractC0739j abstractC0739j) {
                    return (abstractC0739j instanceof C0753p) && this.f5606b == ((C0753p) abstractC0739j).f5606b;
                }
            }
