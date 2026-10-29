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
            final class zzn extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzq zzb;
                final /* synthetic */ zzgr zzc;
                final /* synthetic */ long zzd;
                final /* synthetic */ zzxn zze;
                private /* synthetic */ Object zzf;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzn(zzq zzqVar, zzgr zzgrVar, long j, zzxn zzxnVar, c10 c10Var) {
/* 10 */            super(2, c10Var);
/* 1 */             this.zzb = zzqVar;
/* 3 */             this.zzc = zzgrVar;
/* 5 */             this.zzd = j;
/* 7 */             this.zze = zzxnVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 12 */            zzn zznVar = new zzn(this.zzb, this.zzc, this.zzd, this.zze, c10Var);
/* 15 */            zznVar.zzf = obj;
/* 17 */            return zznVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzn) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 5 */             pg3.m7417A(obj);
/* 8 */             if (i == 0) {
/* 13 */                y10 y10Var = (y10) this.zzf;
/* 17 */                ArrayList arrayList = new ArrayList();
/* 26 */                Iterator it = this.zzb.zzd().iterator();
/* 34 */                while (it.hasNext()) {
/* 61 */                    arrayList.add(i13.m4427d(y10Var, null, new zzm(this.zzc, (zzg) it.next(), this.zzd, this.zze, null), 3));
                        }
/* 72 */                e70[] e70VarArr = (e70[]) arrayList.toArray(new e70[0]);
/* 79 */                e70[] e70VarArr2 = (e70[]) Arrays.copyOf(e70VarArr, e70VarArr.length);
/* 82 */                this.zza = 1;
/* 84 */                obj = de3.m3022c(e70VarArr2, this);
/* 88 */                if (obj == z10Var) {
/* 90 */                    return z10Var;
                        }
                    }
/* 91 */            List list = (List) obj;
/* 93 */            if (list == null || !list.isEmpty()) {
/* 101 */               Iterator it2 = list.iterator();
/* 109 */               while (it2.hasNext()) {
/* 121 */                   if (!(((o42) it2.next()).f14613a instanceof n42)) {
/* 123 */                       return Unit.f12910a;
                            }
                        }
                    }
/* 140 */           throw new zzcg(zzce.zzb, zzcd.zzY, null, null, 12, null);
                }
            }
