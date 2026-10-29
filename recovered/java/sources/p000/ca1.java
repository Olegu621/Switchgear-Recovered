            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum ca1 implements wy1 {
                REASON_UNKNOWN(0),
                MESSAGE_TOO_OLD(1),
                CACHE_FULL(2),
                PAYLOAD_TOO_BIG(3),
                MAX_RETRIES_REACHED(4),
                INVALID_PAYLOD(5),
                SERVER_ERROR(6);


                /* JADX INFO: renamed from: a */
                public final int f2797a;

                ca1(int i) {
/* 4 */             this.f2797a = i;
                }

                @Override // p000.wy1
                /* JADX INFO: renamed from: a */
                public final int mo1560a() {
/* 1 */             return this.f2797a;
                }
            }
