            package p000;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cr3 extends eo3 {
                private static final cr3 zzi;
                private int zza;
                private int zzg;
                private byte zzh = 2;
                private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
                private int zzf = 1;

                static {
/* 3 */             cr3 cr3Var = new cr3();
/* 6 */             zzi = cr3Var;
/* 10 */            eo3.m3536f(cr3.class, cr3Var);
                }

                @Override // p000.eo3
                /* JADX INFO: renamed from: l */
                public final Object mo317l(int i, eo3 eo3Var) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 71 */                return Byte.valueOf(this.zzh);
                    }
/* 6 */             if (i2 == 2) {
/* 65 */                return new aq3(zzi, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔌ\u0001\u0003ᔌ\u0002", new Object[]{"zza", "zze", "zzf", qm3.f15660d, "zzg", qm3.f15659c});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new cr3();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new fm3(zzi);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zzi;
                    }
/* 22 */            this.zzh = eo3Var == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }
            }
