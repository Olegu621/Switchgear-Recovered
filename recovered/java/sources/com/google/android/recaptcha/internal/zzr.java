            package com.google.android.recaptcha.internal;

            import android.app.Application;
            import com.google.android.gms.internal.internal.InternalRecaptchaBaseClient;
            import com.google.android.gms.recaptchabase.ExecuteRequest;
            import com.google.android.gms.recaptchabase.ExecuteResult;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.e70;
            import p000.f42;
            import p000.m42;
            import p000.n42;
            import p000.o42;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzr extends tj2 implements Function2 {
                int zza;
                final /* synthetic */ zzu zzb;
                final /* synthetic */ String zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzr(zzu zzuVar, String str, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zzb = zzuVar;
/* 3 */             this.zzc = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzr(this.zzb, this.zzc, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzr) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code duplicated, block: B:26:0x0060  */
                /* JADX WARN: Code duplicated, block: B:28:0x0085  */
                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
                    String str;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
                    try {
                        try {
/* 7 */                     if (i == 0) {
/* 19 */                        pg3.m7417A(obj);
/* 1 */                         e70 e70Var = this.zzb.zzc;
/* 28 */                        if (e70Var == null) {
/* 30 */                            e70Var = null;
                                }
/* 31 */                        this.zza = 1;
/* 33 */                        obj = e70Var.await(this);
/* 37 */                        if (obj != z10Var) {
                                }
/* 167 */                       return z10Var;
                            }
/* 9 */                     if (i != 1) {
/* 11 */                        pg3.m7417A(obj);
                            } else {
/* 15 */                        pg3.m7417A(obj);
                            }
/* 93 */                    str = ((ExecuteResult) obj).f4268a;
/* 95 */                    if (str != null) {
/* 136 */                       f42.m3656l("Required value was null.");
/* 5 */                         return null;
                            }
/* 97 */                    String str2 = this.zzc;
/* 99 */                    zzxw zzxwVarZzf = zzxx.zzf();
/* 103 */                   zzxwVarZzf.zze(str2);
/* 106 */                   zzxi zzxiVarZzf = zzxj.zzf();
/* 110 */                   zzxiVarZzf.zze(str);
/* 119 */                   zzxwVarZzf.zzf((zzxj) zzxiVarZzf.zzk());
/* 130 */                   return new o42((zzxx) zzxwVarZzf.zzk());
/* 43 */                    ExecuteRequest executeRequest = new ExecuteRequest();
/* 46 */                    zzu zzuVar = this.zzb;
/* 1 */                     String str3 = zzuVar.zzb;
/* 52 */                    if (str3 == null) {
/* 54 */                        str3 = null;
                            }
/* 55 */                    executeRequest.f4266a = str3;
/* 59 */                    executeRequest.f4267b = this.zzc;
/* 61 */                    Application applicationZzl = zzu.zzl(zzuVar);
/* 65 */                    applicationZzl.getClass();
/* 77 */                    e70 e70VarZza = zzdf.zza(new InternalRecaptchaBaseClient(applicationZzl).execute(executeRequest));
/* 82 */                    this.zza = 2;
/* 84 */                    obj = e70VarZza.await(this);
/* 88 */                    if (obj == z10Var) {
/* 167 */                       return z10Var;
                            }
/* 93 */                    str = ((ExecuteResult) obj).f4268a;
/* 95 */                    if (str != null) {
/* 136 */                       f42.m3656l("Required value was null.");
/* 5 */                         return null;
                            }
/* 97 */                    String str4 = this.zzc;
/* 99 */                    zzxw zzxwVarZzf2 = zzxx.zzf();
/* 103 */                   zzxwVarZzf2.zze(str4);
/* 106 */                   zzxi zzxiVarZzf2 = zzxj.zzf();
/* 110 */                   zzxiVarZzf2.zze(str);
/* 119 */                   zzxwVarZzf2.zzf((zzxj) zzxiVarZzf2.zzk());
/* 130 */                   return new o42((zzxx) zzxwVarZzf2.zzk());
                        } catch (Exception unused) {
/* 140 */                   m42 m42Var = o42.f14612b;
/* 163 */                   return new o42(new n42(new zzcg(zzce.zzb, zzcd.zzau, null, null, 12, null)));
                        }
                    } catch (Exception unused2) {
/* 168 */               m42 m42Var2 = o42.f14612b;
/* 191 */               return new o42(new n42(new zzcg(zzce.zzb, zzcd.zzat, null, null, 12, null)));
                    }
                }
            }
