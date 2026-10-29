            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum wq1 implements bz0 {
                UNKNOWN_PREFIX(0),
                TINK(1),
                LEGACY(2),
                RAW(3),
                CRUNCHY(4),
                UNRECOGNIZED(-1);


                /* JADX INFO: renamed from: a */
                public final int f18747a;

                wq1(int i) {
/* 4 */             this.f18747a = i;
                }

                /* JADX INFO: renamed from: a */
                public static wq1 m9601a(int i) {
/* 1 */             if (i == 0) {
/* 29 */                return UNKNOWN_PREFIX;
                    }
/* 4 */             if (i == 1) {
/* 26 */                return TINK;
                    }
/* 7 */             if (i == 2) {
/* 23 */                return LEGACY;
                    }
/* 10 */            if (i == 3) {
/* 20 */                return RAW;
                    }
/* 13 */            if (i != 4) {
/* 15 */                return null;
                    }
/* 17 */            return CRUNCHY;
                }

                /* JADX INFO: renamed from: b */
                public final int m9602b() {
/* 3 */             if (this != UNRECOGNIZED) {
/* 5 */                 return this.f18747a;
                    }
/* 10 */            C1951n4.m6859j("Can't get the number of an unknown enum value.");
/* 13 */            return 0;
                }
            }
