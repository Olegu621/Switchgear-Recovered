            package com.google.android.recaptcha.internal;

            import android.app.Application;
            import com.google.android.recaptcha.RecaptchaException;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.C1020i9;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdy extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ Application zzb;
                final /* synthetic */ String zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzdy(Application application, String str, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzb = application;
/* 3 */             this.zzc = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzdy(this.zzb, this.zzc, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzdy) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws C1020i9, RecaptchaException {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 5 */             pg3.m7417A(obj);
/* 8 */             if (i != 0) {
/* 10 */                return obj;
                    }
/* 11 */            Application application = this.zzb;
/* 13 */            String str = this.zzc;
/* 16 */            this.zza = 1;
/* 18 */            Object objZzd = zzdz.zzd(application, str, this);
                    return objZzd == z10Var ? z10Var : objZzd;
                }
            }
