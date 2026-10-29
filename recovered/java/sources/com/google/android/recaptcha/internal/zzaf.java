            package com.google.android.recaptcha.internal;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.de3;
            import p000.h01;
            import p000.i13;
            import p000.m42;
            import p000.o42;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzaf extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzaj zzb;
                final /* synthetic */ String zzc;
                final /* synthetic */ zzhk zzd;
                private /* synthetic */ Object zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzaf(zzaj zzajVar, String str, zzhk zzhkVar, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzb = zzajVar;
/* 3 */             this.zzc = str;
/* 5 */             this.zzd = zzhkVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 9 */             zzaf zzafVar = new zzaf(this.zzb, this.zzc, this.zzd, c10Var);
/* 12 */            zzafVar.zze = obj;
/* 14 */            return zzafVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzaf) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 5 */             pg3.m7417A(obj);
/* 8 */             if (i == 0) {
/* 14 */                y10 y10Var = (y10) this.zze;
/* 18 */                ArrayList arrayList = new ArrayList();
/* 21 */                zzaj zzajVar = this.zzb;
/* 23 */                String str = this.zzc;
/* 29 */                zzajVar.zzn().put(str, arrayList);
/* 34 */                ArrayList arrayList2 = new ArrayList();
/* 1 */                 List list = zzajVar.zza;
/* 43 */                ArrayList arrayList3 = new ArrayList();
/* 54 */                for (Object obj2 : list) {
/* 67 */                    if (((zzar) obj2).zzi()) {
/* 69 */                        arrayList3.add(obj2);
                            }
                        }
/* 73 */                Iterator it = arrayList3.iterator();
/* 81 */                while (it.hasNext()) {
/* 104 */                   arrayList2.add(i13.m4443w(y10Var, null, new zzae(this.zzd, (zzar) it.next(), str, arrayList, null), 3));
                        }
/* 115 */               h01[] h01VarArr = (h01[]) arrayList2.toArray(new h01[0]);
/* 122 */               h01[] h01VarArr2 = (h01[]) Arrays.copyOf(h01VarArr, h01VarArr.length);
/* 125 */               this.zza = 1;
/* 131 */               if (de3.m3044z(h01VarArr2, this) == z10Var) {
/* 133 */                   return z10Var;
                        }
                    }
/* 134 */           m42 m42Var = o42.f14612b;
/* 146 */           return new o42(this.zzb.zzp(this.zzc));
                }
            }
