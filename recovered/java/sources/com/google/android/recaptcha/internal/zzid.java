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
            final class zzid extends tj2 implements Function2 {
                final /* synthetic */ zzif zza;
                final /* synthetic */ zzcy zzb;
                final /* synthetic */ zzye zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzid(zzif zzifVar, zzcy zzcyVar, zzye zzyeVar, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zza = zzifVar;
/* 3 */             this.zzb = zzcyVar;
/* 5 */             this.zzc = zzyeVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 9 */             return new zzid(this.zza, this.zzb, this.zzc, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzid) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 6 */             zzhl zzhlVarZza = null;
                    try {
                        try {
/* 19 */                    zzhlVarZza = zzif.zza(this.zza).zza(this.zzb.zzd());
/* 23 */                    zzhlVarZza.zzc();
/* 32 */                    zzhlVarZza.zze(this.zzc.zzd());
/* 43 */                    zzyg zzygVar = (zzyg) zzhlVarZza.zza(zzyg.zzi());
/* 45 */                    zzhlVarZza.zzd();
/* 48 */                    return zzygVar;
                        } catch (zzcg e) {
/* 73 */                    throw e;
                        } catch (Exception e2) {
/* 72 */                    throw new zzcg(zzce.zzc, zzcd.zzF, e2.getMessage(), null, 8, null);
                        }
                    } catch (Throwable th) {
/* 76 */                if (zzhlVarZza == null) {
/* 81 */                    throw th;
                        }
/* 78 */                zzhlVarZza.zzd();
/* 81 */                throw th;
                    }
                }
            }
