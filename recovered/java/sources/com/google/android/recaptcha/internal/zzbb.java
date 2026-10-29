            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbb extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzbo zzb;
                final /* synthetic */ String zzc;
                private /* synthetic */ Object zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbb(zzbo zzboVar, String str, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzb = zzboVar;
/* 3 */             this.zzc = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             zzbb zzbbVar = new zzbb(this.zzb, this.zzc, c10Var);
/* 10 */            zzbbVar.zzd = obj;
/* 12 */            return zzbbVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzbb) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:23:0x0056  */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
                
                    if (r7 != r0) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
                
                    if (r7 == r0) goto L28;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v13 */
                /* JADX WARN: Type inference failed for: r1v14 */
                /* JADX WARN: Type inference failed for: r1v6 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Exception {
                    zzhk zzhkVar;
/* 1 */             Object obj2 = z10.f19902a;
/* 3 */             Object obj3 = this.zza;
                    try {
/* 8 */                 if (obj3 == 0) {
/* 36 */                    pg3.m7417A(obj);
/* 42 */                    zzhk zzhkVar2 = (zzhk) this.zzd;
/* 44 */                    zzbo zzboVar = this.zzb;
/* 46 */                    String str = this.zzc;
/* 48 */                    this.zzd = zzhkVar2;
/* 50 */                    this.zza = 1;
/* 1 */                     obj = zzboVar.zzm(str, this);
                            obj3 = zzhkVar2;
                        } else {
/* 10 */                    if (obj3 != 1) {
/* 12 */                        if (obj3 == 2) {
/* 22 */                            zzhk zzhkVar3 = (zzhk) this.zzd;
/* 24 */                            pg3.m7417A(obj);
                                    zzhkVar = zzhkVar3;
/* 77 */                            this.zzd = null;
/* 79 */                            this.zza = 3;
/* 85 */                            if (((zzhg) obj).zza(zzhkVar, this) != obj2) {
/* 87 */                                zzbo zzboVar2 = this.zzb;
/* 89 */                                String str2 = this.zzc;
/* 92 */                                this.zza = 4;
/* 1 */                                 obj = zzboVar2.zzm(str2, this);
                                    }
/* 104 */                           return obj2;
                                }
/* 14 */                        pg3.m7417A(obj);
/* 17 */                        if (obj3 == 3) {
/* 87 */                            zzbo zzboVar3 = this.zzb;
/* 89 */                            String str3 = this.zzc;
/* 92 */                            this.zza = 4;
/* 1 */                             obj = zzboVar3.zzm(str3, this);
                                }
/* 101 */                       return (String) obj;
                            }
/* 30 */                    zzhk zzhkVar4 = (zzhk) this.zzd;
/* 32 */                    pg3.m7417A(obj);
                            obj3 = zzhkVar4;
                        }
/* 58 */                return (String) obj;
                    } catch (Exception unused) {
/* 61 */                zzbo zzboVar4 = this.zzb;
/* 63 */                this.zzd = obj3;
/* 65 */                this.zza = 2;
/* 67 */                obj = zzboVar4.zze(this);
                        zzhkVar = obj3;
/* 71 */                if (obj != obj2) {
/* 77 */                    this.zzd = null;
/* 79 */                    this.zza = 3;
/* 85 */                    if (((zzhg) obj).zza(zzhkVar, this) != obj2) {
/* 87 */                        zzbo zzboVar5 = this.zzb;
/* 89 */                        String str4 = this.zzc;
/* 92 */                        this.zza = 4;
/* 1 */                         obj = zzboVar5.zzm(str4, this);
                            }
                        }
                    }
                }
            }
