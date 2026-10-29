            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfn extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ zzgr zzc;
                final /* synthetic */ zzfp zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzfn(zzgr zzgrVar, zzfp zzfpVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzc = zzgrVar;
/* 3 */             this.zzd = zzfpVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzfn(this.zzc, this.zzd, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzfn) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
                
                    if (r5 == r0) goto L14;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    zzgr zzgrVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzb;
/* 7 */             if (i != 0) {
/* 9 */                 if (i != 1) {
/* 11 */                    pg3.m7417A(obj);
                        } else {
/* 17 */                    zzgrVar = (zzgr) this.zza;
/* 19 */                    pg3.m7417A(obj);
                        }
/* 64 */                return (zzxn) obj;
                    }
/* 23 */            pg3.m7417A(obj);
/* 26 */            zzgrVar = this.zzc;
/* 28 */            zzfp zzfpVar = this.zzd;
/* 30 */            this.zza = zzgrVar;
/* 32 */            this.zzb = 1;
/* 41 */            obj = new zzhg(new zzez(zzfpVar, null));
/* 44 */            if (obj != z10Var) {
                    }
/* 67 */            return z10Var;
/* 48 */            this.zza = null;
/* 51 */            this.zzb = 2;
/* 57 */            obj = ((zzhg) obj).zza(zzgrVar.zza(), this);
                }
            }
