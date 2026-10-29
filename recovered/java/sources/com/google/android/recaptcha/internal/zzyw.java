            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzyw extends zzsn implements zztt {
                private static final zzyw zzb;
                private static volatile zzua zzd;
                private int zze = 0;
                private Object zzf;

                static {
/* 3 */             zzyw zzywVar = new zzyw();
/* 6 */             zzb = zzywVar;
/* 10 */            zzsn.zzI(zzyw.class, zzywVar);
                }

                private zzyw() {
                }

                public static /* synthetic */ void zzM(zzyw zzywVar, float f) {
/* 3 */             zzywVar.zze = 9;
/* 9 */             zzywVar.zzf = Float.valueOf(f);
                }

                public static /* synthetic */ void zzN(zzyw zzywVar, int i) {
/* 2 */             zzywVar.zze = 4;
/* 8 */             zzywVar.zzf = Integer.valueOf(i);
                }

                public static /* synthetic */ void zzO(zzyw zzywVar, int i) {
/* 2 */             zzywVar.zze = 5;
/* 8 */             zzywVar.zzf = Integer.valueOf(i);
                }

                public static /* synthetic */ void zzP(zzyw zzywVar, long j) {
/* 2 */             zzywVar.zze = 7;
/* 8 */             zzywVar.zzf = Long.valueOf(j);
                }

                public static /* synthetic */ void zzQ(zzyw zzywVar, String str) {
/* 1 */             str.getClass();
/* 6 */             zzywVar.zze = 11;
/* 8 */             zzywVar.zzf = str;
                }

                public static zzyv zzf() {
/* 7 */             return (zzyv) zzb.zzq();
                }

                public static /* synthetic */ void zzi(zzyw zzywVar, boolean z) {
/* 2 */             zzywVar.zze = 1;
/* 8 */             zzywVar.zzf = Boolean.valueOf(z);
                }

                public static /* synthetic */ void zzj(zzyw zzywVar, zzqm zzqmVar) {
/* 2 */             zzywVar.zze = 2;
/* 4 */             zzywVar.zzf = zzqmVar;
                }

                public static /* synthetic */ void zzk(zzyw zzywVar, String str) {
/* 1 */             str.getClass();
/* 5 */             zzywVar.zze = 3;
/* 7 */             zzywVar.zzf = str;
                }

                public static /* synthetic */ void zzl(zzyw zzywVar, double d) {
/* 3 */             zzywVar.zze = 10;
/* 9 */             zzywVar.zzf = Double.valueOf(d);
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 83 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 77 */                return zzsn.zzF(zzb, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zzf", "zze"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzyw();
                    }
/* 12 */            zzyy zzyyVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzyv(zzyyVar);
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
                    synchronized (zzyw.class) {
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
