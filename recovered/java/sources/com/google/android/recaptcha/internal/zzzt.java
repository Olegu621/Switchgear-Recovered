            package com.google.android.recaptcha.internal;

            import io.flutter.plugin.editing.FlutterTextUtils;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzzt extends zzsn implements zztt {
                private static final zzzt zzb;
                private static volatile zzua zzd;
                private int zze = 0;
                private Object zzf;

                static {
/* 3 */             zzzt zzztVar = new zzzt();
/* 6 */             zzb = zzztVar;
/* 10 */            zzsn.zzI(zzzt.class, zzztVar);
                }

                private zzzt() {
                }

                public final zzqm zzM() {
                    return this.zze == 3 ? (zzqm) this.zzf : zzqm.zzb;
                }

                public final String zzO() {
                    return this.zze == 4 ? (String) this.zzf : HttpUrl.FRAGMENT_ENCODE_SET;
                }

                public final String zzP() {
                    return this.zze == 12 ? (String) this.zzf : HttpUrl.FRAGMENT_ENCODE_SET;
                }

                public final boolean zzQ() {
/* 4 */             if (this.zze == 2) {
/* 10 */                return ((Boolean) this.zzf).booleanValue();
                    }
/* 15 */            return false;
                }

                public final boolean zzR() {
                    return this.zze == 1;
                }

                public final int zzS() {
                    switch (this.zze) {
                        case 0:
/* 46 */                    return 16;
                        case 1:
/* 44 */                    return 1;
                        case 2:
/* 42 */                    return 2;
                        case 3:
/* 40 */                    return 3;
                        case 4:
/* 38 */                    return 4;
                        case 5:
/* 36 */                    return 5;
                        case 6:
/* 34 */                    return 6;
                        case 7:
/* 32 */                    return 7;
                        case 8:
/* 29 */                    return 8;
                        case 9:
/* 26 */                    return 9;
                        case 10:
/* 23 */                    return 10;
                        case 11:
/* 20 */                    return 11;
                        case 12:
/* 17 */                    return 12;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 14 */                    return 13;
                        case 14:
/* 11 */                    return 14;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 8 */                     return 15;
                        default:
/* 6 */                     return 0;
                    }
                }

                public final double zzf() {
/* 5 */             if (this.zze == 11) {
/* 11 */                return ((Double) this.zzf).doubleValue();
                    }
/* 16 */            return 0.0d;
                }

                public final float zzg() {
/* 5 */             if (this.zze == 10) {
/* 11 */                return ((Float) this.zzf).floatValue();
                    }
/* 16 */            return 0.0f;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 83 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 77 */                return zzsn.zzF(zzb, "\u0000\u000f\u0001\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001>\u0000\u0002:\u0000\u0003=\u0000\u0004Ȼ\u0000\u0005B\u0000\u0006B\u0000\u0007>\u0000\bC\u0000\t6\u0000\n4\u0000\u000b3\u0000\fȻ\u0000\r:\u0000\u000e?\u0000\u000f?\u0000", new Object[]{"zzf", "zze"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzzt();
                    }
/* 12 */            zzzv zzzvVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzzs(zzzvVar);
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
                    synchronized (zzzt.class) {
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

                public final int zzi() {
/* 4 */             if (this.zze == 1) {
/* 10 */                return ((Integer) this.zzf).intValue();
                    }
/* 15 */            return 0;
                }

                public final int zzj() {
/* 4 */             if (this.zze == 5) {
/* 10 */                return ((Integer) this.zzf).intValue();
                    }
/* 15 */            return 0;
                }

                public final int zzk() {
/* 4 */             if (this.zze == 6) {
/* 10 */                return ((Integer) this.zzf).intValue();
                    }
/* 15 */            return 0;
                }

                public final long zzl() {
/* 5 */             if (this.zze == 8) {
/* 11 */                return ((Long) this.zzf).longValue();
                    }
/* 16 */            return 0L;
                }
            }
