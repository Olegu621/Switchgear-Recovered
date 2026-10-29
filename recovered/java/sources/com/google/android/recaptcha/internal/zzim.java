            package com.google.android.recaptcha.internal;

            import java.util.List;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            import okhttp3.HttpUrl;
            import p000.c10;
            import p000.h01;
            import p000.pg3;
            import p000.tj2;
            import p000.xt0;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzim extends tj2 implements Function2 {
                public static final /* synthetic */ int zze = 0;
                int zza;
                final /* synthetic */ zziz zzb;
                final /* synthetic */ List zzc;
                final /* synthetic */ zzip zzd;
                private /* synthetic */ Object zzf;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzim(zziz zzizVar, List list, zzip zzipVar, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzb = zzizVar;
/* 3 */             this.zzc = list;
/* 5 */             this.zzd = zzipVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 9 */             zzim zzimVar = new zzim(this.zzb, this.zzc, this.zzd, c10Var);
/* 12 */            zzimVar.zzf = obj;
/* 14 */            return zzimVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzim) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zza;
/* 5 */             pg3.m7417A(obj);
/* 8 */             if (i == 0) {
/* 13 */                y10 y10Var = (y10) this.zzf;
                        while (true) {
/* 15 */                    zziz zzizVar = this.zzb;
/* 21 */                    if (zzizVar.zza() < 0) {
                                break;
                            }
/* 23 */                    List list = this.zzc;
/* 33 */                    if (zzizVar.zza() < list.size()) {
/* 45 */                        h01 h01Var = (h01) y10Var.mo4406c().get(xt0.f19368w);
/* 56 */                        if (!(h01Var != null ? h01Var.isActive() : true)) {
                                    break;
                                }
/* 66 */                        zzzu zzzuVar = (zzzu) list.get(zzizVar.zza());
                                try {
/* 70 */                            zzip.zzf(this.zzd, zzzuVar, zzizVar);
                                } catch (Exception e) {
/* 76 */                            zzzuVar.zzk();
/* 85 */                            new Integer(zzzuVar.zzg());
/* 88 */                            List listZzj = zzzuVar.zzj();
/* 92 */                            final zzip zzipVar = this.zzd;
/* 104 */                           CollectionsKt.m6203x(listZzj, null, null, null, new Function1(zzipVar) { // from class: com.google.android.recaptcha.internal.zzil
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
/* 3 */                                     ((zzzt) obj2).getClass();
/* 6 */                                     return HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
                                    }, 31);
/* 107 */                           zziz zzizVar2 = this.zzb;
/* 109 */                           this.zza = 1;
/* 115 */                           if (zzipVar.zzh(e, zzizVar2, this) == z10Var) {
/* 117 */                               return z10Var;
                                    }
                                }
                            } else {
                                break;
                            }
                        }
/* 121 */               return Unit.f12910a;
                    }
/* 118 */           return Unit.f12910a;
                }
            }
