            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class t02 {

                /* JADX INFO: renamed from: a */
                public final AbstractC2350x f16888a;

                /* JADX INFO: renamed from: b */
                public final String f16889b;

                /* JADX INFO: renamed from: c */
                public final Object[] f16890c;

                /* JADX INFO: renamed from: d */
                public final int f16891d;

                public t02(tq0 tq0Var, String str, Object[] objArr) {
/* 4 */             this.f16888a = tq0Var;
/* 6 */             this.f16889b = str;
/* 8 */             this.f16890c = objArr;
/* 11 */            char cCharAt = str.charAt(0);
/* 18 */            if (cCharAt < 55296) {
/* 20 */                this.f16891d = cCharAt;
/* 22 */                return;
                    }
/* 23 */            int i = cCharAt & 8191;
/* 25 */            int i2 = 13;
/* 27 */            int i3 = 1;
                    while (true) {
/* 28 */                int i4 = i3 + 1;
/* 30 */                char cCharAt2 = str.charAt(i3);
/* 34 */                if (cCharAt2 < 55296) {
/* 47 */                    this.f16891d = i | (cCharAt2 << i2);
/* 49 */                    return;
                        } else {
/* 39 */                    i |= (cCharAt2 & 8191) << i2;
/* 40 */                    i2 += 13;
/* 42 */                    i3 = i4;
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public final int m8671a() {
/* 1 */             int i = this.f16891d;
/* 5 */             if ((i & 1) != 0) {
/* 7 */                 return 1;
                    }
                    return (i & 4) == 4 ? 3 : 2;
                }
            }
