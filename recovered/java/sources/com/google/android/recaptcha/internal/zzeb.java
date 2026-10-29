            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzeb extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzeh zzb;
                final /* synthetic */ String zzc;
                final /* synthetic */ zzdw zzd;
                final /* synthetic */ zzdq zze;
                final /* synthetic */ long zzf;
                final /* synthetic */ zzhh zzg;
                private /* synthetic */ Object zzh;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzeb(zzeh zzehVar, String str, zzdw zzdwVar, zzdq zzdqVar, long j, zzhh zzhhVar, c10 c10Var) {
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
/* 16 */            zzeb zzebVar = new zzeb(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, c10Var);
/* 19 */            zzebVar.zzh = obj;
/* 21 */            return zzebVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzeb) create((zzgr) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
                
                    if (r15 != r0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
                
                    if (r15 == r0) goto L33;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws zzcg {
                    zzgr zzgrVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 9 */             if (i != 0) {
/* 11 */                if (i == 1) {
/* 37 */                    zzgrVar = (zzgr) this.zzh;
/* 39 */                    pg3.m7417A(obj);
/* 81 */                    this.zzh = null;
/* 83 */                    this.zza = 2;
/* 89 */                    obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
                        } else {
/* 13 */                    if (i != 2) {
/* 15 */                        if (i != 3) {
/* 17 */                            pg3.m7417A(obj);
                                } else {
/* 24 */                            zzgrVar = (zzgr) this.zzh;
/* 26 */                            pg3.m7417A(obj);
/* 162 */                           this.zzh = null;
/* 165 */                           this.zza = 4;
/* 171 */                           obj = ((zzhg) obj).zza(zzgrVar.zza(), this);
                                }
/* 178 */                       return (zzeq) obj;
                            }
/* 31 */                    pg3.m7417A(obj);
                        }
/* 95 */                return (zzeq) obj;
                    }
/* 43 */            pg3.m7417A(obj);
/* 49 */            zzgrVar = (zzgr) this.zzh;
/* 51 */            zzeh zzehVar = this.zzb;
/* 1 */             zzeq zzeqVar = zzehVar.zzc;
/* 57 */            if (zzeqVar != null) {
/* 59 */                String str = this.zzc;
/* 61 */                this.zzh = zzgrVar;
/* 63 */                this.zza = 1;
/* 74 */                obj = new zzhf(45, new zzeg(zzeqVar, str, null), null);
/* 77 */                if (obj != z10Var) {
/* 81 */                    this.zzh = null;
/* 83 */                    this.zza = 2;
/* 89 */                    obj = ((zzhf) obj).zza(zzgrVar.zza(), this);
                        }
                    } else {
/* 98 */                zzdw zzgeVar = this.zzd;
/* 100 */               if (zzgeVar == null) {
/* 102 */                   String str2 = this.zzc;
/* 104 */                   zzdq zzdqVar = this.zze;
/* 108 */                   zzfp zzfpVar = new zzfp(str2);
/* 133 */                   zzgeVar = Intrinsics.m6216a(zzdqVar, zzdq.zza) ? new zzge(zzfpVar) : new zzgb(zzfpVar, new zzct());
                        }
/* 124 */               zzdw zzdwVar = zzgeVar;
/* 137 */               String str3 = this.zzc;
/* 139 */               long j = this.zzf;
/* 141 */               zzhh zzhhVar = this.zzg;
/* 143 */               this.zzh = zzgrVar;
/* 145 */               this.zza = 3;
/* 155 */               obj = new zzhg(new zzee(zzehVar, j, zzdwVar, str3, zzhhVar, null));
/* 158 */               if (obj != z10Var) {
/* 162 */                   this.zzh = null;
/* 165 */                   this.zza = 4;
/* 171 */                   obj = ((zzhg) obj).zza(zzgrVar.zza(), this);
                        }
                    }
/* 181 */           return z10Var;
                }
            }
