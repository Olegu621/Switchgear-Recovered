            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class aq3 {

                /* JADX INFO: renamed from: a */
                public final tm3 f2059a;

                /* JADX INFO: renamed from: b */
                public final String f2060b;

                /* JADX INFO: renamed from: c */
                public final Object[] f2061c;

                /* JADX INFO: renamed from: d */
                public final int f2062d;

                public aq3(tm3 tm3Var, String str, Object[] objArr) {
/* 4 */             this.f2059a = tm3Var;
/* 6 */             this.f2060b = str;
/* 8 */             this.f2061c = objArr;
/* 11 */            char cCharAt = str.charAt(0);
/* 18 */            if (cCharAt < 55296) {
/* 20 */                this.f2062d = cCharAt;
/* 22 */                return;
                    }
/* 23 */            int i = cCharAt & 8191;
/* 25 */            int i2 = 1;
/* 26 */            int i3 = 13;
                    while (true) {
/* 28 */                int i4 = i2 + 1;
/* 30 */                char cCharAt2 = str.charAt(i2);
/* 34 */                if (cCharAt2 < 55296) {
/* 47 */                    this.f2062d = i | (cCharAt2 << i3);
/* 49 */                    return;
                        } else {
/* 39 */                    i |= (cCharAt2 & 8191) << i3;
/* 40 */                    i3 += 13;
/* 42 */                    i2 = i4;
                        }
                    }
                }
            }
