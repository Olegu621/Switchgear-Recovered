            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzee extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzeh zzb;
                final /* synthetic */ long zzc;
                final /* synthetic */ zzdw zzd;
                final /* synthetic */ String zze;
                final /* synthetic */ zzhh zzf;
                private /* synthetic */ Object zzg;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzee(zzeh zzehVar, long j, zzdw zzdwVar, String str, zzhh zzhhVar, c10 c10Var) {
/* 12 */            super(2, c10Var);
/* 1 */             this.zzb = zzehVar;
/* 3 */             this.zzc = j;
/* 5 */             this.zzd = zzdwVar;
/* 7 */             this.zze = str;
/* 9 */             this.zzf = zzhhVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 14 */            zzee zzeeVar = new zzee(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, c10Var);
/* 17 */            zzeeVar.zzg = obj;
/* 19 */            return zzeeVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzee) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
                    zzhk zzhkVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
                    try {
/* 6 */                 if (i != 0) {
/* 8 */                     if (i != 1) {
/* 10 */                        pg3.m7417A(obj);
                            } else {
/* 16 */                        zzhkVar = (zzhk) this.zzg;
/* 18 */                        pg3.m7417A(obj);
                            }
/* 72 */                    zzeq zzeqVar = new zzeq(this.zzd, this.zze, this.zzf);
/* 1 */                     this.zzb.zzc = zzeqVar;
/* 80 */                    return zzeqVar;
                        }
/* 22 */                pg3.m7417A(obj);
/* 28 */                zzhkVar = (zzhk) this.zzg;
/* 30 */                zzeh zzehVar = this.zzb;
/* 32 */                long j = this.zzc;
/* 34 */                zzeh.zzf(zzehVar, j);
/* 37 */                zzdw zzdwVar = this.zzd;
/* 39 */                this.zzg = zzhkVar;
/* 41 */                this.zza = 1;
/* 43 */                obj = zzdwVar.zzb(j, this);
/* 47 */                if (obj != z10Var) {
                        }
/* 81 */                return z10Var;
/* 52 */                this.zzg = null;
/* 55 */                this.zza = 2;
/* 61 */                if (((zzhg) obj).zza(zzhkVar, this) == z10Var) {
/* 81 */                    return z10Var;
                        }
/* 72 */                zzeq zzeqVar2 = new zzeq(this.zzd, this.zze, this.zzf);
/* 1 */                 this.zzb.zzc = zzeqVar2;
/* 80 */                return zzeqVar2;
                    } catch (zzcg e) {
/* 104 */               throw e;
                    } catch (Exception e2) {
/* 101 */               throw new zzcg(zzce.zzb, zzcd.zza, e2.getMessage(), null, 8, null);
                    }
                }
            }
