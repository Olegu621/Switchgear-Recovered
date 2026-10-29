            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tr3 extends eo3 {
                private static final tr3 zzm;
                private int zza;
                private pr3 zzf;
                private nr3 zzg;
                private jr3 zzh;
                private hr3 zzi;
                private rr3 zzj;
                private ir3 zzk;
                private byte zzl = 2;
                private ro3 zze = zp3.f20290d;

                static {
/* 3 */             tr3 tr3Var = new tr3();
/* 6 */             zzm = tr3Var;
/* 10 */            eo3.m3536f(tr3.class, tr3Var);
                }

                /* JADX INFO: renamed from: o */
                public static tr3 m8882o(byte[] bArr, on3 on3Var) {
/* 7 */             return (tr3) eo3.m3539i(zzm, bArr, on3Var);
                }

                /* JADX INFO: renamed from: p */
                public static sr3 m8883p() {
/* 11 */            return (sr3) ((zn3) zzm.mo317l(5, null));
                }

                @Override // p000.eo3
                /* JADX INFO: renamed from: l */
                public final Object mo317l(int i, eo3 eo3Var) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 77 */                return Byte.valueOf(this.zzl);
                    }
/* 6 */             if (i2 == 2) {
/* 71 */                return new aq3(zzm, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0007\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"zza", "zze", tr3.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new tr3();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new sr3(zzm);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zzm;
                    }
/* 22 */            this.zzl = eo3Var == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }
            }
