            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzao extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzar zzb;
                final /* synthetic */ String zzc;
                private /* synthetic */ Object zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzao(zzar zzarVar, String str, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzb = zzarVar;
/* 3 */             this.zzc = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             zzao zzaoVar = new zzao(this.zzb, this.zzc, c10Var);
/* 10 */            zzaoVar.zzd = obj;
/* 12 */            return zzaoVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzao) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
                
                    if (r8 != r0) goto L13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
                
                    if (r8 == r0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
                
                    return r0;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
                    try {
/* 6 */                 if (i == 0) {
/* 20 */                    pg3.m7417A(obj);
/* 25 */                    zzhk zzhkVar = (zzhk) this.zzd;
/* 27 */                    zzar zzarVar = this.zzb;
/* 29 */                    int iZza = zzarVar.zza();
/* 38 */                    zzan zzanVar = new zzan(zzarVar, this.zzc, null);
/* 41 */                    this.zza = 1;
/* 55 */                    obj = new zzhf(37, zzanVar, new Integer(iZza)).zza(zzhkVar, this);
                        } else {
/* 8 */                     if (i != 1) {
/* 10 */                        pg3.m7417A(obj);
/* 76 */                        return (zzat) obj;
                            }
/* 14 */                    pg3.m7417A(obj);
                        }
/* 61 */                return (zzat) obj;
                    } catch (Exception e) {
/* 64 */                zzar zzarVar2 = this.zzb;
/* 67 */                this.zza = 2;
/* 69 */                obj = zzarVar2.zzg(e, this);
                    }
                }
            }
