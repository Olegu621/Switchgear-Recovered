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
            final class zzd extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzg zzb;
                final /* synthetic */ long zzc;
                final /* synthetic */ zzxn zzd;
                private /* synthetic */ Object zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzd(zzg zzgVar, long j, zzxn zzxnVar, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzb = zzgVar;
/* 3 */             this.zzc = j;
/* 5 */             this.zzd = zzxnVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 10 */            zzd zzdVar = new zzd(this.zzb, this.zzc, this.zzd, c10Var);
/* 13 */            zzdVar.zze = obj;
/* 15 */            return zzdVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzd) create((zzgr) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
                
                    if (r10 != r0) goto L18;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
                    try {
/* 7 */                 if (i == 0) {
/* 31 */                    pg3.m7417A(obj);
/* 36 */                    zzgr zzgrVar = (zzgr) this.zze;
/* 38 */                    zzg zzgVar = this.zzb;
/* 44 */                    if (zzgVar.zzi()) {
/* 46 */                        return Unit.f12910a;
                            }
/* 49 */                    long j = this.zzc;
/* 56 */                    zzc zzcVar = new zzc(zzgrVar, zzgVar, this.zzd, null);
/* 59 */                    this.zza = 1;
/* 61 */                    obj = qj3.m7884Q(j, zzcVar, this);
                        } else {
/* 9 */                     if (i != 1) {
/* 11 */                        if (i != 2) {
/* 19 */                            zzcg zzcgVar = (zzcg) this.zze;
/* 21 */                            pg3.m7417A(obj);
/* 114 */                           throw zzcgVar;
                                }
/* 13 */                        pg3.m7417A(obj);
/* 97 */                        zzg zzgVar2 = this.zzb;
/* 99 */                        zzcg zzcgVar2 = (zzcg) obj;
/* 101 */                       this.zze = zzcgVar2;
/* 104 */                       this.zza = 3;
/* 110 */                       if (zzgVar2.zzc(zzcgVar2, this) != z10Var) {
/* 114 */                           throw zzcgVar2;
                                }
/* 112 */                       return z10Var;
                            }
/* 25 */                    pg3.m7417A(obj);
                        }
/* 71 */                pg3.m7417A(((o42) obj).f14613a);
/* 1 */                 this.zzb.zza = true;
/* 79 */                return Unit.f12910a;
                    } catch (Exception e) {
/* 82 */                zzg zzgVar3 = this.zzb;
/* 1 */                 zzgVar3.zza = false;
/* 88 */                this.zza = 2;
/* 90 */                obj = zzgVar3.zzf(e, this);
/* 94 */                if (obj != z10Var) {
                        }
                    }
                }
            }
