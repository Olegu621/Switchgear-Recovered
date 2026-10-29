            package com.google.android.recaptcha.internal;

            import android.webkit.WebView;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.C1869kx;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzli extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ zzly zzc;
                final /* synthetic */ String zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzli(zzly zzlyVar, String str, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzc = zzlyVar;
/* 3 */             this.zzd = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzli(this.zzc, this.zzd, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzli) create((zzgr) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
                    String strZza;
/* 1 */             z10 z10Var = z10.f19902a;
                    try {
/* 5 */                 if (this.zzb != 0) {
/* 9 */                     String str = (String) this.zza;
/* 11 */                    pg3.m7417A(obj);
/* 14 */                    strZza = str;
                        } else {
/* 19 */                    pg3.m7417A(obj);
/* 22 */                    zzly zzlyVar = this.zzc;
/* 28 */                    strZza = zzly.zzm(zzlyVar).zza();
/* 32 */                    this.zza = strZza;
/* 35 */                    this.zzb = 1;
/* 37 */                    obj = zzlyVar.zzv(this);
/* 41 */                    if (obj == z10Var) {
/* 59 */                        return z10Var;
                            }
                        }
/* 53 */                ((WebView) obj).loadDataWithBaseURL(strZza, this.zzd, "text/html", "utf-8", null);
/* 56 */                return Unit.f12910a;
                    } catch (Exception e) {
/* 74 */                zzcg zzcgVar = new zzcg(zzce.zzb, zzcd.zzU, e.getMessage(), null, 8, null);
/* 85 */                ((C1869kx) this.zzc.zzz()).m6289U(zzcgVar);
/* 88 */                throw zzcgVar;
                    }
                }
            }
