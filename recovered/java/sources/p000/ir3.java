            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ir3 extends eo3 {
                private static final ir3 zzg;
                private int zza;
                private km3 zze;
                private byte zzf = 2;

                static {
/* 3 */             ir3 ir3Var = new ir3();
/* 6 */             zzg = ir3Var;
/* 10 */            eo3.m3536f(ir3.class, ir3Var);
                }

                @Override // p000.eo3
                /* JADX INFO: renamed from: l */
                public final Object mo317l(int i, eo3 eo3Var) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 63 */                return Byte.valueOf(this.zzf);
                    }
/* 6 */             if (i2 == 2) {
/* 57 */                return new aq3(zzg, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zza", "zze"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new ir3();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new fm3(zzg);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zzg;
                    }
/* 22 */            this.zzf = eo3Var == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }
            }
