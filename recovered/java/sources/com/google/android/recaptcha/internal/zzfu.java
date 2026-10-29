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
            final class zzfu extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzgb zzb;
                final /* synthetic */ long zzc;
                private /* synthetic */ Object zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzfu(zzgb zzgbVar, long j, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzb = zzgbVar;
/* 3 */             this.zzc = j;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             zzfu zzfuVar = new zzfu(this.zzb, this.zzc, c10Var);
/* 10 */            zzfuVar.zzd = obj;
/* 12 */            return zzfuVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzfu) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:18:0x0054  */
                /* JADX WARN: Code duplicated, block: B:22:0x0064  */
                /* JADX WARN: Code duplicated, block: B:24:0x006a A[Catch: Exception -> 0x0011, TRY_ENTER, TryCatch #0 {Exception -> 0x0011, blocks: (B:6:0x000d, B:19:0x0055, B:24:0x006a, B:25:0x0078, B:16:0x0042), top: B:42:0x0007 }] */
                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
                    zzcg zzcgVar;
                    zzhk zzhkVar;
                    long jLongValue;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
                    try {
/* 8 */                 if (i == 0) {
/* 33 */                    pg3.m7417A(obj);
/* 39 */                    zzhkVar = (zzhk) this.zzd;
/* 41 */                    zzgb zzgbVar = this.zzb;
/* 43 */                    long j = this.zzc;
/* 45 */                    this.zzd = zzhkVar;
/* 47 */                    this.zza = 1;
/* 1 */                     obj = zzgbVar.zzq(j, this);
/* 53 */                    if (obj != z10Var) {
                            }
/* 189 */                   return z10Var;
                        }
/* 10 */                if (i == 1) {
/* 27 */                    zzhkVar = (zzhk) this.zzd;
/* 29 */                    pg3.m7417A(obj);
                        } else if (i != 2) {
/* 14 */                    pg3.m7417A(obj);
                        } else {
/* 21 */                    pg3.m7417A(obj);
/* 67 */                    zzgb zzgbVar2 = this.zzb;
/* 73 */                    zzft zzftVar = new zzft(this.zzc, zzgbVar2, null);
/* 77 */                    this.zza = 3;
/* 1 */                     obj = zzgbVar2.zzp(zzftVar, this);
/* 83 */                    if (obj == z10Var) {
/* 189 */                       return z10Var;
                            }
                        }
/* 94 */                jLongValue = this.zzc - ((Number) obj).longValue();
/* 99 */                if (jLongValue >= 500) {
/* 103 */                   return new Long(jLongValue);
                        }
/* 121 */               throw new zzcg(zzce.zzc, zzcd.zzas, null, null, 12, null);
/* 57 */                this.zzd = null;
/* 59 */                this.zza = 2;
/* 65 */                if (((zzhg) obj).zza(zzhkVar, this) != z10Var) {
/* 67 */                    zzgb zzgbVar3 = this.zzb;
/* 73 */                    zzft zzftVar2 = new zzft(this.zzc, zzgbVar3, null);
/* 77 */                    this.zza = 3;
/* 1 */                     obj = zzgbVar3.zzp(zzftVar2, this);
/* 83 */                    if (obj == z10Var) {
                            }
/* 94 */                    jLongValue = this.zzc - ((Number) obj).longValue();
/* 99 */                    if (jLongValue >= 500) {
/* 103 */                       return new Long(jLongValue);
                            }
/* 121 */                   throw new zzcg(zzce.zzc, zzcd.zzas, null, null, 12, null);
                        }
/* 189 */               return z10Var;
                    } catch (Exception e) {
/* 127 */               zzcg zzcgVar2 = e instanceof zzcg ? (zzcg) e : null;
/* 129 */               if (zzcgVar2 == null) {
/* 145 */                   zzcgVar2 = new zzcg(zzce.zzc, zzcd.zzas, e.getMessage(), null, 8, null);
                        }
/* 149 */               zzgb zzgbVar4 = this.zzb;
/* 163 */               if ((Intrinsics.m6216a(zzgbVar4.zze(), zzdv.zzd) || Intrinsics.m6216a(zzgbVar4.zze(), zzdv.zzc)) && (zzcgVar = zzgbVar4.zzd) != null) {
/* 188 */                   throw zzcgVar;
                        }
/* 188 */               throw zzcgVar2;
                    }
                }
            }
