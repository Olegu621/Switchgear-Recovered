            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzaw extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ zzhk zzc;
                final /* synthetic */ zzba zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzaw(zzhk zzhkVar, zzba zzbaVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzc = zzhkVar;
/* 3 */             this.zzd = zzbaVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzaw(this.zzc, this.zzd, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzaw) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
                    zzhk zzhkVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzb;
                    try {
/* 7 */                 if (i != 0) {
/* 9 */                     if (i != 1) {
/* 11 */                        pg3.m7417A(obj);
                            } else {
/* 17 */                        zzhkVar = (zzhk) this.zza;
/* 19 */                        pg3.m7417A(obj);
                            }
/* 70 */                    zzba zzbaVar = this.zzd;
/* 72 */                    zzyu zzyuVarZzf = zzyx.zzf();
/* 76 */                    zzyv zzyvVarZzf = zzyw.zzf();
/* 80 */                    zzyvVarZzf.zzw((String) obj);
/* 89 */                    zzyuVarZzf.zzf((zzyw) zzyvVarZzf.zzk());
/* 98 */                    return zzas.zzb(zzbaVar, (zzyx) zzyuVarZzf.zzk());
                        }
/* 23 */                pg3.m7417A(obj);
/* 26 */                zzhkVar = this.zzc;
/* 28 */                zzba zzbaVar2 = this.zzd;
/* 1 */                 zzbo zzboVar = zzbaVar2.zza;
/* 1 */                 String str = zzbaVar2.zzd;
/* 38 */                this.zza = zzhkVar;
/* 40 */                this.zzb = 1;
/* 49 */                obj = new zzhg(new zzbb(zzboVar, str, null));
/* 52 */                if (obj != z10Var) {
                        }
/* 103 */               return z10Var;
/* 56 */                this.zza = null;
/* 59 */                this.zzb = 2;
/* 61 */                obj = ((zzhg) obj).zza(zzhkVar, this);
/* 65 */                if (obj == z10Var) {
/* 103 */                   return z10Var;
                        }
/* 70 */                zzba zzbaVar3 = this.zzd;
/* 72 */                zzyu zzyuVarZzf2 = zzyx.zzf();
/* 76 */                zzyv zzyvVarZzf2 = zzyw.zzf();
/* 80 */                zzyvVarZzf2.zzw((String) obj);
/* 89 */                zzyuVarZzf2.zzf((zzyw) zzyvVarZzf2.zzk());
/* 98 */                return zzas.zzb(zzbaVar3, (zzyx) zzyuVarZzf2.zzk());
                    } catch (Exception e) {
/* 118 */               throw new zzcg(zzce.zzb, zzcd.zzaa, e.getMessage(), e);
                    }
                }
            }
