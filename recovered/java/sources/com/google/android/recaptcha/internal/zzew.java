            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.h22;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzew extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ long zzc;
                final /* synthetic */ zzfp zzd;
                final /* synthetic */ zzgr zze;
                final /* synthetic */ zzye zzf;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzew(long j, zzfp zzfpVar, zzgr zzgrVar, zzye zzyeVar, c10 c10Var) {
/* 10 */            super(2, c10Var);
/* 1 */             this.zzc = j;
/* 3 */             this.zzd = zzfpVar;
/* 5 */             this.zze = zzgrVar;
/* 7 */             this.zzf = zzyeVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 12 */            return new zzew(this.zzc, this.zzd, this.zze, this.zzf, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzew) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:25:0x004e  */
                /* JADX WARN: Code duplicated, block: B:27:0x0055  */
                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
                    h22 h22Var;
                    h22 h22Var2;
                    Object objZzc;
                    zzcg zzcgVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 5 */             if (this.zzb != 0) {
/* 10 */                h22Var2 = (h22) this.zza;
                        try {
/* 12 */                    pg3.m7417A(obj);
/* 15 */                    objZzc = obj;
                        } catch (Exception e) {
/* 17 */                    e = e;
/* 75 */                    zzcgVar = (zzcg) h22Var2.f8873a;
/* 77 */                    if (zzcgVar == null) {
/* 85 */                        throw zzfp.zzd(this.zzd, e);
                            }
/* 86 */                    throw zzcgVar;
                        }
                    } else {
/* 19 */                pg3.m7417A(obj);
/* 24 */                h22 h22Var3 = new h22();
                        try {
/* 27 */                    long j = this.zzc;
/* 38 */                    zzev zzevVar = new zzev(this.zze, this.zzd, this.zzf, h22Var3, null);
/* 41 */                    h22Var = h22Var3;
                            try {
/* 42 */                        this.zza = h22Var;
/* 45 */                        this.zzb = 1;
/* 57 */                        objZzc = zzcx.zzc(j, 20, 100L, 1000L, 2.0d, zzevVar, this);
/* 61 */                        if (objZzc == z10Var) {
/* 67 */                            return z10Var;
                                }
/* 63 */                        h22Var2 = h22Var;
                            } catch (Exception e2) {
/* 68 */                        e = e2;
/* 72 */                        h22Var2 = h22Var;
/* 75 */                        zzcgVar = (zzcg) h22Var2.f8873a;
/* 77 */                        if (zzcgVar == null) {
/* 85 */                            throw zzfp.zzd(this.zzd, e);
                                }
/* 86 */                        throw zzcgVar;
                            }
                        } catch (Exception e3) {
/* 70 */                    e = e3;
/* 71 */                    h22Var = h22Var3;
                        }
                    }
/* 64 */            return (zzyg) objZzc;
                }
            }
