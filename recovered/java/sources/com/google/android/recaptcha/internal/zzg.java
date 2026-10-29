            package com.google.android.recaptcha.internal;

            import kotlin.Unit;
            import p000.c10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzg {
                private boolean zza;

                public abstract Object zza(String str, c10 c10Var);

                public abstract Object zzb(String str, c10 c10Var) throws zzcg;

                public Object zzc(zzcg zzcgVar, c10 c10Var) {
/* 1 */             return Unit.f12910a;
                }

                public abstract Object zzd(zzxn zzxnVar, c10 c10Var) throws zzcg;

                public Object zze(String str, long j, Exception exc, c10 c10Var) {
/* 1 */             return Unit.f12910a;
                }

                public Object zzf(Exception exc, c10 c10Var) {
/* 18 */            return zzh.zza(exc, new zzcg(zzce.zzb, zzcd.zzap, exc.getMessage(), null, 8, null));
                }

                public void zzh(zzyg zzygVar) {
                }

                public final boolean zzi() {
/* 1 */             return this.zza;
                }

                public abstract int zzj();

                public abstract int zzk();
            }
