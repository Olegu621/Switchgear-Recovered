            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzzh extends zzsn implements zztt {
                private static final zzzh zzb;
                private static volatile zzua zzd;
                private int zze;

                static {
/* 3 */             zzzh zzzhVar = new zzzh();
/* 6 */             zzb = zzzhVar;
/* 10 */            zzsn.zzI(zzzh.class, zzzhVar);
                }

                private zzzh() {
                }

                public static zzzh zzg(byte[] bArr) throws zzsx {
/* 7 */             return (zzzh) zzsn.zzx(zzb, bArr);
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 81 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 75 */                return zzsn.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zze"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzzh();
                    }
/* 12 */            zzzv zzzvVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzzg(zzzvVar);
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
                    synchronized (zzzh.class) {
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

                public final zzzk zzi() {
/* 3 */             zzzk zzzkVarZzb = zzzk.zzb(this.zze);
                    return zzzkVarZzb == null ? zzzk.UNRECOGNIZED : zzzkVarZzb;
                }
            }
