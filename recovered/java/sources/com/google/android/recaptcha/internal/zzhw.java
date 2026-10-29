            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzhw extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ zzib zzc;
                final /* synthetic */ String zzd;
                final /* synthetic */ String zze;
                private /* synthetic */ Object zzf;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzhw(zzib zzibVar, String str, String str2, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzc = zzibVar;
/* 3 */             this.zzd = str;
/* 5 */             this.zze = str2;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 9 */             zzhw zzhwVar = new zzhw(this.zzc, this.zzd, this.zze, c10Var);
/* 12 */            zzhwVar.zzf = obj;
/* 14 */            return zzhwVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzhw) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
                /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
                /* JADX WARN: Code duplicated, block: B:40:0x00e6 A[RETURN] */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
                
                    if (r11 != r0) goto L27;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v4, types: [com.google.android.recaptcha.internal.zzhf] */
                /* JADX WARN: Type inference failed for: r1v0, types: [int] */
                /* JADX WARN: Type inference failed for: r1v1 */
                /* JADX WARN: Type inference failed for: r1v10 */
                /* JADX WARN: Type inference failed for: r1v13 */
                /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v23 */
                /* JADX WARN: Type inference failed for: r1v24 */
                /* JADX WARN: Type inference failed for: r1v25 */
                /* JADX WARN: Type inference failed for: r1v26 */
                /* JADX WARN: Type inference failed for: r1v27 */
                /* JADX WARN: Type inference failed for: r1v28 */
                /* JADX WARN: Type inference failed for: r1v29 */
                /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.recaptcha.internal.zzhk] */
                /* JADX WARN: Type inference failed for: r1v4 */
                /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzhk] */
                /* JADX WARN: Type inference failed for: r4v2 */
                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v8 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws zzcg {
                    ?? r4;
                    ?? r1;
                    ?? r2;
                    String str;
                    zzhf zzhfVar;
                    String str2;
                    ?? r3;
                    zzhk zzhkVar;
                    zzhk zzhkVar2;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             ?? r5 = this.zzb;
                    try {
/* 11 */                if (r5 == 0) {
/* 91 */                    pg3.m7417A(obj);
/* 97 */                    zzhk zzhkVar3 = (zzhk) this.zzf;
/* 99 */                    zzib zzibVar = this.zzc;
/* 101 */                   String str3 = this.zzd;
/* 103 */                   this.zzf = zzhkVar3;
/* 105 */                   this.zza = zzhkVar3;
/* 107 */                   this.zzb = 1;
/* 118 */                   obj = new zzhf(25, new zzhx(zzibVar, str3, null), null);
/* 121 */                   if (obj != z10Var) {
/* 123 */                       zzhkVar = zzhkVar3;
                                zzhkVar2 = zzhkVar3;
                            }
/* 232 */                   return z10Var;
                        }
/* 13 */                if (r5 == 1) {
/* 76 */                    zzhk zzhkVar4 = (zzhk) this.zza;
/* 80 */                    zzhk zzhkVar5 = (zzhk) this.zzf;
                            try {
/* 82 */                        pg3.m7417A(obj);
/* 86 */                        zzhkVar = zzhkVar4;
/* 87 */                        zzhkVar2 = zzhkVar5;
                            } catch (Exception unused) {
/* 89 */                        r5 = zzhkVar5;
/* 141 */                       zzib zzibVar2 = this.zzc;
/* 147 */                       zzib.zza(zzibVar2).zzb();
/* 150 */                       String str4 = this.zze;
/* 152 */                       this.zzf = r5;
/* 154 */                       this.zza = r5;
/* 156 */                       this.zzb = 3;
/* 167 */                       obj = new zzhf(23, new zzhu(zzibVar2, str4, null), null);
/* 170 */                       if (obj != z10Var) {
/* 172 */                           r4 = r5;
                                    r1 = r5;
/* 175 */                           this.zzf = r4;
/* 177 */                           this.zza = null;
/* 179 */                           this.zzb = 4;
/* 181 */                           obj = ((zzhf) obj).zza(r1, this);
/* 185 */                           if (obj != z10Var) {
/* 187 */                               r2 = r4;
/* 188 */                               zzib zzibVar3 = this.zzc;
/* 190 */                               String str5 = this.zzd;
/* 192 */                               str = (String) obj;
/* 194 */                               this.zzf = str;
/* 196 */                               this.zza = r2;
/* 198 */                               this.zzb = 5;
/* 209 */                               zzhfVar = new zzhf(24, new zzhy(zzibVar3, str5, str, null), null);
/* 212 */                               if (zzhfVar != z10Var) {
/* 214 */                                   str2 = str;
/* 215 */                                   obj = zzhfVar;
                                            r3 = r2;
/* 218 */                                   this.zzf = str2;
/* 220 */                                   this.zza = null;
/* 223 */                                   this.zzb = 6;
/* 229 */                                   if (zzhj.zzb(r3, (zzhf) obj, this) != z10Var) {
/* 231 */                                       return str2;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
/* 15 */                    if (r5 != 2) {
/* 17 */                        if (r5 == 3) {
/* 55 */                            zzhk zzhkVar6 = (zzhk) this.zza;
/* 59 */                            zzhk zzhkVar7 = (zzhk) this.zzf;
/* 61 */                            pg3.m7417A(obj);
                                    r1 = zzhkVar6;
                                    r4 = zzhkVar7;
/* 175 */                           this.zzf = r4;
/* 177 */                           this.zza = null;
/* 179 */                           this.zzb = 4;
/* 181 */                           obj = ((zzhf) obj).zza(r1, this);
/* 185 */                           if (obj != z10Var) {
/* 187 */                               r2 = r4;
/* 188 */                               zzib zzibVar4 = this.zzc;
/* 190 */                               String str6 = this.zzd;
/* 192 */                               str = (String) obj;
/* 194 */                               this.zzf = str;
/* 196 */                               this.zza = r2;
/* 198 */                               this.zzb = 5;
/* 209 */                               zzhfVar = new zzhf(24, new zzhy(zzibVar4, str6, str, null), null);
/* 212 */                               if (zzhfVar != z10Var) {
/* 214 */                                   str2 = str;
/* 215 */                                   obj = zzhfVar;
                                            r3 = r2;
                                        }
                                    }
/* 232 */                           return z10Var;
                                }
/* 19 */                        if (r5 == 4) {
/* 46 */                            zzhk zzhkVar8 = (zzhk) this.zzf;
/* 48 */                            pg3.m7417A(obj);
                                    r2 = zzhkVar8;
/* 188 */                           zzib zzibVar5 = this.zzc;
/* 190 */                           String str7 = this.zzd;
/* 192 */                           str = (String) obj;
/* 194 */                           this.zzf = str;
/* 196 */                           this.zza = r2;
/* 198 */                           this.zzb = 5;
/* 209 */                           zzhfVar = new zzhf(24, new zzhy(zzibVar5, str7, str, null), null);
/* 212 */                           if (zzhfVar != z10Var) {
/* 214 */                               str2 = str;
/* 215 */                               obj = zzhfVar;
                                        r3 = r2;
                                    }
/* 232 */                           return z10Var;
                                }
/* 21 */                        if (r5 != 5) {
/* 25 */                            String str8 = (String) this.zzf;
/* 27 */                            pg3.m7417A(obj);
/* 30 */                            return str8;
                                }
/* 33 */                        zzhk zzhkVar9 = (zzhk) this.zza;
/* 37 */                        str2 = (String) this.zzf;
/* 39 */                        pg3.m7417A(obj);
                                r3 = zzhkVar9;
/* 218 */                       this.zzf = str2;
/* 220 */                       this.zza = null;
/* 223 */                       this.zzb = 6;
/* 229 */                       if (zzhj.zzb(r3, (zzhf) obj, this) != z10Var) {
/* 231 */                           return str2;
                                }
/* 232 */                       return z10Var;
                            }
/* 68 */                    zzhk zzhkVar10 = (zzhk) this.zzf;
/* 70 */                    pg3.m7417A(obj);
                            r5 = zzhkVar10;
                        }
/* 138 */               return (String) obj;
/* 126 */               this.zzf = zzhkVar2;
/* 128 */               this.zza = null;
/* 130 */               this.zzb = 2;
/* 132 */               obj = ((zzhf) obj).zza(zzhkVar, this);
                        r5 = zzhkVar2;
                    } catch (Exception unused2) {
                    }
                }
            }
