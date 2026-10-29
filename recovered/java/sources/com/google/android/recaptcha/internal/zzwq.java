            package com.google.android.recaptcha.internal;

            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzwq extends zzsn implements zztt {
                private static final zzwq zzb;
                private static volatile zzua zzd;
                private int zze;
                private zzsu zzf = zzsn.zzB();
                private zzsu zzg = zzsn.zzB();
                private zzvx zzh;

                static {
/* 3 */             zzwq zzwqVar = new zzwq();
/* 6 */             zzb = zzwqVar;
/* 10 */            zzsn.zzI(zzwq.class, zzwqVar);
                }

                private zzwq() {
                }

                public static /* synthetic */ void zzM(zzwq zzwqVar, zzwn zzwnVar) {
/* 1 */             zzwnVar.getClass();
/* 4 */             zzsu zzsuVar = zzwqVar.zzf;
/* 10 */            if (!zzsuVar.zzc()) {
/* 16 */                zzwqVar.zzf = zzsn.zzC(zzsuVar);
                    }
/* 20 */            zzwqVar.zzf.add(zzwnVar);
                }

                public static /* synthetic */ void zzN(zzwq zzwqVar, zzxc zzxcVar) {
/* 1 */             zzxcVar.getClass();
/* 4 */             zzsu zzsuVar = zzwqVar.zzg;
/* 10 */            if (!zzsuVar.zzc()) {
/* 16 */                zzwqVar.zzg = zzsn.zzC(zzsuVar);
                    }
/* 20 */            zzwqVar.zzg.add(zzxcVar);
                }

                public static zzwo zzi() {
/* 7 */             return (zzwo) zzb.zzq();
                }

                public static zzwq zzk(byte[] bArr) throws zzsx {
/* 7 */             return (zzwq) zzsn.zzx(zzb, bArr);
                }

                public final int zzf() {
/* 3 */             return this.zzf.size();
                }

                public final int zzg() {
/* 3 */             return this.zzg.size();
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 92 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 86 */                return zzsn.zzF(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zze", "zzf", zzwn.class, "zzg", zzxc.class, "zzh"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzwq();
                    }
/* 12 */            zzwp zzwpVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzwo(zzwpVar);
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
                    synchronized (zzwq.class) {
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

                public final List zzl() {
/* 1 */             return this.zzf;
                }
            }
