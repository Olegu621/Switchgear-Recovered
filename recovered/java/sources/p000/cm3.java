            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cm3 extends bo3 {
                private static final cm3 zzf;
                private byte zze = 2;

                static {
/* 3 */             cm3 cm3Var = new cm3();
/* 6 */             zzf = cm3Var;
/* 10 */            eo3.m3536f(cm3.class, cm3Var);
                }

                /* JADX INFO: renamed from: o */
                public static cm3 m1729o(byte[] bArr, on3 on3Var) {
/* 7 */             return (cm3) eo3.m3539i(zzf, bArr, on3Var);
                }

                /* JADX INFO: renamed from: p */
                public static cm3 m1730p() {
/* 1 */             return zzf;
                }

                @Override // p000.eo3
                /* JADX INFO: renamed from: l */
                public final Object mo317l(int i, eo3 eo3Var) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 55 */                return Byte.valueOf(this.zze);
                    }
/* 7 */             if (i2 == 2) {
/* 49 */                return new aq3(zzf, "\u0001\u0000", null);
                    }
/* 10 */            if (i2 == 3) {
/* 39 */                return new cm3();
                    }
/* 13 */            if (i2 == 4) {
/* 33 */                return new dl3(zzf);
                    }
/* 16 */            if (i2 == 5) {
/* 26 */                return zzf;
                    }
/* 23 */            this.zze = eo3Var == null ? (byte) 0 : (byte) 1;
/* 6 */             return null;
                }
            }
