            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class am3 extends bo3 {
                private static final am3 zzh;
                private int zze;
                private long zzf;
                private byte zzg = 2;

                static {
/* 3 */             am3 am3Var = new am3();
/* 6 */             zzh = am3Var;
/* 10 */            eo3.m3536f(am3.class, am3Var);
                }

                @Override // p000.eo3
                /* JADX INFO: renamed from: l */
                public final Object mo317l(int i, eo3 eo3Var) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 63 */                return Byte.valueOf(this.zzg);
                    }
/* 6 */             if (i2 == 2) {
/* 57 */                return new aq3(zzh, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new am3();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new dl3(zzh);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zzh;
                    }
/* 22 */            this.zzg = eo3Var == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }
            }
