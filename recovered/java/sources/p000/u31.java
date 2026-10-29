            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum u31 implements bz0 {
                UNKNOWN_STATUS(0),
                ENABLED(1),
                DISABLED(2),
                DESTROYED(3),
                UNRECOGNIZED(-1);


                /* JADX INFO: renamed from: a */
                public final int f17347a;

                u31(int i) {
/* 4 */             this.f17347a = i;
                }

                /* JADX INFO: renamed from: a */
                public final int m8948a() {
/* 3 */             if (this != UNRECOGNIZED) {
/* 5 */                 return this.f17347a;
                    }
/* 10 */            C1951n4.m6859j("Can't get the number of an unknown enum value.");
/* 13 */            return 0;
                }
            }
