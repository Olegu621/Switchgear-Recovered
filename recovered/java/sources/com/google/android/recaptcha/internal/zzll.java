            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.m42;
            import p000.n42;
            import p000.o42;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzll extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzxn zzb;
                final /* synthetic */ zzly zzc;
                private /* synthetic */ Object zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzll(zzxn zzxnVar, zzly zzlyVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzb = zzxnVar;
/* 3 */             this.zzc = zzlyVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             zzll zzllVar = new zzll(this.zzb, this.zzc, c10Var);
/* 10 */            zzllVar.zzd = obj;
/* 12 */            return zzllVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzll) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
                
                    if (((com.google.android.recaptcha.internal.zzhg) r8).zza(r1, r7) == r0) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
                
                    if (r8.zzc(r1, r7) != r0) goto L24;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    zzhk zzhkVar;
                    Object n42Var;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 7 */             if (i == 0) {
/* 29 */                pg3.m7417A(obj);
/* 35 */                zzhkVar = (zzhk) this.zzd;
/* 37 */                zzxn zzxnVar = this.zzb;
/* 43 */                if (zzxnVar.zzV() && zzxnVar.zzT() && zzxnVar.zzS()) {
/* 58 */                    zzly zzlyVar = this.zzc;
/* 1 */                     zzlyVar.zze = zzxnVar;
/* 63 */                    this.zzd = zzhkVar;
/* 65 */                    this.zza = 2;
/* 67 */                    obj = zzly.zzu(zzlyVar, this);
/* 71 */                    if (obj != z10Var) {
/* 76 */                        this.zzd = null;
/* 79 */                        this.zza = 3;
                            }
                        } else {
/* 95 */                    zzdj zzdjVarZzn = this.zzc.zzn();
/* 99 */                    zzmc zzmcVar = zzmc.zzd;
/* 101 */                   this.zza = 1;
                        }
/* 136 */               return z10Var;
                    }
/* 9 */             if (i != 1) {
/* 11 */                if (i != 2) {
/* 13 */                    pg3.m7417A(obj);
                        } else {
/* 19 */                    zzhkVar = (zzhk) this.zzd;
/* 21 */                    pg3.m7417A(obj);
/* 76 */                    this.zzd = null;
/* 79 */                    this.zza = 3;
                        }
/* 88 */                m42 m42Var = o42.f14612b;
/* 90 */                n42Var = Unit.f12910a;
                    } else {
/* 25 */                pg3.m7417A(obj);
/* 109 */               m42 m42Var2 = o42.f14612b;
/* 127 */               n42Var = new n42(new zzcg(zzce.zzb, zzcd.zzay, null, null, 12, null));
                    }
/* 132 */           return new o42(n42Var);
                }
            }
