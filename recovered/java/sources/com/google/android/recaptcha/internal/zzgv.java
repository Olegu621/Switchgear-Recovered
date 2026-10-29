            package com.google.android.recaptcha.internal;

            import java.util.Timer;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzgv extends tj2 implements Function2 {
                final /* synthetic */ zzgz zza;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzgv(zzgz zzgzVar, c10 c10Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.zza = zzgzVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             return new zzgv(this.zza, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzgv) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 6 */             zzgz zzgzVar = this.zza;
                    synchronized (zzgs.class) {
                        try {
/* 1 */                     zzgo zzgoVar = zzgzVar.zzc;
/* 15 */                    if (zzgoVar != null && zzgoVar.zzb() == 0) {
/* 1 */                         Timer timer = zzgz.zza;
/* 27 */                        if (timer != null) {
/* 29 */                            timer.cancel();
                                }
/* 2 */                         zzgz.zza = null;
                            }
/* 1 */                     zzgzVar.zzf();
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 43 */            return Unit.f12910a;
                }
            }
