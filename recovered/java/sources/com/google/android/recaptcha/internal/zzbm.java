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
            final class zzbm extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ zzhk zzc;
                final /* synthetic */ zzbo zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzbm(zzhk zzhkVar, zzbo zzboVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzc = zzhkVar;
/* 3 */             this.zzd = zzboVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzbm(this.zzc, this.zzd, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzbm) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
                
                    if (com.google.android.recaptcha.internal.zzhj.zzb(r1, (com.google.android.recaptcha.internal.zzhf) r6, r5) == r0) goto L14;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    zzhk zzhkVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzb;
/* 8 */             if (i != 0) {
/* 10 */                if (i != 1) {
/* 12 */                    pg3.m7417A(obj);
                        } else {
/* 18 */                    zzhkVar = (zzhk) this.zza;
/* 20 */                    pg3.m7417A(obj);
                        }
/* 61 */                return Unit.f12910a;
                    }
/* 24 */            pg3.m7417A(obj);
/* 27 */            zzhkVar = this.zzc;
/* 29 */            zzbo zzboVar = this.zzd;
/* 31 */            this.zza = zzhkVar;
/* 33 */            this.zzb = 1;
/* 42 */            obj = zzhj.zzd(38, 2, new zzbf(zzboVar, null), this);
/* 46 */            if (obj != z10Var) {
                    }
/* 64 */            return z10Var;
/* 50 */            this.zza = null;
/* 52 */            this.zzb = 2;
                }
            }
