            package com.google.android.recaptcha.internal;

            import com.google.android.gms.tasks.Task;
            import com.google.android.recaptcha.RecaptchaAction;
            import com.google.android.recaptcha.RecaptchaClient;
            import com.google.android.recaptcha.RecaptchaTasksClient;
            import kotlin.text.Regex;
            import p000.c10;
            import p000.f42;
            import p000.i13;
            import p000.o42;
            import p000.p51;
            import p000.pg3;
            import p000.r51;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 32 */    public final class zzeq implements RecaptchaClient, RecaptchaTasksClient {
                private static final Regex zza = new Regex("^[a-zA-Z0-9/_]{1,100}$");
                private final zzdw zzb;
                private final String zzc;
                private final zzhh zzd;
                private final p51 zze;

                public zzeq(zzdw zzdwVar, String str, zzhh zzhhVar) {
/* 4 */             this.zzb = zzdwVar;
/* 6 */             this.zzc = str;
/* 8 */             this.zzd = zzhhVar;
/* 10 */            int i = zzby.zza;
/* 18 */            this.zze = r51.m8065b(zzep.zza);
                }

                public static final /* synthetic */ void zzd(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction) throws zzcg {
/* 28 */            zzcg zzcgVar = !zza.m6223b(recaptchaAction.getAction()) ? new zzcg(zzce.zzg, zzcd.zzh, null, null, 12, null) : null;
/* 33 */            if (j < 5000) {
/* 46 */                zzcgVar = new zzcg(zzce.zzb, zzcd.zzI, null, null, 12, null);
                    }
/* 50 */            if (zzcgVar != null) {
/* 53 */                throw zzcgVar;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final Object zze(RecaptchaAction recaptchaAction, long j, c10 c10Var) {
                    zzek zzekVar;
/* 3 */             if (c10Var instanceof zzek) {
/* 6 */                 zzekVar = (zzek) c10Var;
/* 8 */                 int i = zzekVar.zzc;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzekVar.zzc = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzekVar = new zzek(this, c10Var);
                        }
                    } else {
/* 22 */                zzekVar = new zzek(this, c10Var);
                    }
/* 25 */            Object objInvoke = zzekVar.zza;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = zzekVar.zzc;
/* 32 */            if (i2 == 0) {
/* 47 */                pg3.m7417A(objInvoke);
/* 50 */                zzhh zzhhVar = this.zzd;
/* 58 */                zzem zzemVar = new zzem(this, j, recaptchaAction, null);
/* 61 */                zzekVar.zzc = 1;
/* 63 */                objInvoke = zzemVar.invoke(zzhhVar, zzekVar);
/* 67 */                if (objInvoke == z10Var) {
/* 69 */                    return z10Var;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                pg3.m7417A(objInvoke);
                    }
/* 72 */            return ((o42) objInvoke).f14613a;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // com.google.android.recaptcha.RecaptchaClient
                /* JADX INFO: renamed from: execute-0E7RQCE */
                public final Object mo10486execute0E7RQCE(RecaptchaAction recaptchaAction, long j, c10 c10Var) {
                    zzei zzeiVar;
/* 3 */             if (c10Var instanceof zzei) {
/* 6 */                 zzeiVar = (zzei) c10Var;
/* 8 */                 int i = zzeiVar.zzc;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzeiVar.zzc = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzeiVar = new zzei(this, c10Var);
                        }
                    } else {
/* 22 */                zzeiVar = new zzei(this, c10Var);
                    }
/* 25 */            Object obj = zzeiVar.zza;
/* 27 */            Object obj2 = z10.f19902a;
/* 29 */            int i2 = zzeiVar.zzc;
/* 32 */            if (i2 == 0) {
/* 51 */                pg3.m7417A(obj);
/* 54 */                zzeiVar.zzc = 1;
/* 56 */                Object objZze = zze(recaptchaAction, j, zzeiVar);
                        return objZze == obj2 ? obj2 : objZze;
                    }
/* 34 */            if (i2 == 1) {
/* 36 */                pg3.m7417A(obj);
/* 41 */                return ((o42) obj).f14613a;
                    }
/* 46 */            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 49 */            return null;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // com.google.android.recaptcha.RecaptchaClient
                /* JADX INFO: renamed from: execute-gIAlu-s */
                public final Object mo10487executegIAlus(RecaptchaAction recaptchaAction, c10 c10Var) {
                    zzej zzejVar;
/* 3 */             if (c10Var instanceof zzej) {
/* 6 */                 zzejVar = (zzej) c10Var;
/* 8 */                 int i = zzejVar.zzc;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    zzejVar.zzc = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    zzejVar = new zzej(this, c10Var);
                        }
                    } else {
/* 22 */                zzejVar = new zzej(this, c10Var);
                    }
/* 25 */            Object obj = zzejVar.zza;
/* 27 */            Object obj2 = z10.f19902a;
/* 29 */            int i2 = zzejVar.zzc;
/* 32 */            if (i2 == 0) {
/* 51 */                pg3.m7417A(obj);
/* 54 */                zzejVar.zzc = 1;
/* 58 */                Object objMo10486execute0E7RQCE = mo10486execute0E7RQCE(recaptchaAction, 10000L, zzejVar);
                        return objMo10486execute0E7RQCE == obj2 ? obj2 : objMo10486execute0E7RQCE;
                    }
/* 34 */            if (i2 == 1) {
/* 36 */                pg3.m7417A(obj);
/* 41 */                return ((o42) obj).f14613a;
                    }
/* 46 */            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 49 */            return null;
                }

                @Override // com.google.android.recaptcha.RecaptchaTasksClient
                public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
/* 29 */            return zzbv.zza(i13.m4427d(((zzcr) this.zze.getValue()).zzb(), null, new zzen(this, recaptchaAction, 10000L, null), 3));
                }

                public final String zzc() {
/* 1 */             return this.zzc;
                }

                @Override // com.google.android.recaptcha.RecaptchaTasksClient
/* 33 */        public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
/* 35 */            return zzbv.zza(i13.m4427d(((zzcr) this.zze.getValue()).zzb(), null, new zzen(this, recaptchaAction, j, null), 3));
                }
            }
