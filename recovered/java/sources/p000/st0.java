            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum st0 implements bz0 {
                UNKNOWN_HASH(0),
                SHA1(1),
                SHA384(2),
                SHA256(3),
                SHA512(4),
                SHA224(5),
                UNRECOGNIZED(-1);


                /* JADX INFO: renamed from: a */
                public final int f16769a;

                st0(int i) {
/* 4 */             this.f16769a = i;
                }

                /* JADX INFO: renamed from: a */
                public final int m8632a() {
/* 3 */             if (this != UNRECOGNIZED) {
/* 5 */                 return this.f16769a;
                    }
/* 10 */            C1951n4.m6859j("Can't get the number of an unknown enum value.");
/* 13 */            return 0;
                }
            }
