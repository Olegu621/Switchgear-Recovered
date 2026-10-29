            package com.google.android.recaptcha.internal;

            import p000.c10;
            import p000.d10;
            import p000.o42;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzej extends d10 {
                /* synthetic */ Object zza;
                final /* synthetic */ zzeq zzb;
                int zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzej(zzeq zzeqVar, c10 c10Var) {
/* 3 */             super(c10Var);
/* 1 */             this.zzb = zzeqVar;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.zza = obj;
/* 8 */             this.zzc |= Integer.MIN_VALUE;
/* 13 */            Object objMo10487executegIAlus = this.zzb.mo10487executegIAlus(null, this);
                    return objMo10487executegIAlus == z10.f19902a ? objMo10487executegIAlus : new o42(objMo10487executegIAlus);
                }
            }
