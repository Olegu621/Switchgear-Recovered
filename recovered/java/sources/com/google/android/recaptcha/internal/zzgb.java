            package com.google.android.recaptcha.internal;

            import com.google.android.recaptcha.RecaptchaAction;
            import java.util.concurrent.TimeUnit;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C1869kx;
            import p000.InterfaceC1809jx;
            import p000.c10;
            import p000.f42;
            import p000.p51;
            import p000.pg3;
            import p000.r51;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgb implements zzdw {
                private final zzfp zza;
                private InterfaceC1809jx zzb = new C1869kx();
                private final p51 zzc;
                private zzcg zzd;
                private zzxn zze;
                private zzdv zzf;

                public zzgb(zzfp zzfpVar, zzct zzctVar) {
/* 4 */             this.zza = zzfpVar;
/* 13 */            int i = zzby.zza;
/* 21 */            this.zzc = r51.m8065b(zzfv.zza);
/* 27 */            this.zzf = zzdv.zza;
                }

                public static final /* synthetic */ zzcr zzd(zzgb zzgbVar) {
/* 7 */             return (zzcr) zzgbVar.zzc.getValue();
                }

                public static final /* synthetic */ boolean zzo(zzgb zzgbVar, Exception exc) {
/* 4 */             if (!(exc instanceof zzcg)) {
/* 3 */                 return true;
                    }
/* 6 */             zzcg zzcgVar = (zzcg) exc;
                    return (Intrinsics.m6216a(zzcgVar.zzb(), zzce.zzd) || Intrinsics.m6216a(zzcgVar.zzb(), zzce.zze) || Intrinsics.m6216a(zzcgVar.zzb(), zzce.zzf)) ? false : true;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final Object zzp(Function1 function1, c10 c10Var) {
                    zzfr zzfrVar;
                    zzcs zzcsVar;
/* 3 */             if (c10Var instanceof zzfr) {
/* 6 */                 zzfrVar = (zzfr) c10Var;
/* 8 */                 int i = zzfrVar.zzc;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzfrVar.zzc = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzfrVar = new zzfr(this, c10Var);
                        }
                    } else {
/* 22 */                zzfrVar = new zzfr(this, c10Var);
                    }
/* 25 */            Object obj = zzfrVar.zza;
/* 27 */            Object obj2 = z10.f19902a;
/* 29 */            int i2 = zzfrVar.zzc;
/* 32 */            if (i2 == 0) {
/* 49 */                pg3.m7417A(obj);
/* 54 */                zzcs zzcsVar2 = new zzcs();
/* 57 */                zzfrVar.zzd = zzcsVar2;
/* 59 */                zzfrVar.zzc = 1;
/* 65 */                if (function1.invoke(zzfrVar) == obj2) {
/* 82 */                    return obj2;
                        }
/* 67 */                zzcsVar = zzcsVar2;
                    } else {
/* 34 */                if (i2 != 1) {
/* 44 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 36 */                zzcsVar = zzfrVar.zzd;
/* 38 */                pg3.m7417A(obj);
                    }
/* 68 */            zzcsVar.zzc();
/* 79 */            return new Long(zzcsVar.zza(TimeUnit.MILLISECONDS));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final Object zzq(long j, c10 c10Var) {
/* 9 */             return new zzhg(new zzga(this, j, null));
                }

                @Override // com.google.android.recaptcha.internal.zzdw
                public final Object zza(String str, RecaptchaAction recaptchaAction, long j, c10 c10Var) {
/* 13 */            return new zzhg(new zzfq(this, j, str, recaptchaAction, null));
                }

                @Override // com.google.android.recaptcha.internal.zzdw
                public final Object zzb(long j, c10 c10Var) {
/* 1 */             return zzq(j, c10Var);
                }

                public final zzdv zze() {
/* 1 */             return this.zzf;
                }
            }
