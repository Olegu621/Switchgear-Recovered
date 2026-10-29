            package com.google.android.recaptcha.internal;

            import com.google.android.recaptcha.RecaptchaException;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzec extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzeh zzb;
                final /* synthetic */ String zzc;
                final /* synthetic */ zzdw zzd;
                final /* synthetic */ zzdq zze;
                final /* synthetic */ long zzf;
                final /* synthetic */ zzhh zzg;
                private /* synthetic */ Object zzh;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzec(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j, zzhh zzhhVar, c10 c10Var) {
/* 14 */            super(2, c10Var);
/* 1 */             this.zzb = zzehVar;
/* 3 */             this.zzc = str;
/* 5 */             this.zzd = zzdwVar;
/* 7 */             this.zze = zzdqVar;
/* 9 */             this.zzf = j;
/* 11 */            this.zzg = zzhhVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 16 */            zzec zzecVar = new zzec(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, c10Var);
/* 19 */            zzecVar.zzh = obj;
/* 21 */            return zzecVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzec) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws RecaptchaException {
/* 1 */             z10 z10Var = z10.f19902a;
                    try {
/* 5 */                 if (this.zza != 0) {
/* 7 */                     pg3.m7417A(obj);
                        } else {
/* 11 */                    pg3.m7417A(obj);
/* 16 */                    zzhk zzhkVar = (zzhk) this.zzh;
/* 33 */                    zzeb zzebVar = new zzeb(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, null);
/* 37 */                    this.zza = 1;
/* 40 */                    obj = zzhj.zze(zzhkVar, 6, zzebVar, this);
/* 44 */                    if (obj == z10Var) {
/* 46 */                        return z10Var;
                            }
                        }
/* 47 */                return (zzeq) obj;
                    } catch (zzcg e) {
/* 80 */                throw e.zzc();
                    } catch (Exception e2) {
/* 73 */                throw new zzcg(zzce.zzb, zzcd.zza, e2.getMessage(), null, 8, null).zzc();
                    }
                }
            }
