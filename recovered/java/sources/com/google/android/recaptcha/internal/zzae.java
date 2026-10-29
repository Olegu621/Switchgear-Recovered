            package com.google.android.recaptcha.internal;

            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzae extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ zzhk zzc;
                final /* synthetic */ zzar zzd;
                final /* synthetic */ String zze;
                final /* synthetic */ List zzf;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzae(zzhk zzhkVar, zzar zzarVar, String str, List list, c10 c10Var) {
/* 10 */            super(2, c10Var);
/* 1 */             this.zzc = zzhkVar;
/* 3 */             this.zzd = zzarVar;
/* 5 */             this.zze = str;
/* 7 */             this.zzf = list;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 12 */            return new zzae(this.zzc, this.zzd, this.zze, this.zzf, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzae) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
                
                    if (r5 == r0) goto L14;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    zzhk zzhkVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzb;
/* 6 */             if (i != 0) {
/* 8 */                 if (i != 1) {
/* 10 */                    pg3.m7417A(obj);
                        } else {
/* 16 */                    zzhkVar = (zzhk) this.zza;
/* 18 */                    pg3.m7417A(obj);
                        }
/* 60 */                this.zzf.add((zzat) obj);
/* 63 */                return Unit.f12910a;
                    }
/* 22 */            pg3.m7417A(obj);
/* 25 */            zzhkVar = this.zzc;
/* 27 */            zzar zzarVar = this.zzd;
/* 29 */            String str = this.zze;
/* 31 */            this.zza = zzhkVar;
/* 33 */            this.zzb = 1;
/* 35 */            obj = zzarVar.zzc(str, this);
/* 39 */            if (obj != z10Var) {
                    }
/* 66 */            return z10Var;
/* 44 */            this.zza = null;
/* 47 */            this.zzb = 2;
/* 49 */            obj = ((zzhg) obj).zza(zzhkVar, this);
                }
            }
