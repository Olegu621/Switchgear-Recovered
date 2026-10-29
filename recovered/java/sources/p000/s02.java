            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class s02 {

                /* JADX INFO: renamed from: a */
                public final AbstractC2313w f16371a;

                /* JADX INFO: renamed from: b */
                public final String f16372b;

                /* JADX INFO: renamed from: c */
                public final Object[] f16373c;

                /* JADX INFO: renamed from: d */
                public final int f16374d;

                public s02(AbstractC2313w abstractC2313w, String str, Object[] objArr) {
/* 4 */             this.f16371a = abstractC2313w;
/* 6 */             this.f16372b = str;
/* 8 */             this.f16373c = objArr;
/* 11 */            char cCharAt = str.charAt(0);
/* 18 */            if (cCharAt < 55296) {
/* 20 */                this.f16374d = cCharAt;
/* 22 */                return;
                    }
/* 23 */            int i = cCharAt & 8191;
/* 25 */            int i2 = 13;
/* 27 */            int i3 = 1;
                    while (true) {
/* 28 */                int i4 = i3 + 1;
/* 30 */                char cCharAt2 = str.charAt(i3);
/* 34 */                if (cCharAt2 < 55296) {
/* 47 */                    this.f16374d = i | (cCharAt2 << i2);
/* 49 */                    return;
                        } else {
/* 39 */                    i |= (cCharAt2 & 8191) << i2;
/* 40 */                    i2 += 13;
/* 42 */                    i3 = i4;
                        }
                    }
                }
            }
