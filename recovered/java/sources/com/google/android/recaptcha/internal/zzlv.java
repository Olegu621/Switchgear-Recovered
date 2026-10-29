            package com.google.android.recaptcha.internal;

            import android.webkit.WebView;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.C1869kx;
            import p000.InterfaceC1809jx;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzlv extends tj2 implements Function2 {
                Object zza;
                Object zzb;
                Object zzc;
                Object zzd;
                int zze;
                final /* synthetic */ zzly zzf;
                final /* synthetic */ zzgr zzg;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzlv(zzly zzlyVar, zzgr zzgrVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzf = zzlyVar;
/* 3 */             this.zzg = zzgrVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzlv(this.zzf, this.zzg, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzlv) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
                /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x00e1, code lost:
                
                    if (r10.zzc(r1, r9) == r0) goto L35;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    zzly zzlyVar;
                    zzdo zzdoVar;
                    zzxn zzxnVar;
                    zzly zzlyVar2;
                    zzgr zzgrVar;
                    InterfaceC1809jx interfaceC1809jxZzz;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zze;
/* 10 */            if (i == 0) {
/* 54 */                pg3.m7417A(obj);
/* 57 */                zzlyVar = this.zzf;
/* 1 */                 zzxn zzxnVar2 = zzlyVar.zze;
/* 63 */                if (zzxnVar2 == null) {
/* 65 */                    zzxnVar2 = null;
                        }
/* 1 */                 zzxn zzxnVar3 = zzlyVar.zze;
/* 72 */                if (zzxnVar3 == null) {
/* 74 */                    zzxnVar3 = null;
                        }
/* 79 */                zzdoVar = new zzdo(zzxnVar3.zzf());
/* 82 */                this.zza = zzlyVar;
/* 84 */                this.zzb = zzlyVar;
/* 86 */                this.zzc = zzxnVar2;
/* 88 */                this.zzd = zzdoVar;
/* 90 */                this.zze = 1;
/* 92 */                Object objZzv = zzlyVar.zzv(this);
/* 96 */                if (objZzv != z10Var) {
/* 99 */                    zzxnVar = zzxnVar2;
/* 100 */                   obj = objZzv;
/* 101 */                   zzlyVar2 = zzlyVar;
                        }
/* 232 */               return z10Var;
                    }
/* 12 */            if (i == 1) {
/* 36 */                zzdoVar = (zzdo) this.zzd;
/* 40 */                zzxnVar = (zzxn) this.zzc;
/* 44 */                zzlyVar = (zzly) this.zzb;
/* 48 */                zzlyVar2 = (zzly) this.zza;
/* 50 */                pg3.m7417A(obj);
                    } else {
/* 14 */                if (i == 2) {
/* 27 */                    zzgrVar = (zzgr) this.zza;
/* 29 */                    pg3.m7417A(obj);
/* 172 */                   this.zza = null;
/* 174 */                   this.zze = 3;
/* 180 */                   if (zzhj.zzc(zzgrVar, (zzhg) obj, this) != z10Var) {
/* 182 */                       zzly zzlyVar3 = this.zzf;
/* 194 */                       new Integer(zzlyVar3.zzz().hashCode());
/* 197 */                       interfaceC1809jxZzz = zzlyVar3.zzz();
/* 201 */                       this.zze = 4;
/* 209 */                       if (((C1869kx) interfaceC1809jxZzz).m10250i(this) != z10Var) {
/* 213 */                           zzdj zzdjVarZzn = this.zzf.zzn();
/* 217 */                           zzmc zzmcVar = zzmc.zzc;
/* 220 */                           this.zze = 5;
                                }
                            }
/* 232 */                   return z10Var;
                        }
/* 16 */                pg3.m7417A(obj);
/* 19 */                if (i == 3) {
/* 182 */                   zzly zzlyVar4 = this.zzf;
/* 194 */                   new Integer(zzlyVar4.zzz().hashCode());
/* 197 */                   interfaceC1809jxZzz = zzlyVar4.zzz();
/* 201 */                   this.zze = 4;
/* 209 */                   if (((C1869kx) interfaceC1809jxZzz).m10250i(this) != z10Var) {
                            }
/* 232 */                   return z10Var;
                        }
/* 21 */                if (i == 4) {
                        }
/* 213 */               zzdj zzdjVarZzn2 = this.zzf.zzn();
/* 217 */               zzmc zzmcVar2 = zzmc.zzc;
/* 220 */               this.zze = 5;
                    }
/* 229 */           return Unit.f12910a;
/* 108 */           zzlyVar2.zzb = zzlyVar.zzB(zzxnVar, zzdoVar, (WebView) obj);
/* 110 */           zzly zzlyVar5 = this.zzf;
/* 122 */           new Integer(zzlyVar5.zzz().hashCode());
/* 129 */           zzlyVar5.zzg.zzd();
/* 136 */           zzlyVar5.zzg.zze();
/* 139 */           zzgrVar = this.zzg;
/* 1 */             zzxn zzxnVar4 = zzlyVar5.zze;
/* 145 */           if (zzxnVar4 == null) {
/* 147 */               zzxnVar4 = null;
                    }
/* 148 */           this.zza = zzgrVar;
/* 150 */           this.zzb = null;
/* 152 */           this.zzc = null;
/* 154 */           this.zzd = null;
/* 156 */           this.zze = 2;
/* 165 */           obj = new zzhg(new zzlh(zzlyVar5, zzxnVar4, null));
/* 168 */           if (obj != z10Var) {
/* 172 */               this.zza = null;
/* 174 */               this.zze = 3;
/* 180 */               if (zzhj.zzc(zzgrVar, (zzhg) obj, this) != z10Var) {
/* 182 */                   zzly zzlyVar6 = this.zzf;
/* 194 */                   new Integer(zzlyVar6.zzz().hashCode());
/* 197 */                   interfaceC1809jxZzz = zzlyVar6.zzz();
/* 201 */                   this.zze = 4;
/* 209 */                   if (((C1869kx) interfaceC1809jxZzz).m10250i(this) != z10Var) {
/* 213 */                       zzdj zzdjVarZzn3 = this.zzf.zzn();
/* 217 */                       zzmc zzmcVar3 = zzmc.zzc;
/* 220 */                       this.zze = 5;
                            }
                        }
                    }
/* 232 */           return z10Var;
                }
            }
