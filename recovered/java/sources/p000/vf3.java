            package p000;

            import android.os.Bundle;
            import android.os.RemoteException;
            import com.google.android.gms.internal.playcore_age_signals.zze;
            import com.google.android.gms.internal.playcore_age_signals.zzp;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.play.agesignals.protocol.IAgeSignalsService;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vf3 extends zze {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ TaskCompletionSource f18043a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ dc0 f18044b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ xg3 f18045c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public vf3(xg3 xg3Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, dc0 dc0Var) {
/* 7 */             super(taskCompletionSource);
/* 1 */             this.f18043a = taskCompletionSource2;
/* 3 */             this.f18044b = dc0Var;
/* 5 */             this.f18045c = xg3Var;
                }

                @Override // com.google.android.gms.internal.playcore_age_signals.zze
                public final void zza(Exception exc) {
/* 3 */             if (exc instanceof zzp) {
/* 11 */                super.zza(new C0009a7(-5));
                    } else {
/* 15 */                super.zza(exc);
                    }
                }

                @Override // com.google.android.gms.internal.playcore_age_signals.zze
                public final void zzb() {
/* 1 */             TaskCompletionSource taskCompletionSource = this.f18043a;
                    try {
/* 3 */                 xg3 xg3Var = this.f18045c;
/* 11 */                IAgeSignalsService iAgeSignalsService = (IAgeSignalsService) xg3Var.f19090b.zze();
/* 15 */                String packageName = xg3Var.f19089a.getPackageName();
/* 21 */                Bundle bundle = new Bundle();
/* 27 */                bundle.putInt("playcore.version.code", 2);
/* 35 */                iAgeSignalsService.mo2439n0(packageName, bundle, new fg3(xg3Var, taskCompletionSource));
                    } catch (RemoteException e) {
/* 50 */                xg3.f19088c.zzb(e, "checkAgeSignals(%s)", this.f18044b);
/* 60 */                taskCompletionSource.trySetException(new C0009a7(-100));
                    }
                }
            }
