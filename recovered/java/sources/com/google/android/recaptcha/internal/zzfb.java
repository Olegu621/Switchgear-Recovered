            package com.google.android.recaptcha.internal;

            import java.util.Iterator;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import kotlin.sequences.Sequence;
            import p000.c10;
            import p000.de3;
            import p000.h01;
            import p000.hu0;
            import p000.pg3;
            import p000.tj2;
            import p000.w92;
            import p000.xt0;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfb extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzfp zzb;
                final /* synthetic */ zzxn zzc;
                final /* synthetic */ long zzd;
                private /* synthetic */ Object zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzfb(zzfp zzfpVar, zzxn zzxnVar, long j, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzb = zzfpVar;
/* 3 */             this.zzc = zzxnVar;
/* 5 */             this.zzd = j;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 10 */            zzfb zzfbVar = new zzfb(this.zzb, this.zzc, this.zzd, c10Var);
/* 13 */            zzfbVar.zze = obj;
/* 15 */            return zzfbVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzfb) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
                
                    if (((com.google.android.recaptcha.internal.zzhf) r9).zza(r1, r8) == r0) goto L32;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws zzcg {
                    Sequence children;
                    zzhk zzhkVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
                    try {
/* 8 */                 if (i != 0) {
/* 10 */                    if (i == 1) {
/* 31 */                        zzhkVar = (zzhk) this.zze;
/* 33 */                        pg3.m7417A(obj);
                            } else {
/* 12 */                        if (i != 2) {
/* 22 */                            zzcg zzcgVar = (zzcg) this.zze;
/* 24 */                            pg3.m7417A(obj);
/* 175 */                           throw zzcgVar;
                                }
/* 14 */                        pg3.m7417A(obj);
                            }
/* 85 */                    return Unit.f12910a;
                        }
/* 37 */                pg3.m7417A(obj);
/* 43 */                zzhkVar = (zzhk) this.zze;
/* 45 */                zzfp zzfpVar = this.zzb;
/* 47 */                zzxn zzxnVar = this.zzc;
/* 1 */                 zzfp.zzv(zzxnVar.zzP());
/* 56 */                zzq zzqVarZzb = zzfp.zzb(zzfpVar);
/* 60 */                long j = this.zzd;
/* 62 */                this.zze = zzhkVar;
/* 64 */                this.zza = 1;
/* 66 */                obj = zzqVarZzb.zzc(j, zzxnVar, this);
/* 70 */                if (obj != z10Var) {
                        }
/* 173 */               return z10Var;
/* 74 */                this.zze = null;
/* 76 */                this.zza = 2;
                    } catch (zzcg e) {
/* 88 */                zzfp zzfpVar2 = this.zzb;
/* 108 */               h01 h01Var = (h01) zzfp.zzf(zzfpVar2).zzd().mo4406c().get(xt0.f19368w);
/* 110 */               if (h01Var != null && (children = h01Var.getChildren()) != null) {
/* 118 */                   Iterator it = children.iterator();
/* 126 */                   while (it.hasNext()) {
/* 134 */                       ((h01) it.next()).cancel(null);
                            }
                        }
/* 158 */               List listM9488b = w92.m9488b(hu0.m4335d0(zzfp.zzf(zzfpVar2).zzd().mo4406c()).getChildren());
/* 162 */               this.zze = e;
/* 165 */               this.zza = 3;
/* 171 */               if (de3.m3043y(listM9488b, this) != z10Var) {
/* 175 */                   throw e;
                        }
                    }
                }
            }
