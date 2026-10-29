            package com.google.android.recaptcha.internal;

            import java.util.ArrayList;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.pm2;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzir extends tj2 implements Function2 {
                final /* synthetic */ String[] zza;
                final /* synthetic */ zzis zzb;
                final /* synthetic */ String zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzir(String[] strArr, zzis zzisVar, String str, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zza = strArr;
/* 3 */             this.zzb = zzisVar;
/* 5 */             this.zzc = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 9 */             return new zzir(this.zza, this.zzb, this.zzc, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzir) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 8 */             String[] strArr = this.zza;
/* 11 */            ArrayList arrayList = new ArrayList(strArr.length);
/* 15 */            for (String str : strArr) {
/* 36 */                arrayList.add("\"" + str + "\"");
                    }
/* 70 */            this.zzb.zza.evaluateJavascript(pm2.m7489l(this.zzc, "(", CollectionsKt.m6203x(arrayList, ",", null, null, null, 62), ")"), null);
/* 73 */            return Unit.f12910a;
                }
            }
