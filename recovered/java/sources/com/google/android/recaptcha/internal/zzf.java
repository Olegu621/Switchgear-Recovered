            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.o42;
            import p000.pg3;
            import p000.qj3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzf extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ long zzb;
                final /* synthetic */ zzg zzc;
                final /* synthetic */ String zzd;
                private /* synthetic */ Object zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzf(long j, zzg zzgVar, String str, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzb = j;
/* 3 */             this.zzc = zzgVar;
/* 5 */             this.zzd = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 10 */            zzf zzfVar = new zzf(this.zzb, this.zzc, this.zzd, c10Var);
/* 13 */            zzfVar.zze = obj;
/* 15 */            return zzfVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzf) create((zzgr) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
                
                    if (r15 != r1) goto L13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
                
                    return r1;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
                    try {
/* 6 */                 if (i == 0) {
/* 26 */                    pg3.m7417A(obj);
/* 31 */                    zzgr zzgrVar = (zzgr) this.zze;
/* 33 */                    long j = this.zzb;
/* 42 */                    zze zzeVar = new zze(zzgrVar, this.zzc, this.zzd, null);
/* 45 */                    this.zza = 1;
/* 47 */                    obj = qj3.m7884Q(j, zzeVar, this);
                        } else {
/* 8 */                     if (i != 1) {
/* 20 */                        zzcg zzcgVar = (zzcg) this.zze;
/* 22 */                        pg3.m7417A(obj);
/* 104 */                       throw zzcgVar;
                            }
/* 10 */                    pg3.m7417A(obj);
                        }
/* 55 */                Object obj2 = ((o42) obj).f14613a;
/* 57 */                pg3.m7417A(obj2);
/* 60 */                return (zzxx) obj2;
                    } catch (Exception e) {
/* 80 */                zzcg zzcgVarZza = zzh.zza(e, new zzcg(zzce.zzb, zzcd.zzaa, e.getMessage(), null, 8, null));
/* 84 */                zzg zzgVar = this.zzc;
/* 86 */                String str = this.zzd;
/* 88 */                long j2 = this.zzb;
/* 90 */                this.zze = zzcgVarZza;
/* 93 */                this.zza = 2;
/* 100 */               if (zzgVar.zze(str, j2, e, this) != z10Var) {
/* 104 */                   throw zzcgVarZza;
                        }
                    }
                }
            }
