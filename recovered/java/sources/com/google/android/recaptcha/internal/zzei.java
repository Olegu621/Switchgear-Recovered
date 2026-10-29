            package com.google.android.recaptcha.internal;

            import p000.c10;
            import p000.d10;
            import p000.o42;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzei extends d10 {
                /* synthetic */ Object zza;
                final /* synthetic */ zzeq zzb;
                int zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzei(zzeq zzeqVar, c10 c10Var) {
/* 3 */             super(c10Var);
/* 1 */             this.zzb = zzeqVar;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.zza = obj;
/* 8 */             this.zzc |= Integer.MIN_VALUE;
/* 15 */            Object objMo10486execute0E7RQCE = this.zzb.mo10486execute0E7RQCE(null, 0L, this);
                    return objMo10486execute0E7RQCE == z10.f19902a ? objMo10486execute0E7RQCE : new o42(objMo10486execute0E7RQCE);
                }
            }
