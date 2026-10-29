            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzzm extends zzsn implements zztt {
                private static final zzzm zzb;
                private static volatile zzua zzd;
                private int zze = 0;
                private Object zzf;

                static {
/* 3 */             zzzm zzzmVar = new zzzm();
/* 6 */             zzb = zzzmVar;
/* 10 */            zzsn.zzI(zzzm.class, zzzmVar);
                }

                private zzzm() {
                }

                public static /* synthetic */ void zzM(zzzm zzzmVar, zzxc zzxcVar) {
/* 1 */             zzxcVar.getClass();
/* 4 */             zzzmVar.zzf = zzxcVar;
/* 7 */             zzzmVar.zze = 2;
                }

                public static zzzl zzi() {
/* 7 */             return (zzzl) zzb.zzq();
                }

                public static zzzm zzk(byte[] bArr) throws zzsx {
/* 7 */             return (zzzm) zzsn.zzx(zzb, bArr);
                }

                public static /* synthetic */ void zzl(zzzm zzzmVar, zzwn zzwnVar) {
/* 1 */             zzwnVar.getClass();
/* 4 */             zzzmVar.zzf = zzwnVar;
/* 7 */             zzzmVar.zze = 1;
                }

                public final int zzN() {
/* 1 */             int i = this.zze;
/* 3 */             if (i == 0) {
/* 14 */                return 3;
                    }
/* 5 */             int i2 = 1;
/* 6 */             if (i != 1) {
/* 8 */                 i2 = 2;
/* 9 */                 if (i != 2) {
/* 11 */                    return 0;
                        }
                    }
/* 13 */            return i2;
                }

                public final zzwn zzf() {
                    return this.zze == 1 ? (zzwn) this.zzf : zzwn.zzl();
                }

                public final zzxc zzg() {
                    return this.zze == 2 ? (zzxc) this.zzf : zzxc.zzg();
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return zzsn.zzF(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzf", "zze", zzwn.class, zzxc.class});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzzm();
                    }
/* 12 */            zzzv zzzvVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzzl(zzzvVar);
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
                    synchronized (zzzm.class) {
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
