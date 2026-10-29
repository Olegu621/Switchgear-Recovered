            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzyx extends zzsn implements zztt {
                private static final zzyx zzb;
                private static volatile zzua zzd;
                private zzsu zze = zzsn.zzB();
                private int zzf;

                static {
/* 3 */             zzyx zzyxVar = new zzyx();
/* 6 */             zzb = zzyxVar;
/* 10 */            zzsn.zzI(zzyx.class, zzyxVar);
                }

                private zzyx() {
                }

                public static zzyu zzf() {
/* 7 */             return (zzyu) zzb.zzq();
                }

                public static /* synthetic */ void zzi(zzyx zzyxVar, Iterable iterable) {
/* 1 */             zzyxVar.zzl();
/* 6 */             zzpw.zzc(iterable, zzyxVar.zze);
                }

                public static /* synthetic */ void zzj(zzyx zzyxVar, zzyw zzywVar) {
/* 1 */             zzywVar.getClass();
/* 4 */             zzyxVar.zzl();
/* 9 */             zzyxVar.zze.add(zzywVar);
                }

                private final void zzl() {
/* 1 */             zzsu zzsuVar = this.zze;
/* 7 */             if (zzsuVar.zzc()) {
/* 15 */                return;
                    }
/* 13 */            this.zze = zzsn.zzC(zzsuVar);
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 85 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 79 */                return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zze", zzyw.class, "zzf"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzyx();
                    }
/* 12 */            zzyy zzyyVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzyu(zzyyVar);
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
                    synchronized (zzyx.class) {
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
