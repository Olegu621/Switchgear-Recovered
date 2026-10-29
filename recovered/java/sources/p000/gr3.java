            package p000;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gr3 extends eo3 {
                private static final gr3 zzg;
                private int zza;
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
                private int zzf;

                static {
/* 3 */             gr3 gr3Var = new gr3();
/* 6 */             zzg = gr3Var;
/* 10 */            eo3.m3536f(gr3.class, gr3Var);
                }

                @Override // p000.eo3
                /* JADX INFO: renamed from: l */
                public final Object mo317l(int i, eo3 eo3Var) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 59 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 54 */                return new aq3(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"zza", "zze", "zzf", qm3.f15658b});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new gr3();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new fm3(zzg);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzg;
                }
            }
