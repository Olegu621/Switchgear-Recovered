            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.C1869kx;
            import p000.c10;
            import p000.i13;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzlh extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ zzly zzc;
                final /* synthetic */ zzxn zzd;
                private /* synthetic */ Object zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzlh(zzly zzlyVar, zzxn zzxnVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzc = zzlyVar;
/* 3 */             this.zzd = zzxnVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             zzlh zzlhVar = new zzlh(this.zzc, this.zzd, c10Var);
/* 10 */            zzlhVar.zze = obj;
/* 12 */            return zzlhVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzlh) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
                    zzhk zzhkVar;
                    zzhk zzhkVar2;
                    zzhk zzhkVar3;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzb;
                    try {
/* 7 */                 if (i != 0) {
/* 9 */                     if (i != 1) {
/* 13 */                        zzhkVar3 = (zzhk) this.zze;
/* 15 */                        pg3.m7417A(obj);
                            } else {
/* 23 */                        zzhk zzhkVar4 = (zzhk) this.zza;
/* 27 */                        zzhk zzhkVar5 = (zzhk) this.zze;
/* 29 */                        pg3.m7417A(obj);
/* 33 */                        zzhkVar2 = zzhkVar4;
/* 34 */                        zzhkVar = zzhkVar5;
                            }
/* 84 */                    zzly zzlyVar = this.zzc;
/* 100 */                   i13.m4443w(zzlyVar.zzD().zzb(), null, new zzlg(zzlyVar, zzhkVar3, (String) obj, null), 3);
/* 116 */                   return Unit.f12910a;
                        }
/* 36 */                pg3.m7417A(obj);
/* 42 */                zzhkVar = (zzhk) this.zze;
/* 46 */                zzib zzibVarZzp = zzly.zzp(this.zzc);
/* 50 */                zzxn zzxnVar = this.zzd;
/* 52 */                this.zze = zzhkVar;
/* 54 */                this.zza = zzhkVar;
/* 56 */                this.zzb = 1;
/* 58 */                obj = zzibVarZzp.zzc(zzxnVar, this);
/* 62 */                if (obj != z10Var) {
/* 64 */                    zzhkVar2 = zzhkVar;
                        }
/* 104 */               return z10Var;
/* 67 */                this.zze = zzhkVar;
/* 69 */                this.zza = null;
/* 72 */                this.zzb = 2;
/* 74 */                obj = ((zzhg) obj).zza(zzhkVar2, this);
/* 78 */                if (obj == z10Var) {
/* 104 */                   return z10Var;
                        }
/* 81 */                zzhkVar3 = zzhkVar;
/* 84 */                zzly zzlyVar2 = this.zzc;
/* 100 */               i13.m4443w(zzlyVar2.zzD().zzb(), null, new zzlg(zzlyVar2, zzhkVar3, (String) obj, null), 3);
/* 116 */               return Unit.f12910a;
                    } catch (zzcg e) {
/* 113 */               ((C1869kx) this.zzc.zzz()).m6289U(e);
                    }
                }
            }
