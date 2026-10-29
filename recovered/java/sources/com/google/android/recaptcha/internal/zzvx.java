            package com.google.android.recaptcha.internal;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzvx extends zzsn implements zztt {
                private static final zzvx zzb;
                private static volatile zzua zzd;
                private zzqm zze;
                private String zzf;
                private zzqm zzg;
                private String zzh;
                private String zzi;
                private zzqm zzj;
                private String zzk;
                private zzqm zzl;

                static {
/* 3 */             zzvx zzvxVar = new zzvx();
/* 6 */             zzb = zzvxVar;
/* 10 */            zzsn.zzI(zzvx.class, zzvxVar);
                }

                private zzvx() {
/* 4 */             zzqm zzqmVar = zzqm.zzb;
/* 6 */             this.zze = zzqmVar;
/* 10 */            this.zzf = HttpUrl.FRAGMENT_ENCODE_SET;
/* 12 */            this.zzg = zzqmVar;
/* 14 */            this.zzh = HttpUrl.FRAGMENT_ENCODE_SET;
/* 16 */            this.zzi = HttpUrl.FRAGMENT_ENCODE_SET;
/* 18 */            this.zzj = zzqmVar;
/* 20 */            this.zzk = HttpUrl.FRAGMENT_ENCODE_SET;
/* 22 */            this.zzl = zzqmVar;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 96 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 90 */                return zzsn.zzF(zzb, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006\n\u0007Ȉ\b\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzvx();
                    }
/* 12 */            zzvw zzvwVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzvv(zzvwVar);
                    }
/* 16 */            if (i2 == 5) {
/* 51 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 21 */            zzua zzuaVar = zzd;
/* 23 */            if (zzuaVar != null) {
/* 49 */                return zzuaVar;
                    }
                    synchronized (zzvx.class) {
                        try {
/* 28 */                    zzsiVar = zzd;
/* 30 */                    if (zzsiVar == null) {
/* 36 */                        zzsiVar = new zzsi(zzb);
/* 39 */                        zzd = zzsiVar;
                            }
                        } catch (Throwable th) {
/* 48 */                    throw th;
                        }
                    }
/* 46 */            return zzsiVar;
                }
            }
