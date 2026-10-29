            package com.google.android.recaptcha.internal;

            import com.google.android.recaptcha.RecaptchaAction;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.m42;
            import p000.o42;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzel extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzeq zzb;
                final /* synthetic */ long zzc;
                final /* synthetic */ RecaptchaAction zzd;
                private /* synthetic */ Object zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzel(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzb = zzeqVar;
/* 3 */             this.zzc = j;
/* 5 */             this.zzd = recaptchaAction;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 10 */            zzel zzelVar = new zzel(this.zzb, this.zzc, this.zzd, c10Var);
/* 13 */            zzelVar.zze = obj;
/* 15 */            return zzelVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzel) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
                    zzhk zzhkVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
                    try {
/* 7 */                 if (i != 0) {
/* 9 */                     if (i != 1) {
/* 11 */                        pg3.m7417A(obj);
                            } else {
/* 17 */                        zzhkVar = (zzhk) this.zze;
/* 19 */                        pg3.m7417A(obj);
                            }
/* 72 */                    m42 m42Var = o42.f14612b;
/* 90 */                    return new o42(obj);
                        }
/* 23 */                pg3.m7417A(obj);
/* 29 */                zzhkVar = (zzhk) this.zze;
/* 31 */                m42 m42Var2 = o42.f14612b;
/* 33 */                zzeq zzeqVar = this.zzb;
/* 35 */                long j = this.zzc;
/* 37 */                RecaptchaAction recaptchaAction = this.zzd;
/* 39 */                this.zze = zzhkVar;
/* 41 */                this.zza = 1;
/* 53 */                obj = new zzhf(9, new zzeo(zzeqVar, j, recaptchaAction, null), null);
/* 56 */                if (obj != z10Var) {
                        }
/* 75 */                return z10Var;
/* 60 */                this.zze = null;
/* 63 */                this.zza = 2;
/* 65 */                obj = ((zzhf) obj).zza(zzhkVar, this);
/* 69 */                if (obj == z10Var) {
/* 75 */                    return z10Var;
                        }
/* 72 */                m42 m42Var3 = o42.f14612b;
                    } catch (zzcg e) {
/* 78 */                m42 m42Var4 = o42.f14612b;
/* 84 */                obj = pg3.m7426e(e.zzc());
                    }
/* 90 */            return new o42(obj);
                }
            }
