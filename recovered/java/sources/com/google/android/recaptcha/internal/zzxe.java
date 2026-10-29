            package com.google.android.recaptcha.internal;

            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzxe extends zzsn implements zztt {
                private static final zzxe zzb;
                private static volatile zzua zzd;
                private zzsu zze = zzsn.zzB();

                static {
/* 3 */             zzxe zzxeVar = new zzxe();
/* 6 */             zzb = zzxeVar;
/* 10 */            zzsn.zzI(zzxe.class, zzxeVar);
                }

                private zzxe() {
                }

                public static zzxe zzg() {
/* 1 */             return zzb;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 81 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 75 */                return zzsn.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zze"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzxe();
                    }
/* 12 */            zzxh zzxhVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzxd(zzxhVar);
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
                    synchronized (zzxe.class) {
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

                public final List zzi() {
/* 1 */             return this.zze;
                }
            }
