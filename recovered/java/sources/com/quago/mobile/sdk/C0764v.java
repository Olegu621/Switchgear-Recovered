            package com.quago.mobile.sdk;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.v */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 27 */    public final class C0764v extends AbstractC0739j {

                /* JADX INFO: renamed from: b */
                public long f5647b;

                /* JADX INFO: renamed from: c */
                public int f5648c;

                /* JADX INFO: renamed from: d */
                public int f5649d;

                /* JADX INFO: renamed from: e */
                public int f5650e;

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: a */
                public final void mo2578a(AbstractC0739j abstractC0739j) {
/* 3 */             if (abstractC0739j instanceof C0764v) {
/* 6 */                 C0764v c0764v = (C0764v) abstractC0739j;
/* 10 */                c0764v.f5647b = this.f5647b;
/* 14 */                c0764v.f5648c = this.f5648c;
/* 18 */                c0764v.f5649d = this.f5649d;
/* 22 */                c0764v.f5650e = this.f5650e;
/* 26 */                c0764v.f5494a = this.f5494a;
                    }
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: b */
                public final Double[] mo2580b() {
/* 43 */            return new Double[]{Double.valueOf(Long.valueOf(this.f5494a).doubleValue()), Double.valueOf(Long.valueOf(this.f5647b).doubleValue()), Double.valueOf(Integer.valueOf(this.f5648c).doubleValue())};
                }

                public final Object clone() {
/* 3 */             C0764v c0764v = new C0764v();
/* 6 */             mo2578a(c0764v);
/* 9 */             return c0764v;
                }

                public final String toString() {
                    String str;
/* 1 */             int i = this.f5648c;
/* 4 */             if (i != 1) {
/* 12 */                str = i != 2 ? "?" : "↑";
                    } else {
/* 15 */                str = "↓";
                    }
/* 62 */            return "[" + str + ", " + this.f5494a + ", " + AbstractC0730g.m2574a(this.f5649d) + ", " + this.f5650e + "]";
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: a */
/* 28 */        public final AbstractC0739j mo2577a() {
/* 29 */            C0764v c0764v = new C0764v();
/* 30 */            mo2578a(c0764v);
                    return c0764v;
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: b */
/* 47 */        public final boolean mo2579b(AbstractC0739j abstractC0739j) {
/* 48 */            if (!(abstractC0739j instanceof C0764v)) {
                        return false;
                    }
/* 49 */            C0764v c0764v = (C0764v) abstractC0739j;
                    return this.f5648c == c0764v.f5648c && this.f5647b == c0764v.f5647b && this.f5649d == c0764v.f5649d && this.f5650e == c0764v.f5650e;
                }
            }
