            package com.google.android.recaptcha.internal;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.de3;
            import p000.e70;
            import p000.i13;
            import p000.n42;
            import p000.o42;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzk extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzq zzb;
                final /* synthetic */ String zzc;
                final /* synthetic */ zzgr zzd;
                final /* synthetic */ long zze;
                private /* synthetic */ Object zzf;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzk(zzq zzqVar, String str, zzgr zzgrVar, long j, c10 c10Var) {
/* 10 */            super(2, c10Var);
/* 1 */             this.zzb = zzqVar;
/* 3 */             this.zzc = str;
/* 5 */             this.zzd = zzgrVar;
/* 7 */             this.zze = j;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 12 */            zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, c10Var);
/* 15 */            zzkVar.zzf = obj;
/* 17 */            return zzkVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzk) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 5 */             pg3.m7417A(obj);
/* 8 */             if (i == 0) {
/* 13 */                y10 y10Var = (y10) this.zzf;
/* 17 */                ArrayList arrayList = new ArrayList();
/* 34 */                for (zzg zzgVar : this.zzb.zzd()) {
/* 47 */                    if (zzgVar.zzi()) {
/* 67 */                        arrayList.add(i13.m4427d(y10Var, null, new zzj(this.zzd, zzgVar, this.zzc, this.zze, null), 3));
                            }
                        }
/* 78 */                e70[] e70VarArr = (e70[]) arrayList.toArray(new e70[0]);
/* 85 */                e70[] e70VarArr2 = (e70[]) Arrays.copyOf(e70VarArr, e70VarArr.length);
/* 88 */                this.zza = 1;
/* 90 */                obj = de3.m3022c(e70VarArr2, this);
/* 94 */                if (obj == z10Var) {
/* 96 */                    return z10Var;
                        }
                    }
/* 97 */            String str = this.zzc;
/* 101 */           zzxw zzxwVarZzf = zzxx.zzf();
/* 105 */           zzxwVarZzf.zze(str);
/* 108 */           Iterator it = ((List) obj).iterator();
/* 116 */           while (it.hasNext()) {
/* 124 */               Object obj2 = ((o42) it.next()).f14613a;
/* 128 */               if (!(obj2 instanceof n42)) {
/* 132 */                   zzxwVarZzf.zzh((zzxx) obj2);
                        }
                    }
/* 140 */           return (zzxx) zzxwVarZzf.zzk();
                }
            }
