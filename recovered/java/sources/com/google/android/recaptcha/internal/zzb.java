            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.m42;
            import p000.o42;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzb extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzg zzb;
                final /* synthetic */ String zzc;
                final /* synthetic */ long zzd;
                private /* synthetic */ Object zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzb(zzg zzgVar, String str, long j, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzb = zzgVar;
/* 3 */             this.zzc = str;
/* 5 */             this.zzd = j;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 10 */            zzb zzbVar = new zzb(this.zzb, this.zzc, this.zzd, c10Var);
/* 13 */            zzbVar.zze = obj;
/* 15 */            return zzbVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzb) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
                
                    if (r12 != r0) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
                
                    if (r12 == r0) goto L22;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    zzhk zzhkVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
                    try {
/* 8 */                 if (i != 0) {
/* 10 */                    if (i == 1) {
/* 24 */                        zzhkVar = (zzhk) this.zze;
/* 26 */                        pg3.m7417A(obj);
                            } else {
/* 12 */                        if (i != 2) {
/* 14 */                            pg3.m7417A(obj);
/* 101 */                           m42 m42Var = o42.f14612b;
/* 105 */                           return new o42(obj);
                                }
/* 18 */                        pg3.m7417A(obj);
                            }
/* 78 */                    obj = (zzxx) obj;
/* 80 */                    m42 m42Var2 = o42.f14612b;
/* 105 */                   return new o42(obj);
                        }
/* 30 */                pg3.m7417A(obj);
/* 36 */                zzhkVar = (zzhk) this.zze;
/* 38 */                zzg zzgVar = this.zzb;
/* 40 */                String str = this.zzc;
/* 42 */                long j = this.zzd;
/* 44 */                this.zze = zzhkVar;
/* 46 */                this.zza = 1;
/* 60 */                zzhf zzhfVar = new zzhf(zzgVar.zzj(), new zzf(j, zzgVar, str, null), null);
/* 63 */                if (zzhfVar != z10Var) {
/* 65 */                    obj = zzhfVar;
                        }
/* 100 */               return z10Var;
/* 68 */                this.zze = null;
/* 70 */                this.zza = 2;
/* 72 */                obj = ((zzhf) obj).zza(zzhkVar, this);
                    } catch (Exception unused) {
/* 83 */                m42 m42Var3 = o42.f14612b;
/* 85 */                zzg zzgVar2 = this.zzb;
/* 87 */                String str2 = this.zzc;
/* 89 */                this.zze = null;
/* 92 */                this.zza = 3;
/* 94 */                obj = zzgVar2.zza(str2, this);
                    }
                }
            }
