            package com.google.android.recaptcha.internal;

            import com.appsflyer.attribution.RequestError;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.List;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzzu extends zzsn implements zztt {
                private static final zzzu zzb;
                private static volatile zzua zzd;
                private int zze;
                private int zzf;
                private zzsu zzg = zzsn.zzB();

                static {
/* 3 */             zzzu zzzuVar = new zzzu();
/* 6 */             zzb = zzzuVar;
/* 10 */            zzsn.zzI(zzzu.class, zzzuVar);
/* 13 */            zzra zzraVarZzg = zzra.zzg();
/* 17 */            zzvg zzvgVar = zzvg.zzi;
/* 28 */            zzsn.zzs(zzraVarZzg, HttpUrl.FRAGMENT_ENCODE_SET, null, null, 490775251, zzvgVar, String.class);
/* 44 */            zzsn.zzs(zzra.zzg(), HttpUrl.FRAGMENT_ENCODE_SET, null, null, 490775252, zzvgVar, String.class);
                }

                private zzzu() {
                }

                public final int zzf() {
/* 1 */             return this.zze;
                }

                public final int zzg() {
/* 1 */             return this.zzf;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return zzsn.zzF(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003\u001b", new Object[]{"zze", "zzf", "zzg", zzzt.class});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzzu();
                    }
/* 12 */            zzzv zzzvVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzzr(zzzvVar);
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
                    synchronized (zzzu.class) {
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

                public final List zzj() {
/* 1 */             return this.zzg;
                }

                public final int zzk() {
                    int i;
                    switch (this.zze) {
                        case 0:
/* 142 */                   i = 2;
                            break;
                        case 1:
/* 140 */                   i = 3;
                            break;
                        case 2:
/* 138 */                   i = 4;
                            break;
                        case 3:
/* 136 */                   i = 5;
                            break;
                        case 4:
/* 134 */                   i = 6;
                            break;
                        case 5:
/* 132 */                   i = 7;
                            break;
                        case 6:
/* 129 */                   i = 8;
                            break;
                        case 7:
/* 126 */                   i = 9;
                            break;
                        case 8:
/* 123 */                   i = 10;
                            break;
                        case 9:
/* 120 */                   i = 11;
                            break;
                        case 10:
/* 117 */                   i = 12;
                            break;
                        case 11:
/* 114 */                   i = 13;
                            break;
                        case 12:
/* 111 */                   i = 14;
                            break;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 108 */                   i = 15;
                            break;
                        case 14:
/* 105 */                   i = 16;
                            break;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 102 */                   i = 17;
                            break;
                        case 16:
/* 99 */                    i = 18;
                            break;
                        case 17:
/* 96 */                    i = 19;
                            break;
                        case 18:
/* 93 */                    i = 20;
                            break;
                        case 19:
/* 90 */                    i = 21;
                            break;
                        case 20:
/* 87 */                    i = 22;
                            break;
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 84 */                    i = 23;
                            break;
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 81 */                    i = 24;
                            break;
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 78 */                    i = 25;
                            break;
                        case 24:
/* 75 */                    i = 26;
                            break;
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 72 */                    i = 27;
                            break;
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 69 */                    i = 28;
                            break;
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 65 */                    i = 29;
                            break;
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 61 */                    i = 30;
                            break;
                        case Build.API_LEVELS.API_29 /* 29 */:
/* 57 */                    i = 31;
                            break;
                        case Build.API_LEVELS.API_30 /* 30 */:
/* 53 */                    i = 32;
                            break;
                        case Build.API_LEVELS.API_31 /* 31 */:
/* 49 */                    i = 33;
                            break;
                        case 32:
/* 45 */                    i = 34;
                            break;
                        case Build.API_LEVELS.API_33 /* 33 */:
/* 41 */                    i = 35;
                            break;
                        case Build.API_LEVELS.API_34 /* 34 */:
/* 37 */                    i = 36;
                            break;
                        case Build.API_LEVELS.API_35 /* 35 */:
/* 33 */                    i = 37;
                            break;
                        case Build.API_LEVELS.API_36 /* 36 */:
/* 29 */                    i = 38;
                            break;
                        case 37:
/* 25 */                    i = 39;
                            break;
                        case 38:
/* 21 */                    i = 40;
                            break;
                        case 39:
/* 17 */                    i = 41;
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
/* 13 */                    i = 42;
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
/* 9 */                     i = 43;
                            break;
                        default:
/* 6 */                     i = 0;
                            break;
                    }
/* 143 */           if (i == 0) {
/* 145 */               return 1;
                    }
/* 146 */           return i;
                }
            }
