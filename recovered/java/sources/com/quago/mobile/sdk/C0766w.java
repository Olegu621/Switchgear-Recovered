            package com.quago.mobile.sdk;

            import android.os.SystemClock;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.w */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class C0766w extends AbstractC0739j {

                /* JADX INFO: renamed from: b */
                public int f5655b;

                public C0766w(EnumC0727f enumC0727f) {
/* 8 */             this.f5655b = m2660a(enumC0727f);
/* 14 */            this.f5494a = SystemClock.uptimeMillis();
                }

                /* JADX INFO: renamed from: a */
                public static int m2660a(EnumC0727f enumC0727f) {
                    switch (enumC0727f.ordinal()) {
                        case 17:
/* 14 */                    return 1;
                        case 18:
/* 12 */                    return 2;
                        case 19:
/* 10 */                    return 3;
                        default:
/* 8 */                     return 0;
                    }
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: b */
                public final Double[] mo2580b() {
/* 29 */            return new Double[]{Double.valueOf(Long.valueOf(this.f5494a).doubleValue()), Double.valueOf(Integer.valueOf(this.f5655b).doubleValue())};
                }

                public final Object clone() {
/* 3 */             C0766w c0766w = new C0766w();
/* 6 */             mo2578a(c0766w);
/* 9 */             return c0766w;
                }

                public final String toString() {
                    EnumC0727f enumC0727f;
/* 1 */             long j = this.f5494a;
/* 3 */             int i = this.f5655b;
/* 6 */             if (i == 1) {
/* 22 */                enumC0727f = EnumC0727f.ON_RESUME;
                    } else if (i != 2) {
/* 16 */                enumC0727f = i != 3 ? null : EnumC0727f.ON_STOP;
                    } else {
/* 19 */                enumC0727f = EnumC0727f.ON_PAUSE;
                    }
/* 47 */            return "[" + j + ", " + enumC0727f + "]";
                }

/* 16 */        public C0766w() {
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: a */
/* 16 */        public final AbstractC0739j mo2577a() {
/* 17 */            C0766w c0766w = new C0766w();
/* 18 */            mo2578a(c0766w);
                    return c0766w;
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: a */
/* 18 */        public final void mo2578a(AbstractC0739j abstractC0739j) {
/* 19 */            if (abstractC0739j instanceof C0766w) {
/* 20 */                C0766w c0766w = (C0766w) abstractC0739j;
/* 21 */                c0766w.f5655b = this.f5655b;
/* 22 */                c0766w.f5494a = this.f5494a;
                    }
                }

                @Override // com.quago.mobile.sdk.AbstractC0739j
                /* JADX INFO: renamed from: b */
/* 33 */        public final boolean mo2579b(AbstractC0739j abstractC0739j) {
                    return (abstractC0739j instanceof C0766w) && this.f5655b == ((C0766w) abstractC0739j).f5655b;
                }
            }
