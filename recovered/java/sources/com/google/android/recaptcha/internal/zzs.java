            package com.google.android.recaptcha.internal;

            import android.app.Application;
            import com.google.android.gms.internal.internal.InternalRecaptchaBaseClient;
            import com.google.android.gms.recaptchabase.InitRequest;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.m42;
            import p000.n42;
            import p000.o42;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzs extends tj2 implements Function2 {
                final /* synthetic */ zzu zza;
                final /* synthetic */ zzxn zzb;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzs(zzu zzuVar, zzxn zzxnVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zza = zzuVar;
/* 3 */             this.zzb = zzxnVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzs(this.zza, this.zzb, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzs) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 6 */             zzu zzuVar = this.zza;
/* 20 */            if (!zzuVar.zza.zzb(zzu.zzl(zzuVar))) {
/* 22 */                m42 m42Var = o42.f14612b;
/* 45 */                return new o42(new n42(new zzcg(zzce.zzb, zzcd.zzar, null, null, 12, null)));
                    }
/* 49 */            zzxn zzxnVar = this.zzb;
/* 55 */            if (!zzxnVar.zzR() || zzxnVar.zzg().zzf().zzn()) {
/* 125 */               m42 m42Var2 = o42.f14612b;
/* 148 */               return new o42(new n42(new zzcg(zzce.zzb, zzcd.zzaD, null, null, 12, null)));
                    }
/* 1 */             zzuVar.zzb = zzxnVar.zzg().zzf().zzm();
/* 89 */            InitRequest initRequest = new InitRequest();
/* 92 */            Application applicationZzl = zzu.zzl(zzuVar);
/* 96 */            applicationZzl.getClass();
/* 1 */             zzuVar.zzc = zzdf.zza(new InternalRecaptchaBaseClient(applicationZzl).init(initRequest));
/* 115 */           m42 m42Var3 = o42.f14612b;
/* 121 */           return new o42(Unit.f12910a);
                }
            }
