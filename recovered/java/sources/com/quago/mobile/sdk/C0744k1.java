            package com.quago.mobile.sdk;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.k1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class C0744k1 extends AbstractC0739j {
                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: a */
                public final void mo2578a(AbstractC0739j abstractC0739j) {
/* 3 */             if (abstractC0739j instanceof C0744k1) {
/* 10 */                ((C0744k1) abstractC0739j).f5494a = this.f5494a;
                    }
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: b */
                public final Double[] mo2580b() {
/* 15 */            return new Double[]{Double.valueOf(Long.valueOf(this.f5494a).doubleValue())};
                }

                public final Object clone() {
/* 3 */             C0744k1 c0744k1 = new C0744k1();
/* 6 */             mo2578a(c0744k1);
/* 9 */             return c0744k1;
                }

                public final String toString() {
/* 18 */            return "[" + this.f5494a + "]";
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: a */
/* 12 */        public final AbstractC0739j mo2577a() {
/* 13 */            C0744k1 c0744k1 = new C0744k1();
/* 14 */            mo2578a(c0744k1);
                    return c0744k1;
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: b */
/* 19 */        public final boolean mo2579b(AbstractC0739j abstractC0739j) {
/* 20 */            return false;
                }
            }
