            package com.google.android.recaptcha.internal;

            import android.webkit.WebView;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzlj extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzly zzb;
                final /* synthetic */ String zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzlj(zzly zzlyVar, String str, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzb = zzlyVar;
/* 3 */             this.zzc = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzlj(this.zzb, this.zzc, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzlj) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 5 */             pg3.m7417A(obj);
/* 8 */             if (i == 0) {
/* 11 */                zzly zzlyVar = this.zzb;
/* 14 */                this.zza = 1;
/* 16 */                obj = zzlyVar.zzv(this);
/* 20 */                if (obj == z10Var) {
/* 22 */                    return z10Var;
                        }
                    }
/* 47 */            ((WebView) obj).evaluateJavascript("recaptcha.m.Main.execute(\"" + this.zzc + "\")", null);
/* 50 */            return Unit.f12910a;
                }
            }
