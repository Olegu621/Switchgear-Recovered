            package com.google.android.recaptcha.internal;

            import com.appsflyer.attribution.RequestError;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzwn extends zzsn implements zztt {
                private static final zzwn zzb;
                private static volatile zzua zzd;
                private int zze;
                private Object zzg;
                private int zzh;
                private int zzi;
                private long zzn;
                private zzrv zzo;
                private int zzp;
                private zzwa zzq;
                private zzwz zzr;
                private zzut zzt;
                private zzrv zzu;
                private int zzw;
                private int zzf = 0;
                private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzk = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzl = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzm = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzs = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzss zzv = zzsn.zzy();

                static {
/* 3 */             zzwn zzwnVar = new zzwn();
/* 6 */             zzb = zzwnVar;
/* 10 */            zzsn.zzI(zzwn.class, zzwnVar);
                }

                private zzwn() {
                }

                public static zzwn zzM(byte[] bArr) throws zzsx {
/* 7 */             return (zzwn) zzsn.zzx(zzb, bArr);
                }

                public static /* synthetic */ void zzP(zzwn zzwnVar, int i) {
/* 1 */             zzss zzssVar = zzwnVar.zzv;
/* 7 */             if (!zzssVar.zzc()) {
/* 13 */                zzwnVar.zzv = zzsn.zzz(zzssVar);
                    }
/* 18 */            zzwnVar.zzv.zzh(0);
                }

                public static /* synthetic */ void zzQ(zzwn zzwnVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzwnVar.zzj = str;
                }

                public static /* synthetic */ void zzS(zzwn zzwnVar, zzwa zzwaVar) {
/* 1 */             zzwnVar.zzq = zzwaVar;
/* 7 */             zzwnVar.zze |= 2;
                }

                public static /* synthetic */ void zzT(zzwn zzwnVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzwnVar.zzk = str;
                }

                public static /* synthetic */ void zzU(zzwn zzwnVar, zzwz zzwzVar) {
/* 1 */             zzwzVar.getClass();
/* 4 */             zzwnVar.zzr = zzwzVar;
/* 10 */            zzwnVar.zze |= 4;
                }

                public static /* synthetic */ void zzV(zzwn zzwnVar, int i) {
/* 5 */             zzwnVar.zze |= 32;
/* 7 */             zzwnVar.zzw = i;
                }

                public static /* synthetic */ void zzX(zzwn zzwnVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzwnVar.zzl = str;
                }

                public static zzwk zzj() {
/* 7 */             return (zzwk) zzb.zzq();
                }

                public static zzwn zzl() {
/* 1 */             return zzb;
                }

                public final String zzN() {
/* 1 */             return this.zzk;
                }

                public final String zzO() {
/* 1 */             return this.zzl;
                }

                public final boolean zzY() {
                    return (this.zze & 2) != 0;
                }

                public final boolean zzZ() {
                    return (this.zze & 32) != 0;
                }

                public final int zzaa() {
                    int i;
                    switch (this.zzh) {
                        case 0:
/* 170 */                   i = 2;
                            break;
                        case 1:
/* 168 */                   i = 3;
                            break;
                        case 2:
/* 166 */                   i = 4;
                            break;
                        case 3:
/* 164 */                   i = 5;
                            break;
                        case 4:
/* 162 */                   i = 6;
                            break;
                        case 5:
/* 160 */                   i = 7;
                            break;
                        case 6:
/* 157 */                   i = 8;
                            break;
                        case 7:
/* 154 */                   i = 9;
                            break;
                        case 8:
/* 151 */                   i = 10;
                            break;
                        case 9:
/* 148 */                   i = 11;
                            break;
                        case 10:
/* 145 */                   i = 12;
                            break;
                        case 11:
/* 142 */                   i = 13;
                            break;
                        case 12:
/* 139 */                   i = 14;
                            break;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 136 */                   i = 15;
                            break;
                        case 14:
/* 133 */                   i = 16;
                            break;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 130 */                   i = 17;
                            break;
                        case 16:
/* 127 */                   i = 18;
                            break;
                        case 17:
/* 124 */                   i = 19;
                            break;
                        case 18:
/* 121 */                   i = 20;
                            break;
                        case 19:
/* 118 */                   i = 21;
                            break;
                        case 20:
/* 115 */                   i = 22;
                            break;
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 112 */                   i = 23;
                            break;
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 109 */                   i = 24;
                            break;
                        case Build.API_LEVELS.API_23 /* 23 */:
/* 106 */                   i = 25;
                            break;
                        case 24:
/* 103 */                   i = 26;
                            break;
                        case Build.API_LEVELS.API_25 /* 25 */:
/* 100 */                   i = 27;
                            break;
                        case Build.API_LEVELS.API_26 /* 26 */:
/* 97 */                    i = 28;
                            break;
                        case Build.API_LEVELS.API_27 /* 27 */:
/* 93 */                    i = 29;
                            break;
                        case Build.API_LEVELS.API_28 /* 28 */:
/* 89 */                    i = 30;
                            break;
                        case Build.API_LEVELS.API_29 /* 29 */:
/* 85 */                    i = 31;
                            break;
                        case Build.API_LEVELS.API_30 /* 30 */:
/* 81 */                    i = 32;
                            break;
                        case Build.API_LEVELS.API_31 /* 31 */:
/* 77 */                    i = 33;
                            break;
                        case 32:
/* 73 */                    i = 34;
                            break;
                        case Build.API_LEVELS.API_33 /* 33 */:
/* 69 */                    i = 35;
                            break;
                        case Build.API_LEVELS.API_34 /* 34 */:
/* 65 */                    i = 36;
                            break;
                        case Build.API_LEVELS.API_35 /* 35 */:
/* 61 */                    i = 37;
                            break;
                        case Build.API_LEVELS.API_36 /* 36 */:
/* 57 */                    i = 38;
                            break;
                        case 37:
/* 53 */                    i = 39;
                            break;
                        case 38:
/* 49 */                    i = 40;
                            break;
                        case 39:
/* 45 */                    i = 41;
                            break;
                        case RequestError.NETWORK_FAILURE /* 40 */:
/* 41 */                    i = 42;
                            break;
                        case RequestError.NO_DEV_KEY /* 41 */:
/* 37 */                    i = 43;
                            break;
                        case 42:
/* 33 */                    i = 44;
                            break;
                        case 43:
/* 29 */                    i = 45;
                            break;
                        case 44:
/* 25 */                    i = 46;
                            break;
                        case 45:
/* 21 */                    i = 47;
                            break;
                        case 46:
/* 17 */                    i = 48;
                            break;
                        case 47:
/* 13 */                    i = 49;
                            break;
                        case 48:
/* 9 */                     i = 50;
                            break;
                        default:
/* 6 */                     i = 0;
                            break;
                    }
/* 171 */           if (i == 0) {
/* 173 */               return 1;
                    }
/* 174 */           return i;
                }

                public final int zzab() {
/* 1 */             int i = this.zzp;
/* 3 */             int i2 = 2;
/* 5 */             if (i != 0) {
/* 7 */                 if (i != 1) {
/* 13 */                    i2 = i != 2 ? 0 : 4;
                        } else {
/* 15 */                    i2 = 3;
                        }
                    }
/* 16 */            if (i2 == 0) {
/* 4 */                 return 1;
                    }
/* 19 */            return i2;
                }

                public final int zzf() {
/* 1 */             return this.zzw;
                }

                @Deprecated
                public final long zzg() {
/* 1 */             return this.zzn;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 119 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 113 */               return zzsn.zzF(zzb, "\u0000\u0011\u0001\u0001\u0001\u0013\u0011\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005\u0013\f", new Object[]{"zzg", "zzf", "zze", "zzh", "zzk", "zzn", "zzp", "zzq", "zzr", "zzs", "zzl", "zzm", "zzo", "zzt", "zzu", "zzj", zzvq.class, "zzv", "zzw", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzwn();
                    }
/* 12 */            zzwm zzwmVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzwk(zzwmVar);
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
                    synchronized (zzwn.class) {
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

                public final zzwa zzi() {
/* 1 */             zzwa zzwaVar = this.zzq;
                    return zzwaVar == null ? zzwa.zzj() : zzwaVar;
                }
            }
