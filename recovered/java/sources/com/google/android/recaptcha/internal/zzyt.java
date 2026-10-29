            package com.google.android.recaptcha.internal;

            import com.appsflyer.attribution.RequestError;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzyt extends zzsn implements zztt {
                private static final zzyt zzb;
                private static volatile zzua zzd;
                private int zze;
                private int zzf;
                private int zzg;
                private int zzh;
                private int zzi;
                private zzyr zzj;
                private int zzk;
                private zzza zzl;

                static {
/* 3 */             zzyt zzytVar = new zzyt();
/* 6 */             zzb = zzytVar;
/* 10 */            zzsn.zzI(zzyt.class, zzytVar);
                }

                private zzyt() {
                }

                public static /* synthetic */ void zzM(zzyt zzytVar, int i) {
/* 2 */             if (i != 1) {
/* 6 */                 zzytVar.zzh = i - 2;
                    } else {
/* 11 */                C1951n4.m6859j("Can't get the number of an unknown enum value.");
                    }
                }

                public static /* synthetic */ void zzN(zzyt zzytVar, int i) {
/* 2 */             if (i != 1) {
/* 6 */                 zzytVar.zzf = i - 2;
                    } else {
/* 11 */                C1951n4.m6859j("Can't get the number of an unknown enum value.");
                    }
                }

                public static zzys zzf() {
/* 7 */             return (zzys) zzb.zzq();
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 96 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 90 */                return zzsn.zzF(zzb, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f\u0004\f\u0005ဉ\u0000\u0006\u000b\u0007ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzyt();
                    }
/* 12 */            zzyy zzyyVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzys(zzyyVar);
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
                    synchronized (zzyt.class) {
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

                public final int zzk() {
                    int i;
                    switch (this.zzh) {
                        case 0:
/* 206 */                   i = 2;
                            break;
                        case 1:
/* 204 */                   i = 3;
                            break;
                        case 2:
/* 202 */                   i = 4;
                            break;
                        case 3:
/* 200 */                   i = 5;
                            break;
                        case 4:
/* 198 */                   i = 6;
                            break;
                        case 5:
/* 196 */                   i = 7;
                            break;
                        case 6:
/* 193 */                   i = 8;
                            break;
                        case 7:
/* 190 */                   i = 9;
                            break;
                        case 8:
/* 187 */                   i = 10;
                            break;
                        case 9:
/* 184 */                   i = 11;
                            break;
                        case 10:
/* 181 */                   i = 12;
                            break;
                        case 11:
/* 178 */                   i = 13;
                            break;
                        case 12:
/* 175 */                   i = 14;
                            break;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 172 */                   i = 15;
                            break;
                        case 14:
/* 169 */                   i = 16;
                            break;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 166 */                   i = 17;
                            break;
                        case 16:
/* 163 */                   i = 18;
                            break;
                        case 17:
/* 160 */                   i = 19;
                            break;
                        case 18:
/* 157 */                   i = 20;
                            break;
                        case 19:
/* 154 */                   i = 21;
                            break;
                        case 20:
/* 151 */                   i = 22;
                            break;
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 148 */                   i = 23;
                            break;
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 145 */                   i = 24;
                            break;
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 142 */                   i = 25;
                            break;
                        case 24:
/* 139 */                   i = 26;
                            break;
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 136 */                   i = 27;
                            break;
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 133 */                   i = 28;
                            break;
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 129 */                   i = 29;
                            break;
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 125 */                   i = 30;
                            break;
                        case Build.API_LEVELS.API_29 /* 29 */:
/* 121 */                   i = 31;
                            break;
                        case Build.API_LEVELS.API_30 /* 30 */:
/* 117 */                   i = 32;
                            break;
                        case Build.API_LEVELS.API_31 /* 31 */:
/* 113 */                   i = 33;
                            break;
                        case 32:
/* 109 */                   i = 34;
                            break;
                        case Build.API_LEVELS.API_33 /* 33 */:
/* 105 */                   i = 35;
                            break;
                        case Build.API_LEVELS.API_34 /* 34 */:
/* 101 */                   i = 36;
                            break;
                        case Build.API_LEVELS.API_35 /* 35 */:
/* 97 */                    i = 37;
                            break;
                        case Build.API_LEVELS.API_36 /* 36 */:
/* 93 */                    i = 38;
                            break;
                        case 37:
/* 89 */                    i = 39;
                            break;
                        case 38:
/* 85 */                    i = 40;
                            break;
                        case 39:
/* 81 */                    i = 41;
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
/* 77 */                    i = 42;
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
/* 73 */                    i = 43;
                            break;
                        case 42:
/* 69 */                    i = 44;
                            break;
                        case 43:
/* 65 */                    i = 45;
                            break;
                        case 44:
/* 61 */                    i = 46;
                            break;
                        case 45:
/* 57 */                    i = 47;
                            break;
                        case 46:
/* 53 */                    i = 48;
                            break;
                        case 47:
/* 49 */                    i = 49;
                            break;
                        case 48:
/* 45 */                    i = 50;
                            break;
                        case 49:
/* 41 */                    i = 51;
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 37 */                    i = 52;
                            break;
                        case 51:
/* 33 */                    i = 53;
                            break;
                        case 52:
/* 29 */                    i = 54;
                            break;
                        case 53:
/* 25 */                    i = 55;
                            break;
                        case 54:
/* 21 */                    i = 56;
                            break;
                        case 55:
/* 17 */                    i = 57;
                            break;
                        case 56:
/* 13 */                    i = 58;
                            break;
                        case 57:
/* 9 */                     i = 59;
                            break;
                        default:
/* 6 */                     i = 0;
                            break;
                    }
/* 207 */           if (i == 0) {
/* 209 */               return 1;
                    }
/* 210 */           return i;
                }

                public final int zzl() {
                    int i;
                    switch (this.zzf) {
                        case 0:
/* 45 */                    i = 2;
                            break;
                        case 1:
/* 43 */                    i = 3;
                            break;
                        case 2:
/* 41 */                    i = 4;
                            break;
                        case 3:
/* 39 */                    i = 5;
                            break;
                        case 4:
/* 37 */                    i = 6;
                            break;
                        case 5:
/* 35 */                    i = 7;
                            break;
                        case 6:
/* 32 */                    i = 8;
                            break;
                        case 7:
/* 29 */                    i = 9;
                            break;
                        case 8:
/* 26 */                    i = 10;
                            break;
                        case 9:
/* 23 */                    i = 11;
                            break;
                        case 10:
/* 20 */                    i = 12;
                            break;
                        case 11:
/* 17 */                    i = 13;
                            break;
                        case 12:
/* 14 */                    i = 14;
                            break;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 11 */                    i = 15;
                            break;
                        case 14:
/* 8 */                     i = 16;
                            break;
                        default:
/* 6 */                     i = 0;
                            break;
                    }
/* 46 */            if (i == 0) {
/* 48 */                return 1;
                    }
/* 49 */            return i;
                }
            }
