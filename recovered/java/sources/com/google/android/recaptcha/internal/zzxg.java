            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzxg extends zzsn implements zztt {
                private static final zzxg zzb;
                private static volatile zzua zzd;
                private int zze;
                private zzxe zzf;
                private zzxe zzg;

                static {
/* 3 */             zzxg zzxgVar = new zzxg();
/* 6 */             zzb = zzxgVar;
/* 10 */            zzsn.zzI(zzxg.class, zzxgVar);
                }

                private zzxg() {
                }

                public static zzxg zzj(byte[] bArr) throws zzsx {
/* 7 */             return (zzxg) zzsn.zzx(zzb, bArr);
                }

                public final zzxe zzf() {
/* 1 */             zzxe zzxeVar = this.zzf;
                    return zzxeVar == null ? zzxe.zzg() : zzxeVar;
                }

                public final zzxe zzg() {
/* 1 */             zzxe zzxeVar = this.zzg;
                    return zzxeVar == null ? zzxe.zzg() : zzxeVar;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 85 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 79 */                return zzsn.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzxg();
                    }
/* 12 */            zzxh zzxhVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzxf(zzxhVar);
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
                    synchronized (zzxg.class) {
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
