            package p000;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class km3 extends eo3 {
                private static final km3 zzn;
                private int zza;
                private Object zzf;
                private int zzh;
                private int zzj;
                private nm3 zzk;
                private fl3 zzl;
                private int zze = 0;
                private byte zzm = 2;
                private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
                private cn3 zzi = cn3.f3019b;

                static {
/* 3 */             km3 km3Var = new km3();
/* 6 */             zzn = km3Var;
/* 10 */            eo3.m3536f(km3.class, km3Var);
                }

                @Override // p000.eo3
                /* JADX INFO: renamed from: l */
                public final Object mo317l(int i, eo3 eo3Var) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 77 */                return Byte.valueOf(this.zzm);
                    }
/* 6 */             if (i2 == 2) {
/* 71 */                return new aq3(zzn, "\u0001\b\u0001\u0001\u0002\f\b\u0000\u0000\u0001\u0002ဈ\u0000\u0003င\u0001\u00057\u0000\u00067\u0000\u0007ည\u0002\bင\u0003\tဉ\u0004\fᐉ\u0005", new Object[]{"zzf", "zze", "zza", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                    }
/* 9 */             if (i2 == 3) {
/* 39 */                return new km3();
                    }
/* 12 */            if (i2 == 4) {
/* 33 */                return new fm3(zzn);
                    }
/* 15 */            if (i2 == 5) {
/* 26 */                return zzn;
                    }
/* 22 */            this.zzm = eo3Var == null ? (byte) 0 : (byte) 1;
/* 24 */            return null;
                }
            }
