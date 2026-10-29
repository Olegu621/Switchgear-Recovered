            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import kotlin.text.C1852e;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzhv extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzib zzb;
                final /* synthetic */ zzxn zzc;
                private /* synthetic */ Object zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzhv(zzib zzibVar, zzxn zzxnVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzb = zzibVar;
/* 3 */             this.zzc = zzxnVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             zzhv zzhvVar = new zzhv(this.zzb, this.zzc, c10Var);
/* 10 */            zzhvVar.zzd = obj;
/* 12 */            return zzhvVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzhv) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws Exception {
                    zzhk zzhkVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
                    try {
/* 7 */                 if (i != 0) {
/* 9 */                     if (i != 1) {
/* 11 */                        pg3.m7417A(obj);
                            } else {
/* 17 */                        zzhkVar = (zzhk) this.zzd;
/* 19 */                        pg3.m7417A(obj);
                            }
/* 83 */                    return C1852e.m6261k(this.zzc.zzl(), "JAVASCRIPT_TAG", (String) obj);
                        }
/* 23 */                pg3.m7417A(obj);
/* 29 */                zzhkVar = (zzhk) this.zzd;
/* 31 */                zzib zzibVar = this.zzb;
/* 33 */                zzxn zzxnVar = this.zzc;
/* 35 */                String strZzM = zzxnVar.zzM();
/* 39 */                String strZzN = zzxnVar.zzN();
/* 43 */                this.zzd = zzhkVar;
/* 45 */                this.zza = 1;
/* 54 */                obj = new zzhg(new zzhw(zzibVar, strZzN, strZzM, null));
/* 57 */                if (obj != z10Var) {
                        }
/* 88 */                return z10Var;
/* 61 */                this.zzd = null;
/* 64 */                this.zza = 2;
/* 66 */                obj = ((zzhg) obj).zza(zzhkVar, this);
/* 70 */                if (obj == z10Var) {
/* 88 */                    return z10Var;
                        }
/* 83 */                return C1852e.m6261k(this.zzc.zzl(), "JAVASCRIPT_TAG", (String) obj);
                    } catch (Exception e) {
/* 93 */                if (e instanceof zzcg) {
/* 95 */                    throw e;
                        }
/* 113 */               throw new zzcg(zzce.zzb, zzcd.zzL, e.getMessage(), null, 8, null);
                    }
                }
            }
