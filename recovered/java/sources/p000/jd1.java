            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class jd1 extends id1 {
                /* JADX INFO: renamed from: a */
                public static int m5796a(float f) {
/* 5 */             if (!Float.isNaN(f)) {
/* 7 */                 return Math.round(f);
                    }
/* 14 */            C1951n4.m6859j("Cannot round NaN value.");
/* 17 */            return 0;
                }

                /* JADX INFO: renamed from: b */
                public static long m5797b(double d) {
/* 5 */             if (!Double.isNaN(d)) {
/* 7 */                 return Math.round(d);
                    }
/* 14 */            C1951n4.m6859j("Cannot round NaN value.");
/* 17 */            return 0L;
                }
            }
