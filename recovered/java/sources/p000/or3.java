            package p000;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class or3 extends eo3 {
                private static final or3 zzh;
                private int zza;
                private Object zzf;
                private int zze = 0;
                private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             or3 or3Var = new or3();
/* 6 */             zzh = or3Var;
/* 10 */            eo3.m3536f(or3.class, or3Var);
                }

                @Override // p000.eo3
                /* JADX INFO: renamed from: l */
                public final Object mo317l(int i, eo3 eo3Var) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 61 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 56 */                return new aq3(zzh, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u00017\u0000\u0002?\u0000\u0003ဈ\u0000", new Object[]{"zzf", "zze", "zza", qm3.f15661e, "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new or3();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new fm3(zzh);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzh;
                }
            }
