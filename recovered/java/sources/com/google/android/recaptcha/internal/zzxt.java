            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzxt extends zzsn implements zztt {
                private static final zzxt zzb;
                private static volatile zzua zzd;
                private zzqm zze;
                private zzqm zzf;

                static {
/* 3 */             zzxt zzxtVar = new zzxt();
/* 6 */             zzb = zzxtVar;
/* 10 */            zzsn.zzI(zzxt.class, zzxtVar);
                }

                private zzxt() {
/* 4 */             zzqm zzqmVar = zzqm.zzb;
/* 6 */             this.zze = zzqmVar;
/* 8 */             this.zzf = zzqmVar;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 83 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 77 */                return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"zze", "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzxt();
                    }
/* 12 */            zzyc zzycVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzxs(zzycVar);
                    }
/* 16 */            if (i2 == 5) {
/* 50 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 21 */            zzua zzuaVar = zzd;
/* 23 */            if (zzuaVar != null) {
/* 48 */                return zzuaVar;
                    }
                    synchronized (zzxt.class) {
                        try {
/* 28 */                    zzsiVar = zzd;
/* 30 */                    if (zzsiVar == null) {
/* 36 */                        zzsiVar = new zzsi(zzb);
/* 39 */                        zzd = zzsiVar;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return zzsiVar;
                }
            }
