            package com.quago.mobile.sdk;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.x */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 55 */    public final class C0768x extends AbstractC0739j {

                /* JADX INFO: renamed from: b */
                public long f5664b;

                /* JADX INFO: renamed from: c */
                public float f5665c;

                /* JADX INFO: renamed from: d */
                public float f5666d;

                /* JADX INFO: renamed from: e */
                public float f5667e;

                /* JADX INFO: renamed from: f */
                public float f5668f;

                /* JADX INFO: renamed from: g */
                public float f5669g;

                /* JADX INFO: renamed from: h */
                public int f5670h;

                /* JADX INFO: renamed from: i */
                public int f5671i;

                /* JADX INFO: renamed from: j */
                public int f5672j;

                /* JADX INFO: renamed from: k */
                public int f5673k;

                /* JADX INFO: renamed from: l */
                public int f5674l;

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: a */
                public final void mo2578a(AbstractC0739j abstractC0739j) {
/* 3 */             if (abstractC0739j instanceof C0768x) {
/* 6 */                 C0768x c0768x = (C0768x) abstractC0739j;
/* 10 */                c0768x.f5494a = this.f5494a;
/* 14 */                c0768x.f5664b = this.f5664b;
/* 18 */                c0768x.f5670h = this.f5670h;
/* 22 */                c0768x.f5665c = this.f5665c;
/* 26 */                c0768x.f5666d = this.f5666d;
/* 30 */                c0768x.f5667e = this.f5667e;
/* 34 */                c0768x.f5668f = this.f5668f;
/* 38 */                c0768x.f5669g = this.f5669g;
/* 42 */                c0768x.f5671i = this.f5671i;
/* 46 */                c0768x.f5672j = this.f5672j;
/* 50 */                c0768x.f5673k = this.f5673k;
/* 54 */                c0768x.f5674l = this.f5674l;
                    }
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: b */
                public final Double[] mo2580b() {
/* 127 */           return new Double[]{Double.valueOf(Long.valueOf(this.f5494a).doubleValue()), Double.valueOf(Long.valueOf(this.f5664b).doubleValue()), Double.valueOf(Integer.valueOf(this.f5670h).doubleValue()), Double.valueOf(Float.valueOf(this.f5665c).doubleValue()), Double.valueOf(Float.valueOf(this.f5666d).doubleValue()), Double.valueOf(Float.valueOf(this.f5667e).doubleValue()), Double.valueOf(Float.valueOf(this.f5668f).doubleValue()), Double.valueOf(Float.valueOf(this.f5669g).doubleValue()), Double.valueOf(Integer.valueOf(this.f5671i).doubleValue())};
                }

                public final Object clone() {
/* 3 */             C0768x c0768x = new C0768x();
/* 6 */             mo2578a(c0768x);
/* 9 */             return c0768x;
                }

                public final String toString() {
                    String str;
/* 1 */             long j = this.f5494a;
/* 3 */             long j2 = this.f5664b;
/* 19 */            int iOrdinal = ((EnumC0727f) EnumC0727f.f5430e.get(Integer.valueOf(this.f5670h))).ordinal();
/* 23 */            if (iOrdinal == 0) {
/* 52 */                str = "↓";
                    } else if (iOrdinal == 1) {
/* 49 */                str = "↘";
                    } else if (iOrdinal == 2) {
/* 46 */                str = "∞";
                    } else if (iOrdinal != 3) {
/* 40 */                str = iOrdinal != 4 ? "?" : "↑";
                    } else {
/* 43 */                str = "↗";
                    }
/* 155 */           return "[" + j + ", " + j2 + ", " + str + ", " + this.f5665c + ", " + this.f5666d + ", " + this.f5667e + ", " + this.f5668f + ", " + this.f5669g + ", " + this.f5671i + ", " + this.f5672j + ", " + this.f5673k + ", " + this.f5674l + "]";
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: a */
/* 56 */        public final AbstractC0739j mo2577a() {
/* 57 */            C0768x c0768x = new C0768x();
/* 58 */            mo2578a(c0768x);
                    return c0768x;
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: b */
/* 131 */       public final boolean mo2579b(AbstractC0739j abstractC0739j) {
/* 132 */           if (!(abstractC0739j instanceof C0768x)) {
                        return false;
                    }
/* 133 */           C0768x c0768x = (C0768x) abstractC0739j;
                    return this.f5670h == c0768x.f5670h && this.f5664b == c0768x.f5664b && this.f5665c == c0768x.f5665c && this.f5666d == c0768x.f5666d && this.f5667e == c0768x.f5667e && this.f5668f == c0768x.f5668f && this.f5669g == c0768x.f5669g && this.f5671i == c0768x.f5671i && this.f5672j == c0768x.f5672j && this.f5673k == c0768x.f5673k && this.f5674l == c0768x.f5674l;
                }
            }
