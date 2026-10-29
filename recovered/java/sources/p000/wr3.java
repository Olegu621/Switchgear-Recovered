            package p000;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class wr3 extends eo3 {
                private static final wr3 zzi;
                private int zza;
                private int zze;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private boolean zzg;
                private int zzh;

                static {
/* 3 */             wr3 wr3Var = new wr3();
/* 6 */             zzi = wr3Var;
/* 10 */            eo3.m3536f(wr3.class, wr3Var);
                }

                /* JADX INFO: renamed from: o */
                public static wr3 m9610o(byte[] bArr, on3 on3Var) {
/* 7 */             return (wr3) eo3.m3539i(zzi, bArr, on3Var);
                }

                /* JADX INFO: renamed from: p */
                public static wr3 m9611p() {
/* 1 */             return zzi;
                }

                @Override // p000.eo3
                /* JADX INFO: renamed from: l */
                public final Object mo317l(int i, eo3 eo3Var) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 63 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 58 */                return new aq3(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zza", "zze", qm3.f15662f, "zzf", "zzg", "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new wr3();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new fm3(zzi);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzi;
                }
            }
