            package com.google.android.recaptcha.internal;

            import com.google.android.play.core.integrity.StandardIntegrityException;
            import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.C1869kx;
            import p000.InterfaceC1809jx;
            import p000.c10;
            import p000.h22;
            import p000.pg3;
            import p000.qj3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbe extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ zzbo zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbe(zzbo zzboVar, c10 c10Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.zzc = zzboVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             return new zzbe(this.zzc, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzbe) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v3 */
                /* JADX WARN: Type inference failed for: r1v6 */
                /* JADX WARN: Type inference failed for: r1v7 */
                /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.Object, kotlin.Unit] */
                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
                    zzcd zzcdVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             h22 h22Var = this.zzb;
                    try {
/* 5 */                 if (h22Var != 0) {
/* 10 */                    h22 h22Var2 = (h22) this.zza;
/* 12 */                    pg3.m7417A(obj);
                            h22Var = h22Var2;
                        } else {
/* 19 */                    pg3.m7417A(obj);
/* 24 */                    h22 h22Var3 = new h22();
/* 32 */                    zzbd zzbdVar = new zzbd(this.zzc, h22Var3, null);
/* 35 */                    this.zza = h22Var3;
/* 38 */                    this.zzb = 1;
                            h22Var = h22Var3;
/* 47 */                    if (qj3.m7884Q(60000L, zzbdVar, this) == z10Var) {
/* 49 */                        return z10Var;
                            }
                        }
/* 50 */                this = Unit.f12910a;
/* 52 */                return this;
                    } catch (Exception e) {
/* 53 */                zzbo zzboVar = this.zzc;
/* 55 */                InterfaceC1809jx interfaceC1809jxZzf = zzboVar.zzf();
/* 61 */                Throwable th = (Throwable) h22Var.f8873a;
/* 63 */                if (th == null) {
/* 65 */                    th = e;
                        }
/* 68 */                ((C1869kx) interfaceC1809jxZzf).m6289U(th);
/* 1 */                 zzboVar.zzc = zzbp.zza;
/* 78 */                zzce zzceVar = zzce.zzb;
/* 82 */                Throwable th2 = (Throwable) h22Var.f8873a;
/* 84 */                if (th2 == null) {
/* 86 */                    th2 = e;
                        }
/* 89 */                if (th2 instanceof StandardIntegrityException) {
/* 93 */                    int errorCode = ((StandardIntegrityException) th2).getErrorCode();
/* 99 */                    if (errorCode == -100) {
/* 169 */                       zzcdVar = zzcd.zzaV;
                            } else if (errorCode == -12) {
/* 166 */                       zzcdVar = zzcd.zzaO;
                            } else if (errorCode == -3) {
/* 163 */                       zzcdVar = zzcd.zzaI;
                            } else if (errorCode == -2) {
/* 160 */                       zzcdVar = zzcd.zzaH;
                            } else if (errorCode != -1) {
                                switch (errorCode) {
                                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
/* 154 */                               zzcdVar = zzcd.zzaU;
                                        break;
                                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
/* 151 */                               zzcdVar = zzcd.zzaT;
                                        break;
                                    case -17:
/* 148 */                               zzcdVar = zzcd.zzaS;
                                        break;
                                    case -16:
/* 145 */                               zzcdVar = zzcd.zzaR;
                                        break;
                                    case -15:
/* 142 */                               zzcdVar = zzcd.zzaQ;
                                        break;
                                    case -14:
/* 139 */                               zzcdVar = zzcd.zzaP;
                                        break;
                                    default:
                                        switch (errorCode) {
                                            case -9:
/* 136 */                                       zzcdVar = zzcd.zzaN;
                                                break;
                                            case -8:
/* 133 */                                       zzcdVar = zzcd.zzaM;
                                                break;
                                            case -7:
/* 130 */                                       zzcdVar = zzcd.zzaL;
                                                break;
                                            case -6:
/* 127 */                                       zzcdVar = zzcd.zzaK;
                                                break;
                                            case -5:
/* 124 */                                       zzcdVar = zzcd.zzaJ;
                                                break;
                                            default:
/* 120 */                                       zzcdVar = zzcd.zza;
                                                break;
                                        }
                                        break;
                                }
                            } else {
/* 157 */                       zzcdVar = zzcd.zzaG;
                            }
                        } else {
/* 172 */                   zzcdVar = zzcd.zza;
                        }
/* 186 */               throw new zzcg(zzceVar, zzcdVar, e.getMessage(), null, 8, null);
                    }
                }
            }
