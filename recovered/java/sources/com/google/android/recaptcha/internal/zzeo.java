            package com.google.android.recaptcha.internal;

            import com.google.android.recaptcha.RecaptchaAction;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzeo extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzeq zzb;
                final /* synthetic */ long zzc;
                final /* synthetic */ RecaptchaAction zzd;
                private /* synthetic */ Object zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzeo(zzeq zzeqVar, long j, RecaptchaAction recaptchaAction, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzb = zzeqVar;
/* 3 */             this.zzc = j;
/* 5 */             this.zzd = recaptchaAction;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 10 */            zzeo zzeoVar = new zzeo(this.zzb, this.zzc, this.zzd, c10Var);
/* 13 */            zzeoVar.zze = obj;
/* 15 */            return zzeoVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzeo) create((zzgr) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:18:0x0059 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:19:0x005a A[Catch: Exception -> 0x006a, zzcg -> 0x007e, TryCatch #2 {zzcg -> 0x007e, Exception -> 0x006a, blocks: (B:5:0x0009, B:16:0x0051, B:19:0x005a, B:20:0x0068, B:8:0x0011, B:13:0x003e, B:11:0x001e), top: B:28:0x0005 }] */
                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws zzcg {
                    zzgr zzgrVar;
                    zzeo zzeoVar;
                    String str;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
                    try {
/* 6 */                 if (i != 0) {
/* 8 */                     if (i != 1) {
/* 10 */                        pg3.m7417A(obj);
                            } else {
/* 16 */                        zzgrVar = (zzgr) this.zze;
/* 18 */                        pg3.m7417A(obj);
/* 21 */                        zzeoVar = this;
                            }
/* 82 */                    str = (String) obj;
/* 88 */                    if (str.length() != 0) {
/* 90 */                        return str;
                            }
/* 105 */                   throw new zzcg(zzce.zzb, zzcd.zzaW, null, null, 12, null);
                        }
/* 23 */                pg3.m7417A(obj);
/* 29 */                zzgrVar = (zzgr) this.zze;
/* 31 */                zzeq zzeqVar = this.zzb;
/* 33 */                long j = this.zzc;
/* 35 */                RecaptchaAction recaptchaAction = this.zzd;
/* 37 */                zzeq.zzd(zzeqVar, j, recaptchaAction);
/* 1 */                 zzdw zzdwVar = zzeqVar.zzb;
/* 48 */                String strZzb = zzgrVar.zza().zzb();
/* 52 */                this.zze = zzgrVar;
/* 54 */                this.zza = 1;
/* 56 */                zzeoVar = this;
/* 57 */                obj = zzdwVar.zza(strZzb, recaptchaAction, j, zzeoVar);
/* 61 */                if (obj != z10Var) {
                        }
/* 106 */               return z10Var;
/* 66 */                zzeoVar.zze = null;
/* 69 */                zzeoVar.zza = 2;
/* 75 */                obj = ((zzhg) obj).zza(zzgrVar.zza(), zzeoVar);
/* 79 */                if (obj == z10Var) {
/* 106 */                   return z10Var;
                        }
/* 82 */                str = (String) obj;
/* 88 */                if (str.length() != 0) {
/* 90 */                    return str;
                        }
/* 105 */               throw new zzcg(zzce.zzb, zzcd.zzaW, null, null, 12, null);
                    } catch (zzcg e) {
/* 129 */               throw e;
                    } catch (Exception e2) {
/* 126 */               throw new zzcg(zzce.zzb, zzcd.zzX, e2.getMessage(), null, 8, null);
                    }
                }
            }
