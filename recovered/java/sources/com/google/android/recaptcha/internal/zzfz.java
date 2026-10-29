            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.C1869kx;
            import p000.InterfaceC1809jx;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfz extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzgb zzb;
                final /* synthetic */ InterfaceC1809jx zzc;
                final /* synthetic */ zzhk zzd;
                final /* synthetic */ long zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzfz(zzgb zzgbVar, InterfaceC1809jx interfaceC1809jx, zzhk zzhkVar, long j, c10 c10Var) {
/* 10 */            super(2, c10Var);
/* 1 */             this.zzb = zzgbVar;
/* 3 */             this.zzc = interfaceC1809jx;
/* 5 */             this.zzd = zzhkVar;
/* 7 */             this.zze = j;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 12 */            return new zzfz(this.zzb, this.zzc, this.zzd, this.zze, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzfz) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws Exception {
                    zzcg zzcgVar;
                    zzfz zzfzVar;
                    zzcg e;
/* 1 */             z10 z10Var = z10.f19902a;
/* 5 */             if (this.zza != 0) {
                        try {
/* 7 */                     pg3.m7417A(obj);
/* 10 */                    zzfzVar = this;
                        } catch (zzcg e2) {
/* 13 */                    zzcgVar = e2;
/* 14 */                    zzfzVar = this;
/* 1 */                     zzfzVar.zzb.zzf = zzdv.zzd;
/* 83 */                    ((C1869kx) zzfzVar.zzc).m6289U(zzcgVar);
                        }
                    } else {
/* 16 */                pg3.m7417A(obj);
                        try {
/* 19 */                    zzcx zzcxVar = zzcx.zza;
/* 23 */                    zzgb zzgbVar = this.zzb;
/* 25 */                    zzfw zzfwVar = new zzfw(zzgbVar);
/* 37 */                    zzfy zzfyVar = new zzfy(this.zzd, zzgbVar, this.zze, this.zzc, null);
/* 41 */                    this.zza = 1;
/* 50 */                    zzfzVar = this;
                            try {
/* 51 */                        obj = zzcxVar.zzb(zzfwVar, 100L, 1000L, 2.0d, zzfyVar, zzfzVar);
/* 55 */                        if (obj == z10Var) {
/* 57 */                            return z10Var;
                                }
                            } catch (zzcg e3) {
/* 64 */                        e = e3;
/* 65 */                        zzcgVar = e;
/* 1 */                         zzfzVar.zzb.zzf = zzdv.zzd;
/* 83 */                        ((C1869kx) zzfzVar.zzc).m6289U(zzcgVar);
                            }
                        } catch (zzcg e4) {
/* 67 */                    e = e4;
/* 68 */                    zzfzVar = this;
/* 65 */                    zzcgVar = e;
/* 1 */                     zzfzVar.zzb.zzf = zzdv.zzd;
/* 83 */                    ((C1869kx) zzfzVar.zzc).m6289U(zzcgVar);
                        }
                    }
/* 60 */            ((Boolean) obj).getClass();
/* 86 */            return Unit.f12910a;
                }
            }
