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
            final class zzlf extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ zzly zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzlf(zzly zzlyVar, c10 c10Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.zzc = zzlyVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             return new zzlf(this.zzc, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzlf) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:17:0x0055 A[PHI: r7
  0x0055: PHI (r7v14 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:16:0x0053, B:7:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
                
                    if (r7 == r0) goto L22;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzb;
/* 10 */            if (i == 0) {
/* 34 */                pg3.m7417A(obj);
/* 37 */                zzly zzlyVar = this.zzc;
/* 39 */                this.zzb = 1;
/* 41 */                obj = zzlyVar.zzv(this);
/* 45 */                if (obj != z10Var) {
                        }
/* 122 */               return z10Var;
                    }
/* 12 */            if (i == 1) {
/* 30 */                pg3.m7417A(obj);
                    } else {
/* 14 */                if (i == 2) {
/* 26 */                    pg3.m7417A(obj);
/* 70 */                    ((WebView) obj).getSettings().setJavaScriptEnabled(true);
/* 73 */                    zzly zzlyVar2 = this.zzc;
/* 76 */                    this.zza = null;
/* 78 */                    this.zzb = 3;
/* 80 */                    obj = zzlyVar2.zzv(this);
/* 84 */                    if (obj != z10Var) {
/* 86 */                        zzly zzlyVar3 = this.zzc;
/* 94 */                        ((WebView) obj).addJavascriptInterface(zzlyVar3.zzr(), "RN");
/* 98 */                        this.zzb = 4;
/* 100 */                       obj = zzlyVar3.zzv(this);
                            }
/* 122 */                   return z10Var;
                        }
/* 16 */                pg3.m7417A(obj);
/* 19 */                if (i == 3) {
/* 86 */                    zzly zzlyVar4 = this.zzc;
/* 94 */                    ((WebView) obj).addJavascriptInterface(zzlyVar4.zzr(), "RN");
/* 98 */                    this.zzb = 4;
/* 100 */                   obj = zzlyVar4.zzv(this);
                        }
                    }
/* 116 */           ((WebView) obj).setWebViewClient(new zzle(this.zzc));
/* 119 */           return Unit.f12910a;
/* 49 */            ((WebView) obj).removeJavascriptInterface("RN");
/* 52 */            zzly zzlyVar5 = this.zzc;
/* 54 */            this.zza = zzlyVar5;
/* 56 */            this.zzb = 2;
/* 58 */            obj = zzlyVar5.zzv(this);
/* 62 */            if (obj != z10Var) {
/* 70 */                ((WebView) obj).getSettings().setJavaScriptEnabled(true);
/* 73 */                zzly zzlyVar6 = this.zzc;
/* 76 */                this.zza = null;
/* 78 */                this.zzb = 3;
/* 80 */                obj = zzlyVar6.zzv(this);
/* 84 */                if (obj != z10Var) {
/* 86 */                    zzly zzlyVar7 = this.zzc;
/* 94 */                    ((WebView) obj).addJavascriptInterface(zzlyVar7.zzr(), "RN");
/* 98 */                    this.zzb = 4;
/* 100 */                   obj = zzlyVar7.zzv(this);
                        }
                    }
/* 122 */           return z10Var;
                }
            }
