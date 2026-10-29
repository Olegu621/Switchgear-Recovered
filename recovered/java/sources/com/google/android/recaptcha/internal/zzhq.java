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
            final class zzhq extends tj2 implements Function2 {
                final /* synthetic */ zzht zza;
                final /* synthetic */ String zzb;
                final /* synthetic */ zzzd zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzhq(zzht zzhtVar, String str, zzzd zzzdVar, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zza = zzhtVar;
/* 3 */             this.zzb = str;
/* 5 */             this.zzc = zzzdVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 9 */             return new zzhq(this.zza, this.zzb, this.zzc, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzhq) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
                    try {
/* 6 */                 zzht zzhtVar = this.zza;
/* 8 */                 zzig zzigVarZzb = zzht.zzb(zzhtVar);
/* 12 */                String str = this.zzb;
/* 18 */                if (zzigVarZzb.zzb(str)) {
/* 26 */                    return zzht.zza(zzhtVar).zza(str, this.zzc);
                        }
/* 45 */                throw new zzcg(zzce.zzc, zzcd.zzQ, null, null, 12, null);
                    } catch (zzcg e) {
/* 68 */                throw e;
                    } catch (Exception e2) {
/* 65 */                throw new zzcg(zzce.zzb, zzcd.zzaz, e2.getMessage(), null, 8, null);
                    }
                }
            }
