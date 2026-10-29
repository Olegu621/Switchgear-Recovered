            package com.google.android.recaptcha.internal;

            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzyo extends zzsn implements zztt {
                private static final zzyo zzb;
                private static volatile zzua zzd;
                private int zze;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzsu zzg = zzsn.zzB();

                static {
/* 3 */             zzyo zzyoVar = new zzyo();
/* 6 */             zzb = zzyoVar;
/* 10 */            zzsn.zzI(zzyo.class, zzyoVar);
                }

                private zzyo() {
                }

                public static zzyn zzf() {
/* 7 */             return (zzyn) zzb.zzq();
                }

                public static /* synthetic */ void zzi(zzyo zzyoVar, Iterable iterable) {
/* 1 */             zzyoVar.zzl();
/* 6 */             zzpw.zzc(iterable, zzyoVar.zzg);
                }

                public static /* synthetic */ void zzj(zzyo zzyoVar, zzym zzymVar) {
/* 1 */             zzymVar.getClass();
/* 4 */             zzyoVar.zzl();
/* 9 */             zzyoVar.zzg.add(zzymVar);
                }

                public static /* synthetic */ void zzk(zzyo zzyoVar, String str) {
/* 1 */             str.getClass();
/* 8 */             zzyoVar.zze |= 1;
/* 10 */            zzyoVar.zzf = str;
                }

                private final void zzl() {
/* 1 */             zzsu zzsuVar = this.zzg;
/* 7 */             if (zzsuVar.zzc()) {
/* 15 */                return;
                    }
/* 13 */            this.zzg = zzsn.zzC(zzsuVar);
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return zzsn.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zze", "zzg", zzym.class, "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzyo();
                    }
/* 12 */            zzyp zzypVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzyn(zzypVar);
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
                    synchronized (zzyo.class) {
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
