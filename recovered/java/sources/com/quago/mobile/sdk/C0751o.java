            package com.quago.mobile.sdk;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.o */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 23 */    public final class C0751o extends AbstractC0739j {

                /* JADX INFO: renamed from: b */
                public float f5569b;

                /* JADX INFO: renamed from: c */
                public float f5570c;

                /* JADX INFO: renamed from: d */
                public float f5571d;

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: a */
                public final void mo2578a(AbstractC0739j abstractC0739j) {
/* 3 */             if (abstractC0739j instanceof C0751o) {
/* 6 */                 C0751o c0751o = (C0751o) abstractC0739j;
/* 10 */                c0751o.f5569b = this.f5569b;
/* 14 */                c0751o.f5570c = this.f5570c;
/* 18 */                c0751o.f5571d = this.f5571d;
/* 22 */                c0751o.f5494a = this.f5494a;
                    }
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: b */
                public final Double[] mo2580b() {
/* 57 */            return new Double[]{Double.valueOf(Long.valueOf(this.f5494a).doubleValue()), Double.valueOf(Float.valueOf(this.f5569b).doubleValue()), Double.valueOf(Float.valueOf(this.f5570c).doubleValue()), Double.valueOf(Float.valueOf(this.f5571d).doubleValue())};
                }

                public final Object clone() {
/* 3 */             C0751o c0751o = new C0751o();
/* 6 */             mo2578a(c0751o);
/* 9 */             return c0751o;
                }

                public final String toString() {
/* 44 */            return "[" + this.f5494a + ", " + this.f5569b + ", " + this.f5570c + ", " + this.f5571d + "]";
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: a */
/* 24 */        public final AbstractC0739j mo2577a() {
/* 25 */            C0751o c0751o = new C0751o();
/* 26 */            mo2578a(c0751o);
                    return c0751o;
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: b */
/* 61 */        public final boolean mo2579b(AbstractC0739j abstractC0739j) {
/* 62 */            if (!(abstractC0739j instanceof C0751o)) {
                        return false;
                    }
/* 63 */            C0751o c0751o = (C0751o) abstractC0739j;
                    return this.f5569b == c0751o.f5569b && this.f5570c == c0751o.f5570c && this.f5571d == c0751o.f5571d;
                }
            }
