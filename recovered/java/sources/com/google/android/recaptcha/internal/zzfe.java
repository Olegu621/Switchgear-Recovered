            package com.google.android.recaptcha.internal;

            import java.util.LinkedHashMap;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.C2122qw;
            import p000.c10;
            import p000.nc1;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfe extends tj2 implements Function2 {
                final /* synthetic */ zzyg zza;
                final /* synthetic */ zzfp zzb;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzfe(zzyg zzygVar, zzfp zzfpVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zza = zzygVar;
/* 3 */             this.zzb = zzfpVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzfe(this.zza, this.zzb, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzfe) create((zzgr) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
                    try {
/* 6 */                 zzyg zzygVar = this.zza;
/* 8 */                 List<zzyi> listZzk = zzygVar.zzk();
/* 18 */                int iM6962c = nc1.m6962c(C2122qw.m8020h(listZzk, 10));
/* 24 */                if (iM6962c < 16) {
/* 26 */                    iM6962c = 16;
                        }
/* 29 */                LinkedHashMap linkedHashMap = new LinkedHashMap(iM6962c);
/* 40 */                for (zzyi zzyiVar : listZzk) {
/* 56 */                    linkedHashMap.put(zzyiVar.zzg(), zzyiVar.zzi());
                        }
/* 60 */                zzfp zzfpVar = this.zzb;
/* 66 */                zzfp.zze(zzfpVar).zzb(linkedHashMap);
/* 73 */                zzfp.zzb(zzfpVar).zze(zzygVar);
/* 76 */                return Unit.f12910a;
                    } catch (zzcg e) {
/* 101 */               throw e;
                    } catch (Exception e2) {
/* 98 */                throw new zzcg(zzce.zzb, zzcd.zzav, e2.getMessage(), null, 8, null);
                    }
                }
            }
